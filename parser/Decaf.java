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
		PLUS_IG=43, PRCNT=37, KW_INT=11, MENOR=46, KW_FALSE=8, NO=32, KW_BOOLEAN=3, 
		CHAR=17, KW_CONTINUE=6, WHITESPACE=1, PYC=24, INT=18, KW_TRUE=13, MENORIGUAL=48, 
		MULT=35, AND=38, ID=21, IG=41, LSBRACKET=25, QUOTE=22, RES=36, KW_CALLOUT=5, 
		BOOLEAN=20, DIG=42, KW_VOID=14, KW_BREAK=4, MIN_IG=44, POT=40, COMMA=29, 
		RSBRACKET=26, HEX=19, KW_WHILE=10, KW_FOR=9, OR=39, LCBRACKET=27, KW_RETURN=12, 
		NOIGUAL=49, MAYOR=45, PLUS=33, DIV=34, COMMENT=15, KW_IF=2, MAYORIGUAL=47, 
		RCBRACKET=28, BSLASH=23, PA=30, STRING=16, PC=31, KW_ELSE=7;
	public static final String[] tokenNames = {
		"<INVALID>", "WHITESPACE", "'if'", "'boolean'", "'break'", "'callout'", 
		"'continue'", "'else'", "'false'", "'for'", "'while'", "'int'", "'return'", 
		"'true'", "'void'", "COMMENT", "STRING", "CHAR", "INT", "HEX", "BOOLEAN", 
		"ID", "'\"'", "'\\'", "';'", "'['", "']'", "'{'", "'}'", "','", "'('", 
		"')'", "'!'", "'+'", "'/'", "'*'", "'-'", "'%'", "'&&'", "'||'", "'^'", 
		"'='", "'=='", "'+='", "'-='", "'>'", "'<'", "'>='", "'<='", "'!='"
	};
	public static final int
		RULE_start = 0, RULE_callout_decl = 1, RULE_field_decl = 2, RULE_type = 3, 
		RULE_int_literal = 4, RULE_method_decl = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_location = 8, RULE_expr = 9;
	public static final String[] ruleNames = {
		"start", "callout_decl", "field_decl", "type", "int_literal", "method_decl", 
		"block", "statement", "location", "expr"
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
		public List<Callout_declContext> callout_decl() {
			return getRuleContexts(Callout_declContext.class);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Callout_declContext callout_decl(int i) {
			return getRuleContext(Callout_declContext.class,i);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_CALLOUT) {
				{
				{
				setState(20); callout_decl();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26); field_decl();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BOOLEAN) | (1L << KW_INT) | (1L << KW_VOID))) != 0)) {
				{
				{
				setState(32); method_decl();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println ("	program");
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
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public TerminalNode KW_CALLOUT() { return getToken(Decaf.KW_CALLOUT, 0); }
		public Callout_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCallout_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCallout_decl(this);
		}
	}

	public final Callout_declContext callout_decl() throws RecognitionException {
		Callout_declContext _localctx = new Callout_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_callout_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(KW_CALLOUT);
			setState(41); match(ID);
			setState(42); match(PYC);
			System.out.println ("		callout_decl");
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

	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode LSBRACKET(int i) {
			return getToken(Decaf.LSBRACKET, i);
		}
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public Int_literalContext int_literal(int i) {
			return getRuleContext(Int_literalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Decaf.COMMA); }
		public List<TerminalNode> ID() { return getTokens(Decaf.ID); }
		public List<Int_literalContext> int_literal() {
			return getRuleContexts(Int_literalContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> RSBRACKET() { return getTokens(Decaf.RSBRACKET); }
		public TerminalNode RSBRACKET(int i) {
			return getToken(Decaf.RSBRACKET, i);
		}
		public List<TerminalNode> LSBRACKET() { return getTokens(Decaf.LSBRACKET); }
		public TerminalNode COMMA(int i) {
			return getToken(Decaf.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(Decaf.ID, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); type();
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(54);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(46); match(ID);
					setState(47); match(COMMA);
					}
					break;
				case 2:
					{
					setState(48); match(ID);
					setState(49); match(LSBRACKET);
					setState(50); int_literal();
					setState(51); match(RSBRACKET);
					setState(52); match(COMMA);
					}
					break;
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(58); match(PYC);
			System.out.println ("		field_decl");
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode KW_INT() { return getToken(Decaf.KW_INT, 0); }
		public TerminalNode KW_BOOLEAN() { return getToken(Decaf.KW_BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==KW_BOOLEAN || _la==KW_INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			System.out.println ("			type");
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

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Decaf.INT, 0); }
		public TerminalNode HEX() { return getToken(Decaf.HEX, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==HEX) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			System.out.println ("			int_literal");
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

	public static class Method_declContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(Decaf.COMMA); }
		public TerminalNode PA() { return getToken(Decaf.PA, 0); }
		public List<TerminalNode> ID() { return getTokens(Decaf.ID); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode KW_VOID() { return getToken(Decaf.KW_VOID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PC() { return getToken(Decaf.PC, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(Decaf.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(Decaf.ID, i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			switch (_input.LA(1)) {
			case KW_BOOLEAN:
			case KW_INT:
				{
				setState(67); type();
				}
				break;
			case KW_VOID:
				{
				setState(68); match(KW_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(71); match(ID);
			setState(72); match(PA);
			setState(81);
			_la = _input.LA(1);
			if (_la==KW_BOOLEAN || _la==KW_INT) {
				{
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73); type();
					setState(74); match(ID);
					setState(75); match(COMMA);
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_BOOLEAN || _la==KW_INT );
				}
			}

			setState(83); match(PC);
			setState(84); block();
			System.out.println ("		method_decl");
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode LCBRACKET() { return getToken(Decaf.LCBRACKET, 0); }
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RCBRACKET() { return getToken(Decaf.RCBRACKET, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(LCBRACKET);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_BOOLEAN || _la==KW_INT) {
				{
				{
				setState(88); field_decl();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_CONTINUE || _la==ID) {
				{
				{
				setState(94); statement();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); match(RCBRACKET);
			System.out.println ("			block");
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(Decaf.KW_CONTINUE, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); location();
				}
				break;
			case KW_CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(KW_CONTINUE);
				setState(105); match(PYC);
				System.out.println ("			statement");
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

	public static class LocationContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public TerminalNode RSBRACKET() { return getToken(Decaf.RSBRACKET, 0); }
		public TerminalNode LSBRACKET() { return getToken(Decaf.LSBRACKET, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_location);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); match(ID);
				setState(111); match(LSBRACKET);
				setState(112); expr();
				setState(113); match(RSBRACKET);
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); location();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\7\2$"+
		"\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\6\49\n\4\r\4\16\4:\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\5\7H\n\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7P\n\7\r\7\16\7Q\5\7T\n\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\b\7\bb\n\b\f\b\16"+
		"\be\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\nv\n\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\4\2\5\5\r\r"+
		"\3\2\24\25{\2\31\3\2\2\2\4*\3\2\2\2\6/\3\2\2\2\b?\3\2\2\2\nB\3\2\2\2\f"+
		"G\3\2\2\2\16Y\3\2\2\2\20m\3\2\2\2\22u\3\2\2\2\24w\3\2\2\2\26\30\5\4\3"+
		"\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\37\3\2\2"+
		"\2\33\31\3\2\2\2\34\36\5\6\4\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2"+
		"\37 \3\2\2\2 %\3\2\2\2!\37\3\2\2\2\"$\5\f\7\2#\"\3\2\2\2$\'\3\2\2\2%#"+
		"\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\b\2\1\2)\3\3\2\2\2*+\7\7\2\2"+
		"+,\7\27\2\2,-\7\32\2\2-.\b\3\1\2.\5\3\2\2\2/8\5\b\5\2\60\61\7\27\2\2\61"+
		"9\7\37\2\2\62\63\7\27\2\2\63\64\7\33\2\2\64\65\5\n\6\2\65\66\7\34\2\2"+
		"\66\67\7\37\2\2\679\3\2\2\28\60\3\2\2\28\62\3\2\2\29:\3\2\2\2:8\3\2\2"+
		"\2:;\3\2\2\2;<\3\2\2\2<=\7\32\2\2=>\b\4\1\2>\7\3\2\2\2?@\t\2\2\2@A\b\5"+
		"\1\2A\t\3\2\2\2BC\t\3\2\2CD\b\6\1\2D\13\3\2\2\2EH\5\b\5\2FH\7\20\2\2G"+
		"E\3\2\2\2GF\3\2\2\2HI\3\2\2\2IJ\7\27\2\2JS\7 \2\2KL\5\b\5\2LM\7\27\2\2"+
		"MN\7\37\2\2NP\3\2\2\2OK\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2"+
		"\2SO\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7!\2\2VW\5\16\b\2WX\b\7\1\2X\r\3\2"+
		"\2\2Y]\7\35\2\2Z\\\5\6\4\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^c"+
		"\3\2\2\2_]\3\2\2\2`b\5\20\t\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2"+
		"df\3\2\2\2ec\3\2\2\2fg\7\36\2\2gh\b\b\1\2h\17\3\2\2\2in\5\22\n\2jk\7\b"+
		"\2\2kl\7\32\2\2ln\b\t\1\2mi\3\2\2\2mj\3\2\2\2n\21\3\2\2\2ov\7\27\2\2p"+
		"q\7\27\2\2qr\7\33\2\2rs\5\24\13\2st\7\34\2\2tv\3\2\2\2uo\3\2\2\2up\3\2"+
		"\2\2v\23\3\2\2\2wx\5\22\n\2x\25\3\2\2\2\16\31\37%8:GQS]cmu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}