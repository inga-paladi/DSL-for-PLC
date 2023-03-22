// Generated from Program.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProgramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProgramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#programName}.
	 * @param ctx the parse tree
	 */
	void enterProgramName(ProgramParser.ProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#programName}.
	 * @param ctx the parse tree
	 */
	void exitProgramName(ProgramParser.ProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#inputDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclarations(ProgramParser.InputDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#inputDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclarations(ProgramParser.InputDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#outputDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterOutputDeclarations(ProgramParser.OutputDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#outputDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitOutputDeclarations(ProgramParser.OutputDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#memoryDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterMemoryDeclarations(ProgramParser.MemoryDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#memoryDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitMemoryDeclarations(ProgramParser.MemoryDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ProgramParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ProgramParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#x1Value}.
	 * @param ctx the parse tree
	 */
	void enterX1Value(ProgramParser.X1ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#x1Value}.
	 * @param ctx the parse tree
	 */
	void exitX1Value(ProgramParser.X1ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#x2Value}.
	 * @param ctx the parse tree
	 */
	void enterX2Value(ProgramParser.X2ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#x2Value}.
	 * @param ctx the parse tree
	 */
	void exitX2Value(ProgramParser.X2ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#ram}.
	 * @param ctx the parse tree
	 */
	void enterRam(ProgramParser.RamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#ram}.
	 * @param ctx the parse tree
	 */
	void exitRam(ProgramParser.RamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#coils}.
	 * @param ctx the parse tree
	 */
	void enterCoils(ProgramParser.CoilsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#coils}.
	 * @param ctx the parse tree
	 */
	void exitCoils(ProgramParser.CoilsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#coil}.
	 * @param ctx the parse tree
	 */
	void enterCoil(ProgramParser.CoilContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#coil}.
	 * @param ctx the parse tree
	 */
	void exitCoil(ProgramParser.CoilContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#logicStatements}.
	 * @param ctx the parse tree
	 */
	void enterLogicStatements(ProgramParser.LogicStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#logicStatements}.
	 * @param ctx the parse tree
	 */
	void exitLogicStatements(ProgramParser.LogicStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ProgramParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ProgramParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicOp(ProgramParser.LogicOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicOp(ProgramParser.LogicOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ProgramParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ProgramParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#endProgram}.
	 * @param ctx the parse tree
	 */
	void enterEndProgram(ProgramParser.EndProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#endProgram}.
	 * @param ctx the parse tree
	 */
	void exitEndProgram(ProgramParser.EndProgramContext ctx);
}