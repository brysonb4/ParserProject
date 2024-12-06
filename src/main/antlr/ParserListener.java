// Generated from Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserParser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(ParserParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(ParserParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(ParserParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(ParserParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#sizeofloop}.
	 * @param ctx the parse tree
	 */
	void enterSizeofloop(ParserParser.SizeofloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#sizeofloop}.
	 * @param ctx the parse tree
	 */
	void exitSizeofloop(ParserParser.SizeofloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(ParserParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(ParserParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(ParserParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(ParserParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ParserParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ParserParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElif_statement(ParserParser.Elif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElif_statement(ParserParser.Elif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(ParserParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(ParserParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#block2}.
	 * @param ctx the parse tree
	 */
	void enterBlock2(ParserParser.Block2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#block2}.
	 * @param ctx the parse tree
	 */
	void exitBlock2(ParserParser.Block2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#block3}.
	 * @param ctx the parse tree
	 */
	void enterBlock3(ParserParser.Block3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#block3}.
	 * @param ctx the parse tree
	 */
	void exitBlock3(ParserParser.Block3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#condition_expression}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expression(ParserParser.Condition_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#condition_expression}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expression(ParserParser.Condition_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(ParserParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(ParserParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ParserParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ParserParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ParserParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ParserParser.ArrayContext ctx);
}