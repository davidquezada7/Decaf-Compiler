package compiler.ast;

import java.util.*;
import compiler.parser.Decaf;
import compiler.parser.DecafBaseVisitor;

public class Block extends Node{
	public LinkedList<FieldDeclaration> fields;
	public LinkedList<Terminal> statements;
	public LinkedList<Statement1> statements1;
	public LinkedList<AuxMCall1> statements2;
	public LinkedList<Statement3> statements3;
	public LinkedList<Statement4> statements4;
	public LinkedList<Statement5> statements5;
	public LinkedList<Statement6> statements6;

	public Block(LinkedList<FieldDeclaration> f, LinkedList<Terminal> statements, LinkedList<Statement1> statements1,LinkedList<Statement3> statements3, LinkedList<Statement4> statements4, LinkedList<Statement5> statements5, LinkedList<Statement6> statements6, LinkedList<AuxMCall1> statements2){
		//System.out.print("holi");
		this.fields = f;
		this.statements = statements;
		this.statements1 = statements1;
		this.statements2 = statements2;
		this.statements3 = statements3;
		this.statements4 = statements4;
		this.statements5 = statements5;
		this.statements6 = statements6;
	}

	public void print(String padding){
		//System.out.print("asdfasd");
		int f = this.fields.size(), s = this.statements.size(), s1 = this.statements1.size(),s2 = this.statements2.size(), s3 = this.statements3.size(), s4 = this.statements4.size(), s5 = this.statements5.size(), s6 = this.statements6.size();
		for(int i = 0; i < f; i++)
			this.fields.get(i).print("     ");

		for(int i = 0; i < s; i++)
			this.statements.get(i).print("     ");

		for(int i = 0; i < s1; i++)
			this.statements1.get(i).print("     ");

		for(int i = 0; i < s2; i++)
			this.statements2.get(i).print("     ");

		for(int i = 0; i < s3; i++)
			this.statements3.get(i).print("     ");

		for(int i = 0; i < s4; i++)
			this.statements4.get(i).print("     ");

		for(int i = 0; i < s5; i++)
			this.statements5.get(i).print("     ");

		for(int i = 0; i < s6; i++)
			this.statements6.get(i).print("     ");
			
	}
}
