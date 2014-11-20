package compiler.ast;

import java.util.*;

public class CharLiteral extends Node{
	public String literal;

	public CharLiteral(String literal){
		this.literal = literal;
	}

	public void print(String padding){
		System.out.println(padding + this.literal);
	}
}