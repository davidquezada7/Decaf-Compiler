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
	 * Visit a parse tree produced by the {@code calloutDecl}
	 * labeled alternative in {@link Decaf#callout_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalloutDecl(@NotNull Decaf.CalloutDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inicio}
	 * labeled alternative in {@link Decaf#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(@NotNull Decaf.InicioContext ctx);
}