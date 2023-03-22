// Generated from Program.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, CN01=17, 
		CN02=18, CN03=19, CN04=20, ALPHA=21, ALPHANUM=22, DIGIT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "CN01", 
			"CN02", "CN03", "CN04", "ALPHA", "ALPHANUM", "DIGIT", "WS"
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


	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0004\u0017\u0087\b\u0017\u000b\u0017\f\u0017\u0088"+
		"\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0003\u0002"+
		"\u0000AZaz\u0001\u000007\u0003\u0000\t\n\r\r  \u008c\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00011\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u0005="+
		"\u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tA\u0001\u0000"+
		"\u0000\u0000\u000bH\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000"+
		"\u000fN\u0001\u0000\u0000\u0000\u0011P\u0001\u0000\u0000\u0000\u0013R"+
		"\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017X\u0001\u0000"+
		"\u0000\u0000\u0019[\u0001\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000"+
		"\u001dc\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000\u0000!j\u0001"+
		"\u0000\u0000\u0000#o\u0001\u0000\u0000\u0000%t\u0001\u0000\u0000\u0000"+
		"\'y\u0001\u0000\u0000\u0000)~\u0001\u0000\u0000\u0000+\u0080\u0001\u0000"+
		"\u0000\u0000-\u0083\u0001\u0000\u0000\u0000/\u0086\u0001\u0000\u0000\u0000"+
		"12\u0005B\u0000\u000023\u0005E\u0000\u000034\u0005G\u0000\u000045\u0005"+
		"I\u0000\u000056\u0005N\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005"+
		"I\u0000\u000089\u0005N\u0000\u00009:\u0005P\u0000\u0000:;\u0005U\u0000"+
		"\u0000;<\u0005T\u0000\u0000<\u0004\u0001\u0000\u0000\u0000=>\u0005.\u0000"+
		"\u0000>\u0006\u0001\u0000\u0000\u0000?@\u0005;\u0000\u0000@\b\u0001\u0000"+
		"\u0000\u0000AB\u0005O\u0000\u0000BC\u0005U\u0000\u0000CD\u0005T\u0000"+
		"\u0000DE\u0005P\u0000\u0000EF\u0005U\u0000\u0000FG\u0005T\u0000\u0000"+
		"G\n\u0001\u0000\u0000\u0000HI\u0005R\u0000\u0000IJ\u0005A\u0000\u0000"+
		"JK\u0005M\u0000\u0000K\f\u0001\u0000\u0000\u0000LM\u0005I\u0000\u0000"+
		"M\u000e\u0001\u0000\u0000\u0000NO\u0005Q\u0000\u0000O\u0010\u0001\u0000"+
		"\u0000\u0000PQ\u0005M\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005"+
		"0\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TU\u0005A\u0000\u0000UV\u0005"+
		"N\u0000\u0000VW\u0005D\u0000\u0000W\u0016\u0001\u0000\u0000\u0000XY\u0005"+
		"O\u0000\u0000YZ\u0005R\u0000\u0000Z\u0018\u0001\u0000\u0000\u0000[\\\u0005"+
		"X\u0000\u0000\\]\u0005O\u0000\u0000]^\u0005R\u0000\u0000^\u001a\u0001"+
		"\u0000\u0000\u0000_`\u0005N\u0000\u0000`a\u0005O\u0000\u0000ab\u0005T"+
		"\u0000\u0000b\u001c\u0001\u0000\u0000\u0000cd\u0005:\u0000\u0000de\u0005"+
		"=\u0000\u0000e\u001e\u0001\u0000\u0000\u0000fg\u0005E\u0000\u0000gh\u0005"+
		"N\u0000\u0000hi\u0005D\u0000\u0000i \u0001\u0000\u0000\u0000jk\u0005C"+
		"\u0000\u0000kl\u0005N\u0000\u0000lm\u00050\u0000\u0000mn\u00051\u0000"+
		"\u0000n\"\u0001\u0000\u0000\u0000op\u0005C\u0000\u0000pq\u0005N\u0000"+
		"\u0000qr\u00050\u0000\u0000rs\u00052\u0000\u0000s$\u0001\u0000\u0000\u0000"+
		"tu\u0005C\u0000\u0000uv\u0005N\u0000\u0000vw\u00050\u0000\u0000wx\u0005"+
		"3\u0000\u0000x&\u0001\u0000\u0000\u0000yz\u0005C\u0000\u0000z{\u0005N"+
		"\u0000\u0000{|\u00050\u0000\u0000|}\u00054\u0000\u0000}(\u0001\u0000\u0000"+
		"\u0000~\u007f\u0007\u0000\u0000\u0000\u007f*\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0003)\u0014\u0000\u0081\u0082\u0003-\u0016\u0000\u0082,\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0007\u0001\u0000\u0000\u0084.\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0007\u0002\u0000\u0000\u0086\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0006\u0017\u0000\u0000\u008b0\u0001\u0000\u0000"+
		"\u0000\u0002\u0000\u0088\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}