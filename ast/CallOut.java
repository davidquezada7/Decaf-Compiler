package compiler.ast;

import java.util.*;

public class CallOut extends Node {
	public String id = null;
	public String callout = null;

	public CallOut(String id, String callout){
		this.id = id;
		this.callout = callout;
			
	}

	public void print(String padding){
		/*
			imprimir tanto el signo como los hijos
		*/
			System.out.println(padding + this.callout);
			System.out.println(padding + "\t" +this.id);
			
			
	}
}