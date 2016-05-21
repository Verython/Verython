// Generated from Verython.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VerythonParser}.
 */
public interface VerythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VerythonParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterInitial(VerythonParser.InitialContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitInitial(VerythonParser.InitialContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(VerythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(VerythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(VerythonParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(VerythonParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(VerythonParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(VerythonParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(VerythonParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(VerythonParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(VerythonParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(VerythonParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(VerythonParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(VerythonParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(VerythonParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(VerythonParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(VerythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(VerythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(VerythonParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(VerythonParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(VerythonParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(VerythonParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(VerythonParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(VerythonParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(VerythonParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(VerythonParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(VerythonParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(VerythonParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(VerythonParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(VerythonParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(VerythonParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(VerythonParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(VerythonParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(VerythonParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(VerythonParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(VerythonParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(VerythonParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(VerythonParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(VerythonParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(VerythonParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(VerythonParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(VerythonParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(VerythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(VerythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(VerythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(VerythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(VerythonParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(VerythonParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(VerythonParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(VerythonParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(VerythonParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(VerythonParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(VerythonParser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(VerythonParser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(VerythonParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(VerythonParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(VerythonParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(VerythonParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(VerythonParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(VerythonParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(VerythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(VerythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(VerythonParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(VerythonParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(VerythonParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(VerythonParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(VerythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(VerythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(VerythonParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(VerythonParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(VerythonParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(VerythonParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(VerythonParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(VerythonParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(VerythonParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(VerythonParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(VerythonParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(VerythonParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(VerythonParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(VerythonParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(VerythonParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(VerythonParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(VerythonParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(VerythonParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(VerythonParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(VerythonParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(VerythonParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(VerythonParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(VerythonParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(VerythonParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(VerythonParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(VerythonParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(VerythonParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(VerythonParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(VerythonParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(VerythonParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(VerythonParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(VerythonParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(VerythonParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(VerythonParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(VerythonParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(VerythonParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(VerythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(VerythonParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(VerythonParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(VerythonParser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(VerythonParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(VerythonParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(VerythonParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(VerythonParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(VerythonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(VerythonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerythonParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(VerythonParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerythonParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(VerythonParser.IntegerContext ctx);
}