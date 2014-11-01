package compiler.ast;


import compiler.parser.CC4Parser;
import compiler.scanner.*;
import java.io.PrintWriter;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import compiler.parser.*;


public class Ast{
	public String outname = null;
	public CC4Parser parser;
	public PrintWriter writer;
	public String target = null;
	public String filename = null;
	public Scanner scanner;
	public Decaf decaf;
	public Root root;
	public AstVisitor visitor;
	public ParseTree tree;

	public Ast(CC4Parser parser){
		this.parser = parser;
		this.scanner = this.parser.scanner;
		this.decaf = this.parser.decaf;
		this.outname = this.parser.outname;
		this.target = this.parser.target;
		this.filename = this.parser.filename;
		System.out.println("stage: Ast ");

		this.writer = this.parser.writer;
		this.writer.println("stage: Ast ");

		if(this.target.equals("ast")){
			writer.close();
		}
	}

	public void execute(){
		String nameArbol = "arbol.s";
		try{ 

	      //obtener arbol de parseo
		  this.decaf.reset();
	      tree = decaf.start();
	      //System.out.println(tree.toStringTree(decaf));

	      //usar visitor para recorrer el arbol y tomar los elementos que interesan
	      visitor = new AstVisitor();


	      root = (Root) visitor.visit(tree);
	      root.print();	


		} catch (ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
     		 System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens");
     		 System.exit(1);
   		} catch (Exception e) {
   			e.printStackTrace();
      		System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens");
      		System.exit(1);
    	} 
			    
	}

}