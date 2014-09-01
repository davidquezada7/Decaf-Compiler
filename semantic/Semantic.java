package compiler.semantic;

import compiler.ast.Ast;
import java.io.PrintWriter;

public class Semantic{
	public String outname = null;
	public Ast ast;
	public PrintWriter writer;
	public String target = null;

	public Semantic(Ast ast){
		this.ast = ast;
		this.outname = this.ast.outname;
		this.target = this.ast.target;
		System.out.println("stage: Semantic ");

		this.writer = this.ast.writer;
		this.writer.println("stage: Semantic ");

		if(this.target.equals("semantic")){
			writer.close();
		}
	}
}