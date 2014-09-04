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
		PLUS_IG=43, PRCNT=37, KW_INT=12, MENOR=46, KW_FALSE=9, NO=32, KW_BOOLEAN=4, 
		CHAR=17, KW_CONTINUE=7, WHITESPACE=2, PYC=24, INT=18, KW_TRUE=14, MENORIGUAL=48, 
		MULT=35, AND=38, ID=21, IG=41, LSBRACKET=25, QUOTE=22, RES=36, KW_CALLOUT=6, 
		BOOLEAN=20, DIG=42, KW_VOID=15, KW_BREAK=5, MIN_IG=44, POT=40, COMMA=29, 
		RSBRACKET=26, HEX=19, KW_WHILE=11, KW_FOR=10, OR=39, LCBRACKET=27, KW_RETURN=13, 
		NOIGUAL=49, MAYOR=45, PLUS=33, DIV=34, COMMENT=1, KW_IF=3, MAYORIGUAL=47, 
		RCBRACKET=28, BSLASH=23, PA=30, STRING=16, PC=31, KW_ELSE=8;
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENT", "WHITESPACE", "'if'", "'boolean'", "'break'", 
		"'callout'", "'continue'", "'else'", "'false'", "'for'", "'while'", "'int'", 
		"'return'", "'true'", "'void'", "STRING", "CHAR", "INT", "HEX", "BOOLEAN", 
		"ID", "'\"'", "'\\'", "';'", "'['", "']'", "'{'", "'}'", "','", "'('", 
		"')'", "'!'", "'+'", "'/'", "'*'", "'-'", "'%'", "'&&'", "'||'", "'^'", 
		"'='", "'=='", "'+='", "'-='", "'>'", "'<'", "'>='", "'<='", "'!='"
	};
	public static final int
		RULE_start = 0, RULE_callout_decl = 1, RULE_field_decl = 2, RULE_auxVar = 3, 
		RULE_type = 4, RULE_int_literal = 5, RULE_method_decl = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_location = 9, RULE_expr = 10, RULE_expr2 = 11, 
		RULE_assign_opp = 12, RULE_method_call = 13, RULE_method_name = 14, RULE_callout_arg = 15, 
		RULE_literal = 16, RULE_char_literal = 17, RULE_bool_literal = 18, RULE_bin_op = 19, 
		RULE_arith_op = 20, RULE_rel_op = 21, RULE_eq_op = 22, RULE_cond_op = 23;
	public static final String[] ruleNames = {
		"start", "callout_decl", "field_decl", "auxVar", "type", "int_literal", 
		"method_decl", "block", "statement", "location", "expr", "expr2", "assign_opp", 
		"method_call", "method_name", "callout_arg", "literal", "char_literal", 
		"bool_literal", "bin_op", "arith_op", "rel_op", "eq_op", "cond_op"
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_CALLOUT) {
				{
				{
				setState(48); callout_decl();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54); field_decl();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BOOLEAN) | (1L << KW_INT) | (1L << KW_VOID))) != 0)) {
				{
				{
				setState(60); method_decl();
				}
				}
				setState(65);
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
			setState(68); match(KW_CALLOUT);
			setState(69); match(ID);
			setState(70); match(PYC);
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
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public List<AuxVarContext> auxVar() {
			return getRuleContexts(AuxVarContext.class);
		}
		public AuxVarContext auxVar(int i) {
			return getRuleContext(AuxVarContext.class,i);
		}
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(Decaf.RSBRACKET, 0); }
		public TerminalNode LSBRACKET() { return getToken(Decaf.LSBRACKET, 0); }
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
			setState(73); type();
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(74); match(ID);
				}
				break;
			case 2:
				{
				setState(75); match(ID);
				setState(76); match(LSBRACKET);
				setState(77); int_literal();
				setState(78); match(RSBRACKET);
				}
				break;
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82); auxVar();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); match(PYC);
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

	public static class AuxVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public TerminalNode COMMA() { return getToken(Decaf.COMMA, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(Decaf.RSBRACKET, 0); }
		public TerminalNode LSBRACKET() { return getToken(Decaf.LSBRACKET, 0); }
		public AuxVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterAuxVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitAuxVar(this);
		}
	}

	public final AuxVarContext auxVar() throws RecognitionException {
		AuxVarContext _localctx = new AuxVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_auxVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(COMMA);
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(92); match(ID);
				}
				break;
			case 2:
				{
				setState(93); match(ID);
				setState(94); match(LSBRACKET);
				setState(95); int_literal();
				setState(96); match(RSBRACKET);
				}
				break;
			}
			System.out.println (" 			auxVar");
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
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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
		enterRule(_localctx, 10, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 12, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			switch (_input.LA(1)) {
			case KW_BOOLEAN:
			case KW_INT:
				{
				setState(108); type();
				}
				break;
			case KW_VOID:
				{
				setState(109); match(KW_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112); match(ID);
			setState(113); match(PA);
			setState(122);
			_la = _input.LA(1);
			if (_la==KW_BOOLEAN || _la==KW_INT) {
				{
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(114); type();
					setState(115); match(ID);
					setState(116); match(COMMA);
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_BOOLEAN || _la==KW_INT );
				}
			}

			setState(124); match(PC);
			setState(125); block();
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(LCBRACKET);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_BOOLEAN || _la==KW_INT) {
				{
				{
				setState(129); field_decl();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(135); statement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141); match(RCBRACKET);
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
		public TerminalNode KW_CONTINUE() { return getToken(Decaf.KW_CONTINUE, 0); }
		public TerminalNode KW_WHILE() { return getToken(Decaf.KW_WHILE, 0); }
		public TerminalNode KW_RETURN() { return getToken(Decaf.KW_RETURN, 0); }
		public TerminalNode IG() { return getToken(Decaf.IG, 0); }
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode KW_IF() { return getToken(Decaf.KW_IF, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode PC() { return getToken(Decaf.PC, 0); }
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public TerminalNode KW_ELSE() { return getToken(Decaf.KW_ELSE, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode COMMA() { return getToken(Decaf.COMMA, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PA() { return getToken(Decaf.PA, 0); }
		public TerminalNode KW_FOR() { return getToken(Decaf.KW_FOR, 0); }
		public TerminalNode KW_BREAK() { return getToken(Decaf.KW_BREAK, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public Assign_oppContext assign_opp() {
			return getRuleContext(Assign_oppContext.class,0);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(144); location();
				setState(145); assign_opp();
				setState(146); expr();
				setState(147); match(PYC);
				}
				break;
			case 2:
				{
				setState(149); method_call();
				setState(150); match(PYC);
				}
				break;
			case 3:
				{
				setState(152); match(KW_IF);
				setState(153); match(PA);
				setState(154); expr();
				setState(155); match(PC);
				setState(156); block();
				setState(159);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(157); match(KW_ELSE);
					setState(158); block();
					}
				}

				}
				break;
			case 4:
				{
				setState(161); match(KW_FOR);
				setState(162); match(PA);
				setState(163); match(ID);
				setState(164); match(IG);
				setState(165); expr();
				setState(166); match(COMMA);
				setState(167); expr();
				setState(168); match(PC);
				setState(169); block();
				}
				break;
			case 5:
				{
				setState(171); match(KW_WHILE);
				setState(172); match(PA);
				setState(173); expr();
				setState(174); match(PC);
				setState(175); block();
				}
				break;
			case 6:
				{
				setState(177); match(KW_RETURN);
				setState(179);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << HEX) | (1L << BOOLEAN) | (1L << ID) | (1L << PA) | (1L << NO) | (1L << RES))) != 0)) {
					{
					setState(178); expr();
					}
				}

				setState(181); match(PYC);
				}
				break;
			case 7:
				{
				setState(182); match(KW_BREAK);
				setState(183); match(PYC);
				}
				break;
			case 8:
				{
				setState(184); match(KW_CONTINUE);
				setState(185); match(PYC);
				}
				break;
			}
			System.out.println ("			statement");
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
		enterRule(_localctx, 18, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(190); match(ID);
				}
				break;
			case 2:
				{
				setState(191); match(ID);
				setState(192); match(LSBRACKET);
				setState(193); expr();
				setState(194); match(RSBRACKET);
				}
				break;
			}
			System.out.println ("			location");
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
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PA() { return getToken(Decaf.PA, 0); }
		public TerminalNode NO() { return getToken(Decaf.NO, 0); }
		public TerminalNode RES() { return getToken(Decaf.RES, 0); }
		public TerminalNode PC() { return getToken(Decaf.PC, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
		enterRule(_localctx, 20, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(200); location();
				}
				break;
			case 2:
				{
				setState(201); method_call();
				}
				break;
			case 3:
				{
				setState(202); literal();
				}
				break;
			case 4:
				{
				setState(203); expr2();
				setState(204); bin_op();
				setState(205); expr();
				}
				break;
			case 5:
				{
				setState(207); match(RES);
				setState(208); expr();
				}
				break;
			case 6:
				{
				setState(209); match(NO);
				setState(210); expr();
				}
				break;
			case 7:
				{
				setState(211); match(PA);
				setState(212); expr();
				setState(213); match(PC);
				}
				break;
			}
			System.out.println ("			expr");
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
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PA() { return getToken(Decaf.PA, 0); }
		public TerminalNode NO() { return getToken(Decaf.NO, 0); }
		public TerminalNode RES() { return getToken(Decaf.RES, 0); }
		public TerminalNode PC() { return getToken(Decaf.PC, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitExpr2(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(219); location();
				}
				break;
			case 2:
				{
				setState(220); method_call();
				}
				break;
			case 3:
				{
				setState(221); literal();
				}
				break;
			case 4:
				{
				setState(222); match(RES);
				setState(223); expr();
				}
				break;
			case 5:
				{
				setState(224); match(NO);
				setState(225); expr();
				}
				break;
			case 6:
				{
				setState(226); match(PA);
				setState(227); expr();
				setState(228); match(PC);
				}
				break;
			}
			System.out.println ("			expr");
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

	public static class Assign_oppContext extends ParserRuleContext {
		public TerminalNode MIN_IG() { return getToken(Decaf.MIN_IG, 0); }
		public TerminalNode IG() { return getToken(Decaf.IG, 0); }
		public TerminalNode PLUS_IG() { return getToken(Decaf.PLUS_IG, 0); }
		public Assign_oppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_opp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterAssign_opp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitAssign_opp(this);
		}
	}

	public final Assign_oppContext assign_opp() throws RecognitionException {
		Assign_oppContext _localctx = new Assign_oppContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign_opp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IG) | (1L << PLUS_IG) | (1L << MIN_IG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			System.out.println ("			assign_opp");
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

	public static class Method_callContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(Decaf.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PA() { return getToken(Decaf.PA, 0); }
		public TerminalNode PC() { return getToken(Decaf.PC, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(Decaf.COMMA, i);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(237); method_name();
				setState(238); match(PA);
				setState(246);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << HEX) | (1L << BOOLEAN) | (1L << ID) | (1L << PA) | (1L << NO) | (1L << RES))) != 0)) {
					{
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(239); expr();
						setState(240); match(COMMA);
						}
						}
						setState(244); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << HEX) | (1L << BOOLEAN) | (1L << ID) | (1L << PA) | (1L << NO) | (1L << RES))) != 0) );
					}
				}

				setState(248); match(PC);
				}
				break;
			case 2:
				{
				setState(250); method_name();
				setState(251); match(PA);
				setState(259);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << CHAR) | (1L << INT) | (1L << HEX) | (1L << BOOLEAN) | (1L << ID) | (1L << PA) | (1L << NO) | (1L << RES))) != 0)) {
					{
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(252); callout_arg();
						setState(253); match(COMMA);
						}
						}
						setState(257); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << CHAR) | (1L << INT) | (1L << HEX) | (1L << BOOLEAN) | (1L << ID) | (1L << PA) | (1L << NO) | (1L << RES))) != 0) );
					}
				}

				setState(261); match(PC);
				}
				break;
			}
			System.out.println ("			method_call");
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(ID);
			System.out.println ("			method_name");
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

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(Decaf.STRING, 0); }
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callout_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			switch (_input.LA(1)) {
			case CHAR:
			case INT:
			case HEX:
			case BOOLEAN:
			case ID:
			case PA:
			case NO:
			case RES:
				{
				setState(270); expr();
				}
				break;
			case STRING:
				{
				setState(271); match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			System.out.println ("			callout_arg");
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

	public static class LiteralContext extends ParserRuleContext {
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			switch (_input.LA(1)) {
			case INT:
			case HEX:
				{
				setState(276); int_literal();
				}
				break;
			case CHAR:
				{
				setState(277); char_literal();
				}
				break;
			case BOOLEAN:
				{
				setState(278); bool_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			System.out.println ("			literal");
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

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(Decaf.CHAR, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(CHAR);
			System.out.println ("			char_literal");
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Decaf.BOOLEAN, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bool_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); match(BOOLEAN);
			System.out.println ("			bool_literal");
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

	public static class Bin_opContext extends ParserRuleContext {
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bin_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			switch (_input.LA(1)) {
			case PLUS:
			case DIV:
			case MULT:
			case RES:
			case PRCNT:
				{
				setState(289); arith_op();
				}
				break;
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
				{
				setState(290); rel_op();
				}
				break;
			case DIG:
			case NOIGUAL:
				{
				setState(291); eq_op();
				}
				break;
			case AND:
			case OR:
				{
				setState(292); cond_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			System.out.println ("			bin_op");
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

	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(Decaf.DIV, 0); }
		public TerminalNode MULT() { return getToken(Decaf.MULT, 0); }
		public TerminalNode PRCNT() { return getToken(Decaf.PRCNT, 0); }
		public TerminalNode RES() { return getToken(Decaf.RES, 0); }
		public TerminalNode PLUS() { return getToken(Decaf.PLUS, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitArith_op(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << DIV) | (1L << MULT) | (1L << RES) | (1L << PRCNT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			System.out.println ("			arith_op");
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

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(Decaf.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(Decaf.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Decaf.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Decaf.MENORIGUAL, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL) | (1L << MENORIGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			System.out.println ("			rel_op");
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

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode NOIGUAL() { return getToken(Decaf.NOIGUAL, 0); }
		public TerminalNode DIG() { return getToken(Decaf.DIG, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !(_la==DIG || _la==NOIGUAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			System.out.println ("			eq_op");
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

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Decaf.AND, 0); }
		public TerminalNode OR() { return getToken(Decaf.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			System.out.println ("			cond_op");
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u0138\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4S\n\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5e\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\bq\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\6\by\n\b\r\b\16\bz\5\b}\n\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\t\7\t\u008b\n\t\f\t\16\t"+
		"\u008e\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00a2\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bd"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c7\n\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00da\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e9\n\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\6\17\u00f5\n\17\r\17\16"+
		"\17\u00f6\5\17\u00f9\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u0102"+
		"\n\17\r\17\16\17\u0103\5\17\u0106\n\17\3\17\3\17\5\17\u010a\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u0113\n\21\3\21\3\21\3\22\3\22\3\22"+
		"\5\22\u011a\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\5\25\u0128\n\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\2\t\4\2\6\6\16\16\3\2\24\25\4\2++-.\3\2#\'\3\2/\62\4\2,,"+
		"\63\63\3\2()\u014a\2\65\3\2\2\2\4F\3\2\2\2\6K\3\2\2\2\b]\3\2\2\2\nh\3"+
		"\2\2\2\fk\3\2\2\2\16p\3\2\2\2\20\u0082\3\2\2\2\22\u00bc\3\2\2\2\24\u00c6"+
		"\3\2\2\2\26\u00d9\3\2\2\2\30\u00e8\3\2\2\2\32\u00ec\3\2\2\2\34\u0109\3"+
		"\2\2\2\36\u010d\3\2\2\2 \u0112\3\2\2\2\"\u0119\3\2\2\2$\u011d\3\2\2\2"+
		"&\u0120\3\2\2\2(\u0127\3\2\2\2*\u012b\3\2\2\2,\u012e\3\2\2\2.\u0131\3"+
		"\2\2\2\60\u0134\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63"+
		"\3\2\2\2\65\66\3\2\2\2\66;\3\2\2\2\67\65\3\2\2\28:\5\6\4\298\3\2\2\2:"+
		"=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>@\5\16\b\2?>\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\b\2\1\2E\3\3\2\2"+
		"\2FG\7\b\2\2GH\7\27\2\2HI\7\32\2\2IJ\b\3\1\2J\5\3\2\2\2KR\5\n\6\2LS\7"+
		"\27\2\2MN\7\27\2\2NO\7\33\2\2OP\5\f\7\2PQ\7\34\2\2QS\3\2\2\2RL\3\2\2\2"+
		"RM\3\2\2\2SW\3\2\2\2TV\5\b\5\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"XZ\3\2\2\2YW\3\2\2\2Z[\7\32\2\2[\\\b\4\1\2\\\7\3\2\2\2]d\7\37\2\2^e\7"+
		"\27\2\2_`\7\27\2\2`a\7\33\2\2ab\5\f\7\2bc\7\34\2\2ce\3\2\2\2d^\3\2\2\2"+
		"d_\3\2\2\2ef\3\2\2\2fg\b\5\1\2g\t\3\2\2\2hi\t\2\2\2ij\b\6\1\2j\13\3\2"+
		"\2\2kl\t\3\2\2lm\b\7\1\2m\r\3\2\2\2nq\5\n\6\2oq\7\21\2\2pn\3\2\2\2po\3"+
		"\2\2\2qr\3\2\2\2rs\7\27\2\2s|\7 \2\2tu\5\n\6\2uv\7\27\2\2vw\7\37\2\2w"+
		"y\3\2\2\2xt\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|x\3\2\2\2"+
		"|}\3\2\2\2}~\3\2\2\2~\177\7!\2\2\177\u0080\5\20\t\2\u0080\u0081\b\b\1"+
		"\2\u0081\17\3\2\2\2\u0082\u0086\7\35\2\2\u0083\u0085\5\6\4\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u008c\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\5\22\n\2\u008a\u0089\3"+
		"\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\36\2\2\u0090\u0091\b"+
		"\t\1\2\u0091\21\3\2\2\2\u0092\u0093\5\24\13\2\u0093\u0094\5\32\16\2\u0094"+
		"\u0095\5\26\f\2\u0095\u0096\7\32\2\2\u0096\u00bd\3\2\2\2\u0097\u0098\5"+
		"\34\17\2\u0098\u0099\7\32\2\2\u0099\u00bd\3\2\2\2\u009a\u009b\7\5\2\2"+
		"\u009b\u009c\7 \2\2\u009c\u009d\5\26\f\2\u009d\u009e\7!\2\2\u009e\u00a1"+
		"\5\20\t\2\u009f\u00a0\7\n\2\2\u00a0\u00a2\5\20\t\2\u00a1\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00bd\3\2\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5"+
		"\7 \2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7+\2\2\u00a7\u00a8\5\26\f\2\u00a8"+
		"\u00a9\7\37\2\2\u00a9\u00aa\5\26\f\2\u00aa\u00ab\7!\2\2\u00ab\u00ac\5"+
		"\20\t\2\u00ac\u00bd\3\2\2\2\u00ad\u00ae\7\r\2\2\u00ae\u00af\7 \2\2\u00af"+
		"\u00b0\5\26\f\2\u00b0\u00b1\7!\2\2\u00b1\u00b2\5\20\t\2\u00b2\u00bd\3"+
		"\2\2\2\u00b3\u00b5\7\17\2\2\u00b4\u00b6\5\26\f\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bd\7\32\2\2\u00b8\u00b9\7"+
		"\7\2\2\u00b9\u00bd\7\32\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00bd\7\32\2\2\u00bc"+
		"\u0092\3\2\2\2\u00bc\u0097\3\2\2\2\u00bc\u009a\3\2\2\2\u00bc\u00a3\3\2"+
		"\2\2\u00bc\u00ad\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\n\1\2\u00bf\23\3\2\2"+
		"\2\u00c0\u00c7\7\27\2\2\u00c1\u00c2\7\27\2\2\u00c2\u00c3\7\33\2\2\u00c3"+
		"\u00c4\5\26\f\2\u00c4\u00c5\7\34\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c0\3"+
		"\2\2\2\u00c6\u00c1\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\13\1\2\u00c9"+
		"\25\3\2\2\2\u00ca\u00da\5\24\13\2\u00cb\u00da\5\34\17\2\u00cc\u00da\5"+
		"\"\22\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf\5(\25\2\u00cf\u00d0\5\26\f\2"+
		"\u00d0\u00da\3\2\2\2\u00d1\u00d2\7&\2\2\u00d2\u00da\5\26\f\2\u00d3\u00d4"+
		"\7\"\2\2\u00d4\u00da\5\26\f\2\u00d5\u00d6\7 \2\2\u00d6\u00d7\5\26\f\2"+
		"\u00d7\u00d8\7!\2\2\u00d8\u00da\3\2\2\2\u00d9\u00ca\3\2\2\2\u00d9\u00cb"+
		"\3\2\2\2\u00d9\u00cc\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\f"+
		"\1\2\u00dc\27\3\2\2\2\u00dd\u00e9\5\24\13\2\u00de\u00e9\5\34\17\2\u00df"+
		"\u00e9\5\"\22\2\u00e0\u00e1\7&\2\2\u00e1\u00e9\5\26\f\2\u00e2\u00e3\7"+
		"\"\2\2\u00e3\u00e9\5\26\f\2\u00e4\u00e5\7 \2\2\u00e5\u00e6\5\26\f\2\u00e6"+
		"\u00e7\7!\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00de\3\2"+
		"\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\r\1\2\u00eb\31\3\2\2"+
		"\2\u00ec\u00ed\t\4\2\2\u00ed\u00ee\b\16\1\2\u00ee\33\3\2\2\2\u00ef\u00f0"+
		"\5\36\20\2\u00f0\u00f8\7 \2\2\u00f1\u00f2\5\26\f\2\u00f2\u00f3\7\37\2"+
		"\2\u00f3\u00f5\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7!\2\2\u00fb\u010a\3\2"+
		"\2\2\u00fc\u00fd\5\36\20\2\u00fd\u0105\7 \2\2\u00fe\u00ff\5 \21\2\u00ff"+
		"\u0100\7\37\2\2\u0100\u0102\3\2\2\2\u0101\u00fe\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u0101\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7!"+
		"\2\2\u0108\u010a\3\2\2\2\u0109\u00ef\3\2\2\2\u0109\u00fc\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\b\17\1\2\u010c\35\3\2\2\2\u010d\u010e\7\27"+
		"\2\2\u010e\u010f\b\20\1\2\u010f\37\3\2\2\2\u0110\u0113\5\26\f\2\u0111"+
		"\u0113\7\22\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3"+
		"\2\2\2\u0114\u0115\b\21\1\2\u0115!\3\2\2\2\u0116\u011a\5\f\7\2\u0117\u011a"+
		"\5$\23\2\u0118\u011a\5&\24\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b\22\1\2\u011c#\3\2\2\2"+
		"\u011d\u011e\7\23\2\2\u011e\u011f\b\23\1\2\u011f%\3\2\2\2\u0120\u0121"+
		"\7\26\2\2\u0121\u0122\b\24\1\2\u0122\'\3\2\2\2\u0123\u0128\5*\26\2\u0124"+
		"\u0128\5,\27\2\u0125\u0128\5.\30\2\u0126\u0128\5\60\31\2\u0127\u0123\3"+
		"\2\2\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\b\25\1\2\u012a)\3\2\2\2\u012b\u012c\t\5\2\2"+
		"\u012c\u012d\b\26\1\2\u012d+\3\2\2\2\u012e\u012f\t\6\2\2\u012f\u0130\b"+
		"\27\1\2\u0130-\3\2\2\2\u0131\u0132\t\7\2\2\u0132\u0133\b\30\1\2\u0133"+
		"/\3\2\2\2\u0134\u0135\t\b\2\2\u0135\u0136\b\31\1\2\u0136\61\3\2\2\2\33"+
		"\65;ARWdpz|\u0086\u008c\u00a1\u00b5\u00bc\u00c6\u00d9\u00e8\u00f6\u00f8"+
		"\u0103\u0105\u0109\u0112\u0119\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}