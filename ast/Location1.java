package compiler.ast;

import java.util.*;

public class Location extends Node{
	public String variable;
	public Node expresion;

	public Location1(String variable, Node expresion){
		this.variable = variable;
		this.expresion = expresion;
	}

	public void print(String padding){
		System.out.print(padding + variable);
		this.expresion.print(padding);
	}

}