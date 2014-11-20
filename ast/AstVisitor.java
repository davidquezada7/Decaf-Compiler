package compiler.ast;


import java.util.*;
import java.io.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.List.*;
import compiler.parser.Decaf;
import compiler.parser.DecafBaseVisitor;

public class AstVisitor extends DecafBaseVisitor<Node>{
	


	@Override
	public Node visitInicio(Decaf.InicioContext ctx){
		Root root = new Root();							//raiz del arbol
		
		List<Decaf.Callout_declContext> listC = ctx.callout_decl();
		List<Decaf.Method_declContext>  listM = ctx.method_decl();
		List<Decaf.Field_declContext>  listF = ctx.field_decl();

		for(Decaf.Callout_declContext c : listC){
			root.add(visit(c));							//visitar cada expresion
		}

		for(Decaf.Field_declContext f : listF){
			root.add(visit(f));							//visitar cada expresion
		}

		for(Decaf.Method_declContext m : listM){
			root.add(visit(m));							//visitar cada expresion
		}

		return root;
	}	

	@Override
	public	Node visitCalloutDecl(Decaf.CalloutDeclContext ctx){
		String id = ctx.ID().getSymbol().getText();
		String callout = ctx.KW_CALLOUT().getSymbol().getText();

		return new CallOut(id, callout);
	}

	@Override
	public Node visitMethodDecl(Decaf.MethodDeclContext ctx){
		List<TerminalNode> variables = ctx.ID();
		List<Decaf.TypeContext> tipo = ctx.type();
		String methodT;
		String methodN;
		Decaf.TypeContext contexto;
		LinkedList<String> type= new LinkedList<String>();
		LinkedList<String> v = new LinkedList<String>();

		for(TerminalNode i : variables)
	   		v.add(i.getSymbol().getText());

		if(ctx.KW_VOID()==null){
		 	contexto = 	tipo.get(0);
		 	if (contexto.KW_BOOLEAN() == null) {
				methodT = contexto.KW_INT().getSymbol().getText();
				methodN = v.get(0);
		 	} else {
		 		methodT = contexto.KW_BOOLEAN().getSymbol().getText();
		 		methodN = v.get(0);
			}
			
		}else{ 
			String t_void = ctx.KW_VOID().getSymbol().getText();
			methodT = t_void;
			methodN = v.pollFirst();
		}

		for(Decaf.TypeContext contexto2 : tipo) {
			if (contexto2.KW_BOOLEAN() == null) {
				type.add(contexto2.KW_INT().getSymbol().getText());
			} else {
				type.add(contexto2.KW_BOOLEAN().getSymbol().getText());
			}
		}

		

		return new MethodDecl(methodT,methodN,v,type,(Block)visit(ctx.block()));
		
	}


	@Override
	public Node visitFieldDecl(Decaf.FieldDeclContext ctx){
		Decaf.TypeContext contextoT = ctx.type();
		List<Decaf.ArrContext> contextoA = ctx.arr();
		List<TerminalNode> variables = ctx.ID();
		String fieldN = null;
		String fieldT = null;
		String arrayL = null;
		boolean aux = false;
		LinkedList<String> arreglos = new LinkedList<String>();
		LinkedList<String> v = new LinkedList<String>();


		for(TerminalNode i : variables)
	   		v.add(i.getSymbol().getText());

		if(ctx.arr() == null){
			System.out.println("entro");
			fieldN = ctx.ID(0).getSymbol().getText();
				
		}else{
			for(Decaf.ArrContext i : contextoA){
		   		arreglos.add(i.ID().getSymbol().getText());
		   		if(i.HEX() == null){
					arreglos.add(i.INT().getSymbol().getText());
				}else{
					arreglos.add(i.HEX().getSymbol().getText());
				}
		   	}
		}
		

		if (contextoT.KW_BOOLEAN() == null) {
			fieldT = contextoT.KW_INT().getSymbol().getText();
		 } else {
			fieldT = contextoT.KW_BOOLEAN().getSymbol().getText();
		}


		return new FieldDeclaration(fieldT,v,arreglos);

	}

