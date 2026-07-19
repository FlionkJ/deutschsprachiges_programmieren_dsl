// Generated from /home/lukas/git/deutschsprachiges_programmieren_dsl/src/deutschsprachigeProgrammiersprache.g4 by ANTLR 4.13.2

package generation;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class deutschsprachigeProgrammierspracheLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, NUMBER=17, 
		ALPHANUMERIC=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "NUMBER", 
			"ALPHANUMERIC", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "':='", "';'", "'+'", "'-'", "'STOPP'", "'HALT'", "'GEHE ZU '", 
			"'WENN('", "')DANN GEHE ZU'", "'Zeile'", "'EINGABE'", "'SCHREIBE'", "'='", 
			"'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NUMBER", "ALPHANUMERIC", "WS"
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


	public deutschsprachigeProgrammierspracheLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "deutschsprachigeProgrammiersprache.g4"; }

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
		"\u0004\u0000\u0013\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010y\b"+
		"\u0010\u000b\u0010\f\u0010z\u0001\u0011\u0004\u0011~\b\u0011\u000b\u0011"+
		"\f\u0011\u007f\u0001\u0012\u0004\u0012\u0083\b\u0012\u000b\u0012\f\u0012"+
		"\u0084\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\u0001\u0000\u0003\u0001\u000009\u0003\u000009AZaz\u0003"+
		"\u0000\t\n\r\r  \u008a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003"+
		")\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u0007.\u0001"+
		"\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b2\u0001\u0000\u0000"+
		"\u0000\r8\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011"+
		"F\u0001\u0000\u0000\u0000\u0013L\u0001\u0000\u0000\u0000\u0015Z\u0001"+
		"\u0000\u0000\u0000\u0017`\u0001\u0000\u0000\u0000\u0019h\u0001\u0000\u0000"+
		"\u0000\u001bq\u0001\u0000\u0000\u0000\u001ds\u0001\u0000\u0000\u0000\u001f"+
		"u\u0001\u0000\u0000\u0000!x\u0001\u0000\u0000\u0000#}\u0001\u0000\u0000"+
		"\u0000%\u0082\u0001\u0000\u0000\u0000\'(\u0005:\u0000\u0000(\u0002\u0001"+
		"\u0000\u0000\u0000)*\u0005:\u0000\u0000*+\u0005=\u0000\u0000+\u0004\u0001"+
		"\u0000\u0000\u0000,-\u0005;\u0000\u0000-\u0006\u0001\u0000\u0000\u0000"+
		"./\u0005+\u0000\u0000/\b\u0001\u0000\u0000\u000001\u0005-\u0000\u0000"+
		"1\n\u0001\u0000\u0000\u000023\u0005S\u0000\u000034\u0005T\u0000\u0000"+
		"45\u0005O\u0000\u000056\u0005P\u0000\u000067\u0005P\u0000\u00007\f\u0001"+
		"\u0000\u0000\u000089\u0005H\u0000\u00009:\u0005A\u0000\u0000:;\u0005L"+
		"\u0000\u0000;<\u0005T\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005"+
		"G\u0000\u0000>?\u0005E\u0000\u0000?@\u0005H\u0000\u0000@A\u0005E\u0000"+
		"\u0000AB\u0005 \u0000\u0000BC\u0005Z\u0000\u0000CD\u0005U\u0000\u0000"+
		"DE\u0005 \u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005W\u0000\u0000"+
		"GH\u0005E\u0000\u0000HI\u0005N\u0000\u0000IJ\u0005N\u0000\u0000JK\u0005"+
		"(\u0000\u0000K\u0012\u0001\u0000\u0000\u0000LM\u0005)\u0000\u0000MN\u0005"+
		"D\u0000\u0000NO\u0005A\u0000\u0000OP\u0005N\u0000\u0000PQ\u0005N\u0000"+
		"\u0000QR\u0005 \u0000\u0000RS\u0005G\u0000\u0000ST\u0005E\u0000\u0000"+
		"TU\u0005H\u0000\u0000UV\u0005E\u0000\u0000VW\u0005 \u0000\u0000WX\u0005"+
		"Z\u0000\u0000XY\u0005U\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005"+
		"Z\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005l\u0000"+
		"\u0000^_\u0005e\u0000\u0000_\u0016\u0001\u0000\u0000\u0000`a\u0005E\u0000"+
		"\u0000ab\u0005I\u0000\u0000bc\u0005N\u0000\u0000cd\u0005G\u0000\u0000"+
		"de\u0005A\u0000\u0000ef\u0005B\u0000\u0000fg\u0005E\u0000\u0000g\u0018"+
		"\u0001\u0000\u0000\u0000hi\u0005S\u0000\u0000ij\u0005C\u0000\u0000jk\u0005"+
		"H\u0000\u0000kl\u0005R\u0000\u0000lm\u0005E\u0000\u0000mn\u0005I\u0000"+
		"\u0000no\u0005B\u0000\u0000op\u0005E\u0000\u0000p\u001a\u0001\u0000\u0000"+
		"\u0000qr\u0005=\u0000\u0000r\u001c\u0001\u0000\u0000\u0000st\u0005<\u0000"+
		"\u0000t\u001e\u0001\u0000\u0000\u0000uv\u0005>\u0000\u0000v \u0001\u0000"+
		"\u0000\u0000wy\u0007\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\"\u0001\u0000\u0000\u0000|~\u0007\u0001\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080$\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0007\u0002\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0006\u0012\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0004\u0000z\u007f"+
		"\u0084\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}