package compiler.ast;

import java.util.*;

public class ReturnStatement extends Node{
	public String retorno;
	public Node expresion;

	public ReturnStatement(String retorno, Node expresion){
		this.retorno = retorno;
		this.expresion = expresion;
	}

	public void print(String padding){
		if (expresion == null) {
			System.out.print(padding + this.retorno);
		}else{
			System.out.print(padding + this.retorno);
			this.expresion.print(padding + "\t");
		}	
	}
}