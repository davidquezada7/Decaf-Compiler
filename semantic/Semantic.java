package compiler.semantic;

import compiler.ast.Root;
import compiler.ast.Ast;
import java.io.PrintWriter;

public class Semantic{
	public String outname = null;
	public Ast ast;
	public PrintWriter writer;
	public String target = null;
	public Root root;
	public SemanticVisitor semanticVisitor;

	public Semantic(Ast ast){
		this.ast = ast;
		this.outname = this.ast.outname;
		this.target = this.ast.target;
		this.root = this.ast.root;

		System.out.println("");
		System.out.println("stage: Semantic ");

		this.writer = this.ast.writer;
		this.writer.println("stage: Semantic ");

		if(this.target.equals("semantic")){
			writer.close();
		}
	}

	public void execute(){
		semanticVisitor = new SemanticVisitor();
		semanticVisitor.visit(root);
	}
}