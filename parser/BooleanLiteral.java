package compiler.ast;

import java.util.*;

public class BooleanLiteral extends Node{
	public String literal;

	public BooleanLiteral(String literal){
		this.literal = literal;
	}

	public void print(String padding){
		System.out.println(padding + this.literal);
	}
}