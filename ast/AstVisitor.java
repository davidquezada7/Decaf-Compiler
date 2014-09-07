package compiler.ast;


import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.List.*;
import compiler.parser.Decaf;
import compiler.parser.DecafBaseVisitor;

public class AstVisitor extends DecafBaseVisitor<Node>{
	


	@Override
	public Node visitInicio(Decaf.InicioContext ctx){
		Root root = new Root();							//raiz del arbol
		
		List<Decaf.Callout_declContext> list = ctx.callout_decl();	//lista con todas las expresiones, exp()
		
		for(Decaf.Callout_declContext s : list){
			root.add(visit(s));							//visitar cada expresion
		}

		return root;
	}	

	@Override
	public	Node visitCalloutDecl(Decaf.CalloutDeclContext ctx){
		String id = ctx.ID().getSymbol().getText();
		String callout = ctx.KW_CALLOUT().getSymbol().getText();

		return new CallOut(id, callout);
	}
/*
	@Override
	public Node visitFieldDecl(Decaf.FieldDeclContext ctx){
		String intToken = ctx.KW_INT().getSymbol().getText();
		String booleanToken = ctx.KW_BOOLEAN().getSymbol().getText();
		String tipo;
		if(intToken= null){
			tipo = booleanToken;
		}else{
			tipo = intToken;
		}

		String id = ctx.ID().getSymbol().getText();

		String lsBracket = ctx.LSBRACKET().getSymbol().getText();
		if(lsBracket = null){

		}else{
			String intLiteral = ctx.INT().getSymbol().getText();
			String hexLiteral = ctx.HEX().getSymbol().getText();
			String valor;
			if(intLiteral = null){
				valor = hexLiteral;
			}else{
				valor = intLiteral;
			}
			String rsBracket = ctx.RSBRACKET().getSymbol().getText();
		}

	List<TerminalNode> comma = ctx.COMMA();
	if(comma = null)
		
	}else{
		List<TerminalNode> lsBracketList = ctx.LSBRACKET();
		if(lsBracketList =null){

		}else{

		}
	}
*/
}
