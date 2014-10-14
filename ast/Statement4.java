package compiler.ast;

import java.util.*;

public class Statement4 extends Node{
	public String kwFOR;
	public String id;
	public String ig;
	public Node expr1;
	public Node expr2;
	public Node block;

	public Statement4(String kwFOR, String id, String ig, Node expr1, Node expr2, Node block){
		this.kwFOR = kwFOR;
		this.id = id;
		this.ig = ig;
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.block = block;
	}

	public void print(String padding){
		System.out.print(padding + kwFOR);
		System.out.print(padding + id);
		System.out.print(padding + ig);
		this.expr1.print(padding);
		this.expr2.print(padding);
		this.block.print(padding);
	}
}