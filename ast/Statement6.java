package compiler.ast;

import java.util.*;

public class Statement6 extends Node{
	public String retorno;
	public Node expresion;

	public Statement6(String retorno, Node expresion){
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