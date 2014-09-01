package compiler.parser;

import org.antlr.v4.runtime.*;
import compiler.scanner.SDecaf;
import compiler.parser.Decaf;

import compiler.scanner.Scanner;
import java.io.PrintWriter;

public class CC4Parser{
	public String outname = null;
	public Scanner scanner;
	public PrintWriter writer;
	public String target = null;
	public String filename = null;

	public CC4Parser(Scanner scanner){
		this.scanner = scanner;
		this.outname = this.scanner.outname;
		this.target = this.scanner.target;
		this.filename = this.scanner.filename;
		System.out.println("stage: parser ");

		this.writer = this.scanner.writer;
		this.writer.println("stage: parser ");

		if(this.target.equals("parse")){
			writer.close();
		}

		execute();
		
	}

	public void execute(){
		try {	    
			(new Decaf(new CommonTokenStream(new SDecaf(new ANTLRFileStream(filename+ ".txt"))))).start();
	    } catch (ArrayIndexOutOfBoundsException aiobe) {
	    	System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens");
	        System.exit(1);
	    } catch (Exception e) {
	        System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens");
	        System.exit(1);
	    }
	}

}
