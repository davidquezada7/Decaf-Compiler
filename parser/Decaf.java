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
		PRCNT=44, MENOR=53, KW_BOOLEAN=6, CHAR=21, KW_TRUE=16, ID=28, AND=45, 
		IG=48, QUOTE=29, RES=43, KW_CALLOUT=8, KW_BREAK=7, MIN_IG=51, POT=47, 
		HEX=26, RSBRACKET=33, COMMA=36, KW_WHILE=13, KW_FOR=12, ERR5_CHAR=24, 
		KW_RETURN=15, LCBRACKET=34, NOIGUAL=56, PLUS=40, COMMENT=2, KW_IF=5, BOOL_FALSE=4, 
		RCBRACKET=35, PLUS_IG=50, KW_INT=14, KW_FALSE=11, NO=39, KW_CONTINUE=9, 
		WHITESPACE=1, PYC=31, INT=25, MENORIGUAL=55, MULT=42, ERR2_CHAR=20, LSBRACKET=32, 
		DIG=49, KW_VOID=17, ERR3_CHAR=22, ERR_HEX=27, OR=46, MAYOR=52, DIV=41, 
		ERR1_CHAR=19, ERR4_CHAR=23, MAYORIGUAL=54, BSLASH=30, BOOL_TRUE=3, PA=37, 
		STRING=18, KW_ELSE=10, PC=38;
	public static final String[] tokenNames = {
		"<INVALID>", "WHITESPACE", "COMMENT", "BOOL_TRUE", "BOOL_FALSE", "'if'", 
		"'boolean'", "'break'", "'callout'", "'continue'", "'else'", "KW_FALSE", 
		"'for'", "'while'", "'int'", "'return'", "KW_TRUE", "'void'", "STRING", 
		"ERR1_CHAR", "ERR2_CHAR", "CHAR", "ERR3_CHAR", "ERR4_CHAR", "ERR5_CHAR", 
		"INT", "HEX", "'0x'", "ID", "'\"'", "'\\'", "';'", "'['", "']'", "'{'", 
		"'}'", "','", "'('", "')'", "'!'", "'+'", "'/'", "'*'", "'-'", "'%'", 
		"'&&'", "'||'", "'^'", "'='", "'=='", "'+='", "'-='", "'>'", "'<'", "'>='", 
		"'<='", "'!='"
	};
	public static final int
		RULE_start = 0, RULE_callout_decl = 1, RULE_method_decl = 2, RULE_type = 3, 
		RULE_field_decl = 4, RULE_arr = 5, RULE_statement = 6, RULE_block = 7, 
		RULE_location = 8, RULE_expr = 9, RULE_bin_op = 10, RULE_expr2 = 11, RULE_assign_opp = 12, 
		RULE_method_call = 13, RULE_method_call_expr = 14, RULE_method_call_callout = 15, 
		RULE_callout_arg = 16, RULE_literal = 17, RULE_int_literal = 18, RULE_char_literal = 19, 
		RULE_bool_literal = 20;
	public static final String[] ruleNames = {
		"start", "callout_decl", "method_decl", "type", "field_decl", "arr", "statement", 
		"block", "location", "expr", "bin_op", "expr2", "assign_opp", "method_call", 
		"method_call_expr", "method_call_callout", "callout_arg", "literal", "int_literal", 
		"char_literal", "bool_literal"
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
			int _alt;
			_localctx = new InicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_CALLOUT) {
				{
				{
				setState(42); callout_decl();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48); field_decl();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BOOLEAN) | (1L << KW_INT) | (1L << KW_VOID))) != 0)) {
				{
				{
				setState(54); method_decl();
				}
				}
				setState(59);
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
			setState(60); match(KW_CALLOUT);
			setState(61); match(ID);
			setState(62); match(PYC);
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
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
	 
		public Method_declContext() { }
		public void copyFrom(Method_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDeclContext extends Method_declContext {
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
		public MethodDeclContext(Method_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method_decl);
		int _la;
		try {
			_localctx = new MethodDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			switch (_input.LA(1)) {
			case KW_BOOLEAN:
			case KW_INT:
				{
				setState(64); type();
				}
				break;
			case KW_VOID:
				{
				setState(65); match(KW_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(68); match(ID);
			setState(69); match(PA);
			setState(81);
			_la = _input.LA(1);
			if (_la==KW_BOOLEAN || _la==KW_INT) {
				{
				setState(70); type();
				setState(71); match(ID);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(72); match(COMMA);
					setState(73); type();
					setState(74); match(ID);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(83); match(PC);
			setState(84); block();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==KW_BOOLEAN || _la==KW_INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
	 
		public Field_declContext() { }
		public void copyFrom(Field_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldDeclContext extends Field_declContext {
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Decaf.COMMA); }
		public List<TerminalNode> ID() { return getTokens(Decaf.ID); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ArrContext> arr() {
			return getRuleContexts(ArrContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Decaf.COMMA, i);
		}
		public ArrContext arr(int i) {
			return getRuleContext(ArrContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(Decaf.ID, i);
		}
		public FieldDeclContext(Field_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_decl);
		int _la;
		try {
			_localctx = new FieldDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(88); type();
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(89); arr();
				}
				break;
			case 2:
				{
				setState(90); match(ID);
				}
				break;
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93); match(COMMA);
				setState(96);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(94); match(ID);
					}
					break;
				case 2:
					{
					setState(95); arr();
					}
					break;
				}
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(PYC);
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

	public static class ArrContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Decaf.INT, 0); }
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public TerminalNode RSBRACKET() { return getToken(Decaf.RSBRACKET, 0); }
		public TerminalNode LSBRACKET() { return getToken(Decaf.LSBRACKET, 0); }
		public TerminalNode HEX() { return getToken(Decaf.HEX, 0); }
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(ID);
			{
			setState(106); match(LSBRACKET);
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==HEX) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(108); match(RSBRACKET);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statement6Context extends StatementContext {
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KW_RETURN() { return getToken(Decaf.KW_RETURN, 0); }
		public Statement6Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitStatement6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement5Context extends StatementContext {
		public TerminalNode KW_WHILE() { return getToken(Decaf.KW_WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PA() { return getToken(Decaf.PA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PC() { return getToken(Decaf.PC, 0); }
		public Statement5Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitStatement5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement4Context extends StatementContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode IG() { return getToken(Decaf.IG, 0); }
		public TerminalNode COMMA() { return getToken(Decaf.COMMA, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public TerminalNode PA() { return getToken(Decaf.PA, 0); }
		public TerminalNode KW_FOR() { return getToken(Decaf.KW_FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PC() { return getToken(Decaf.PC, 0); }
		public Statement4Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitStatement4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement3Context extends StatementContext {
		public TerminalNode KW_ELSE() { return getToken(Decaf.KW_ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode PA() { return getToken(Decaf.PA, 0); }
		public TerminalNode KW_IF() { return getToken(Decaf.KW_IF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode PC() { return getToken(Decaf.PC, 0); }
		public Statement3Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitStatement3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement2Context extends StatementContext {
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Statement2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitStatement2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement1Context extends StatementContext {
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_oppContext assign_opp() {
			return getRuleContext(Assign_oppContext.class,0);
		}
		public Statement1Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitStatement1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement8Context extends StatementContext {
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(Decaf.KW_CONTINUE, 0); }
		public Statement8Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitStatement8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement7Context extends StatementContext {
		public TerminalNode PYC() { return getToken(Decaf.PYC, 0); }
		public TerminalNode KW_BREAK() { return getToken(Decaf.KW_BREAK, 0); }
		public Statement7Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitStatement7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Statement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110); location();
				setState(111); assign_opp();
				setState(112); expr();
				setState(113); match(PYC);
				}
				break;
			case 2:
				_localctx = new Statement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115); method_call();
				setState(116); match(PYC);
				}
				break;
			case 3:
				_localctx = new Statement3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(KW_IF);
				setState(119); match(PA);
				setState(120); expr();
				setState(121); match(PC);
				setState(122); block();
				setState(125);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(123); match(KW_ELSE);
					setState(124); block();
					}
				}

				}
				break;
			case 4:
				_localctx = new Statement4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(127); match(KW_FOR);
				setState(128); match(PA);
				setState(129); match(ID);
				setState(130); match(IG);
				setState(131); expr();
				setState(132); match(COMMA);
				setState(133); expr();
				setState(134); match(PC);
				setState(135); block();
				}
				break;
			case 5:
				_localctx = new Statement5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137); match(KW_WHILE);
				setState(138); match(PA);
				setState(139); expr();
				setState(140); match(PC);
				setState(141); block();
				}
				break;
			case 6:
				_localctx = new Statement6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(143); match(KW_RETURN);
				setState(145);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TRUE) | (1L << BOOL_FALSE) | (1L << CHAR) | (1L << INT) | (1L << HEX) | (1L << ID) | (1L << NO) | (1L << RES))) != 0)) {
					{
					setState(144); expr();
					}
				}

				setState(147); match(PYC);
				}
				break;
			case 7:
				_localctx = new Statement7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(148); match(KW_BREAK);
				setState(149); match(PYC);
				}
				break;
			case 8:
				_localctx = new Statement8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(150); match(KW_CONTINUE);
				setState(151); match(PYC);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockeContext extends BlockContext {
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
		public BlockeContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBlocke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBlocke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBlocke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			_localctx = new BlockeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(LCBRACKET);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_BOOLEAN || _la==KW_INT) {
				{
				{
				setState(155); field_decl();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(161); statement();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167); match(RCBRACKET);
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
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	 
		public LocationContext() { }
		public void copyFrom(LocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocContext extends LocationContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public TerminalNode RSBRACKET() { return getToken(Decaf.RSBRACKET, 0); }
		public TerminalNode LSBRACKET() { return getToken(Decaf.LSBRACKET, 0); }
		public LocContext(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_location);
		try {
			_localctx = new LocContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(169); match(ID);
				}
				break;
			case 2:
				{
				setState(170); match(ID);
				setState(171); match(LSBRACKET);
				setState(172); expr();
				setState(173); match(RSBRACKET);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); location();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); method_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179); literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180); bin_op(0);
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

	public static class Bin_opContext extends ParserRuleContext {
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
	 
		public Bin_opContext() { }
		public void copyFrom(Bin_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Bin9Context extends Bin_opContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Bin9Context(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBin9(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bin7Context extends Bin_opContext {
		public TerminalNode AND() { return getToken(Decaf.AND, 0); }
		public Bin_opContext bin_op(int i) {
			return getRuleContext(Bin_opContext.class,i);
		}
		public List<Bin_opContext> bin_op() {
			return getRuleContexts(Bin_opContext.class);
		}
		public Bin7Context(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBin7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bin8Context extends Bin_opContext {
		public TerminalNode OR() { return getToken(Decaf.OR, 0); }
		public Bin_opContext bin_op(int i) {
			return getRuleContext(Bin_opContext.class,i);
		}
		public List<Bin_opContext> bin_op() {
			return getRuleContexts(Bin_opContext.class);
		}
		public Bin8Context(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBin8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bin2Context extends Bin_opContext {
		public TerminalNode NO() { return getToken(Decaf.NO, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public Bin2Context(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBin2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bin1Context extends Bin_opContext {
		public TerminalNode RES() { return getToken(Decaf.RES, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public Bin1Context(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBin1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bin6Context extends Bin_opContext {
		public TerminalNode NOIGUAL() { return getToken(Decaf.NOIGUAL, 0); }
		public Bin_opContext bin_op(int i) {
			return getRuleContext(Bin_opContext.class,i);
		}
		public List<Bin_opContext> bin_op() {
			return getRuleContexts(Bin_opContext.class);
		}
		public TerminalNode DIG() { return getToken(Decaf.DIG, 0); }
		public Bin6Context(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBin6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bin5Context extends Bin_opContext {
		public TerminalNode MAYOR() { return getToken(Decaf.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(Decaf.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Decaf.MAYORIGUAL, 0); }
		public Bin_opContext bin_op(int i) {
			return getRuleContext(Bin_opContext.class,i);
		}
		public TerminalNode MENORIGUAL() { return getToken(Decaf.MENORIGUAL, 0); }
		public List<Bin_opContext> bin_op() {
			return getRuleContexts(Bin_opContext.class);
		}
		public Bin5Context(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBin5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bin4Context extends Bin_opContext {
		public Bin_opContext bin_op(int i) {
			return getRuleContext(Bin_opContext.class,i);
		}
		public TerminalNode RES() { return getToken(Decaf.RES, 0); }
		public TerminalNode PLUS() { return getToken(Decaf.PLUS, 0); }
		public List<Bin_opContext> bin_op() {
			return getRuleContexts(Bin_opContext.class);
		}
		public Bin4Context(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBin4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bin3Context extends Bin_opContext {
		public TerminalNode DIV() { return getToken(Decaf.DIV, 0); }
		public TerminalNode MULT() { return getToken(Decaf.MULT, 0); }
		public TerminalNode PRCNT() { return getToken(Decaf.PRCNT, 0); }
		public Bin_opContext bin_op(int i) {
			return getRuleContext(Bin_opContext.class,i);
		}
		public List<Bin_opContext> bin_op() {
			return getRuleContexts(Bin_opContext.class);
		}
		public Bin3Context(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBin3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		return bin_op(0);
	}

	private Bin_opContext bin_op(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bin_opContext _localctx = new Bin_opContext(_ctx, _parentState);
		Bin_opContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_bin_op, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			switch (_input.LA(1)) {
			case RES:
				{
				_localctx = new Bin1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184); match(RES);
				setState(185); bin_op(9);
				}
				break;
			case NO:
				{
				_localctx = new Bin2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186); match(NO);
				setState(187); bin_op(8);
				}
				break;
			case BOOL_TRUE:
			case BOOL_FALSE:
			case CHAR:
			case INT:
			case HEX:
			case ID:
				{
				_localctx = new Bin9Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188); expr2();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Bin3Context(new Bin_opContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bin_op);
						setState(191);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(192);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MULT) | (1L << PRCNT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(193); bin_op(8);
						}
						break;
					case 2:
						{
						_localctx = new Bin4Context(new Bin_opContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bin_op);
						setState(194);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(195);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==RES) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(196); bin_op(7);
						}
						break;
					case 3:
						{
						_localctx = new Bin5Context(new Bin_opContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bin_op);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL) | (1L << MENORIGUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(199); bin_op(6);
						}
						break;
					case 4:
						{
						_localctx = new Bin6Context(new Bin_opContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bin_op);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						_la = _input.LA(1);
						if ( !(_la==DIG || _la==NOIGUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(202); bin_op(5);
						}
						break;
					case 5:
						{
						_localctx = new Bin7Context(new Bin_opContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bin_op);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204); match(AND);
						setState(205); bin_op(4);
						}
						break;
					case 6:
						{
						_localctx = new Bin8Context(new Bin_opContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bin_op);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207); match(OR);
						setState(208); bin_op(3);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr2Context extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr2);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); location();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); method_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216); literal();
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

	public static class Assign_oppContext extends ParserRuleContext {
		public Assign_oppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_opp; }
	 
		public Assign_oppContext() { }
		public void copyFrom(Assign_oppContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignOpContext extends Assign_oppContext {
		public TerminalNode MIN_IG() { return getToken(Decaf.MIN_IG, 0); }
		public TerminalNode IG() { return getToken(Decaf.IG, 0); }
		public TerminalNode PLUS_IG() { return getToken(Decaf.PLUS_IG, 0); }
		public AssignOpContext(Assign_oppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitAssignOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_oppContext assign_opp() throws RecognitionException {
		Assign_oppContext _localctx = new Assign_oppContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign_opp);
		int _la;
		try {
			_localctx = new AssignOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IG) | (1L << PLUS_IG) | (1L << MIN_IG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	 
		public Method_callContext() { }
		public void copyFrom(Method_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodcallContext extends Method_callContext {
		public TerminalNode PA() { return getToken(Decaf.PA, 0); }
		public TerminalNode ID() { return getToken(Decaf.ID, 0); }
		public Method_call_calloutContext method_call_callout() {
			return getRuleContext(Method_call_calloutContext.class,0);
		}
		public TerminalNode PC() { return getToken(Decaf.PC, 0); }
		public Method_call_exprContext method_call_expr() {
			return getRuleContext(Method_call_exprContext.class,0);
		}
		public MethodcallContext(Method_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethodcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitMethodcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_call);
		try {
			_localctx = new MethodcallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(ID);
			setState(222); match(PA);
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(223); method_call_expr();
				}
				break;
			case 2:
				{
				setState(224); method_call_callout();
				}
				break;
			}
			setState(227); match(PC);
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

	public static class Method_call_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(Decaf.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Decaf.COMMA, i);
		}
		public Method_call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_call_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_call_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitMethod_call_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_call_exprContext method_call_expr() throws RecognitionException {
		Method_call_exprContext _localctx = new Method_call_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method_call_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); expr();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(230); match(COMMA);
				setState(231); expr();
				}
				}
				setState(236);
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

	public static class Method_call_calloutContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(Decaf.COMMA); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Decaf.COMMA, i);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_call_calloutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_callout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_call_callout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_call_callout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitMethod_call_callout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_call_calloutContext method_call_callout() throws RecognitionException {
		Method_call_calloutContext _localctx = new Method_call_calloutContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_method_call_callout);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); callout_arg();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238); match(COMMA);
				setState(239); callout_arg();
				}
				}
				setState(244);
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

	public static class Callout_argContext extends ParserRuleContext {
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
	 
		public Callout_argContext() { }
		public void copyFrom(Callout_argContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalloutArg2Context extends Callout_argContext {
		public TerminalNode STRING() { return getToken(Decaf.STRING, 0); }
		public CalloutArg2Context(Callout_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCalloutArg2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCalloutArg2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitCalloutArg2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalloutArg1Context extends Callout_argContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CalloutArg1Context(Callout_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCalloutArg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCalloutArg1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitCalloutArg1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_callout_arg);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case BOOL_TRUE:
			case BOOL_FALSE:
			case CHAR:
			case INT:
			case HEX:
			case ID:
			case NO:
			case RES:
				_localctx = new CalloutArg1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245); expr();
				}
				break;
			case STRING:
				_localctx = new CalloutArg2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246); match(STRING);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Literal3Context extends LiteralContext {
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Literal3Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLiteral3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLiteral3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitLiteral3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal2Context extends LiteralContext {
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Literal2Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLiteral2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLiteral2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitLiteral2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal1Context extends LiteralContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Literal1Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLiteral1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLiteral1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitLiteral1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(252);
			switch (_input.LA(1)) {
			case INT:
			case HEX:
				_localctx = new Literal1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249); int_literal();
				}
				break;
			case CHAR:
				_localctx = new Literal2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250); char_literal();
				}
				break;
			case BOOL_TRUE:
			case BOOL_FALSE:
				_localctx = new Literal3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251); bool_literal();
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

	public static class Int_literalContext extends ParserRuleContext {
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
	 
		public Int_literalContext() { }
		public void copyFrom(Int_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralIntContext extends Int_literalContext {
		public TerminalNode INT() { return getToken(Decaf.INT, 0); }
		public TerminalNode HEX() { return getToken(Decaf.HEX, 0); }
		public LiteralIntContext(Int_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLiteralInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLiteralInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitLiteralInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_int_literal);
		int _la;
		try {
			_localctx = new LiteralIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==HEX) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
	 
		public Char_literalContext() { }
		public void copyFrom(Char_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralCharContext extends Char_literalContext {
		public TerminalNode CHAR() { return getToken(Decaf.CHAR, 0); }
		public LiteralCharContext(Char_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLiteralChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLiteralChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitLiteralChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_char_literal);
		try {
			_localctx = new LiteralCharContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(CHAR);
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
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
	 
		public Bool_literalContext() { }
		public void copyFrom(Bool_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralBooleanContext extends Bool_literalContext {
		public TerminalNode BOOL_TRUE() { return getToken(Decaf.BOOL_TRUE, 0); }
		public TerminalNode BOOL_FALSE() { return getToken(Decaf.BOOL_FALSE, 0); }
		public LiteralBooleanContext(Bool_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLiteralBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLiteralBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitLiteralBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bool_literal);
		int _la;
		try {
			_localctx = new LiteralBooleanContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==BOOL_TRUE || _la==BOOL_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return bin_op_sempred((Bin_opContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bin_op_sempred(Bin_opContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0107\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\5\4E\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16"+
		"\4R\13\4\5\4T\n\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\3\6"+
		"\5\6c\n\6\7\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0094\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u009b\n\b\3\t\3\t\7\t\u009f\n\t\f"+
		"\t\16\t\u00a2\13\t\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00b2\n\n\3\13\3\13\3\13\3\13\5\13\u00b8\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c0\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d4\n\f\f\f\16\f\u00d7\13"+
		"\f\3\r\3\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00e4"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u00eb\n\20\f\20\16\20\u00ee\13\20"+
		"\3\21\3\21\3\21\7\21\u00f3\n\21\f\21\16\21\u00f6\13\21\3\22\3\22\5\22"+
		"\u00fa\n\22\3\23\3\23\3\23\5\23\u00ff\n\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\26\2\3\26\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\n\4"+
		"\2\b\b\20\20\3\2\33\34\4\2+,..\4\2**--\3\2\669\4\2\63\63::\4\2\62\62\64"+
		"\65\3\2\5\6\u011b\2/\3\2\2\2\4>\3\2\2\2\6D\3\2\2\2\bX\3\2\2\2\nZ\3\2\2"+
		"\2\fk\3\2\2\2\16\u009a\3\2\2\2\20\u009c\3\2\2\2\22\u00b1\3\2\2\2\24\u00b7"+
		"\3\2\2\2\26\u00bf\3\2\2\2\30\u00db\3\2\2\2\32\u00dd\3\2\2\2\34\u00df\3"+
		"\2\2\2\36\u00e7\3\2\2\2 \u00ef\3\2\2\2\"\u00f9\3\2\2\2$\u00fe\3\2\2\2"+
		"&\u0100\3\2\2\2(\u0102\3\2\2\2*\u0104\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\65\3\2\2\2\61/\3\2\2\2\62\64\5\n\6\2"+
		"\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66;\3\2\2\2\67"+
		"\65\3\2\2\28:\5\6\4\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2"+
		"\2=;\3\2\2\2>?\7\n\2\2?@\7\36\2\2@A\7!\2\2A\5\3\2\2\2BE\5\b\5\2CE\7\23"+
		"\2\2DB\3\2\2\2DC\3\2\2\2EF\3\2\2\2FG\7\36\2\2GS\7\'\2\2HI\5\b\5\2IP\7"+
		"\36\2\2JK\7&\2\2KL\5\b\5\2LM\7\36\2\2MO\3\2\2\2NJ\3\2\2\2OR\3\2\2\2PN"+
		"\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SH\3\2\2\2ST\3\2\2\2TU\3\2\2\2U"+
		"V\7(\2\2VW\5\20\t\2W\7\3\2\2\2XY\t\2\2\2Y\t\3\2\2\2Z]\5\b\5\2[^\5\f\7"+
		"\2\\^\7\36\2\2][\3\2\2\2]\\\3\2\2\2^f\3\2\2\2_b\7&\2\2`c\7\36\2\2ac\5"+
		"\f\7\2b`\3\2\2\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2d_\3\2\2\2eh\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7!\2\2j\13\3\2\2\2kl\7\36\2\2l"+
		"m\7\"\2\2mn\t\3\2\2no\7#\2\2o\r\3\2\2\2pq\5\22\n\2qr\5\32\16\2rs\5\24"+
		"\13\2st\7!\2\2t\u009b\3\2\2\2uv\5\34\17\2vw\7!\2\2w\u009b\3\2\2\2xy\7"+
		"\7\2\2yz\7\'\2\2z{\5\24\13\2{|\7(\2\2|\177\5\20\t\2}~\7\f\2\2~\u0080\5"+
		"\20\t\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u009b\3\2\2\2\u0081\u0082"+
		"\7\16\2\2\u0082\u0083\7\'\2\2\u0083\u0084\7\36\2\2\u0084\u0085\7\62\2"+
		"\2\u0085\u0086\5\24\13\2\u0086\u0087\7&\2\2\u0087\u0088\5\24\13\2\u0088"+
		"\u0089\7(\2\2\u0089\u008a\5\20\t\2\u008a\u009b\3\2\2\2\u008b\u008c\7\17"+
		"\2\2\u008c\u008d\7\'\2\2\u008d\u008e\5\24\13\2\u008e\u008f\7(\2\2\u008f"+
		"\u0090\5\20\t\2\u0090\u009b\3\2\2\2\u0091\u0093\7\21\2\2\u0092\u0094\5"+
		"\24\13\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u009b\7!\2\2\u0096\u0097\7\t\2\2\u0097\u009b\7!\2\2\u0098\u0099\7\13"+
		"\2\2\u0099\u009b\7!\2\2\u009ap\3\2\2\2\u009au\3\2\2\2\u009ax\3\2\2\2\u009a"+
		"\u0081\3\2\2\2\u009a\u008b\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0096\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\17\3\2\2\2\u009c\u00a0\7$\2\2\u009d\u009f"+
		"\5\n\6\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a6\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5\16"+
		"\b\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7%"+
		"\2\2\u00aa\21\3\2\2\2\u00ab\u00b2\7\36\2\2\u00ac\u00ad\7\36\2\2\u00ad"+
		"\u00ae\7\"\2\2\u00ae\u00af\5\24\13\2\u00af\u00b0\7#\2\2\u00b0\u00b2\3"+
		"\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b2\23\3\2\2\2\u00b3"+
		"\u00b8\5\22\n\2\u00b4\u00b8\5\34\17\2\u00b5\u00b8\5$\23\2\u00b6\u00b8"+
		"\5\26\f\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b8\25\3\2\2\2\u00b9\u00ba\b\f\1\2\u00ba\u00bb"+
		"\7-\2\2\u00bb\u00c0\5\26\f\13\u00bc\u00bd\7)\2\2\u00bd\u00c0\5\26\f\n"+
		"\u00be\u00c0\5\30\r\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00d5\3\2\2\2\u00c1\u00c2\f\t\2\2\u00c2\u00c3\t\4\2\2\u00c3"+
		"\u00d4\5\26\f\n\u00c4\u00c5\f\b\2\2\u00c5\u00c6\t\5\2\2\u00c6\u00d4\5"+
		"\26\f\t\u00c7\u00c8\f\7\2\2\u00c8\u00c9\t\6\2\2\u00c9\u00d4\5\26\f\b\u00ca"+
		"\u00cb\f\6\2\2\u00cb\u00cc\t\7\2\2\u00cc\u00d4\5\26\f\7\u00cd\u00ce\f"+
		"\5\2\2\u00ce\u00cf\7/\2\2\u00cf\u00d4\5\26\f\6\u00d0\u00d1\f\4\2\2\u00d1"+
		"\u00d2\7\60\2\2\u00d2\u00d4\5\26\f\5\u00d3\u00c1\3\2\2\2\u00d3\u00c4\3"+
		"\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3"+
		"\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\27\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dc\5\22\n\2\u00d9\u00dc"+
		"\5\34\17\2\u00da\u00dc\5$\23\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2"+
		"\u00db\u00da\3\2\2\2\u00dc\31\3\2\2\2\u00dd\u00de\t\b\2\2\u00de\33\3\2"+
		"\2\2\u00df\u00e0\7\36\2\2\u00e0\u00e3\7\'\2\2\u00e1\u00e4\5\36\20\2\u00e2"+
		"\u00e4\5 \21\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7(\2\2\u00e6\35\3\2\2\2\u00e7\u00ec"+
		"\5\24\13\2\u00e8\u00e9\7&\2\2\u00e9\u00eb\5\24\13\2\u00ea\u00e8\3\2\2"+
		"\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\37"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f4\5\"\22\2\u00f0\u00f1\7&\2\2\u00f1"+
		"\u00f3\5\"\22\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3"+
		"\2\2\2\u00f4\u00f5\3\2\2\2\u00f5!\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa"+
		"\5\24\13\2\u00f8\u00fa\7\24\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2"+
		"\2\u00fa#\3\2\2\2\u00fb\u00ff\5&\24\2\u00fc\u00ff\5(\25\2\u00fd\u00ff"+
		"\5*\26\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"%\3\2\2\2\u0100\u0101\t\3\2\2\u0101\'\3\2\2\2\u0102\u0103\7\27\2\2\u0103"+
		")\3\2\2\2\u0104\u0105\t\t\2\2\u0105+\3\2\2\2\33/\65;DPS]bf\177\u0093\u009a"+
		"\u00a0\u00a6\u00b1\u00b7\u00bf\u00d3\u00d5\u00db\u00e3\u00ec\u00f4\u00f9"+
		"\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}