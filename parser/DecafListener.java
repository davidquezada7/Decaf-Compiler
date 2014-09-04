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
	 * Enter a parse tree produced by {@link Decaf#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(@NotNull Decaf.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(@NotNull Decaf.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#assign_opp}.
	 * @param ctx the parse tree
	 */
	void enterAssign_opp(@NotNull Decaf.Assign_oppContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#assign_opp}.
	 * @param ctx the parse tree
	 */
	void exitAssign_opp(@NotNull Decaf.Assign_oppContext ctx);
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
	 * Enter a parse tree produced by {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(@NotNull Decaf.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(@NotNull Decaf.Bin_opContext ctx);
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
	 * Enter a parse tree produced by {@link Decaf#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(@NotNull Decaf.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(@NotNull Decaf.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(@NotNull Decaf.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(@NotNull Decaf.Char_literalContext ctx);
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
	 * Enter a parse tree produced by {@link Decaf#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(@NotNull Decaf.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(@NotNull Decaf.Arith_opContext ctx);
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
	 * Enter a parse tree produced by {@link Decaf#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(@NotNull Decaf.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(@NotNull Decaf.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(@NotNull Decaf.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(@NotNull Decaf.Callout_argContext ctx);
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
	 * Enter a parse tree produced by {@link Decaf#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(@NotNull Decaf.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(@NotNull Decaf.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull Decaf.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull Decaf.Method_callContext ctx);
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
	 * Enter a parse tree produced by {@link Decaf#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(@NotNull Decaf.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(@NotNull Decaf.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#auxVar}.
	 * @param ctx the parse tree
	 */
	void enterAuxVar(@NotNull Decaf.AuxVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#auxVar}.
	 * @param ctx the parse tree
	 */
	void exitAuxVar(@NotNull Decaf.AuxVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Decaf#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull Decaf.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull Decaf.LiteralContext ctx);
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