package compiler.irt;

import compiler.semantic.Semantic;
import java.io.PrintWriter;

public class Irt{
	public String outname = null;
	public Semantic semantic;
	public PrintWriter writer;
	public String target = null;

	public Irt(Semantic semantic){
		this.semantic = semantic;
		this.outname = this.semantic.outname;
		this.target = this.semantic.target;
		System.out.println("stage: IRT ");

		this.writer = this.semantic.writer;
		this.writer.println("stage: IRT ");

		if(this.target.equals("irt")){
			writer.close();
		}
	}
}