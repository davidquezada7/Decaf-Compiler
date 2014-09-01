parser grammar Decaf;

options {
    tokenVocab=SDecaf;
}

@parser::header{
  package compiler.parser;
}


start: (callout_decl)* (field_decl)* (method_decl)*									{System.out.println ("	program");} ;

callout_decl: KW_CALLOUT ID	PYC														{System.out.println ("		callout_decl");} ;	

field_decl: type (ID COMMA| ID LSBRACKET int_literal RSBRACKET COMMA )+	PYC			{System.out.println ("		field_decl");} ;

type: (KW_INT | KW_BOOLEAN)															{System.out.println ("			type");} ;

int_literal: (INT | HEX)															{System.out.println ("			int_literal");} ;

method_decl: (type|KW_VOID) ID PA ( (type ID COMMA)+ )? PC block					{System.out.println ("		method_decl");} ;

block: LCBRACKET (field_decl)* (statement)* RCBRACKET								{System.out.println ("			block");} ;

statement: 
		( 	location assign_opp expr PYC
		|	method_call PYC
		|	KW_IF PA expr PC block (KW_ELSE block)?
		|	KW_FOR PA ID IG expr COMMA expr PC block
		|	KW_WHILE PA expr PC block
		|	KW_RETURN	(expr)?
		|	KW_BREAK PYC
		|  	KW_CONTINUE PYC)														{System.out.println ("			statement");} ;

location: 
		( 	ID
		|	ID LSBRACKET expr RSBRACKET)											{System.out.println ("			location");} ;

expr: 	
		( 	location
		|	method_call
		|	literal 
		| 	expr bin_op expr
		|	RES expr
		|	NO expr
		| 	PA expr PC)																{System.out.println ("			expr");} ;															

assign_opp: 
		(	IG
		|	PLUS_IG
		|	MIN_IG)																	{System.out.println ("			assign_opp");} ;

method_call:
		( 	method_name PA ((expr COMMA)+)? PC
		|	method_name PA ((callout_arg COMMA)+)? PC)								{System.out.println ("			method_call");} ;

method_name: ID																		{System.out.println ("			method_name");} ;

callout_arg: (expr | STRING)														{System.out.println ("			callout_arg");} ;

literal: (int_literal | char_literal | bool_literal)								{System.out.println ("			literal");} ;

char_literal: CHAR 																	{System.out.println ("			char_literal");} ;

bool_literal: BOOLEAN 																{System.out.println ("			bool_literal");} ;

bin_op: (
			arith_op
		|	rel_op
		|	eq_op
		|	cond_op)																{System.out.println ("			bin_op");} ;

arith_op:
		(
			PLUS
		|	RES
		|	MULT
		|	DIV
		|	PRCNT
			)																		{System.out.println ("			arith_op");} ;

rel_op:
		(
			MENOR
		|	MAYOR
		| 	MENORIGUAL
		|	MAYORIGUAL
			)																		{System.out.println ("			rel_op");} ;

eq_op:
		(
			DIG
		|	NOIGUAL
			)																		{System.out.println ("			eq_op");} ;

cond_op:
		(
			AND
		|	OR
			)																		{System.out.println ("			cond_op");} ;













