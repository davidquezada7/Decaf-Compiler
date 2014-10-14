package compiler.ast;

import java.util.*;

public class Terminal extends Node{
	public String brk;


	public Terminal(String brk){
		this.brk = brk;
		
	}

	public void print(String padding){
		System.out.println(padding + this.brk);
	}
}
