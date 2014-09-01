package compiler.codegen;

import compiler.irt.Irt;
import java.io.PrintWriter;

public class Codegen{
	public String outname = null;
	public Irt irt;
	public PrintWriter writer;
	public String target = null;

	public Codegen(Irt irt){
		this.irt = irt;
		this.outname = this.irt.outname;
		this.target = this.irt.target;
		System.out.println("stage: Codegen ");

		this.writer = this.irt.writer;
		this.writer.println("stage: Codegen ");
		writer.close();

		if(this.target.equals("codegen")){
			writer.close();
		}
	}
}