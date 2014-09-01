package compiler.ast;

import compiler.parser.CC4Parser;
import java.io.PrintWriter;

public class Ast{
	public String outname = null;
	public CC4Parser parser;
	public PrintWriter writer;
	public String target = null;

	public Ast(CC4Parser parser){
		this.parser = parser;
		this.outname = this.parser.outname;
		this.target = this.parser.target;
		System.out.println("stage: Ast ");

		this.writer = this.parser.writer;
		this.writer.println("stage: Ast ");

		if(this.target.equals("ast")){
			writer.close();
		}
	}


}