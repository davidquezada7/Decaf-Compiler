package compiler.ast;

import java.util.*;

public class IfStatement extends Node{
	public String kwIF;
	public Node expr;
	public Node block1;
	public Node block2;
	public String kwELSE;

	public IfStatement(String kwIF, Node expr, Node block1, String kwELSE, Node block2){
		this.kwIF = kwIF;
		this.expr = expr;
		this.block1 = block1;
		this.kwELSE = kwELSE;
		this.block2 = block2;
	}

	public void print(String padding){
		if (block2 == null) {
			System.out.print(padding + kwIF);
			this.expr.print(padding);
			System.out.println("" + padding);
			this.block1.print(padding);
		}else{
			System.out.print(padding + kwIF);
			this.expr.print(padding);
			this.block1.print(padding);
			System.out.print(padding + kwELSE);
			this.block2.print(padding);
		}
		
	}
}