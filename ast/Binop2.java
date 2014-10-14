package compiler.ast;

import java.util.*;

public class Binop2 extends Node{
	public Node binop1;
	public String op;
	public Node binop2;

	public Binop2(Node binop1, String op, Node binop2){
		this.binop1 = binop1;
		this.op = op;
		this.binop2 = binop2;
	}

	public void print(String padding){
		this.binop1.print(padding);
		System.out.print(padding + op);
		this.binop2.print(padding);
	}
}