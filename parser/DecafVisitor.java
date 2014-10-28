// Generated from parser\Decaf.g by ANTLR 4.4

  package compiler.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Decaf}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DecafVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code literal2}
	 * labeled alternative in {@link Decaf#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral2(@NotNull Decaf.Literal2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code loc}
	 * labeled alternative in {@link Decaf#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc(@NotNull Decaf.LocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal1}
	 * labeled alternative in {@link Decaf#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral1(@NotNull Decaf.Literal1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assignOp}
	 * labeled alternative in {@link Decaf#assign_opp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOp(@NotNull Decaf.AssignOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalBoolean}
	 * labeled alternative in {@link Decaf#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralBoolean(@NotNull Decaf.LiteralBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement7}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement7(@NotNull Decaf.Statement7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement8}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement8(@NotNull Decaf.Statement8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literal3}
	 * labeled alternative in {@link Decaf#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral3(@NotNull Decaf.Literal3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement5}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement5(@NotNull Decaf.Statement5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code inicio}
	 * labeled alternative in {@link Decaf#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(@NotNull Decaf.InicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement6}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement6(@NotNull Decaf.Statement6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement3}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement3(@NotNull Decaf.Statement3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link Decaf#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(@NotNull Decaf.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement4}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement4(@NotNull Decaf.Statement4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Decaf#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull Decaf.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement1}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement1(@NotNull Decaf.Statement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement2}
	 * labeled alternative in {@link Decaf#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement2(@NotNull Decaf.Statement2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodcall}
	 * labeled alternative in {@link Decaf#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodcall(@NotNull Decaf.MethodcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blocke}
	 * labeled alternative in {@link Decaf#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocke(@NotNull Decaf.BlockeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calloutDecl}
	 * labeled alternative in {@link Decaf#callout_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalloutDecl(@NotNull Decaf.CalloutDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Decaf#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull Decaf.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Decaf#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(@NotNull Decaf.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Decaf#method_call_callout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_callout(@NotNull Decaf.Method_call_calloutContext ctx);
	/**
	 * Visit a parse tree produced by {@link Decaf#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(@NotNull Decaf.ArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin5}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin5(@NotNull Decaf.Bin5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin6}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin6(@NotNull Decaf.Bin6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin3}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin3(@NotNull Decaf.Bin3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin4}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin4(@NotNull Decaf.Bin4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin1}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin1(@NotNull Decaf.Bin1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin2}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin2(@NotNull Decaf.Bin2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldDecl}
	 * labeled alternative in {@link Decaf#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(@NotNull Decaf.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calloutArg2}
	 * labeled alternative in {@link Decaf#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalloutArg2(@NotNull Decaf.CalloutArg2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code calloutArg1}
	 * labeled alternative in {@link Decaf#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalloutArg1(@NotNull Decaf.CalloutArg1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literalChar}
	 * labeled alternative in {@link Decaf#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralChar(@NotNull Decaf.LiteralCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link Decaf#method_call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_expr(@NotNull Decaf.Method_call_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin9}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin9(@NotNull Decaf.Bin9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link Decaf#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralInt(@NotNull Decaf.LiteralIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin7}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin7(@NotNull Decaf.Bin7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bin8}
	 * labeled alternative in {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin8(@NotNull Decaf.Bin8Context ctx);
}