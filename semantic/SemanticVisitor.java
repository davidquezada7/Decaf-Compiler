package compiler.semantic;
import compiler.ast.*;
import java.util.*;
import org.antlr.runtime.tree.*;

public class SemanticVisitor{
	public Table tabla;

	public SemanticVisitor(){
		this.tabla = new Table();
	}

	public void visit(Root root){
		System.out.println(">>visit");
		LinkedList<Node> listRoot = root.arbol;
		for (int i=0;i<listRoot.size() ; i++) {
			if(listRoot.get(i) instanceof FieldDeclaration){
				visitFieldDeclaration((FieldDeclaration)listRoot.get(i), this.tabla);
			}else if( listRoot.get(i) instanceof MethodDecl){
				visitMethodDeclaration((MethodDecl)listRoot.get(i), this.tabla);
			}
		}
	}

//FIELD DECLARATION
	public void visitFieldDeclaration(FieldDeclaration fieldDeclaration ,Table tabla){
		System.out.println(">>visitFieldDeclaration");
		String type = fieldDeclaration.fielT;
		List<String> var = fieldDeclaration.var;
		List<String> arr = fieldDeclaration.arr;
		
		//se agrega a la tabla la lista de los var y de los arr, no nos interesa el orden ni tampoco
		//si variable o array
		for (int i = 0;i<var.size() ;i++ ) {
			if(!tabla.containsVar(var.get(i))){
				tabla.addToVariables(var.get(i), type);
			}else{
				System.out.println("Error: "+var.get(i)+" is already defined");
			}
		}

		for (int i=0;i<arr.size() ;i++ ) {
			if(!tabla.containsVar(arr.get(i))){
				tabla.addToVariables(arr.get(i), type);
			}else{
				System.out.println("Error: "+arr.get(i)+" is already defined");
			}
		}
	}
//METHOD DECLARATION
	public void visitMethodDeclaration(MethodDecl methodDecl, Table tabla){
		//nombre y tipo del metodo
		System.out.println(">>visitMethodDeclaration");
		String nombre = methodDecl.methodN;
		String tipo = methodDecl.methodT;
		//IMPORTANTE: para los parametros, cuando es void la lista esta bien, no hay issues
		//pero cuando es int o boolean solo la primer casilla viene de nuevo
		//con los valores del metodo y el tipo del metodo, asi que no hay que empezar en 0 sino que en uno
		//sino estariamos agregando variables repetidas a la tabla (cosa que no es permitido segun el codigo)
		List variables = methodDecl.v;
		List tipos = methodDecl.type;
		

		//VERIFICACION DE UNICIDAD PARA EL METODO
		//NOTA: este compilador no soporta 2 variables llamadas igual o dos funciones llamadas igual 
		//o una variable y una funcion a llamada igual 

		if(!(tabla.containsVar(nombre)||tabla.containsFunc(nombre))){
		//agregamos el nombre de la funcion a la tabla, y en el value se crea el nuevo scope
			tabla.addToFunciones(nombre, tabla);
		
			//obtenemos el nuevo scope del metodo
			Table nuevaTabla = tabla.getTable(nombre);
			//agregamos todos los parametros en el scope obtenido

			//AGREGAR PARAMETROS DE LA FUNCION AL NUEVO SCOPE
			//segun la nota de arriba ('IMPORTANTE'), vamos a escribir el codigo para no repetir
			//los parametros y entonces empezara en uno, para obviar la primera casilla
			if(tipo.equals("void")){
				for (int i=0;i<variables.size() ;i++ ) {
					if(!(nuevaTabla.containsVar((String)variables.get(i))) ){
						nuevaTabla.addToVariables((String)variables.get(i),(String)tipos.get(i));
					}else{
						System.out.println("Error: '"+(String)variables.get(i)+"' is already defined");
					}
				}
			}else{
				for (int i=1;i<variables.size() ;i++ ) {
					if(!nuevaTabla.containsVar((String)variables.get(i))){
						nuevaTabla.addToVariables((String)variables.get(i),(String)tipos.get(i));
					}else{
						System.out.println("Error: '"+(String)variables.get(i)+"' is already defined");
					}
				}
			}


			//agregamos el tipo de metodo que es, accesando al campo 'tipo' de la clase Table
			nuevaTabla.tipo = tipo;	
			Block nodoBlock = methodDecl.bloque;
			if(nodoBlock != null){
				
				visitBlock(nodoBlock,nuevaTabla);
			}
		}else{
			System.out.println("error: "+nombre+" is already defined");
		}
	}

