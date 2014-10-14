package compiler.ast;

import java.util.*;

public class Statement7 extends Node{
	public String brk;


	public Statement7(String brk){
		this.brk = brk;
		
	}

	public void print(String padding){
		System.out.println(padding + this.brk);
	}
}