	@Override
	public Node visitBlocke(Decaf.BlockeContext ctx){
		//System.out.println("holi2");
		LinkedList<FieldDeclaration> campos = new LinkedList<FieldDeclaration>();
		for(Decaf.Field_declContext contexto : ctx.field_decl()){
			campos.add((FieldDeclaration)visit(contexto));
		}

		List<Decaf.StatementContext> argumentos = ctx.statement();
		
		LinkedList<Node> statements = new LinkedList<Node>();
		// LinkedList<Terminal> l7 = new LinkedList<Terminal>();
		// LinkedList<Asignation> l1 = new LinkedList<Asignation>();
		// LinkedList<Pnode> l2 = new LinkedList<Pnode>();
		// LinkedList<IfStatement> l3 = new LinkedList<IfStatement>();
		// LinkedList<ForStatement> l4 = new LinkedList<ForStatement>();
		// LinkedList<WhileStatement> l5 = new LinkedList<WhileStatement>();
		// LinkedList<ReturnStatement> l6 = new LinkedList<ReturnStatement>();

		for (int i = 0;i < argumentos.size() ;i++ ) {
			if (argumentos.get(i) instanceof Decaf.Statement7Context) {
				statements.add((Terminal)visit((Decaf.Statement7Context)argumentos.get(i)));
			}else if (argumentos.get(i) instanceof Decaf.Statement8Context) {
				statements.add((Terminal)visit((Decaf.Statement8Context)argumentos.get(i)));
			}else if (argumentos.get(i) instanceof Decaf.Statement1Context) {
				statements.add((Asignation)visit((Decaf.Statement1Context)argumentos.get(i)));
			}else if (argumentos.get(i) instanceof Decaf.Statement3Context) {
				statements.add((IfStatement)visit((Decaf.Statement3Context)argumentos.get(i)));
			}else if (argumentos.get(i) instanceof Decaf.Statement4Context) {
				statements.add((ForStatement)visit((Decaf.Statement4Context)argumentos.get(i)));
			}else if (argumentos.get(i) instanceof Decaf.Statement5Context) {
				statements.add((WhileStatement)visit((Decaf.Statement5Context)argumentos.get(i)));
			}else if (argumentos.get(i) instanceof Decaf.Statement6Context) {
				statements.add((ReturnStatement)visit((Decaf.Statement6Context)argumentos.get(i)));
			}else if (argumentos.get(i) instanceof Decaf.Statement2Context) {
				statements.add((Pnode)visit((Decaf.Statement2Context)argumentos.get(i)));
			}
		}
		
		

		return new Block(campos, statements);
	}

	@Override
	public Node visitStatement1(Decaf.Statement1Context ctx){
		//pendiente algo en Location.java 
		Decaf.Assign_oppContext op = ctx.assign_opp();
		Decaf.ExprContext expr = ctx.expr();
		Decaf.LocationContext location = ctx.location();
		return new Asignation(visit(location), visit(expr), visit(op));
	}

	@Override
	public Node visitStatement2(Decaf.Statement2Context ctx){
		Decaf.Method_callContext mcall = ctx.method_call();
		return new Pnode (visit(mcall));
	}

	@Override
	public Node visitStatement3(Decaf.Statement3Context ctx){
		String kwIF = ctx.KW_IF().getSymbol().getText();
		Decaf.ExprContext expr = ctx.expr();
		Decaf.BlockContext block1 = ctx.block(0);
		if (ctx.KW_ELSE() == null) {
			return new IfStatement(kwIF, visit(expr), visit(block1), null, null);
		}else{
			String kwELSE = ctx.KW_ELSE().getSymbol().getText();
			Decaf.BlockContext block2 = ctx.block(1);
			return new IfStatement(kwIF, visit(expr), visit(block1), kwELSE,visit(block2));
		}
	}

	@Override
	public Node visitStatement4(Decaf.Statement4Context ctx){
		String kwFOR = ctx.KW_FOR().getSymbol().getText();
		String id = ctx.ID().getSymbol().getText();
		String ig = ctx.IG().getSymbol().getText();
		Decaf.ExprContext expr1 = ctx.expr(0);
		Decaf.ExprContext expr2 = ctx.expr(1);
		Decaf.BlockContext block = ctx.block();
		return new ForStatement(kwFOR, id, ig, visit(expr1), visit(expr2), visit(block));
	}

