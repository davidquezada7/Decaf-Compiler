package compiler.ast;

import java.util.*;

public class FieldDeclaration extends Node{

	public String fielT;
	public List<String> var;
	public List<String> arr;

	public FieldDeclaration(String fielT,List<String> var,List<String> arr){
		this.fielT = fielT;
		this.var = var;
		this.arr = arr;
	}

	public void print(String padding){
		System.out.print(  " ");
		System.out.print(  " ");
		int v = this.var.size(), a = this.arr.size();
		System.out.print(padding + this.fielT + " ");
		for(int i = 0; i < v; i++)
			System.out.print(padding + this.var.get(i));
		for(int i = 0; i < a; i = i + 2)
			System.out.print(padding + this.arr.get(i) + "[" + this.arr.get(i + 1) + "]");
		}
}