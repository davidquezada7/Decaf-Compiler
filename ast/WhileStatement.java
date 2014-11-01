package compiler.ast;

import java.util.*;

public class WhileStatement extends Node{
	public String kwWHILE;
	public Node expr;
	public Node block;

	public WhileStatement(String kwWHILE, Node expr, Node block){
		this.kwWHILE = kwWHILE;
		this.expr = expr;
		this.block = block;
	}

	public void print(String padding){
		System.out.print(padding + kwWHILE);
		this.expr.print(padding);
		this.block.print(padding);
	}
}