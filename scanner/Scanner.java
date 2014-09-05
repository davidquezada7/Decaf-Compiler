package compiler.scanner;

import org.antlr.v4.runtime.*;
import compiler.scanner.SDecaf;
import java.io.*;
import java.util.*;

public class Scanner {
	public String filename = null;
	public String outname = null;
	public String target = null;
	public PrintWriter writer;

	public Scanner(String filename, String outname, String target){
		this.filename = filename;
		this.outname = outname;
		this.target = target;
	}

	public void execute(){
		
		int token;
		try{
		
			writer = new PrintWriter(outname+".s" ,  "UTF-8");

		    SDecaf lexer = new SDecaf(new ANTLRFileStream(filename+".txt"));
		    while (lexer.nextToken().getType() != Token.EOF){
		    	token = lexer.getType();
		    	switch(token){
		    		case 1:
		    			System.out.print(" Tipo: WHITESPACE ");
		    			writer.append(" Tipo: WHITESPACE ");
		    			break;
		    		case 2:
		    			System.out.print(" Tipo: COMMENT ");
		    			writer.append(" Tipo: COMMENT ");
		    			break;
		    		case 3:
		    			System.out.print(" Tipo: KW_IF ");
		    			writer.append(" Tipo: KW_IF ");
		    			break;
		    		case 4:
		    			System.out.print(" Tipo: KW_BOOLEAN ");
		    			writer.append(" Tipo: KW_BOOLEAN ");
		    			break;
		    		case 5:
		    			System.out.print(" Tipo: callout ");
		    			writer.append(" Tipo: callout ");
		    			break;
		    		case 6:
		    			System.out.print(" Tipo: continue ");
		    			writer.append(" Tipo: continue ");
		    			break;
		    		case 7:
		    			System.out.print(" Tipo: else ");
		    			writer.append(" Tipo: else ");
		    			break;
		   			case 8:
		    			System.out.print(" Tipo: false ");
		    			writer.append(" Tipo: false ");
		    			break;
		   			case 9:
		    			System.out.print(" Tipo: for ");
		    			writer.append(" Tipo: for ");
		    			break;
		   			case 10:
		    			System.out.print(" Tipo: while ");
		    			writer.append(" Tipo: while ");
		    			break;
		   			case 11:
		    			System.out.print(" Tipo: int ");
		    			writer.append(" Tipo: int ");
		    			break;
	    			case 12:
		    			System.out.print(" Tipo: return ");
		    			writer.append(" Tipo: return ");
		    			break;
	    			case 13:
		    			System.out.print(" Tipo: true ");
		    			writer.append(" Tipo: true ");
		    			break;
		    		case 14:
		    			System.out.print(" Tipo: void ");
		    			writer.append(" Tipo: void ");
		    			break;
		    		case 15:
		    			System.out.print(" Tipo: comment ");
		    			writer.append(" Tipo: comment ");
		    			break;
		   			case 16:
		    			System.out.print(" Tipo: string ");
		    			writer.append(" Tipo: string ");
		    			break;
		  			case 17:
		    			System.out.print(" Tipo: char ");
		    			writer.append(" Tipo: char ");
		    			break;
		   			case 18:
		    			System.out.print(" Tipo: int ");
		    			writer.append(" Tipo: int ");
		    			break;
	    			case 19:
		    			System.out.print(" Tipo: hex ");
		    			writer.append(" Tipo: hex ");
		    			break;
	    			case 20:
		    			System.out.print(" Tipo: boolean ");
		    			writer.append(" Tipo: boolean ");
		    			break;
		    		case 21:
		    			System.out.print(" Tipo: id ");
		    			writer.append(" Tipo: id ");
		    			break;
		    		case 22:
		    			System.out.print(" Tipo: quote ");
		    			writer.append(" Tipo: quote ");
		    			break;
		    		case 23:
		    			System.out.print(" Tipo: single quote ");
		    			writer.append(" Tipo: single quote ");
		    			break;
		   			case 24:
		    			System.out.print(" Tipo: backslash ");
		    			writer.append(" Tipo: backslash ");
		    			break;
		   			case 25:
		    			System.out.print(" Tipo: punto y coma ");
		    			writer.append(" Tipo: punto y coma ");
		    			break;
		   			case 26:
		    			System.out.print(" Tipo: left square bracket ");
		    			writer.append(" Tipo: left square bracket ");
		    			break;
		   			case 27:
		    			System.out.print(" Tipo: right square bracket ");
		    			writer.append(" Tipo: right square bracket ");
		    			break;
	    			case 28:
		    			System.out.print(" Tipo: right curly bracket ");
		    			writer.append(" Tipo: right curly bracket ");
		    			break;
	    			case 29:
		    			System.out.print(" Tipo: left curly bracket ");
		    			writer.append(" Tipo: left curly bracket ");
		    			break;
		    		case 30:
		    			System.out.print(" Tipo: comma ");
		    			writer.append(" Tipo: comma ");
		    			break;
		    		case 31:
		    			System.out.print(" Tipo: parentesis abierto ");
		    			writer.append(" Tipo: parentesis abierto ");
		    			break;
		    		case 32:
		    			System.out.print(" Tipo: parentesis cerrado ");
		    			writer.append(" Tipo: parentesis cerrado ");
		    			break;
		   			case 33:
		    			System.out.print(" Tipo: no ");
		    			writer.append(" Tipo: no ");
		    			break;
		   			case 34:
		    			System.out.print(" Tipo: plus ");
		    			writer.append(" Tipo: plus ");
		    			break;
		   			case 35:
		    			System.out.print(" Tipo: division ");
		    			writer.append(" Tipo: division ");
		    			break;
		   			case 36:
		    			System.out.print(" Tipo: multiplicacion ");
		    			writer.append(" Tipo: multiplicacion ");
		    			break;
	    			case 37:
		    			System.out.print(" Tipo: minus ");
		    			writer.append(" Tipo: minus ");
		    			break;
	    			case 38:
		    			System.out.print(" Tipo: porcentaje ");
		    			writer.append(" Tipo: porcentaje ");
		    			break;
		    		case 39:
		    			System.out.print(" Tipo: and ");
		    			writer.append(" Tipo: and ");
		    			break;
		    		case 40:
		    			System.out.print(" Tipo: or ");
		    			writer.append(" Tipo: or ");
		    			break;
		    		case 41:
		    			System.out.print(" Tipo: potencia ");
		    			writer.append(" Tipo: potencia ");
		    			break;
		   			case 42:
		    			System.out.print(" Tipo: igual ");
		    			writer.append(" Tipo: igual ");
		    			break;
		   			case 43:
		    			System.out.print(" Tipo: doble igual ");
		    			writer.append(" Tipo: doble igual ");
		    			break;
		   			case 44:
		    			System.out.print(" Tipo: mas igual ");
		    			writer.append(" Tipo: mas igual ");
		    			break;
		   			case 45:
		    			System.out.print(" Tipo: menos igual ");
		    			writer.append(" Tipo: menos igual ");
		    			break;
	    			case 46:
		    			System.out.print(" Tipo: mayor ");
		    			writer.append(" Tipo: mayor ");
		    			break;
	    			case 47:
		    			System.out.print(" Tipo: menor ");
		    			writer.append(" Tipo: menor ");
		    			break;
		    		case 48:
		    			System.out.print(" Tipo: mayor igual ");
		    			writer.append(" Tipo: mayor igual ");
		    			break;
		    		case 49:
		    			System.out.print(" Tipo: menor igual ");
		    			writer.append(" Tipo: menor igual ");
		    			break;
		    		case 50:
		    			System.out.print(" Tipo: no igual ");
		    			writer.append(" Tipo: no igual ");
		    			break;
		    	}
		    	System.out.print("Linea: " + lexer.getLine() + " ");
		    	writer.append("Linea: " + lexer.getLine() + " ");
		    	System.out.print("Columna: " + lexer.getCharPositionInLine() + " ");
		    	writer.append("Columa: " + lexer.getCharPositionInLine() + " ");
		    	System.out.println("lexema: " + lexer.getText() + " ");
		    	writer.append("lexema: " + lexer.getText() + "\n ");
		    	writer.print("");
		    }
		    if(this.target.equals("scan")){
				writer.close();
			}
		    
		}catch(ArrayIndexOutOfBoundsException aiobe){
		    System.err.println("Must provide a valid path to the filename with the tokens");
		    System.exit(1);
		}catch(Exception e){
		    System.err.println("Must provide a valid path to the filename with the tokens");
		    System.exit(1);
		}
	}
}