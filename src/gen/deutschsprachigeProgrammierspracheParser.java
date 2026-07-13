// Generated from C:/Users/admin/IdeaProjects/deutschsprachiges_programmieren_dsl/src/deutschsprachigeProgrammiersprache.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class deutschsprachigeProgrammierspracheParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NUMBER=15, ALPHANUMERIC=16, 
		WS=17;
	public static final int
		RULE_program = 0, RULE_zeilenNummerierung = 1, RULE_anweisung = 2, RULE_intergerDeklaration = 3, 
		RULE_wertzuweisungAddition = 4, RULE_wertzuweisungSubtraktion = 5, RULE_stopAnweisung = 6, 
		RULE_sprunganweisung = 7, RULE_unbedingteSprunganweisung = 8, RULE_bedingteSprunganweisung = 9, 
		RULE_zeilenReferenzierung = 10, RULE_eingabe = 11, RULE_ausgabe = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "zeilenNummerierung", "anweisung", "intergerDeklaration", 
			"wertzuweisungAddition", "wertzuweisungSubtraktion", "stopAnweisung", 
			"sprunganweisung", "unbedingteSprunganweisung", "bedingteSprunganweisung", 
			"zeilenReferenzierung", "eingabe", "ausgabe"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Zeile'", "':'", "':='", "';'", "'+'", "'-'", "'STOPP'", "'HALT'", 
			"'GEHE ZU '", "'WENN('", "'='", "')DANN GEHE ZU'", "'EINGABE'", "'SCHREIBE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NUMBER", "ALPHANUMERIC", "WS"
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
	public String getGrammarFileName() { return "deutschsprachigeProgrammiersprache.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public deutschsprachigeProgrammierspracheParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<ZeilenNummerierungContext> zeilenNummerierung() {
			return getRuleContexts(ZeilenNummerierungContext.class);
		}
		public ZeilenNummerierungContext zeilenNummerierung(int i) {
			return getRuleContext(ZeilenNummerierungContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				zeilenNummerierung();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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
	public static class ZeilenNummerierungContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(deutschsprachigeProgrammierspracheParser.NUMBER, 0); }
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
		}
		public ZeilenNummerierungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeilenNummerierung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterZeilenNummerierung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitZeilenNummerierung(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitZeilenNummerierung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZeilenNummerierungContext zeilenNummerierung() throws RecognitionException {
		ZeilenNummerierungContext _localctx = new ZeilenNummerierungContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_zeilenNummerierung);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
			match(NUMBER);
			setState(33);
			match(T__1);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				anweisung();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 92032L) != 0) );
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
	public static class AnweisungContext extends ParserRuleContext {
		public IntergerDeklarationContext intergerDeklaration() {
			return getRuleContext(IntergerDeklarationContext.class,0);
		}
		public WertzuweisungAdditionContext wertzuweisungAddition() {
			return getRuleContext(WertzuweisungAdditionContext.class,0);
		}
		public WertzuweisungSubtraktionContext wertzuweisungSubtraktion() {
			return getRuleContext(WertzuweisungSubtraktionContext.class,0);
		}
		public StopAnweisungContext stopAnweisung() {
			return getRuleContext(StopAnweisungContext.class,0);
		}
		public SprunganweisungContext sprunganweisung() {
			return getRuleContext(SprunganweisungContext.class,0);
		}
		public EingabeContext eingabe() {
			return getRuleContext(EingabeContext.class,0);
		}
		public AusgabeContext ausgabe() {
			return getRuleContext(AusgabeContext.class,0);
		}
		public AnweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterAnweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitAnweisung(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitAnweisung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnweisungContext anweisung() throws RecognitionException {
		AnweisungContext _localctx = new AnweisungContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anweisung);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				intergerDeklaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				wertzuweisungAddition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				wertzuweisungSubtraktion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				stopAnweisung();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				sprunganweisung();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				eingabe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				ausgabe();
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
	public static class IntergerDeklarationContext extends ParserRuleContext {
		public TerminalNode ALPHANUMERIC() { return getToken(deutschsprachigeProgrammierspracheParser.ALPHANUMERIC, 0); }
		public TerminalNode NUMBER() { return getToken(deutschsprachigeProgrammierspracheParser.NUMBER, 0); }
		public IntergerDeklarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intergerDeklaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterIntergerDeklaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitIntergerDeklaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitIntergerDeklaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntergerDeklarationContext intergerDeklaration() throws RecognitionException {
		IntergerDeklarationContext _localctx = new IntergerDeklarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intergerDeklaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ALPHANUMERIC);
			setState(49);
			match(T__2);
			setState(50);
			match(NUMBER);
			setState(51);
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
	public static class WertzuweisungAdditionContext extends ParserRuleContext {
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(deutschsprachigeProgrammierspracheParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(deutschsprachigeProgrammierspracheParser.ALPHANUMERIC, i);
		}
		public WertzuweisungAdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wertzuweisungAddition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterWertzuweisungAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitWertzuweisungAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitWertzuweisungAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WertzuweisungAdditionContext wertzuweisungAddition() throws RecognitionException {
		WertzuweisungAdditionContext _localctx = new WertzuweisungAdditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_wertzuweisungAddition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ALPHANUMERIC);
			setState(54);
			match(T__2);
			setState(55);
			match(ALPHANUMERIC);
			setState(56);
			match(T__4);
			setState(57);
			match(ALPHANUMERIC);
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
	public static class WertzuweisungSubtraktionContext extends ParserRuleContext {
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(deutschsprachigeProgrammierspracheParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(deutschsprachigeProgrammierspracheParser.ALPHANUMERIC, i);
		}
		public WertzuweisungSubtraktionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wertzuweisungSubtraktion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterWertzuweisungSubtraktion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitWertzuweisungSubtraktion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitWertzuweisungSubtraktion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WertzuweisungSubtraktionContext wertzuweisungSubtraktion() throws RecognitionException {
		WertzuweisungSubtraktionContext _localctx = new WertzuweisungSubtraktionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wertzuweisungSubtraktion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ALPHANUMERIC);
			setState(61);
			match(T__2);
			setState(62);
			match(ALPHANUMERIC);
			setState(63);
			match(T__5);
			setState(64);
			match(ALPHANUMERIC);
			setState(65);
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
	public static class StopAnweisungContext extends ParserRuleContext {
		public StopAnweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopAnweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterStopAnweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitStopAnweisung(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitStopAnweisung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopAnweisungContext stopAnweisung() throws RecognitionException {
		StopAnweisungContext _localctx = new StopAnweisungContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stopAnweisung);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__7);
				setState(69);
				match(T__3);
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
	public static class SprunganweisungContext extends ParserRuleContext {
		public UnbedingteSprunganweisungContext unbedingteSprunganweisung() {
			return getRuleContext(UnbedingteSprunganweisungContext.class,0);
		}
		public BedingteSprunganweisungContext bedingteSprunganweisung() {
			return getRuleContext(BedingteSprunganweisungContext.class,0);
		}
		public SprunganweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sprunganweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterSprunganweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitSprunganweisung(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitSprunganweisung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SprunganweisungContext sprunganweisung() throws RecognitionException {
		SprunganweisungContext _localctx = new SprunganweisungContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sprunganweisung);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				unbedingteSprunganweisung();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				bedingteSprunganweisung();
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
	public static class UnbedingteSprunganweisungContext extends ParserRuleContext {
		public ZeilenReferenzierungContext zeilenReferenzierung() {
			return getRuleContext(ZeilenReferenzierungContext.class,0);
		}
		public UnbedingteSprunganweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbedingteSprunganweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterUnbedingteSprunganweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitUnbedingteSprunganweisung(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitUnbedingteSprunganweisung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnbedingteSprunganweisungContext unbedingteSprunganweisung() throws RecognitionException {
		UnbedingteSprunganweisungContext _localctx = new UnbedingteSprunganweisungContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unbedingteSprunganweisung);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__8);
			setState(77);
			zeilenReferenzierung();
			setState(78);
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
	public static class BedingteSprunganweisungContext extends ParserRuleContext {
		public TerminalNode ALPHANUMERIC() { return getToken(deutschsprachigeProgrammierspracheParser.ALPHANUMERIC, 0); }
		public TerminalNode NUMBER() { return getToken(deutschsprachigeProgrammierspracheParser.NUMBER, 0); }
		public ZeilenReferenzierungContext zeilenReferenzierung() {
			return getRuleContext(ZeilenReferenzierungContext.class,0);
		}
		public BedingteSprunganweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bedingteSprunganweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterBedingteSprunganweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitBedingteSprunganweisung(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitBedingteSprunganweisung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BedingteSprunganweisungContext bedingteSprunganweisung() throws RecognitionException {
		BedingteSprunganweisungContext _localctx = new BedingteSprunganweisungContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bedingteSprunganweisung);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__9);
			setState(81);
			match(ALPHANUMERIC);
			setState(82);
			match(T__10);
			setState(83);
			match(NUMBER);
			setState(84);
			match(T__11);
			setState(85);
			zeilenReferenzierung();
			setState(86);
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
	public static class ZeilenReferenzierungContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(deutschsprachigeProgrammierspracheParser.NUMBER, 0); }
		public ZeilenReferenzierungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeilenReferenzierung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterZeilenReferenzierung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitZeilenReferenzierung(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitZeilenReferenzierung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZeilenReferenzierungContext zeilenReferenzierung() throws RecognitionException {
		ZeilenReferenzierungContext _localctx = new ZeilenReferenzierungContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_zeilenReferenzierung);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__0);
			setState(89);
			match(NUMBER);
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
	public static class EingabeContext extends ParserRuleContext {
		public TerminalNode ALPHANUMERIC() { return getToken(deutschsprachigeProgrammierspracheParser.ALPHANUMERIC, 0); }
		public EingabeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eingabe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterEingabe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitEingabe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitEingabe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EingabeContext eingabe() throws RecognitionException {
		EingabeContext _localctx = new EingabeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eingabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__12);
			setState(92);
			match(ALPHANUMERIC);
			setState(93);
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
	public static class AusgabeContext extends ParserRuleContext {
		public TerminalNode ALPHANUMERIC() { return getToken(deutschsprachigeProgrammierspracheParser.ALPHANUMERIC, 0); }
		public AusgabeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausgabe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).enterAusgabe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deutschsprachigeProgrammierspracheListener ) ((deutschsprachigeProgrammierspracheListener)listener).exitAusgabe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deutschsprachigeProgrammierspracheVisitor ) return ((deutschsprachigeProgrammierspracheVisitor<? extends T>)visitor).visitAusgabe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AusgabeContext ausgabe() throws RecognitionException {
		AusgabeContext _localctx = new AusgabeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ausgabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__13);
			setState(96);
			match(ALPHANUMERIC);
			setState(97);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0011d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001$\b\u0001"+
		"\u000b\u0001\f\u0001%\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006G\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007K\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000`\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000"+
		"\u0000\u00060\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n<\u0001"+
		"\u0000\u0000\u0000\fF\u0001\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000"+
		"\u0000\u0010L\u0001\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000\u0014"+
		"X\u0001\u0000\u0000\u0000\u0016[\u0001\u0000\u0000\u0000\u0018_\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0001\u0001"+
		"\u0000\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !\u0005\u000f\u0000"+
		"\u0000!#\u0005\u0002\u0000\u0000\"$\u0003\u0004\u0002\u0000#\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\'/\u0003\u0006\u0003"+
		"\u0000(/\u0003\b\u0004\u0000)/\u0003\n\u0005\u0000*/\u0003\f\u0006\u0000"+
		"+/\u0003\u000e\u0007\u0000,/\u0003\u0016\u000b\u0000-/\u0003\u0018\f\u0000"+
		".\'\u0001\u0000\u0000\u0000.(\u0001\u0000\u0000\u0000.)\u0001\u0000\u0000"+
		"\u0000.*\u0001\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0005\u0001\u0000\u0000\u0000"+
		"01\u0005\u0010\u0000\u000012\u0005\u0003\u0000\u000023\u0005\u000f\u0000"+
		"\u000034\u0005\u0004\u0000\u00004\u0007\u0001\u0000\u0000\u000056\u0005"+
		"\u0010\u0000\u000067\u0005\u0003\u0000\u000078\u0005\u0010\u0000\u0000"+
		"89\u0005\u0005\u0000\u00009:\u0005\u0010\u0000\u0000:;\u0005\u0004\u0000"+
		"\u0000;\t\u0001\u0000\u0000\u0000<=\u0005\u0010\u0000\u0000=>\u0005\u0003"+
		"\u0000\u0000>?\u0005\u0010\u0000\u0000?@\u0005\u0006\u0000\u0000@A\u0005"+
		"\u0010\u0000\u0000AB\u0005\u0004\u0000\u0000B\u000b\u0001\u0000\u0000"+
		"\u0000CG\u0005\u0007\u0000\u0000DE\u0005\b\u0000\u0000EG\u0005\u0004\u0000"+
		"\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000G\r\u0001\u0000"+
		"\u0000\u0000HK\u0003\u0010\b\u0000IK\u0003\u0012\t\u0000JH\u0001\u0000"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000K\u000f\u0001\u0000\u0000\u0000"+
		"LM\u0005\t\u0000\u0000MN\u0003\u0014\n\u0000NO\u0005\u0004\u0000\u0000"+
		"O\u0011\u0001\u0000\u0000\u0000PQ\u0005\n\u0000\u0000QR\u0005\u0010\u0000"+
		"\u0000RS\u0005\u000b\u0000\u0000ST\u0005\u000f\u0000\u0000TU\u0005\f\u0000"+
		"\u0000UV\u0003\u0014\n\u0000VW\u0005\u0004\u0000\u0000W\u0013\u0001\u0000"+
		"\u0000\u0000XY\u0005\u0001\u0000\u0000YZ\u0005\u000f\u0000\u0000Z\u0015"+
		"\u0001\u0000\u0000\u0000[\\\u0005\r\u0000\u0000\\]\u0005\u0010\u0000\u0000"+
		"]^\u0005\u0004\u0000\u0000^\u0017\u0001\u0000\u0000\u0000_`\u0005\u000e"+
		"\u0000\u0000`a\u0005\u0010\u0000\u0000ab\u0005\u0004\u0000\u0000b\u0019"+
		"\u0001\u0000\u0000\u0000\u0005\u001d%.FJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}