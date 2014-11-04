package compiler.ast;

import java.util.*;

public class Parentesis extends Node{
	public Node binop;

	public Parentesis(Node binop){
		this.binop = binop;
	}

	public void print(String padding){
		this.binop.print(padding);
	}
}