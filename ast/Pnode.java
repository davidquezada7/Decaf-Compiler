package compiler.ast;

import java.util.*;

public class Pnode extends Node{
	public Node nd;


	public Pnode(Node nd){
		this.nd = nd;
		
	}

	public void print(String padding){
		this.nd.print("     ");
	}
}