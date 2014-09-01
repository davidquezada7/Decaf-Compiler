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
	 * Enter a parse tree produced by {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Decaf.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Decaf.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#callout_decl}.
	 * @param ctx the parse tree
	 */
	void enterCallout_decl(@NotNull Decaf.Callout_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#callout_decl}.
	 * @param ctx the parse tree
	 */
	void exitCallout_decl(@NotNull Decaf.Callout_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(@NotNull Decaf.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(@NotNull Decaf.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull Decaf.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull Decaf.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(@NotNull Decaf.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(@NotNull Decaf.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull Decaf.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull Decaf.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link Decaf#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(@NotNull Decaf.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(@NotNull Decaf.Field_declContext ctx);
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
	 * Enter a parse tree produced by {@link Decaf#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(@NotNull Decaf.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(@NotNull Decaf.Method_declContext ctx);
}