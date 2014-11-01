package compiler.ast;

import java.util.*;

public class Res extends Node{
	public String op;
	public Node binop;

	public Res(String op, Node binop){
		this.op = op;
		this.binop = binop;
	}

	public void print(String padding){
		System.out.print(padding + op);
		this.binop.print(padding);
	}
}