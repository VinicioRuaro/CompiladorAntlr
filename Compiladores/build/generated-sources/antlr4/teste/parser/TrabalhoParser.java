// Generated from C:\Users\vinic\Documents\NetBeansProjects\Compiladores\grammar\teste\parser\Trabalho.g4 by ANTLR 4.6
 
package teste.parser;
import java.util.*;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrabalhoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, EOL=6, PE=7, PD=8, ADIC=9, RESTO=10, 
		MENOS=11, MULT=12, DIV=13, IGUAL=14, PALA=15, VAR=16, NUM=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_input = 2, RULE_output = 3, RULE_expr0 = 4, 
		RULE_expr1 = 5, RULE_expr2 = 6;
	public static final String[] ruleNames = {
		"prog", "stmt", "input", "output", "expr0", "expr1", "expr2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'double'", "'string'", "'\"'", "'print'", "';'", "'('", 
		"')'", "'+'", "'%'", "'-'", "'*'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "EOL", "PE", "PD", "ADIC", "RESTO", 
		"MENOS", "MULT", "DIV", "IGUAL", "PALA", "VAR", "NUM", "WS"
	};
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
	public String getGrammarFileName() { return "Trabalho.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private HashMap<String,Simbolo> memory = new HashMap<String,Simbolo>();

	public TrabalhoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Integer val;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				stmt();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << PE) | (1L << NUM))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public Integer val;
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode EOL() { return getToken(TrabalhoParser.EOL, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case PE:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				input();
				setState(20);
				match(EOL);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				output();
				setState(23);
				match(EOL);
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

	public static class InputContext extends ParserRuleContext {
		public Integer val;
		public Token VAR;
		public Expr0Context expr0;
		public Token PALA;
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode PALA() { return getToken(TrabalhoParser.PALA, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(T__0);
				setState(28);
				((InputContext)_localctx).VAR = match(VAR);
				Simbolo simbolo = new Simbolo("int",2);
				                                 simbolo.valori=0;
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+0);              
				                                   
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(T__0);
				setState(31);
				((InputContext)_localctx).VAR = match(VAR);
				setState(32);
				match(IGUAL);
				setState(33);
				((InputContext)_localctx).expr0 = expr0();
				Simbolo simbolo = new Simbolo("int",2);
				                                 simbolo.valori=((InputContext)_localctx).expr0.val;
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+((InputContext)_localctx).expr0.val);              
				                                   
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(T__1);
				setState(37);
				((InputContext)_localctx).VAR = match(VAR);
				Simbolo simbolo = new Simbolo("double",1);
				                                 simbolo.valord=0;
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+0);              
				                                   
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(T__1);
				setState(40);
				((InputContext)_localctx).VAR = match(VAR);
				setState(41);
				match(IGUAL);
				setState(42);
				((InputContext)_localctx).expr0 = expr0();
				Simbolo simbolo = new Simbolo("double",1);
				                                 simbolo.valord=((InputContext)_localctx).expr0.val;
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+((InputContext)_localctx).expr0.val);              
				                                   
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(T__2);
				setState(46);
				((InputContext)_localctx).VAR = match(VAR);
				setState(47);
				match(IGUAL);
				setState(48);
				match(T__3);
				setState(49);
				((InputContext)_localctx).PALA = match(PALA);
				setState(50);
				match(T__3);
				Simbolo simbolo = new Simbolo("String",0);
				                                 simbolo.valors=(((InputContext)_localctx).PALA!=null?((InputContext)_localctx).PALA.getText():null);
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+(((InputContext)_localctx).PALA!=null?((InputContext)_localctx).PALA.getText():null));              
				                                   
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(T__2);
				setState(53);
				((InputContext)_localctx).VAR = match(VAR);
				Simbolo simbolo = new Simbolo("String",0);
				                                 simbolo.valors="";
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+"");              
				                                  
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				((InputContext)_localctx).expr0 = expr0();
				System.out.println(((InputContext)_localctx).expr0.val);
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

	public static class OutputContext extends ParserRuleContext {
		public String val;
		public Token VAR;
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__4);
			setState(61);
			((OutputContext)_localctx).VAR = match(VAR);
			   if(memory.get((((OutputContext)_localctx).VAR!=null?((OutputContext)_localctx).VAR.getText():null)).tiponum==0){
			                                                System.out.println(memory.get(((OutputContext)_localctx).VAR).tipo+"="+memory.get(((OutputContext)_localctx).VAR).valors);
			                                                }
			                                            if(memory.get((((OutputContext)_localctx).VAR!=null?((OutputContext)_localctx).VAR.getText():null)).tiponum==1){
			                                                System.out.println(memory.get(((OutputContext)_localctx).VAR).tipo+"="+memory.get(((OutputContext)_localctx).VAR).valord);
			                                                }
			                                            if(memory.get((((OutputContext)_localctx).VAR!=null?((OutputContext)_localctx).VAR.getText():null)).tiponum==2){
			                                                System.out.println(memory.get(((OutputContext)_localctx).VAR).tipo+"="+memory.get(((OutputContext)_localctx).VAR).valori);
			                                                }
			                                          System.out.println(memory.get((((OutputContext)_localctx).VAR!=null?((OutputContext)_localctx).VAR.getText():null)));
			                                        
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

	public static class Expr0Context extends ParserRuleContext {
		public Integer val;
		public Expr1Context expr1;
		public Expr0Context h1;
		public Expr0Context h2;
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr0);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((Expr0Context)_localctx).expr1 = expr1();
				setState(65);
				match(ADIC);
				setState(66);
				((Expr0Context)_localctx).h1 = expr0();
				((Expr0Context)_localctx).val =  ((Expr0Context)_localctx).expr1.val + ((Expr0Context)_localctx).h1.val;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				((Expr0Context)_localctx).expr1 = expr1();
				setState(70);
				match(MENOS);
				setState(71);
				((Expr0Context)_localctx).h2 = expr0();
				((Expr0Context)_localctx).val =  ((Expr0Context)_localctx).expr1.val - ((Expr0Context)_localctx).h2.val;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				((Expr0Context)_localctx).expr1 = expr1();
				((Expr0Context)_localctx).val =  ((Expr0Context)_localctx).expr1.val;
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

	public static class Expr1Context extends ParserRuleContext {
		public Integer val;
		public Expr2Context expr2;
		public Expr1Context t1;
		public Expr1Context t2;
		public Expr1Context t3;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr1);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((Expr1Context)_localctx).expr2 = expr2();
				setState(80);
				match(MULT);
				setState(81);
				((Expr1Context)_localctx).t1 = expr1();
				((Expr1Context)_localctx).val =  ((Expr1Context)_localctx).expr2.val * ((Expr1Context)_localctx).t1.val;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((Expr1Context)_localctx).expr2 = expr2();
				setState(85);
				match(DIV);
				setState(86);
				((Expr1Context)_localctx).t2 = expr1();
				((Expr1Context)_localctx).val =  ((Expr1Context)_localctx).expr2.val / ((Expr1Context)_localctx).t2.val;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((Expr1Context)_localctx).expr2 = expr2();
				setState(90);
				match(RESTO);
				setState(91);
				((Expr1Context)_localctx).t3 = expr1();
				((Expr1Context)_localctx).val =  ((Expr1Context)_localctx).expr2.val % ((Expr1Context)_localctx).t3.val;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				((Expr1Context)_localctx).expr2 = expr2();
				((Expr1Context)_localctx).val =  ((Expr1Context)_localctx).expr2.val;
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

	public static class Expr2Context extends ParserRuleContext {
		public Integer val;
		public Expr0Context expr0;
		public Token NUM;
		public TerminalNode PE() { return getToken(TrabalhoParser.PE, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode PD() { return getToken(TrabalhoParser.PD, 0); }
		public TerminalNode NUM() { return getToken(TrabalhoParser.NUM, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr2);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PE:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(PE);
				setState(100);
				((Expr2Context)_localctx).expr0 = expr0();
				setState(101);
				match(PD);
				((Expr2Context)_localctx).val =  ((Expr2Context)_localctx).expr0.val;
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				((Expr2Context)_localctx).NUM = match(NUM);
				((Expr2Context)_localctx).val =  Integer.parseInt((((Expr2Context)_localctx).NUM!=null?((Expr2Context)_localctx).NUM.getText():null));
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7d\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bm\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2u\2\21\3\2\2\2\4\33\3\2"+
		"\2\2\6<\3\2\2\2\b>\3\2\2\2\nO\3\2\2\2\fc\3\2\2\2\16l\3\2\2\2\20\22\5\4"+
		"\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2"+
		"\2\2\25\26\5\6\4\2\26\27\7\b\2\2\27\34\3\2\2\2\30\31\5\b\5\2\31\32\7\b"+
		"\2\2\32\34\3\2\2\2\33\25\3\2\2\2\33\30\3\2\2\2\34\5\3\2\2\2\35\36\7\3"+
		"\2\2\36\37\7\22\2\2\37=\b\4\1\2 !\7\3\2\2!\"\7\22\2\2\"#\7\20\2\2#$\5"+
		"\n\6\2$%\b\4\1\2%=\3\2\2\2&\'\7\4\2\2\'(\7\22\2\2(=\b\4\1\2)*\7\4\2\2"+
		"*+\7\22\2\2+,\7\20\2\2,-\5\n\6\2-.\b\4\1\2.=\3\2\2\2/\60\7\5\2\2\60\61"+
		"\7\22\2\2\61\62\7\20\2\2\62\63\7\6\2\2\63\64\7\21\2\2\64\65\7\6\2\2\65"+
		"=\b\4\1\2\66\67\7\5\2\2\678\7\22\2\28=\b\4\1\29:\5\n\6\2:;\b\4\1\2;=\3"+
		"\2\2\2<\35\3\2\2\2< \3\2\2\2<&\3\2\2\2<)\3\2\2\2</\3\2\2\2<\66\3\2\2\2"+
		"<9\3\2\2\2=\7\3\2\2\2>?\7\7\2\2?@\7\22\2\2@A\b\5\1\2A\t\3\2\2\2BC\5\f"+
		"\7\2CD\7\13\2\2DE\5\n\6\2EF\b\6\1\2FP\3\2\2\2GH\5\f\7\2HI\7\r\2\2IJ\5"+
		"\n\6\2JK\b\6\1\2KP\3\2\2\2LM\5\f\7\2MN\b\6\1\2NP\3\2\2\2OB\3\2\2\2OG\3"+
		"\2\2\2OL\3\2\2\2P\13\3\2\2\2QR\5\16\b\2RS\7\16\2\2ST\5\f\7\2TU\b\7\1\2"+
		"Ud\3\2\2\2VW\5\16\b\2WX\7\17\2\2XY\5\f\7\2YZ\b\7\1\2Zd\3\2\2\2[\\\5\16"+
		"\b\2\\]\7\f\2\2]^\5\f\7\2^_\b\7\1\2_d\3\2\2\2`a\5\16\b\2ab\b\7\1\2bd\3"+
		"\2\2\2cQ\3\2\2\2cV\3\2\2\2c[\3\2\2\2c`\3\2\2\2d\r\3\2\2\2ef\7\t\2\2fg"+
		"\5\n\6\2gh\7\n\2\2hi\b\b\1\2im\3\2\2\2jk\7\23\2\2km\b\b\1\2le\3\2\2\2"+
		"lj\3\2\2\2m\17\3\2\2\2\b\23\33<Ocl";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}