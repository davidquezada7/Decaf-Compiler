package compiler.ast;

import java.util.*;

public class AuxMCall1 extends Node{
	public String id;
	public LinkedList<Node> expresiones = new LinkedList<Node>();

	public AuxMCall1(String id, LinkedList<Node> expresiones){
		this.id = id;
		this.expresiones = expresiones;
	}

	public void print(String padding){
		System.out.print(padding + id);
		if(expresiones != null){
			for (int i = 0;i < expresiones.size() ;i++ ) {
				this.expresiones.get(i).print(padding);
			}
		}
	}
}