	@Override
	public Node visitStatement5(Decaf.Statement5Context ctx){
		String kwWHILE = ctx.KW_WHILE().getSymbol().getText();
		Decaf.ExprContext expr = ctx.expr();
		Decaf.BlockContext block = ctx.block();
		return new WhileStatement(kwWHILE, visit(expr), visit(block));
	}

	@Override
	public Node visitStatement6(Decaf.Statement6Context ctx){
		String retorno = ctx.KW_RETURN().getSymbol().getText();
		if (ctx.expr() == null) {
			return new ReturnStatement(retorno, null);
		}else{
			Decaf.ExprContext expr = ctx.expr();
			return new ReturnStatement(retorno, visit(expr));
		}
	}

	@Override
	public Node visitStatement7(Decaf.Statement7Context ctx){
		String brk = ctx.KW_BREAK().getSymbol().getText();
		return new Terminal(brk);
	}

	@Override
	public Node visitStatement8(Decaf.Statement8Context ctx){
		String conti = ctx.KW_CONTINUE().getSymbol().getText();
		return new Terminal(conti);
	}

	@Override
	public Node visitLoc(Decaf.LocContext ctx){
		String variable = ctx.ID().getSymbol().getText();
		Decaf.ExprContext expr = ctx.expr();
		if (ctx.expr() == null) {
			return new Location(variable, null);	
		}else{
			return new Location(variable, visit(expr));
		}
		
	}

	@Override
	public Node visitAssignOp(Decaf.AssignOpContext ctx){
		String assignop = null;
		if ((ctx.MIN_IG() == null)&&(ctx.PLUS_IG() == null)) {
			assignop = ctx.IG().getSymbol().getText();
		}else if ((ctx.MIN_IG() == null)&&(ctx.IG() == null)) {
			assignop = ctx.PLUS_IG().getSymbol().getText();
		}else{
			assignop = ctx.MIN_IG().getSymbol().getText();
		}
		return new Terminal(assignop);
	}

	@Override
	public Node visitLiteral1(Decaf.Literal1Context ctx){
		Decaf.Int_literalContext lit = ctx.int_literal();
		return (visit(lit));
	}	

	@Override
	public Node visitLiteral2(Decaf.Literal2Context ctx){
		Decaf.Char_literalContext lit = ctx.char_literal();
		return (visit(lit));
	}

	@Override
	public Node visitLiteral3(Decaf.Literal3Context ctx){
		Decaf.Bool_literalContext lit = ctx.bool_literal();
		return (visit(lit));
	}

	@Override
	public Node visitLiteralInt(Decaf.LiteralIntContext ctx){
		String literal;
		if (ctx.HEX() == null) {
			literal = ctx.INT().getSymbol().getText();
		}else{
			literal = ctx.HEX().getSymbol().getText();
		}

		return new Literal(literal);
	}

	@Override
	public Node visitLiteralChar(Decaf.LiteralCharContext ctx){
		String literal = ctx.CHAR().getSymbol().getText();
		return new Literal(literal);
	}

	@Override
	public Node visitLiteralBoolean(Decaf.LiteralBooleanContext ctx){
		String literalT = ctx.BOOL_TRUE().getSymbol().getText();
		String literalF = ctx.BOOL_FALSE().getSymbol().getText();

			if (literalT == null) {
				return new Literal(literalF);
			}else{
				return new Literal(literalT);
			}
		


	}

	@Override
	public Node visitBin1(Decaf.Bin1Context ctx){
		String op = ctx.RES().getSymbol().getText();
		Decaf.Bin_opContext binop = ctx.bin_op();
		return new Res(op, visit(binop));
	}

	@Override
	public Node visitBin2(Decaf.Bin2Context ctx){
		String op = ctx.NO().getSymbol().getText();
		Decaf.Bin_opContext binop = ctx.bin_op();
		return new Negation(op, visit(binop));
	}

	@Override
	public Node visitBin3(Decaf.Bin3Context ctx){
		Decaf.Bin_opContext binop1 = ctx.bin_op(0);
		String op;
		Decaf.Bin_opContext binop2 = ctx.bin_op(1);
		if ((ctx.MULT() == null) && (ctx.DIV() == null)){
			op = ctx.PRCNT().getSymbol().getText();
		}else if((ctx.MULT() == null) && (ctx.PRCNT() == null)){
			op = ctx.DIV().getSymbol().getText();
		}else{
			op = ctx.MULT().getSymbol().getText();
		}

		return new IntBinOp(visit(binop1), op, visit(binop2));
	}

