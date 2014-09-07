// Generated from parser\Decaf.g by ANTLR 4.4

  package compiler.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Decaf extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRCNT=43, MENOR=52, KW_BOOLEAN=4, CHAR=19, KW_TRUE=14, ID=27, AND=44, 
		IG=47, QUOTE=28, RES=42, KW_CALLOUT=6, BOOLEAN=26, KW_BREAK=5, MIN_IG=50, 
		POT=46, HEX=24, RSBRACKET=32, COMMA=35, KW_FOR=10, KW_WHILE=11, ERR5_CHAR=22, 
		KW_RETURN=13, LCBRACKET=33, NOIGUAL=55, PLUS=39, COMMENT=2, KW_IF=3, RCBRACKET=34, 
		PLUS_IG=49, KW_INT=12, KW_FALSE=9, NO=38, KW_CONTINUE=7, WHITESPACE=1, 
		PYC=30, INT=23, MENORIGUAL=54, MULT=41, ERR2_CHAR=18, LSBRACKET=31, KW_VOID=15, 
		DIG=48, ERR3_CHAR=20, ERR_HEX=25, OR=45, MAYOR=51, DIV=40, ERR1_CHAR=17, 
		ERR4_CHAR=21, MAYORIGUAL=53, BSLASH=29, PA=36, STRING=16, KW_ELSE=8, PC=37;
	public static final String[] tokenNames = {
		"<INVALID>", "WHITESPACE", "COMMENT", "'if'", "'boolean'", "'break'", 
		"'callout'", "'continue'", "'else'", "'false'", "'for'", "'while'", "'int'", 
		"'return'", "'true'", "'void'", "STRING", "ERR1_CHAR", "ERR2_CHAR", "CHAR", 
		"ERR3_CHAR", "ERR4_CHAR", "ERR5_CHAR", "INT", "HEX", "'0x'", "BOOLEAN", 
		"ID", "'\"'", "'\\'", "';'", "'['", "']'", "'{'", "'}'", "','", "'('", 
		"')'", "'!'", "'+'", "'/'", "'*'", "'-'", "'%'", "'&&'", "'||'", "'^'", 
		"'='", "'=='", "'+='", "'-='", "'>'", "'<'", "'>='", "'<='", "'!='"
	};
	public static final int
		RULE_start = 0, RULE_callout_decl = 1;
	public static final String[] ruleNames = {
		"start", "callout_decl"
	};

	@Override
	public String getGrammarFileName() { return "Decaf.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Decaf(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InicioContext extends StartContext {
		public List<Callout_declContext> callout_decl() {
			return getRuleContexts(Callout_declContext.class);
		}
		public Callout_declContext callout_decl(int i) {
			return getRuleContext(Callout_declContext.class,i);
		}
		public InicioContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			_localctx = new InicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_CALLOUT) {
				{
				{
				setState(4); callout_decl();
				}
				}
				setState(9);
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

	public static class Callout_declContext extends ParserRuleContext {
		public Callout_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_decl; }
	 
		public Callout_declContext() { }
		public void copyFrom(Callout_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalloutDeclContext extends Callout_declContext {
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public TerminalNode KW_CALLOUT() { return getToken(Decaf.KW_CALLOUT, 0); }
		public CalloutDeclContext(Callout_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCalloutDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCalloutDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitCalloutDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_declContext callout_decl() throws RecognitionException {
		Callout_declContext _localctx = new Callout_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_callout_decl);
		try {
			_localctx = new CalloutDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(10); match(KW_CALLOUT);
			setState(11); match(ID);
			setState(12); match(PYC);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\21\4\2\t\2\4\3\t"+
		"\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\17"+
		"\2\t\3\2\2\2\4\f\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2"+
		"\2\2\t\n\3\2\2\2\n\3\3\2\2\2\13\t\3\2\2\2\f\r\7\b\2\2\r\16\7\35\2\2\16"+
		"\17\7 \2\2\17\5\3\2\2\2\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}