	public void visitBlock(Block block, Table tabla){
		System.out.println(">>visitBlock");
		LinkedList<FieldDeclaration> lista = block.fields;
		for (int i = 0;i<lista.size() ;i++ ) {
			visitFieldDeclaration(lista.get(i), tabla);
		}

		//Utilizamos instanceof para verificar a que tipo de clase corresponde
		//listaNodos puede ser "Terminal", "Asignation", "IfStatement","ForStatement","WhileStatement",
		//"ReturnStatement" o "Pnode"
		LinkedList<Node> listaNodos = block.statements;
		
		for (int i = 0;i<listaNodos.size() ;i++ ) {
			if(listaNodos.get(i) instanceof IfStatement){
				visitIfStatement((IfStatement)listaNodos.get(i), tabla);
			}
			if(listaNodos.get(i) instanceof ForStatement){
				visitForStatement((ForStatement)listaNodos.get(i),tabla);
			}
			if(listaNodos.get(i) instanceof WhileStatement){
				visitWhileStatement ((WhileStatement)listaNodos.get(i),tabla);
			}
			if(listaNodos.get(i) instanceof Asignation){
				visitAsignation((Asignation)listaNodos.get(i), tabla);
			}
			if(listaNodos.get(i) instanceof Pnode){
				visitPnode((Pnode)listaNodos.get(i), tabla);
			}
			if(listaNodos.get(i) instanceof ReturnStatement){
				visitReturnStatement((ReturnStatement) listaNodos.get(i),tabla);
			}
		}	
	}

	public void visitPnode(Pnode pnode, Table tabla){
		Node nd = pnode.nd;
		visitAuxCall1((AuxMCall1)nd, tabla);
	}

	public void visitAsignation(Asignation asignation, Table tabla){
		Node location = asignation.location;
		Node op = asignation.op;
		Node expr = asignation.expr;
		
		visitLocation((Location)location, tabla);
		//System.out.println("tengo los ojos aguados");

		visitNode(expr, tabla);
	}

	public void visitLocation(Location location, Table tabla){
		String variable = location.variable;
		Node expresion = location.expresion;
		//si es arreglo se verifica si tiene una variable en los corchetes en el else se verifica si existe
		//dicha variable
		
		if(expresion == null){
			searchVar(variable,tabla);	
		}else{
			//System.out.println(expresion.getClass());
			searchVar(variable,tabla);
			visitNode(expresion, tabla);
		}
	}

	public void visitRes(Res res, Table tabla){
		Node binop = res.binop;
		visitNode(binop, tabla);
	}

	public void visitNegation(Negation negation, Table tabla){
		Node binop = negation.binop;
		visitNode(binop, tabla);
	}

	public void visitIntBinOp(IntBinOp intBinOp, Table tabla){
		Node binop1 = intBinOp.binop1;
		Node binop2 = intBinOp.binop2;
		//HIJO IZQUIERDO
		visitNode(binop1, tabla);
		//HIJO DERECHO
		visitNode(binop2, tabla);
	}
	
	public void visitComparisonBinOp(ComparisonBinOp comparisonBinOp, Table tabla){
		Node binop1 = comparisonBinOp.binop1;
		Node binop2 = comparisonBinOp.binop2;
		//HIJO IZQUIERDO
		visitNode(binop1, tabla);
		//HIJO DERECHO
		visitNode(binop2, tabla);
	}
	
	public void visitBooleanBinOp(BooleanBinOp booleanBinOp, Table tabla){
		Node binop1 = booleanBinOp.binop1;
		Node binop2 = booleanBinOp.binop2;
		//HIJO IZQUIERDO
		visitNode(binop1, tabla);
		
		//HIJO DERECHO
		visitNode(binop2, tabla);
	}

	public void visitParentesis(Parentesis parentesis, Table tabla){
		Node binop = parentesis.binop;
		visitNode(binop, tabla);
	}

