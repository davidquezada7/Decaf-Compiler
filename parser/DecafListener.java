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
}