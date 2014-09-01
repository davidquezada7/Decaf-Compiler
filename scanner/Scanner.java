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
		execute();
	}

	public void execute(){
		
		int token;
		try{
		
			writer = new PrintWriter(outname+".txt" ,  "UTF-8");

		    SDecaf lexer = new SDecaf(new ANTLRFileStream(filename+".txt"));
		    while (lexer.nextToken().getType() != Token.EOF){
		    	token = lexer.getType();
		    	switch(token){
		    		case 1:
		    			System.out.println("Tipo: whitespace" + "\n");
		    			writer.append("Tipo: whitespace" + "\n");
		    			break;
		    		case 2:
		    			System.out.println("Tipo: if " + "\n");
		    			writer.append("Tipo: if "  + "\n");
		    			break;
		    		case 3:
		    			System.out.println("Tipo: boolean "  + "\n");
		    			writer.append("Tipo: boolean "  + "\n");
		    			break;
		    		case 4:
		    			System.out.println("Tipo: break"  + "\n");
		    			writer.append("Tipo: break "  + "\n");
		    			break;
		    		case 5:
		    			System.out.println("Tipo: callout"  + "\n");
		    			writer.append("Tipo: callout "  + "\n");
		    			break;
		    		case 6:
		    			System.out.println("Tipo: continue"  + "\n");
		    			writer.append("Tipo: continue "  + "\n");
		    			break;
		    		case 7:
		    			System.out.println("Tipo: else"  + "\n");
		    			writer.append("Tipo: else "  + "\n");
		    			break;
		   			case 8:
		    			System.out.println("Tipo: false" + "\n");
		    			writer.append("Tipo: false "  + "\n");
		    			break;
		   			case 9:
		    			System.out.println("Tipo: for" + "\n");
		    			writer.append("Tipo: for "  + "\n");
		    			break;
		   			case 10:
		    			System.out.println("Tipo: while"  + "\n");
		    			writer.append("Tipo: while "  + "\n");
		    			break;
		   			case 11:
		    			System.out.println("Tipo: int"  + "\n");
		    			writer.append("Tipo: int "  + "\n");
		    			break;
	    			case 12:
		    			System.out.println("Tipo: return"  + "\n");
		    			writer.append("Tipo: return "  + "\n");
		    			break;
	    			case 13:
		    			System.out.println("Tipo: true"  + "\n");
		    			writer.append("Tipo: true "  + "\n");
		    			break;
		    		case 14:
		    			System.out.println("Tipo: void"  + "\n");
		    			writer.append("Tipo: void "  + "\n");
		    			break;
		    		case 15:
		    			System.out.println("Tipo: comment" + "\n");
		    			writer.append("Tipo: comment "  + "\n");
		    			break;
		   			case 16:
		    			System.out.println("Tipo: string"  + "\n");
		    			writer.append("Tipo: string "  + "\n");
		    			break;
		  			case 17:
		    			System.out.println("Tipo: char"  + "\n");
		    			writer.append("Tipo: char "  + "\n");
		    			break;
		   			case 18:
		    			System.out.println("Tipo: int"  + "\n");
		    			writer.append("Tipo: int "  + "\n");
		    			break;
	    			case 19:
		    			System.out.println("Tipo: hex"  + "\n");
		    			writer.append("Tipo: hex "  + "\n");
		    			break;
	    			case 20:
		    			System.out.println("Tipo: boolean"  + "\n");
		    			writer.append("Tipo: boolean "  + "\n");
		    			break;
		    		case 21:
		    			System.out.println("Tipo: id"  + "\n");
		    			writer.append("Tipo: id "   + "\n");
		    			break;
		    		case 22:
		    			System.out.println("Tipo: quote"  + "\n");
		    			writer.append("Tipo: quote "  + "\n");
		    			break;
		    		case 23:
		    			System.out.println("Tipo: single quote" + "\n");
		    			writer.append("Tipo: single quote "  + "\n");
		    			break;
		   			case 24:
		    			System.out.println("Tipo: backslash"  + "\n");
		    			writer.append("Tipo: backslash "  + "\n");
		    			break;
		   			case 25:
		    			System.out.println("Tipo: punto y coma"  + "\n");
		    			writer.append("Tipo: punto y coma "  + "\n");
		    			break;
		   			case 26:
		    			System.out.println("Tipo: left square bracket" + "\n");
		    			writer.append("Tipo: left square bracket "  + "\n");
		    			break;
		   			case 27:
		    			System.out.println("Tipo: right square bracket"  + "\n");
		    			writer.append("Tipo: right square bracket "  + "\n");
		    			break;
	    			case 28:
		    			System.out.println("Tipo: right curly bracket" + "\n");
		    			writer.append("Tipo: right curly bracket "  + "\n");
		    			break;
	    			case 29:
		    			System.out.println("Tipo: left curly bracket" + "\n");
		    			writer.append("Tipo: left curly bracket "  + "\n");
		    			break;
		    		case 30:
		    			System.out.println("Tipo: comma" + "\n");
		    			writer.append("Tipo: comma "    + "\n");
		    			break;
		    		case 31:
		    			System.out.println("Tipo: parentesis abierto"  + "\n");
		    			writer.append("Tipo: parentesis abierto "  + "\n");
		    			break;
		    		case 32:
		    			System.out.println("Tipo: parentesis cerrado"  + "\n");
		    			writer.append("Tipo: parentesis cerrado "  + "\n");
		    			break;
		   			case 33:
		    			System.out.println("Tipo: no" + "\n");
		    			writer.append("Tipo: no "  + "\n");
		    			break;
		   			case 34:
		    			System.out.println("Tipo: plus" + "\n");
		    			writer.append("Tipo: plus "  + "\n");
		    			break;
		   			case 35:
		    			System.out.println("Tipo: division"  + "\n");
		    			writer.append("Tipo: division "  + "\n");
		    			break;
		   			case 36:
		    			System.out.println("Tipo: multiplicacion" + "\n");
		    			writer.append("Tipo: multiplicacion "  + "\n");
		    			break;
	    			case 37:
		    			System.out.println("Tipo: minus"  + "\n");
		    			writer.append("Tipo: minus "  + "\n");
		    			break;
	    			case 38:
		    			System.out.println("Tipo: porcentaje"  + "\n");
		    			writer.append("Tipo: porcentaje "  + "\n");
		    			break;
		    		case 39:
		    			System.out.println("Tipo: and"  + "\n");
		    			writer.append("Tipo: and "  + "\n");
		    			break;
		    		case 40:
		    			System.out.println("Tipo: or" + "\n");
		    			writer.append("Tipo: or "  + "\n");
		    			break;
		    		case 41:
		    			System.out.println("Tipo: potencia" + "\n");
		    			writer.append("Tipo: potencia "  + "\n");
		    			break;
		   			case 42:
		    			System.out.println("Tipo: igual" + "\n");
		    			writer.append("Tipo: igual "  + "\n");
		    			break;
		   			case 43:
		    			System.out.println("Tipo: doble igual" + "\n");
		    			writer.append("Tipo: doble igual "  + "\n");
		    			break;
		   			case 44:
		    			System.out.println("Tipo: mas igual" + "\n");
		    			writer.append("Tipo: mas igual "  + "\n");
		    			break;
		   			case 45:
		    			System.out.println("Tipo: menos igual"  + "\n");
		    			writer.append("Tipo: menos igual "  + "\n");
		    			break;
	    			case 46:
		    			System.out.println("Tipo: mayor"  + "\n");
		    			writer.append("Tipo: mayor "  + "\n");
		    			break;
	    			case 47:
		    			System.out.println("Tipo: menor" + "\n");
		    			writer.append("Tipo: menor "  + "\n");
		    			break;
		    		case 48:
		    			System.out.println("Tipo: mayor igual"  + "\n");
		    			writer.append("Tipo: mayor igual "  + "\n");
		    			break;
		    		case 49:
		    			System.out.println("Tipo: menor igual" + "\n");
		    			writer.append("Tipo: menor igual "  + "\n");
		    			break;
		    		case 50:
		    			System.out.println("Tipo: no igual"  + "\n");
		    			writer.append("Tipo: no igual "  + "\n");
		    			break;
		    	}
		    	System.out.println("Linea: " + lexer.getLine() + " ");
		    	writer.append("Linea: " + lexer.getLine() + " ");
		    	System.out.println("Columna: " + lexer.getCharPositionInLine() + " ");
		    	writer.append("Columa: " + lexer.getCharPositionInLine() + " ");
		    	System.out.println("lexema: " + lexer.getText() + " ");
		    	writer.append("lexema: " + lexer.getText() + " ");
		    	writer.println("");
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