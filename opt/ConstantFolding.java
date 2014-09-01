package compiler.opt;

import java.io.PrintWriter;
import java.io.IOException;

public class ConstantFolding{
	public String outname= null;
	public PrintWriter writer;

	public ConstantFolding(String outname){
		this.outname = outname;
		try{
			writer = new PrintWriter(outname+".txt", "UTF-8");
		}catch(IOException e){
				System.out.println("Error en el write");
		}
			writer.println("optimizing: constant folding");
			writer.close();
	}
	
}