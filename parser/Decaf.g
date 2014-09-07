parser grammar Decaf;

options {
    tokenVocab=SDecaf;
}

@parser::header{
  package compiler.parser;
}


start: (callout_decl)* /* (field_decl)* (method_decl)* */ 										#inicio ;

callout_decl: KW_CALLOUT ID PYC     														            #calloutDecl ;

/*
field_decl: (KW_INT | KW_BOOLEAN) ID (LSBRACKET (INT | HEX) RSBRACKET)? 
			(COMMA ID (LSBRACKET (INT | HEX) RSBRACKET)?)* PYC  							  	#fieldDecl ; 




method_decl: (type|KW_VOID) ID PA (type ID (COMMA (KW_INT | KW_BOOLEAN) ID)*)?  PC block   							#methodDecl ;
         

block: LCBRACKET (field_decl)* (statement)* RCBRACKET    										#block ;

statement: (
    location assign_opp expr PYC     															#statement1
  | method_call PYC           																	#statement2
  | KW_IF PA expr PC block (KW_ELSE block)?    													#statement3
  | KW_FOR PA ID IG expr COMMA expr PC block    												#statement4
  | KW_WHILE PA expr PC block        															#statement5
  | KW_RETURN (expr)? PYC         																#statement6
  | KW_BREAK PYC           																		#statement7
  |   KW_CONTINUE PYC           																#statement8 
  );

location: 
  (  ID              #location1
  | ID LSBRACKET expr RSBRACKET        															#location2
  ) ;

expr:  
  (  location             																		#expr_1
  | method_call            																		#expr_2
  | literal             																		#expr_3
  |  expr2 bin_op expr           																#expr_4
  | RES expr             																		#expr_5
  | NO expr             																		#expr_6
  |  PA expr PC             																	#expr_7
  ) ;               

expr2:
  (  location             																		#expr2_1
  | method_call            																		#expr2_2
  | literal             																		#expr2_3
  | RES expr             																		#expr2_4
  | NO expr             																		#expr2_5
  |  PA expr PC             																	#expr2_6
  ) ;

assign_opp: 
  ( IG               																			#assign_opp1
  | PLUS_IG             																		#assign_opp2
  | MIN_IG             																			#assign_opp3
  ) ;

method_call:
  (  method_name PA ((expr (auxMethodCall)*)? PC)    											#methodCall1
  | method_name PA (callout_arg (auxMethodCall2)*)? PC      									#methodCall2
  );

auxMethodCall: COMMA expr            															#auxMethodCall ;

auxMethodCall2: COMMA callout_arg          														#auxMethodCall2 ;

method_name: ID              																	#methodName ;

callout_arg: 
	(expr                                                  										#calloutArg1
   | STRING             																		#calloutArg2
   ) ;

literal: (
    int_literal            																		#literal1
   | char_literal            																	#literal2
   | bool_literal            																	#literal3
  ) ;

char_literal: CHAR              																#literalChar ;

bool_literal: BOOLEAN             																#literalBoolean ;

bin_op: (
   arith_op
  | rel_op
  | eq_op
  | cond_op)                {System.out.println ("   bin_op");} ;

arith_op:
  (
   PLUS
  | RES
  | MULT
  | DIV
  | PRCNT
   )                  {System.out.println ("   arith_op");} ;

rel_op:
  (
   MENOR
  | MAYOR
  |  MENORIGUAL
  | MAYORIGUAL
   )                  {System.out.println ("   rel_op");} ;

eq_op:
  (
   DIG
  | NOIGUAL
   )                  {System.out.println ("   eq_op");} ;

cond_op:
  (
   AND
  | OR
   )                  {System.out.println ("   cond_op");} ;parser grammar Decaf;

options {
    tokenVocab=SDecaf;
}

@parser::header{
  package compiler.parser;
}


start: (callout_decl)* (field_decl)* (method_decl)*  #inicio ;

callout_decl: KW_CALLOUT ID PYC       #calloutDecl ; 

field_decl: type (ID | ID LSBRACKET int_literal RSBRACKET) (auxVar)* PYC  #fieldDecl ;

auxVar: COMMA (ID | ID LSBRACKET int_literal RSBRACKET )   #auxVar ;

type: (KW_INT | KW_BOOLEAN)           #type ;

int_literal: (INT | HEX)           #intLiteral ;

method_decl: (type|KW_VOID) ID PA (type ID (auxMethod)*)?  PC block   #methodDecl ;

auxMethod:  COMMA type ID           #auxMethod ;            

block: LCBRACKET (field_decl)* (statement)* RCBRACKET    #block ;

statement: (
    location assign_opp expr PYC       #statement1
  | method_call PYC           #statement2
  | KW_IF PA expr PC block (KW_ELSE block)?     #statement3
  | KW_FOR PA ID IG expr COMMA expr PC block    #statement4
  | KW_WHILE PA expr PC block        #statement5
  | KW_RETURN (expr)? PYC         #statement6
  | KW_BREAK PYC           #statement7
  |   KW_CONTINUE PYC           #statement8 
  );

location: 
  (  ID              #location1
  | ID LSBRACKET expr RSBRACKET        #location2
  ) ;

expr:  
  (  location             #expr_1
  | method_call            #expr_2
  | literal             #expr_3
  |  expr2 bin_op expr           #expr_4
  | RES expr             #expr_5
  | NO expr             #expr_6
  |  PA expr PC             #expr_7
  ) ;               

expr2:
  (  location             #expr2_1
  | method_call            #expr2_2
  | literal             #expr2_3
  | RES expr             #expr2_4
  | NO expr             #expr2_5
  |  PA expr PC             #expr2_6
  ) ;

assign_opp: 
  ( IG               #assign_opp1
  | PLUS_IG             #assign_opp2
  | MIN_IG             #assign_opp3
  ) ;

method_call:
  (  method_name PA ((expr (auxMethodCall)*)? PC)    #methodCall1
  | method_name PA (callout_arg (auxMethodCall2)*)? PC      #methodCall2
  );

auxMethodCall: COMMA expr            #auxMethodCall ;

auxMethodCall2: COMMA callout_arg          #auxMethodCall2 ;

method_name: ID              #methodName ;

callout_arg: (expr                                                  #calloutArg1
   | STRING             #calloutArg2
   ) ;

literal: (
    int_literal            #literal1
   | char_literal            #literal2
   | bool_literal            #literal3
  ) ;

char_literal: CHAR              #literalChar ;

bool_literal: BOOLEAN             #literalBoolean ;

bin_op: (
   arith_op
  | rel_op
  | eq_op
  | cond_op)                {System.out.println ("   bin_op");} ;

arith_op:
  (
   PLUS
  | RES
  | MULT
  | DIV
  | PRCNT
   )                  {System.out.println ("   arith_op");} ;

rel_op:
  (
   MENOR
  | MAYOR
  |  MENORIGUAL
  | MAYORIGUAL
   )                  {System.out.println ("   rel_op");} ;

eq_op:
  (
   DIG
  | NOIGUAL
   )                  {System.out.println ("   eq_op");} ;

cond_op:
  (
   AND
  | OR
   )                  {System.out.println ("   cond_op");} ;

*/