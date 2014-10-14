package compiler.ast;

import java.util.*;

public class Binop1 extends Node{
	public String op;
	public Node binop;

	public Binop1(String op, Node binop){
		this.op = op;
		this.binop = binop;
	}

	public void print(String padding){
		System.out.print(padding + op);
		this.binop.print(padding);
	}
}