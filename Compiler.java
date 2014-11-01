import compiler.scanner.*;
import compiler.parser.*;
import compiler.ast.*;
import compiler.semantic.*;
import compiler.irt.*;
import compiler.codegen.*;

import compiler.opt.*;

import compiler.lib.*;						//Importar

import java.io.*;
import java.util.LinkedList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Compiler{
	

	public static void main(String args[]){
	//CLASES
	Scanner scanner;
	CC4Parser parser;
	Ast ast;
	Semantic semantic;
	Irt irt;
	Codegen codegen;
	//OPT
		ConstantFolding constantFolding;
		Algebraic algebraic;
	//DEBUG
		Debug debug;
	//NOMBRE ARCHIVO ENTRADA
		int lengthArgs = args.length;
		String filename = args[lengthArgs-1];
	//NOMBRE ARCHIVO DE SALIDA
		String outname = filename;
	//VARIABLES AUXILIARES PARA EJECUTAR LA ULTIMA OPCION REPETIDA EN EL CLI
		boolean o_open = true;
		boolean target_open = true;
		boolean opt_open = true;
		boolean debug_open = true;
		boolean h_open = true;
	//TARGET
		String target = null;
	//OPTIMIZATION
		String optimization = null;
	//DEBUGER
		String stagesDebug = null;
	//Variable parametro que contendrá el valor de la opcion que se elija en el CLI
		String parametro = null;
	//LINKESLIST para darle la vuelta a la ejecucion de los comandos
		LinkedList <String> option = new LinkedList<String>();
		LinkedList <String> parameter = new LinkedList<String>();
	//ARREGLOS Las linked list option y parameter se convirtieron en arreglos de Strings para poder recorrerlos y ejecutarlos
		String[] opcion = new String[]{} ;
		String[] param = new String[]{};

		for(int cont = lengthArgs-1 ;0<=cont;cont--){
				switch(args[cont]){
					case "-o":
						if(o_open){
							o_open = false;
							System.out.println("************Entre a o");

							parametro = args[cont+1];
							System.out.println("************Parametro: "+parametro);

							option.addFirst("-o");
							parameter.addFirst(parametro);
						}
						break;
					case "-target":
						if(target_open){
							target_open = false;
							System.out.println("************Entre a target");

							parametro = args[cont+1];
							System.out.println("************Parametro: "+parametro);	

							option.addFirst("-target");
							parameter.addFirst(parametro);						
						}
						break;
					case "-opt":
						if(opt_open){
							opt_open = false;
							System.out.println("************Entre a opt");

							parametro = args[cont+1];
							System.out.println("************Parametro: "+parametro);		

							option.addFirst("-opt");
							parameter.addFirst(parametro);					
						}
						break;
					case "-debug":
						if(debug_open){
							debug_open = false;
							System.out.println("************Entre a debug");

							parametro = args[cont+1];
							System.out.println("************Parametro: "+parametro);

							option.addFirst("-debug");
							parameter.addFirst(parametro);							
						}
						break;
					case "-h":
						if(h_open){
							h_open = false;
							System.out.println("************Entre a h");
							System.out.println("************OPCIONES DE -h");		

							option.addFirst("-h");
							parameter.addFirst("null");				
						}
						break;

				}
				System.out.print(args[cont]+" ");
				System.out.println(cont);
		}

	//CONVERTIR LINKEDLISTS EN ARRAYS PARA LA EJECUCION
		opcion = option.toArray(new String[option.size()]);
		param = parameter.toArray(new String[parameter.size()]);

		int sizeOpcion = opcion.length;

	//LISTO PARA LA EJECUCION
		for (int cont2=0;cont2<sizeOpcion;cont2++) {
			// System.out.print("La opcion es: "+opcion[cont2]+" ");
			// System.out.println("El parametro es es: "+param[cont2]+" ");
			// System.out.println("");
			switch(opcion[cont2]){
				case "-o":
					outname = param[cont2];
					scanner = new Scanner(filename, outname, "end");
					scanner.execute();												//Si no está esta linea da un error de NULLPOINTEREXCEPTION
					parser = new CC4Parser(scanner);
					parser.execute();
					ast = new Ast(parser);
					semantic = new Semantic(ast);
					irt = new Irt(semantic);
					codegen = new Codegen(irt);

					break;
				case "-target":
					target = param[cont2];

					switch(target){
						case "scan":
							System.out.println("scan");
							System.out.println("");
							scanner = new Scanner(filename, outname, target);
							scanner.execute();

							break;
						case "parse":
							System.out.println("parse");
							System.out.println("");
							scanner = new Scanner(filename, outname, target);
							scanner.execute();
							parser = new CC4Parser(scanner);
							parser.execute();
							break;
						case "ast":
							System.out.println("ast");
							System.out.println("");
							scanner = new Scanner(filename, outname, target);
							scanner.execute();
							parser = new CC4Parser(scanner);
							parser.execute();
							ast = new Ast(parser);
							ast.execute();

							break;
						case "semantic":
							System.out.println("semantic");
							System.out.println("");
							
							scanner = new Scanner(filename, outname, target);
							scanner.execute();
							
							parser = new CC4Parser(scanner);
							parser.execute();
							
							ast = new Ast(parser);
							ast.execute();
							
							semantic = new Semantic(ast);
							semantic.execute();

							break;
						case "irt":
							System.out.println("irt");
							System.out.println("");
							scanner = new Scanner(filename, outname, target);
							parser = new CC4Parser(scanner);
							ast = new Ast(parser);
							semantic = new Semantic(ast);
							irt = new Irt(semantic);

							break;
						case "codegen":
							System.out.println("codegen");
							System.out.println("");
							scanner = new Scanner(filename, outname, target);
							parser = new CC4Parser(scanner);
							ast = new Ast(parser);
							semantic = new Semantic(ast);
							irt = new Irt(semantic);
							codegen = new Codegen(irt);

							break;

					}

					break;
				case "-opt":
					optimization = param[cont2];
					switch(optimization){
						case "constant":
							constantFolding = new ConstantFolding(outname);
							break;

						case "algebraic":
							algebraic = new Algebraic(outname);
							break;

					}
					break;
				case "-debug":
					stagesDebug = param[cont2];
					debug = new Debug(stagesDebug);

					break;
				case "-h":
					System.out.println("***********************************AYUDA**************************************");
					System.out.println("-o <outname>		Escribir el output a un archivo de texto");
					System.out.println("llamado <outname>.");
					System.out.println("");
					System.out.println("-target <stage>		Donde <stage> es uno de: scan, parse, ast, ");
					System.out.println("semantic, irt, codegen; la compilación debe proceder hasta la etapa indicada.");
					System.out.println("");
					System.out.println("Por ejemplo, si <stage> es scan, una instancia de scan debe ser creada imprimiendo");
					System.out.println("en el archivo de salida 'stage: scanning' ");
					System.out.println("Si es parse una instancia de parser debe ser creada a partir de la instancia de");
					System.out.println("scanner imprimiendo 'stage: parsing', además del mensaje de scanner y así sucesivamente. ");
					System.out.println("");
					System.out.println("-opt <optimzation>	<optimization> es uno de: constant, algebraic; la compilación");
					System.out.println("debe hacer solo la optimización que se le pida,y debe imprimir como en -target");
					System.out.println("'optimizing: constant folding' o 'optimizing: algebraic simplification' ");
					System.out.println("");
					System.out.println("-debug <stage>		Imprimir información de debugging. Debe haber un mensaje por cada");
					System.out.println("etapa listada en <stage> de la forma 'Debugging <stage>'.");
					System.out.println("<stage> tiene las mismas opciones de -target, con la diferencia que se pueden 'debuggear'");
					System.out.println("varias etapas, separandolas con ':' de la forma scan:parse:etc.");
					System.out.println("");
					System.out.println("-h			Muestra esta ayuda al usuario.");
					System.out.println("");
					System.out.println("******************************************************************************");
					break;
			}

		}

	

	}
}

