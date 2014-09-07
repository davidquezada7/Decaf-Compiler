package compiler.ast;

import java.util.List;
import java.util.LinkedList;

public class Root extends Node{
	/*
		estructura de datos que contenga objetos node
		segun la gramatica puede haber cualquier cantidad de hijos
	*/
		public LinkedList<Node> arbol; 
	
	public Root(){
		/*
			instanciar estructura
		*/
			arbol = new LinkedList<Node>();
	}
	
	public void add(Node node){
		/*
			agregar objeto a estructura
		*/
			arbol.add(node);
	}
	
	public void print(String padding){
		/*
			imprimir nodo y todos sus hijos
			darle formato, usar padding para pasar la alineacion
			
			root
				hijo1
					nieto1-1
				hijo2
					nieto2-1
					nieto2-2
		*/
		for(Node nodo : this.arbol)
			nodo.print(padding);
	}
	
	public void print(){
		print("");
	}
} 
 
 
