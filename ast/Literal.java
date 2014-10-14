package compiler.ast;

import java.util.*;

public class Literal extends Node{
	public String literal;

	public Literal(String literal){
		this.literal = literal;
	}

	public void print(String padding){
		System.out.println(padding + this.literal);
	}
}