package compiler.ast;

import java.util.*;

public class Asignation extends Node{
	public Node op;
	public Node expr;
	public Node location;

	public Asignation(Node location, Node expr, Node op){
		this.location = location;
		this.expr = expr;
		this.op = op;
	}

	public void print(String padding){
		this.op.print(padding);
		this.location.print(padding + padding);
		this.expr.print(padding + padding);
	}
}