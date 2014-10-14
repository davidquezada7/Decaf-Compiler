package compiler.ast;

import java.util.*;

public class Location extends Node{
	public String variable;
	public Node expresion;

	public Location(String variable, Node expresion){
		this.variable = variable;
		this.expresion = expresion;
	}


	public void print(String padding){
		if (expresion == null) {
			System.out.print(padding + variable);
		}else{
			System.out.print(padding + variable);
			this.expresion.print(padding);
		}
	}

}