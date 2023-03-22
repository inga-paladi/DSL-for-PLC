// Generated from Program.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, CN01=17, 
		CN02=18, CN03=19, CN04=20, ALPHA=21, ALPHANUM=22, DIGIT=23, WS=24;
	public static final int
		RULE_program = 0, RULE_programName = 1, RULE_inputDeclarations = 2, RULE_outputDeclarations = 3, 
		RULE_memoryDeclarations = 4, RULE_var = 5, RULE_x1Value = 6, RULE_x2Value = 7, 
		RULE_ram = 8, RULE_coils = 9, RULE_coil = 10, RULE_logicStatements = 11, 
		RULE_statement = 12, RULE_logicOp = 13, RULE_identifier = 14, RULE_endProgram = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programName", "inputDeclarations", "outputDeclarations", 
			"memoryDeclarations", "var", "x1Value", "x2Value", "ram", "coils", "coil", 
			"logicStatements", "statement", "logicOp", "identifier", "endProgram"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'BEGIN'", "'INPUT'", "'.'", "';'", "'OUTPUT'", "'RAM'", "'I'", 
			"'Q'", "'M'", "'0'", "'AND'", "'OR'", "'XOR'", "'NOT'", "':='", "'END'", 
			"'CN01'", "'CN02'", "'CN03'", "'CN04'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "CN01", "CN02", "CN03", "CN04", "ALPHA", 
			"ALPHANUM", "DIGIT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramNameContext programName() {
			return getRuleContext(ProgramNameContext.class,0);
		}
		public InputDeclarationsContext inputDeclarations() {
			return getRuleContext(InputDeclarationsContext.class,0);
		}
		public OutputDeclarationsContext outputDeclarations() {
			return getRuleContext(OutputDeclarationsContext.class,0);
		}
		public MemoryDeclarationsContext memoryDeclarations() {
			return getRuleContext(MemoryDeclarationsContext.class,0);
		}
		public LogicStatementsContext logicStatements() {
			return getRuleContext(LogicStatementsContext.class,0);
		}
		public EndProgramContext endProgram() {
			return getRuleContext(EndProgramContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			programName();
			setState(34);
			inputDeclarations();
			setState(35);
			outputDeclarations();
			setState(36);
			memoryDeclarations();
			setState(37);
			logicStatements();
			setState(38);
			endProgram();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProgramNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProgramName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProgramName(this);
		}
	}

	public final ProgramNameContext programName() throws RecognitionException {
		ProgramNameContext _localctx = new ProgramNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputDeclarationsContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public InputDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterInputDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitInputDeclarations(this);
		}
	}

	public final InputDeclarationsContext inputDeclarations() throws RecognitionException {
		InputDeclarationsContext _localctx = new InputDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inputDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__1);
			setState(43);
			var();
			setState(44);
			match(T__2);
			setState(45);
			var();
			setState(46);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputDeclarationsContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public OutputDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterOutputDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitOutputDeclarations(this);
		}
	}

	public final OutputDeclarationsContext outputDeclarations() throws RecognitionException {
		OutputDeclarationsContext _localctx = new OutputDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_outputDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__4);
			setState(49);
			var();
			setState(50);
			match(T__2);
			setState(51);
			var();
			setState(52);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemoryDeclarationsContext extends ParserRuleContext {
		public List<RamContext> ram() {
			return getRuleContexts(RamContext.class);
		}
		public RamContext ram(int i) {
			return getRuleContext(RamContext.class,i);
		}
		public MemoryDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterMemoryDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitMemoryDeclarations(this);
		}
	}

	public final MemoryDeclarationsContext memoryDeclarations() throws RecognitionException {
		MemoryDeclarationsContext _localctx = new MemoryDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_memoryDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__5);
			setState(55);
			ram();
			setState(56);
			match(T__2);
			setState(57);
			ram();
			setState(58);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public X1ValueContext x1;
		public X2ValueContext x2;
		public X1ValueContext x1Value() {
			return getRuleContext(X1ValueContext.class,0);
		}
		public X2ValueContext x2Value() {
			return getRuleContext(X2ValueContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__6);
				setState(61);
				((VarContext)_localctx).x1 = x1Value();
				setState(62);
				((VarContext)_localctx).x2 = x2Value();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__7);
				setState(65);
				((VarContext)_localctx).x1 = x1Value();
				setState(66);
				((VarContext)_localctx).x2 = x2Value();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(T__8);
				setState(69);
				((VarContext)_localctx).x1 = x1Value();
				setState(70);
				((VarContext)_localctx).x2 = x2Value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class X1ValueContext extends ParserRuleContext {
		public X1ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x1Value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterX1Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitX1Value(this);
		}
	}

	public final X1ValueContext x1Value() throws RecognitionException {
		X1ValueContext _localctx = new X1ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_x1Value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class X2ValueContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ProgramParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ProgramParser.DIGIT, i);
		}
		public X2ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x2Value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterX2Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitX2Value(this);
		}
	}

	public final X2ValueContext x2Value() throws RecognitionException {
		X2ValueContext _localctx = new X2ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_x2Value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(DIGIT);
			setState(77);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RamContext extends ParserRuleContext {
		public TerminalNode CN01() { return getToken(ProgramParser.CN01, 0); }
		public CoilsContext coils() {
			return getRuleContext(CoilsContext.class,0);
		}
		public TerminalNode CN02() { return getToken(ProgramParser.CN02, 0); }
		public TerminalNode CN03() { return getToken(ProgramParser.CN03, 0); }
		public TerminalNode CN04() { return getToken(ProgramParser.CN04, 0); }
		public RamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterRam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitRam(this);
		}
	}

	public final RamContext ram() throws RecognitionException {
		RamContext _localctx = new RamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ram);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CN01:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(CN01);
				setState(80);
				match(T__2);
				setState(81);
				match(T__10);
				setState(82);
				coils();
				}
				break;
			case CN02:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(CN02);
				setState(84);
				match(T__2);
				setState(85);
				match(T__11);
				setState(86);
				coils();
				}
				break;
			case CN03:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(CN03);
				setState(88);
				match(T__2);
				setState(89);
				match(T__12);
				setState(90);
				coils();
				}
				break;
			case CN04:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(CN04);
				setState(92);
				match(T__2);
				setState(93);
				match(T__13);
				setState(94);
				coils();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoilsContext extends ParserRuleContext {
		public List<CoilContext> coil() {
			return getRuleContexts(CoilContext.class);
		}
		public CoilContext coil(int i) {
			return getRuleContext(CoilContext.class,i);
		}
		public CoilsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coils; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterCoils(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitCoils(this);
		}
	}

	public final CoilsContext coils() throws RecognitionException {
		CoilsContext _localctx = new CoilsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_coils);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			coil();
			setState(98);
			match(T__2);
			setState(99);
			coil();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoilContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CoilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterCoil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitCoil(this);
		}
	}

	public final CoilContext coil() throws RecognitionException {
		CoilContext _localctx = new CoilContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_coil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicStatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LogicStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterLogicStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitLogicStatements(this);
		}
	}

	public final LogicStatementsContext logicStatements() throws RecognitionException {
		LogicStatementsContext _localctx = new LogicStatementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			statement();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(104);
				match(T__2);
				setState(105);
				statement();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			var();
			setState(112);
			match(T__14);
			setState(113);
			logicOp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicOpContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterLogicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitLogicOp(this);
		}
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicOp);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				var();
				setState(116);
				match(T__10);
				setState(117);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				var();
				setState(120);
				match(T__11);
				setState(121);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				var();
				setState(124);
				match(T__12);
				setState(125);
				var();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(T__13);
				setState(128);
				var();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(ProgramParser.ALPHA, 0); }
		public List<TerminalNode> ALPHANUM() { return getTokens(ProgramParser.ALPHANUM); }
		public TerminalNode ALPHANUM(int i) {
			return getToken(ProgramParser.ALPHANUM, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ALPHA);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHANUM) {
				{
				{
				setState(132);
				match(ALPHANUM);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndProgramContext extends ParserRuleContext {
		public EndProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterEndProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitEndProgram(this);
		}
	}

	public final EndProgramContext endProgram() throws RecognitionException {
		EndProgramContext _localctx = new EndProgramContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_endProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u008d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b`\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000bk\b\u000b\n\u000b\f\u000bn\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0082\b\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0086\b\u000e\n\u000e\f\u000e\u0089\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000"+
		"\u0000\u0086\u0000 \u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000"+
		"\u0004*\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b6\u0001"+
		"\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000"+
		"\u000eL\u0001\u0000\u0000\u0000\u0010_\u0001\u0000\u0000\u0000\u0012a"+
		"\u0001\u0000\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016g\u0001\u0000"+
		"\u0000\u0000\u0018o\u0001\u0000\u0000\u0000\u001a\u0081\u0001\u0000\u0000"+
		"\u0000\u001c\u0083\u0001\u0000\u0000\u0000\u001e\u008a\u0001\u0000\u0000"+
		"\u0000 !\u0005\u0001\u0000\u0000!\"\u0003\u0002\u0001\u0000\"#\u0003\u0004"+
		"\u0002\u0000#$\u0003\u0006\u0003\u0000$%\u0003\b\u0004\u0000%&\u0003\u0016"+
		"\u000b\u0000&\'\u0003\u001e\u000f\u0000\'\u0001\u0001\u0000\u0000\u0000"+
		"()\u0003\u001c\u000e\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0005\u0002"+
		"\u0000\u0000+,\u0003\n\u0005\u0000,-\u0005\u0003\u0000\u0000-.\u0003\n"+
		"\u0005\u0000./\u0005\u0004\u0000\u0000/\u0005\u0001\u0000\u0000\u0000"+
		"01\u0005\u0005\u0000\u000012\u0003\n\u0005\u000023\u0005\u0003\u0000\u0000"+
		"34\u0003\n\u0005\u000045\u0005\u0004\u0000\u00005\u0007\u0001\u0000\u0000"+
		"\u000067\u0005\u0006\u0000\u000078\u0003\u0010\b\u000089\u0005\u0003\u0000"+
		"\u00009:\u0003\u0010\b\u0000:;\u0005\u0004\u0000\u0000;\t\u0001\u0000"+
		"\u0000\u0000<=\u0005\u0007\u0000\u0000=>\u0003\f\u0006\u0000>?\u0003\u000e"+
		"\u0007\u0000?I\u0001\u0000\u0000\u0000@A\u0005\b\u0000\u0000AB\u0003\f"+
		"\u0006\u0000BC\u0003\u000e\u0007\u0000CI\u0001\u0000\u0000\u0000DE\u0005"+
		"\t\u0000\u0000EF\u0003\f\u0006\u0000FG\u0003\u000e\u0007\u0000GI\u0001"+
		"\u0000\u0000\u0000H<\u0001\u0000\u0000\u0000H@\u0001\u0000\u0000\u0000"+
		"HD\u0001\u0000\u0000\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005\n\u0000"+
		"\u0000K\r\u0001\u0000\u0000\u0000LM\u0005\u0017\u0000\u0000MN\u0005\u0017"+
		"\u0000\u0000N\u000f\u0001\u0000\u0000\u0000OP\u0005\u0011\u0000\u0000"+
		"PQ\u0005\u0003\u0000\u0000QR\u0005\u000b\u0000\u0000R`\u0003\u0012\t\u0000"+
		"ST\u0005\u0012\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0005\f\u0000\u0000"+
		"V`\u0003\u0012\t\u0000WX\u0005\u0013\u0000\u0000XY\u0005\u0003\u0000\u0000"+
		"YZ\u0005\r\u0000\u0000Z`\u0003\u0012\t\u0000[\\\u0005\u0014\u0000\u0000"+
		"\\]\u0005\u0003\u0000\u0000]^\u0005\u000e\u0000\u0000^`\u0003\u0012\t"+
		"\u0000_O\u0001\u0000\u0000\u0000_S\u0001\u0000\u0000\u0000_W\u0001\u0000"+
		"\u0000\u0000_[\u0001\u0000\u0000\u0000`\u0011\u0001\u0000\u0000\u0000"+
		"ab\u0003\u0014\n\u0000bc\u0005\u0003\u0000\u0000cd\u0003\u0014\n\u0000"+
		"d\u0013\u0001\u0000\u0000\u0000ef\u0003\n\u0005\u0000f\u0015\u0001\u0000"+
		"\u0000\u0000gl\u0003\u0018\f\u0000hi\u0005\u0003\u0000\u0000ik\u0003\u0018"+
		"\f\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0017\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000op\u0003\n\u0005\u0000pq\u0005\u000f\u0000\u0000"+
		"qr\u0003\u001a\r\u0000r\u0019\u0001\u0000\u0000\u0000st\u0003\n\u0005"+
		"\u0000tu\u0005\u000b\u0000\u0000uv\u0003\n\u0005\u0000v\u0082\u0001\u0000"+
		"\u0000\u0000wx\u0003\n\u0005\u0000xy\u0005\f\u0000\u0000yz\u0003\n\u0005"+
		"\u0000z\u0082\u0001\u0000\u0000\u0000{|\u0003\n\u0005\u0000|}\u0005\r"+
		"\u0000\u0000}~\u0003\n\u0005\u0000~\u0082\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\u000e\u0000\u0000\u0080\u0082\u0003\n\u0005\u0000\u0081s"+
		"\u0001\u0000\u0000\u0000\u0081w\u0001\u0000\u0000\u0000\u0081{\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u001b\u0001\u0000"+
		"\u0000\u0000\u0083\u0087\u0005\u0015\u0000\u0000\u0084\u0086\u0005\u0016"+
		"\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u001d\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005\u0010\u0000\u0000\u008b\u001f\u0001\u0000"+
		"\u0000\u0000\u0005H_l\u0081\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}