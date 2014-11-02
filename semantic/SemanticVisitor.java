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
		
		for (int i = 0;i<var.size() ;i++ ) {
			if(!tabla.containsKey(var.get(i))){
				tabla.addToVariables(var.get(i), type);
			}else{
				System.out.println("Error: "+var.get(i)+" is already defined");
			}
		}

		for (int i=0;i<arr.size() ;i++ ) {
			if(!tabla.containsKey(arr.get(i))){
				tabla.addToVariables(arr.get(i), type);
			}else{
				System.out.println("Error: "+arr.get(i)+" is already defined");
			}
		}
	}
//METHOD DECLARATION
	public void visitMethodDeclaration(MethodDecl methodDecl, Table tabla){
		//nombre y tipo del metodo
		System.out.println(">>visitFieldDeclaration");
		String nombre = methodDecl.methodN;
		String tipo = methodDecl.methodT;
		//IMPORTANTE: para los parametros, cuando es void la lista esta bien, no hay issues
		//pero cuando es int o boolean solo la primer casilla viene de nuevo
		//con los valores del metodo y el tipo del metodo, asi que no hay que empezar en 0 sino que en uno
		//sino estariamos agregando variables repetidas a la tabla (cosa que no es permitido segun el codigo)
		List variables = methodDecl.v;
		List tipos = methodDecl.type;
		

		//System.out.println(nombre +" "+tipo);
		//agregamos el nombre de la funcion a la tabla, y en el value se crea el nuevo scope
		tabla.addToFunciones(nombre, tabla);
		//obtenemos el nuevo scope del metodo
		Table nuevaTabla = tabla.getTable(nombre);
		//agregamos todos los parametros en el scope obtenido

		//segun la nota de arriba ('IMPORTANTE'), vamos a escribir el codigo para no repetir
		//los parametros y entonces empezara en uno, para obviar la primera casilla
		if(tipo.equals("void")){
			for (int i=0;i<variables.size() ;i++ ) {
				if(!nuevaTabla.containsKey((String)variables.get(i))){
					nuevaTabla.addToVariables((String)variables.get(i),(String)tipos.get(i));
				}else{
					System.out.println("Error: '"+(String)variables.get(i)+"' is already defined");
				}
			}
		}else{
			for (int i=1;i<variables.size() ;i++ ) {
				if(!nuevaTabla.containsKey((String)variables.get(i))){
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
		}	
		

	}

	//crear nuevo scope cada vez que se llame a If
	public void visitIfStatement(IfStatement ifStatement, Table tabla){
		System.out.println(">>visitIfStatement");
		Node bloque1 = ifStatement.block1;
		Node bloque2 = ifStatement.block2;
		String kwelse = ifStatement.kwELSE;
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

	//crear nuevo scope cada vez que se llame a For
	public void visitForStatement(ForStatement forStatement, Table tabla){
		System.out.println(">>visitForStatement");
		Node bloque = forStatement.block;
		//se crea el scope volatil para For, con la direccion a la tabla a la que en el codigo 
		//esta contenida
		Table tablaTemp = new Table(tabla);
		visitBlock((Block)bloque, tablaTemp);
	}

	//crear nuevo scope cada vez que se llame a While
	public void visitWhileStatement(WhileStatement whileStatement, Table tabla){
		Node bloque = whileStatement.block;
		//se crea el scope volatil para While, con la direccion a la tabla a la que en el codigo 
		//esta contenida
		Table tablaTemp = new Table(tabla);
		visitBlock((Block)bloque, tablaTemp);
	}

}