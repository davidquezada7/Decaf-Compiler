// Generated from scanner\SDecaf.g by ANTLR 4.4

	package compiler.scanner;
	import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SDecaf extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, KW_IF=2, KW_BOOLEAN=3, KW_BREAK=4, KW_CALLOUT=5, KW_CONTINUE=6, 
		KW_ELSE=7, KW_FALSE=8, KW_FOR=9, KW_WHILE=10, KW_INT=11, KW_RETURN=12, 
		KW_TRUE=13, KW_VOID=14, COMMENT=15, STRING=16, CHAR=17, INT=18, HEX=19, 
		BOOLEAN=20, ID=21, QUOTE=22, BSLASH=23, PYC=24, LSBRACKET=25, RSBRACKET=26, 
		LCBRACKET=27, RCBRACKET=28, COMMA=29, PA=30, PC=31, NO=32, PLUS=33, DIV=34, 
		MULT=35, RES=36, PRCNT=37, AND=38, OR=39, POT=40, IG=41, DIG=42, PLUS_IG=43, 
		MIN_IG=44, MAYOR=45, MENOR=46, MAYORIGUAL=47, MENORIGUAL=48, NOIGUAL=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "KW_IF", "KW_BOOLEAN", "KW_BREAK", "KW_CALLOUT", "KW_CONTINUE", 
		"KW_ELSE", "KW_FALSE", "KW_FOR", "KW_WHILE", "KW_INT", "KW_RETURN", "KW_TRUE", 
		"KW_VOID", "COMMENT", "STRING", "CHAR", "INT", "HEX", "BOOLEAN", "ID", 
		"QUOTE", "BSLASH", "PYC", "LSBRACKET", "RSBRACKET", "LCBRACKET", "RCBRACKET", 
		"COMMA", "PA", "PC", "NO", "PLUS", "DIV", "MULT", "RES", "PRCNT", "AND", 
		"OR", "POT", "IG", "DIG", "PLUS_IG", "MIN_IG", "MAYOR", "MENOR", "MAYORIGUAL", 
		"MENORIGUAL", "NOIGUAL"
	};


	public SDecaf(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SDecaf.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		case 1: KW_IF_action((RuleContext)_localctx, actionIndex); break;
		case 2: KW_BOOLEAN_action((RuleContext)_localctx, actionIndex); break;
		case 3: KW_BREAK_action((RuleContext)_localctx, actionIndex); break;
		case 4: KW_CALLOUT_action((RuleContext)_localctx, actionIndex); break;
		case 5: KW_CONTINUE_action((RuleContext)_localctx, actionIndex); break;
		case 6: KW_ELSE_action((RuleContext)_localctx, actionIndex); break;
		case 7: KW_FALSE_action((RuleContext)_localctx, actionIndex); break;
		case 8: KW_FOR_action((RuleContext)_localctx, actionIndex); break;
		case 9: KW_WHILE_action((RuleContext)_localctx, actionIndex); break;
		case 10: KW_INT_action((RuleContext)_localctx, actionIndex); break;
		case 11: KW_RETURN_action((RuleContext)_localctx, actionIndex); break;
		case 12: KW_TRUE_action((RuleContext)_localctx, actionIndex); break;
		case 13: KW_VOID_action((RuleContext)_localctx, actionIndex); break;
		case 14: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		case 15: STRING_action((RuleContext)_localctx, actionIndex); break;
		case 16: CHAR_action((RuleContext)_localctx, actionIndex); break;
		case 17: INT_action((RuleContext)_localctx, actionIndex); break;
		case 18: HEX_action((RuleContext)_localctx, actionIndex); break;
		case 19: BOOLEAN_action((RuleContext)_localctx, actionIndex); break;
		case 20: ID_action((RuleContext)_localctx, actionIndex); break;
		case 21: QUOTE_action((RuleContext)_localctx, actionIndex); break;
		case 22: BSLASH_action((RuleContext)_localctx, actionIndex); break;
		case 23: PYC_action((RuleContext)_localctx, actionIndex); break;
		case 24: LSBRACKET_action((RuleContext)_localctx, actionIndex); break;
		case 25: RSBRACKET_action((RuleContext)_localctx, actionIndex); break;
		case 26: LCBRACKET_action((RuleContext)_localctx, actionIndex); break;
		case 27: RCBRACKET_action((RuleContext)_localctx, actionIndex); break;
		case 28: COMMA_action((RuleContext)_localctx, actionIndex); break;
		case 29: PA_action((RuleContext)_localctx, actionIndex); break;
		case 30: PC_action((RuleContext)_localctx, actionIndex); break;
		case 31: NO_action((RuleContext)_localctx, actionIndex); break;
		case 32: PLUS_action((RuleContext)_localctx, actionIndex); break;
		case 33: DIV_action((RuleContext)_localctx, actionIndex); break;
		case 34: MULT_action((RuleContext)_localctx, actionIndex); break;
		case 35: RES_action((RuleContext)_localctx, actionIndex); break;
		case 36: PRCNT_action((RuleContext)_localctx, actionIndex); break;
		case 37: AND_action((RuleContext)_localctx, actionIndex); break;
		case 38: OR_action((RuleContext)_localctx, actionIndex); break;
		case 39: POT_action((RuleContext)_localctx, actionIndex); break;
		case 40: IG_action((RuleContext)_localctx, actionIndex); break;
		case 41: DIG_action((RuleContext)_localctx, actionIndex); break;
		case 42: PLUS_IG_action((RuleContext)_localctx, actionIndex); break;
		case 43: MIN_IG_action((RuleContext)_localctx, actionIndex); break;
		case 44: MAYOR_action((RuleContext)_localctx, actionIndex); break;
		case 45: MENOR_action((RuleContext)_localctx, actionIndex); break;
		case 46: MAYORIGUAL_action((RuleContext)_localctx, actionIndex); break;
		case 47: MENORIGUAL_action((RuleContext)_localctx, actionIndex); break;
		case 48: NOIGUAL_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void PLUS_IG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42: System.out.println("igual"); break;
		}
	}
	private void PRCNT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36: System.out.println("porcentaje"); break;
		}
	}
	private void KW_INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: System.out.println("kw_int"); break;
		}
	}
	private void MENOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45: System.out.println("menor"); break;
		}
	}
	private void KW_FALSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.println("kw_false"); break;
		}
	}
	private void NO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31: System.out.print("!"); break;
		}
	}
	private void KW_BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("kw_boolean"); break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: System.out.println(" caracter "); break;
		}
	}
	private void KW_CONTINUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.println("kw_continue"); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}
	private void PYC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23: System.out.println(";"); break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: System.out.println("numero entero"); break;
		}
	}
	private void KW_TRUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: System.out.println("kw_true"); break;
		}
	}
	private void MENORIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 47: System.out.println("menor o igual"); break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34: System.out.println("multiplicacion"); break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37: System.out.println("and"); break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20: System.out.println("id"); break;
		}
	}
	private void IG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40: System.out.println("igual"); break;
		}
	}
	private void LSBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24: System.out.print(" left square bracket "); break;
		}
	}
	private void QUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21: System.out.println("Comilla doble"); break;
		}
	}
	private void RES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35: System.out.println("resta"); break;
		}
	}
	private void KW_CALLOUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("kw_callout"); break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: System.out.println("boolean"); break;
		}
	}
	private void DIG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41: System.out.println("doble igual"); break;
		}
	}
	private void KW_VOID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: System.out.println("kw_void"); break;
		}
	}
	private void KW_BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("kw_break"); break;
		}
	}
	private void MIN_IG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43: System.out.println("igual"); break;
		}
	}
	private void POT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39: System.out.println("potencia"); break;
		}
	}
	private void COMMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28: System.out.print(" coma "); break;
		}
	}
	private void RSBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25: System.out.print(" right square bracket "); break;
		}
	}
	private void HEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: System.out.println("numero hexadecimal"); break;
		}
	}
	private void KW_WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: System.out.println("kw_while"); break;
		}
	}
	private void KW_FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.println("kw_for"); break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38: System.out.println("or"); break;
		}
	}
	private void LCBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26: System.out.print(" left curly bracket "); break;
		}
	}
	private void KW_RETURN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: System.out.println("kw_return"); break;
		}
	}
	private void NOIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 48: System.out.println("no igual"); break;
		}
	}
	private void MAYOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44: System.out.println("mayor"); break;
		}
	}
	private void PLUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32: System.out.println("suma"); break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33: System.out.println("división"); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: System.out.println("Comentario"); break;
		}
	}
	private void KW_IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("kw_if"); break;
		}
	}
	private void MAYORIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46: System.out.println("mayor o igual"); break;
		}
	}
	private void RCBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27: System.out.print(" right curly bracket "); break;
		}
	}
	private void BSLASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22: System.out.println("Backslash"); break;
		}
	}
	private void PA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29: System.out.print("parentesis abierto"); break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: System.out.println(" string"); break;
		}
	}
	private void PC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30: System.out.print("parentesis cerrado"); break;
		}
	}
	private void KW_ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("kw_else"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u0178\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\6\2g\n\2\r"+
		"\2\16\2h\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21"+
		"\u00db\n\21\f\21\16\21\u00de\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\5\23\u00ea\n\23\3\23\6\23\u00ed\n\23\r\23\16\23\u00ee"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\6\24\u00f7\n\24\r\24\16\24\u00f8\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0106\n\25\3\25"+
		"\3\25\3\26\5\26\u010b\n\26\3\26\7\26\u010e\n\26\f\26\16\26\u0111\13\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\2\2\63\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\7\5\2\13\f\17\17\"\"\3"+
		"\2$$\5\2\62;CHch\4\2C\\c|\5\2\62;C\\c|\u017e\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3f\3\2\2"+
		"\2\5l\3\2\2\2\7q\3\2\2\2\t{\3\2\2\2\13\u0083\3\2\2\2\r\u008d\3\2\2\2\17"+
		"\u0098\3\2\2\2\21\u009f\3\2\2\2\23\u00a7\3\2\2\2\25\u00ad\3\2\2\2\27\u00b5"+
		"\3\2\2\2\31\u00bb\3\2\2\2\33\u00c4\3\2\2\2\35\u00cb\3\2\2\2\37\u00d2\3"+
		"\2\2\2!\u00d8\3\2\2\2#\u00e2\3\2\2\2%\u00e9\3\2\2\2\'\u00f2\3\2\2\2)\u0105"+
		"\3\2\2\2+\u010a\3\2\2\2-\u0114\3\2\2\2/\u0117\3\2\2\2\61\u011a\3\2\2\2"+
		"\63\u011d\3\2\2\2\65\u0120\3\2\2\2\67\u0123\3\2\2\29\u0126\3\2\2\2;\u0129"+
		"\3\2\2\2=\u012c\3\2\2\2?\u012f\3\2\2\2A\u0132\3\2\2\2C\u0135\3\2\2\2E"+
		"\u0138\3\2\2\2G\u013b\3\2\2\2I\u013e\3\2\2\2K\u0141\3\2\2\2M\u0144\3\2"+
		"\2\2O\u0149\3\2\2\2Q\u014e\3\2\2\2S\u0151\3\2\2\2U\u0154\3\2\2\2W\u0159"+
		"\3\2\2\2Y\u015e\3\2\2\2[\u0163\3\2\2\2]\u0166\3\2\2\2_\u0169\3\2\2\2a"+
		"\u016e\3\2\2\2c\u0173\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2"+
		"hi\3\2\2\2ij\3\2\2\2jk\b\2\2\2k\4\3\2\2\2lm\7k\2\2mn\7h\2\2no\3\2\2\2"+
		"op\b\3\3\2p\6\3\2\2\2qr\7d\2\2rs\7q\2\2st\7q\2\2tu\7n\2\2uv\7g\2\2vw\7"+
		"c\2\2wx\7p\2\2xy\3\2\2\2yz\b\4\4\2z\b\3\2\2\2{|\7d\2\2|}\7t\2\2}~\7g\2"+
		"\2~\177\7c\2\2\177\u0080\7m\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\5\5"+
		"\2\u0082\n\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7c\2\2\u0085\u0086\7"+
		"n\2\2\u0086\u0087\7n\2\2\u0087\u0088\7q\2\2\u0088\u0089\7w\2\2\u0089\u008a"+
		"\7v\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\6\6\2\u008c\f\3\2\2\2\u008d"+
		"\u008e\7e\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p\2\2\u0090\u0091\7v\2\2"+
		"\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7w\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\7\7\2\u0097\16\3\2\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\b\b\b\2\u009e\20\3\2\2\2\u009f\u00a0"+
		"\7h\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\t\t\2\u00a6\22\3\2\2\2"+
		"\u00a7\u00a8\7h\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\b\n\n\2\u00ac\24\3\2\2\2\u00ad\u00ae\7y\2\2\u00ae"+
		"\u00af\7j\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\13\13\2\u00b4\26\3\2\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\b\f\f\2\u00ba\30\3\2\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd\u00be\7v\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7p\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\r\r\2\u00c3\32\3\2\2\2\u00c4"+
		"\u00c5\7v\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7g\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\16\16\2\u00ca\34\3\2\2\2\u00cb\u00cc"+
		"\7x\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7f\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\b\17\17\2\u00d1\36\3\2\2\2\u00d2\u00d3\7\61"+
		"\2\2\u00d3\u00d4\7\61\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6"+
		"\u00d7\b\20\20\2\u00d7 \3\2\2\2\u00d8\u00dc\7$\2\2\u00d9\u00db\n\3\2\2"+
		"\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7$\2\2\u00e0"+
		"\u00e1\b\21\21\2\u00e1\"\3\2\2\2\u00e2\u00e3\7)\2\2\u00e3\u00e4\13\2\2"+
		"\2\u00e4\u00e5\7)\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\22\22\2\u00e7"+
		"$\3\2\2\2\u00e8\u00ea\7/\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00ed\4\62;\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\b\23\23\2\u00f1&\3\2\2\2\u00f2\u00f3\7\62\2\2\u00f3\u00f4\7z\2"+
		"\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\t\4\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\b\24\24\2\u00fb(\3\2\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7t\2\2"+
		"\u00fe\u00ff\7w\2\2\u00ff\u0106\7g\2\2\u0100\u0101\7h\2\2\u0101\u0102"+
		"\7c\2\2\u0102\u0103\7n\2\2\u0103\u0104\7u\2\2\u0104\u0106\7g\2\2\u0105"+
		"\u00fc\3\2\2\2\u0105\u0100\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b\25"+
		"\25\2\u0108*\3\2\2\2\u0109\u010b\t\5\2\2\u010a\u0109\3\2\2\2\u010b\u010f"+
		"\3\2\2\2\u010c\u010e\t\6\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u0113\b\26\26\2\u0113,\3\2\2\2\u0114\u0115\7$\2\2\u0115\u0116"+
		"\b\27\27\2\u0116.\3\2\2\2\u0117\u0118\7^\2\2\u0118\u0119\b\30\30\2\u0119"+
		"\60\3\2\2\2\u011a\u011b\7=\2\2\u011b\u011c\b\31\31\2\u011c\62\3\2\2\2"+
		"\u011d\u011e\7]\2\2\u011e\u011f\b\32\32\2\u011f\64\3\2\2\2\u0120\u0121"+
		"\7_\2\2\u0121\u0122\b\33\33\2\u0122\66\3\2\2\2\u0123\u0124\7}\2\2\u0124"+
		"\u0125\b\34\34\2\u01258\3\2\2\2\u0126\u0127\7\177\2\2\u0127\u0128\b\35"+
		"\35\2\u0128:\3\2\2\2\u0129\u012a\7.\2\2\u012a\u012b\b\36\36\2\u012b<\3"+
		"\2\2\2\u012c\u012d\7*\2\2\u012d\u012e\b\37\37\2\u012e>\3\2\2\2\u012f\u0130"+
		"\7+\2\2\u0130\u0131\b  \2\u0131@\3\2\2\2\u0132\u0133\7#\2\2\u0133\u0134"+
		"\b!!\2\u0134B\3\2\2\2\u0135\u0136\7-\2\2\u0136\u0137\b\"\"\2\u0137D\3"+
		"\2\2\2\u0138\u0139\7\61\2\2\u0139\u013a\b##\2\u013aF\3\2\2\2\u013b\u013c"+
		"\7,\2\2\u013c\u013d\b$$\2\u013dH\3\2\2\2\u013e\u013f\7/\2\2\u013f\u0140"+
		"\b%%\2\u0140J\3\2\2\2\u0141\u0142\7\'\2\2\u0142\u0143\b&&\2\u0143L\3\2"+
		"\2\2\u0144\u0145\7(\2\2\u0145\u0146\7(\2\2\u0146\u0147\3\2\2\2\u0147\u0148"+
		"\b\'\'\2\u0148N\3\2\2\2\u0149\u014a\7~\2\2\u014a\u014b\7~\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014d\b((\2\u014dP\3\2\2\2\u014e\u014f\7`\2\2\u014f\u0150"+
		"\b))\2\u0150R\3\2\2\2\u0151\u0152\7?\2\2\u0152\u0153\b**\2\u0153T\3\2"+
		"\2\2\u0154\u0155\7?\2\2\u0155\u0156\7?\2\2\u0156\u0157\3\2\2\2\u0157\u0158"+
		"\b++\2\u0158V\3\2\2\2\u0159\u015a\7-\2\2\u015a\u015b\7?\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015d\b,,\2\u015dX\3\2\2\2\u015e\u015f\7/\2\2\u015f\u0160"+
		"\7?\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b--\2\u0162Z\3\2\2\2\u0163\u0164"+
		"\7@\2\2\u0164\u0165\b..\2\u0165\\\3\2\2\2\u0166\u0167\7>\2\2\u0167\u0168"+
		"\b//\2\u0168^\3\2\2\2\u0169\u016a\7@\2\2\u016a\u016b\7?\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016d\b\60\60\2\u016d`\3\2\2\2\u016e\u016f\7>\2\2\u016f"+
		"\u0170\7?\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b\61\61\2\u0172b\3\2\2\2"+
		"\u0173\u0174\7#\2\2\u0174\u0175\7?\2\2\u0175\u0176\3\2\2\2\u0176\u0177"+
		"\b\62\62\2\u0177d\3\2\2\2\f\2h\u00dc\u00e9\u00ee\u00f8\u0105\u010a\u010d"+
		"\u010f\63\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\b\b\3\t\t\3\n\n\3\13\13"+
		"\3\f\f\3\r\r\3\16\16\3\17\17\3\20\20\3\21\21\3\22\22\3\23\23\3\24\24\3"+
		"\25\25\3\26\26\3\27\27\3\30\30\3\31\31\3\32\32\3\33\33\3\34\34\3\35\35"+
		"\3\36\36\3\37\37\3  \3!!\3\"\"\3##\3$$\3%%\3&&\3\'\'\3((\3))\3**\3++\3"+
		",,\3--\3..\3//\3\60\60\3\61\61\3\62\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}