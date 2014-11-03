package compiler.ast;

import java.util.*;

public class MethodDecl extends Node{

	public String methodT;
	public String methodN;
	public List v;
	public List type;
	public Block bloque;

	public MethodDecl(String methodT,String methodN,List v, List type, Block b){
		this.methodT = methodT;
		this.methodN = methodN;
		this.v = v;
		this.type = type;
		this.bloque = b;
	}

	 public void print(String padding){

	   if ((methodT.equals("int")) || (methodT.equals("boolean"))) {
		   System.out.print(methodT + " ");
		   System.out.print(methodN + " ");
		   for(int a = 1; a < v.size() ;a++){
		  	System.out.print(padding + type.get(a)+" ");
		   	System.out.print(padding + v.get(a)+" ");
		   }
		   System.out.println("");
		   this.bloque.print(padding);
		  }else{
		   System.out.print(methodT + " ");
		   System.out.print(methodN + " ");
		   for(int a = 0; a < v.size() ;a++){
		    System.out.print(padding + type.get(a)+" ");
		    System.out.print(padding + v.get(a)+" ");
		   }
		   System.out.println("");
		   this.bloque.print(padding);
		  }
 		}
}