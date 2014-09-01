package compiler.opt;

import java.io.PrintWriter;
import java.io.IOException;

public class Algebraic{
	public String outname = null;
	public PrintWriter writer;
	public Algebraic(String outname){
		this.outname = outname;
		try{
			writer = new PrintWriter(outname+".txt","UTF-8");
		}catch(IOException e){
				System.out.println("Error en el write");
		}
			writer.println("optimizing: algebraic simplification");
			writer.close();

	}
	
}