	public void visitAuxCall1(AuxMCall1 auxMCall1, Table tabla){
		String variable = auxMCall1.id;
		LinkedList<Node> expresiones = auxMCall1.expresiones;

		if(expresiones==null){
			searchFunc(variable,tabla);
		}else{
			searchFunc(variable,tabla);
			for (int i=0;i<expresiones.size() ;i++ ) {
				if(expresiones.get(i) instanceof Location){
					visitLocation((Location)expresiones.get(i),tabla);
				}
				if(expresiones.get(i) instanceof AuxMCall1){
					visitAuxCall1((AuxMCall1)expresiones.get(i),tabla);					
				}
			}
		}

	}

//Es la funcion recursiva para buscar una variable
	public void searchVar(String variable, Table tabla){
		if(tabla.containsVar(variable)){
		}else{
			if (tabla.padre!= null) {
				searchVar(variable,tabla.padre);
			}else{
				//System.out.println("entro2");
				System.out.println("error: variable "+variable+" is not defined");
			}
		}
	}
//Es la funcion recursiva para buscar una funcion
	public void searchFunc(String variable, Table tabla){
		if(tabla.containsFunc(variable)){
		}else{
			if (tabla.padre!= null) {
				searchFunc(variable,tabla.padre);
			}else{
				//System.out.println("entro2");
				System.out.println("error: function "+variable+" is not defined");
			}
		}
	}

	//crear nuevo scope cada vez que se llame a While
	public void visitWhileStatement(WhileStatement whileStatement, Table tabla){
		Node expr = whileStatement.expr;
		Node bloque = whileStatement.block;
		
		//Existencia
		visitNode(expr, tabla);

		//se crea el scope volatil para While, con la direccion a la tabla a la que en el codigo 
		//esta contenida
		Table tablaTemp = new Table(tabla);
		visitBlock((Block)bloque, tablaTemp);
	}

	//crear nuevo scope cada vez que se llame a For
	public void visitForStatement(ForStatement forStatement, Table tabla){
		System.out.println(">>visitForStatement");
		String id = forStatement.id;
		//EXISTENCIA
		searchVar(id, tabla);

		Node expr1 = forStatement.expr1;
		visitNode(expr1, tabla);
		// expr2
		Node expr2 = forStatement.expr2;

		visitNode(expr2, tabla);


		//
		Node bloque = forStatement.block;
		//se crea el scope volatil para For, con la direccion a la tabla a la que en el codigo 
		//esta contenida
		Table tablaTemp = new Table(tabla);
		visitBlock((Block)bloque, tablaTemp);
	}

	//crear nuevo scope cada vez que se llame a If
	public void visitIfStatement(IfStatement ifStatement, Table tabla){
		System.out.println(">>visitIfStatement");
		Node expr = ifStatement.expr;
		Node bloque1 = ifStatement.block1;
		String kwelse = ifStatement.kwELSE;
		Node bloque2 = ifStatement.block2;
		

		//Existencia
		visitNode(expr, tabla);


		// se crea nuevo scope que es volatil, o sea que existe solamente mientras se utiliza el if
		// el while o el for, pero de igual forma se crea con el parametro tabla para tener referencia 
		// a la tabla en la que esta contenido el if
		Table tablaTemp1 = new Table(tabla);
		Table tablaTemp2 = new Table(tabla);
		if(bloque1 != null){
			visitBlock((Block)bloque1, tablaTemp1);
			if(kwelse != null){
			visitBlock((Block)bloque2, tablaTemp2);
			}
		}
	}

	public void visitReturnStatement(ReturnStatement returnStatement, Table tabla){
		Node expresion = returnStatement.expresion;
		if(expresion!= null){
			visitNode(expresion, tabla);
		}
	}

	public void visitNode(Node node, Table tabla){
			if(node instanceof Res){
			visitRes((Res)node, tabla);
			}
			if(node instanceof Negation){
				visitNegation((Negation)node, tabla);
			}
			if(node instanceof IntBinOp){
				visitIntBinOp((IntBinOp)node, tabla);
			}
			if(node instanceof ComparisonBinOp){
				visitComparisonBinOp((ComparisonBinOp)node, tabla);
			}
			if(node instanceof BooleanBinOp){
				visitBooleanBinOp((BooleanBinOp)node, tabla);
			}
			if(node instanceof Parentesis){
				visitParentesis((Parentesis)node, tabla);
			}
			if(node instanceof Location){
				visitLocation((Location)node, tabla);
			}
			if(node instanceof AuxMCall1){
				visitAuxCall1((AuxMCall1)node, tabla);
			}
	}
}