	@Override
	public Node visitBin4(Decaf.Bin4Context ctx){
		Decaf.Bin_opContext binop1 = ctx.bin_op(0);
		String op;
		Decaf.Bin_opContext binop2 = ctx.bin_op(1);
		if(ctx.PLUS() == null){
			op = ctx.RES().getSymbol().getText();
		}else{
			op = ctx.PLUS().getSymbol().getText();
		}

		return new IntBinOp(visit(binop1), op, visit(binop2));
	}

	@Override
	public Node visitBin5(Decaf.Bin5Context ctx){
		Decaf.Bin_opContext binop1 = ctx.bin_op(0);
		String op;
		Decaf.Bin_opContext binop2 = ctx.bin_op(1);
		if((ctx.MENOR() == null) && (ctx.MAYOR() == null) && (ctx.MENORIGUAL() == null)){
			op = ctx.MAYORIGUAL().getSymbol().getText();
		}else if((ctx.MENOR() == null) && (ctx.MAYOR() == null) && (ctx.MAYORIGUAL() == null)){
			op = ctx.MENORIGUAL().getSymbol().getText();
		}else if((ctx.MENOR() == null) && (ctx.MENORIGUAL() == null) && (ctx.MAYORIGUAL() == null)){
			op = ctx.MAYOR().getSymbol().getText();
		}else{
			op = ctx.MENOR().getSymbol().getText();
		}

		return new ComparisonBinOp(visit(binop1), op, visit(binop2));
	}

	@Override
	public Node visitBin6(Decaf.Bin6Context ctx){
		Decaf.Bin_opContext binop1 = ctx.bin_op(0);
		String op;
		Decaf.Bin_opContext binop2 = ctx.bin_op(1);
		if(ctx.DIG() == null){
			op = ctx.NOIGUAL().getSymbol().getText();
		}else{
			op = ctx.DIG().getSymbol().getText();
		}

		return new ComparisonBinOp(visit(binop1), op, visit(binop2));
	}

	@Override
	public Node visitBin7(Decaf.Bin7Context ctx){
		Decaf.Bin_opContext binop1 = ctx.bin_op(0);
		String op = ctx.AND().getSymbol().getText();
		Decaf.Bin_opContext binop2 = ctx.bin_op(1);

		return new BooleanBinOp(visit(binop1), op, visit(binop2));
	}

	@Override
	public Node visitBin8(Decaf.Bin8Context ctx){
		Decaf.Bin_opContext binop1 = ctx.bin_op(0);
		String op = ctx.OR().getSymbol().getText();
		Decaf.Bin_opContext binop2 = ctx.bin_op(1);

		return new BooleanBinOp(visit(binop1), op, visit(binop2));
	}

	@Override
	public Node visitBin9(Decaf.Bin9Context ctx){
		Decaf.Expr2Context expr2 = ctx.expr2();
		return (visit(expr2));
	}

	@Override
	public Node visitBin10(Decaf.Bin10Context ctx){
		Decaf.Bin_opContext binop = ctx.bin_op();
		return new Parentesis(visit(binop));
	}

	@Override
	public Node visitMethodcall(Decaf.MethodcallContext ctx){
		String id = ctx.ID().getSymbol().getText();
		LinkedList<Node> argumentos = new LinkedList<Node>();
		List<Decaf.Callout_argContext> cL = null;
		List<Decaf.ExprContext> eL = null;
		Decaf.Method_call_calloutContext calloutL = ctx.method_call_callout();
		Decaf.Method_call_exprContext expL = ctx.method_call_expr();


		if((ctx.method_call_expr() == null) && (ctx.method_call_callout() == null)){
			return new AuxMCall1 (id, null);
		}else if(ctx.method_call_expr() == null){
			cL = calloutL.callout_arg();
			for (int n = 0; n < cL.size() ; n++) {
				argumentos.add(visit(cL.get(n)));
			}
			return new AuxMCall1 (id, argumentos);
		}else{
			eL = expL.expr();
			for (int n = 0; n < eL.size() ; n++) {
				argumentos.add(visit(eL.get(n)));
			}
			return new AuxMCall1 (id, argumentos);
		}
	}
}
