lexer grammar SDecaf;

@lexer::header{
	package compiler.scanner;
	import java.util.*;
}

//espacios en blanco
WHITESPACE 	: 	( '\t' | ' ' | '\r' | '\n')+ {System.out.println("Espacio en blanco");} ;

//palabras reservadas
KW_IF  :  'if' {System.out.println("palabra reservada if");};
KW_BOOLEAN  :  'boolean' {System.out.println("palabra reservada boolean");};
KW_BREAK  :  'break' {System.out.println("palabra reservada break");};
KW_CALLOUT  :  'callout' {System.out.println("palabra reservada callout");};
KW_CONTINUE  :  'continue' {System.out.println("palabra reservada continue");};
KW_ELSE  :  'else' {System.out.println("palabra reservada else");};
KW_FALSE  :  'false' {System.out.println("palabra reservada false");};
KW_FOR  :  'for' {System.out.println("palabra reservada for");};
KW_WHILE  :  'while' {System.out.println("palabra reservada while");};
KW_INT  :  'int' {System.out.println("palabra reservada int");};
KW_RETURN  :  'return' {System.out.println("palabra reservada return");};
KW_TRUE  :  'true' {System.out.println("palabra reservada true");};
KW_VOID  :  'void' {System.out.println("palabra reservada void");};

//comentarios
COMMENT  : '//' '\n'  {System.out.println("Comentario");};

//string
STRING  :  '"'~('"')*'"' {System.out.println(" string");};

//caracter
CHAR  :  ('\'' . '\'') {System.out.println(" caracter ");};

//entero
INT : ('-')? ('0'..'9')+ {System.out.println("numero entero");};

//hexadecimal
HEX  :  '0x' (('a'..'f' | 'A'..'F' | '0'..'9'))+ {System.out.println("numero hexadecimal");};

//boolean
BOOLEAN  :  ('true' | 'false') {System.out.println("boolean");};

//ID
ID  :  (('a'..'z') | ('A'..'Z')) (('a'..'z') | ('A'..'Z') | ('0'..'9'))* {System.out.println("id");};

//caracteres especiales

QUOTE  :  '\"'  {System.out.println("Comilla doble");};
//SQUOTE  :  '\''  {System.out.println("Comilla simple");};
BSLASH  :  '\\'  {System.out.println("Backslash");};
PYC  : ';' {System.out.println("punto y coma");};
LSBRACKET :  '[' {System.out.print(" left square bracket ");};
RSBRACKET :  ']' {System.out.print(" right square bracket ");};
LCBRACKET :  '{' {System.out.print(" left curly bracket ");};
RCBRACKET :  '}' {System.out.print(" right curly bracket ");};
COMMA : ',' {System.out.print(" coma ");};
PA  :  '(' {System.out.print("parentesis abierto");};
PC  :  ')' {System.out.print("parentesis cerrado");};
NO  :  '!' {System.out.print("!");};

//operadores
PLUS : '+' {System.out.println("suma");};
DIV  : '/' {System.out.println("división");};
MULT : '*' {System.out.println("multiplicacion");};
RES  : '-' {System.out.println("resta");};
PRCNT  : '%' {System.out.println("porcentaje");};
AND  : '&&' {System.out.println("and");};
OR   : '||' {System.out.println("or");};
POT  : '^' {System.out.println("potencia");};
IG   : '=' {System.out.println("igual");};
DIG   : '==' {System.out.println("doble igual");};
PLUS_IG   : '+=' {System.out.println("igual");};
MIN_IG   : '-=' {System.out.println("igual");};
MAYOR  : '>' {System.out.println("mayor");};
MENOR  : '<' {System.out.println("menor");};
MAYORIGUAL  : '>=' {System.out.println("mayor o igual");};
MENORIGUAL  : '<=' {System.out.println("menor o igual");};
NOIGUAL  : '!=' {System.out.println("no igual");};

