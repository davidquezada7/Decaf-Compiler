lexer grammar SDecaf;

@lexer::header{
	package compiler.scanner;
	import java.util.*;
}



//espacios en blanco
WHITESPACE 	: 	( '\t' | ' ' | '\r' | '\n')+ {skip();} ;

//comentarios
COMMENT		:	'//'~('\n')* ('\n')? {skip();};

//palabras reservadas
KW_IF  :  'if' {System.out.print("kw_if");};
KW_BOOLEAN  :  'boolean' {System.out.print("kw_boolean");};
KW_BREAK  :  'break' {System.out.print("kw_break");};
KW_CALLOUT  :  'callout' {System.out.print("kw_callout");};
KW_CONTINUE  :  'continue' {System.out.print("kw_continue");};
KW_ELSE  :  'else' {System.out.print("kw_else");};
KW_FALSE  :  'false' {System.out.print("kw_false");};
KW_FOR  :  'for' {System.out.print("kw_for");};
KW_WHILE  :  'while' {System.out.print("kw_while");};
KW_INT  :  'int' {System.out.print("kw_int");};
KW_RETURN  :  'return' {System.out.print("kw_return");};
KW_TRUE  :  'true' {System.out.print("kw_true");};
KW_VOID  :  'void' {System.out.print("kw_void");};


//string
STRING  :  '"' (~('\n') | (('\\')('\'')) | (('\\')('\"')) | '\t' | '\\')* '"' {System.out.print(" string");};

//caracter
ERR1_CHAR  : '\'' '\'' 				'\'' 	 									{System.out.print(" unexpected char: ''' ");};
ERR2_CHAR  : '\'' '\\' ~('n'|'t'|'\\'|'\"')   '\''  										{System.out.print(" unexpected char: 'p' ");};

																	
CHAR  :  '\'' (~('\''|'\"'|'\\'|' ') |'\\n' | '\\t' | '\\''\\'|'\\''\"')   '\'' 				{System.out.print(" caracter ");};


ERR3_CHAR  : '\'' ~('\'') (AUXERROR3)+		'\''									{System.out.print(" unexpected char: Allowed one char ");};
fragment AUXERROR3 : ~('\'') ;

ERR4_CHAR : '\'' '\"' '\''															{System.out.print(" unexpected char: '\"' ");};
ERR5_CHAR : '\'' '\\' '\'' '\n'															{System.out.print(" expecting ''', found '\\ n' ");};


INT : ('-')? ('0'..'9')+ {System.out.print("numero entero");};

//hexadecimal
HEX  :  '0x' ('a'..'f' | 'A'..'F' | '0'..'9')+ {System.out.print("numero hexadecimal");};
ERR_HEX  :  '0x'	{System.out.print("hexadecimal no valido");};

//boolean
BOOLEAN  :  ('true' | 'false') {System.out.print("boolean");};

//ID
ID  :  (('a'..'z') | ('A'..'Z') | '_') (('a'..'z') | '_' | ('A'..'Z') | ('0'..'9'))* {System.out.print("id");};

//caracteres especiales

QUOTE  :  '\"'  {System.out.print("\"");};
//SQUOTE  :  '\''  {System.out.print("Comilla simple");};
BSLASH  :  '\\'  {System.out.print("\\");};
PYC  : ';' {System.out.print(";");};
LSBRACKET :  '[' {System.out.print(" [ ");};
RSBRACKET :  ']' {System.out.print(" ] ");};
LCBRACKET :  '{' {System.out.print(" { ");};
RCBRACKET :  '}' {System.out.print(" } ");};
COMMA : ',' {System.out.print(" , ");};
PA  :  '(' {System.out.print(" ( ");};
PC  :  ')' {System.out.print(" ) ");};
NO  :  '!' {System.out.print(" ! ");};

//operadores
PLUS : '+' {System.out.print(" + ");};
DIV  : '/' {System.out.print(" / ");};
MULT : '*' {System.out.print(" * ");};
RES  : '-' {System.out.print(" - ");};
PRCNT  : '%' {System.out.print(" % ");};
AND  : '&&' {System.out.print(" and ");};
OR   : '||' {System.out.print(" or ");};
POT  : '^' {System.out.print(" ^ ");};
IG   : '=' {System.out.print(" = ");};
DIG   : '==' {System.out.print(" == ");};
PLUS_IG   : '+=' {System.out.print(" += ");};
MIN_IG   : '-=' {System.out.print(" -= ");};
MAYOR  : '>' {System.out.print(" > ");};
MENOR  : '<' {System.out.print(" < ");};
MAYORIGUAL  : '>=' {System.out.print(" >= ");};
MENORIGUAL  : '<=' {System.out.print(" <= ");};
NOIGUAL  : '!=' {System.out.print(" != ");};

