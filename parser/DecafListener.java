// Generated from parser\Decaf.g by ANTLR 4.4

  package compiler.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Decaf}.
 */
public interface DecafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Decaf#method_call_callout}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_callout(@NotNull Decaf.Method_call_calloutContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#method_call_callout}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_callout(@NotNull Decaf.Method_call_calloutContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(@NotNull Decaf.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(@NotNull Decaf.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin2}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin2(@NotNull Decaf.Bin2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin2}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin2(@NotNull Decaf.Bin2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin1}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin1(@NotNull Decaf.Bin1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin1}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin1(@NotNull Decaf.Bin1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull Decaf.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull Decaf.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull Decaf.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull Decaf.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin6}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin6(@NotNull Decaf.Bin6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin6}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin6(@NotNull Decaf.Bin6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin5}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin5(@NotNull Decaf.Bin5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin5}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin5(@NotNull Decaf.Bin5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin4}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin4(@NotNull Decaf.Bin4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin4}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin4(@NotNull Decaf.Bin4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literalChar}
	 * labeled alternative in {@link Decaf#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralChar(@NotNull Decaf.LiteralCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalChar}
	 * labeled alternative in {@link Decaf#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralChar(@NotNull Decaf.LiteralCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin3}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin3(@NotNull Decaf.Bin3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin3}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin3(@NotNull Decaf.Bin3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement6}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement6(@NotNull Decaf.Statement6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement6}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement6(@NotNull Decaf.Statement6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin9}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin9(@NotNull Decaf.Bin9Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin9}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin9(@NotNull Decaf.Bin9Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement5}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement5(@NotNull Decaf.Statement5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement5}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement5(@NotNull Decaf.Statement5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement4}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement4(@NotNull Decaf.Statement4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement4}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement4(@NotNull Decaf.Statement4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin7}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin7(@NotNull Decaf.Bin7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin7}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin7(@NotNull Decaf.Bin7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement3}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement3(@NotNull Decaf.Statement3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement3}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement3(@NotNull Decaf.Statement3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bin8}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin8(@NotNull Decaf.Bin8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code bin8}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin8(@NotNull Decaf.Bin8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement2}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement2(@NotNull Decaf.Statement2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement2}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement2(@NotNull Decaf.Statement2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement1}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement1(@NotNull Decaf.Statement1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement1}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement1(@NotNull Decaf.Statement1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code calloutArg2}
	 * labeled alternative in {@link Decaf#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCalloutArg2(@NotNull Decaf.CalloutArg2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code calloutArg2}
	 * labeled alternative in {@link Decaf#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCalloutArg2(@NotNull Decaf.CalloutArg2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link Decaf#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(@NotNull Decaf.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link Decaf#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(@NotNull Decaf.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldDecl}
	 * labeled alternative in {@link Decaf#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(@NotNull Decaf.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldDecl}
	 * labeled alternative in {@link Decaf#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(@NotNull Decaf.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blocke}
	 * labeled alternative in {@link Decaf#block}.
	 * @param ctx the parse tree
	 */
	void enterBlocke(@NotNull Decaf.BlockeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blocke}
	 * labeled alternative in {@link Decaf#block}.
	 * @param ctx the parse tree
	 */
	void exitBlocke(@NotNull Decaf.BlockeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calloutArg1}
	 * labeled alternative in {@link Decaf#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCalloutArg1(@NotNull Decaf.CalloutArg1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code calloutArg1}
	 * labeled alternative in {@link Decaf#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCalloutArg1(@NotNull Decaf.CalloutArg1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement8}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement8(@NotNull Decaf.Statement8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement8}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement8(@NotNull Decaf.Statement8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement7}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement7(@NotNull Decaf.Statement7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement7}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement7(@NotNull Decaf.Statement7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code calloutDecl}
	 * labeled alternative in {@link Decaf#callout_decl}.
	 * @param ctx the parse tree
	 */
	void enterCalloutDecl(@NotNull Decaf.CalloutDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calloutDecl}
	 * labeled alternative in {@link Decaf#callout_decl}.
	 * @param ctx the parse tree
	 */
	void exitCalloutDecl(@NotNull Decaf.CalloutDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link Decaf#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralInt(@NotNull Decaf.LiteralIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link Decaf#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralInt(@NotNull Decaf.LiteralIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inicio}
	 * labeled alternative in {@link Decaf#start}.
	 * @param ctx the parse tree
	 */
	void enterInicio(@NotNull Decaf.InicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inicio}
	 * labeled alternative in {@link Decaf#start}.
	 * @param ctx the parse tree
	 */
	void exitInicio(@NotNull Decaf.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(@NotNull Decaf.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(@NotNull Decaf.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#method_call_expr}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_expr(@NotNull Decaf.Method_call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#method_call_expr}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_expr(@NotNull Decaf.Method_call_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal3}
	 * labeled alternative in {@link Decaf#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral3(@NotNull Decaf.Literal3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal3}
	 * labeled alternative in {@link Decaf#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral3(@NotNull Decaf.Literal3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code loc}
	 * labeled alternative in {@link Decaf#location}.
	 * @param ctx the parse tree
	 */
	void enterLoc(@NotNull Decaf.LocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loc}
	 * labeled alternative in {@link Decaf#location}.
	 * @param ctx the parse tree
	 */
	void exitLoc(@NotNull Decaf.LocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodcall}
	 * labeled alternative in {@link Decaf#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethodcall(@NotNull Decaf.MethodcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodcall}
	 * labeled alternative in {@link Decaf#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethodcall(@NotNull Decaf.MethodcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal2}
	 * labeled alternative in {@link Decaf#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral2(@NotNull Decaf.Literal2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal2}
	 * labeled alternative in {@link Decaf#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral2(@NotNull Decaf.Literal2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literal1}
	 * labeled alternative in {@link Decaf#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral1(@NotNull Decaf.Literal1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal1}
	 * labeled alternative in {@link Decaf#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral1(@NotNull Decaf.Literal1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assignOp}
	 * labeled alternative in {@link Decaf#assign_opp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(@NotNull Decaf.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignOp}
	 * labeled alternative in {@link Decaf#assign_opp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(@NotNull Decaf.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalBoolean}
	 * labeled alternative in {@link Decaf#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralBoolean(@NotNull Decaf.LiteralBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalBoolean}
	 * labeled alternative in {@link Decaf#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralBoolean(@NotNull Decaf.LiteralBooleanContext ctx);
}