// Generated from Verython.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VerythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VerythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VerythonParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial(VerythonParser.InitialContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(VerythonParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(VerythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(VerythonParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(VerythonParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(VerythonParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(VerythonParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(VerythonParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(VerythonParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(VerythonParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(VerythonParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(VerythonParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(VerythonParser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(VerythonParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(VerythonParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(VerythonParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(VerythonParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(VerythonParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(VerythonParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(VerythonParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(VerythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(VerythonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(VerythonParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(VerythonParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(VerythonParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(VerythonParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(VerythonParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(VerythonParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(VerythonParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(VerythonParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(VerythonParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(VerythonParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(VerythonParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(VerythonParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(VerythonParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(VerythonParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(VerythonParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(VerythonParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(VerythonParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(VerythonParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(VerythonParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(VerythonParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(VerythonParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(VerythonParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(VerythonParser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(VerythonParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(VerythonParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(VerythonParser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(VerythonParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(VerythonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(VerythonParser.Comp_iterContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(VerythonParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(VerythonParser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerythonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(VerythonParser.NumberContext ctx);
}