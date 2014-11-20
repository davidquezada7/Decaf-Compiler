package compiler.ast;

import java.util.*;

public class IntLiteral extends Node{
	public String literal;

	public IntLiteral(String literal){
		this.literal = literal;
	}

	public void print(String padding){
		System.out.println(padding + this.literal);
	}
}