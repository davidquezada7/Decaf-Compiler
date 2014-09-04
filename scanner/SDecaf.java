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
		COMMENT=1, WHITESPACE=2, KW_IF=3, KW_BOOLEAN=4, KW_BREAK=5, KW_CALLOUT=6, 
		KW_CONTINUE=7, KW_ELSE=8, KW_FALSE=9, KW_FOR=10, KW_WHILE=11, KW_INT=12, 
		KW_RETURN=13, KW_TRUE=14, KW_VOID=15, STRING=16, CHAR=17, INT=18, HEX=19, 
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
		"COMMENT", "WHITESPACE", "KW_IF", "KW_BOOLEAN", "KW_BREAK", "KW_CALLOUT", 
		"KW_CONTINUE", "KW_ELSE", "KW_FALSE", "KW_FOR", "KW_WHILE", "KW_INT", 
		"KW_RETURN", "KW_TRUE", "KW_VOID", "STRING", "CHAR", "INT", "HEX", "BOOLEAN", 
		"ID", "QUOTE", "BSLASH", "PYC", "LSBRACKET", "RSBRACKET", "LCBRACKET", 
		"RCBRACKET", "COMMA", "PA", "PC", "NO", "PLUS", "DIV", "MULT", "RES", 
		"PRCNT", "AND", "OR", "POT", "IG", "DIG", "PLUS_IG", "MIN_IG", "MAYOR", 
		"MENOR", "MAYORIGUAL", "MENORIGUAL", "NOIGUAL"
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
		case 0: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		case 1: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		case 2: KW_IF_action((RuleContext)_localctx, actionIndex); break;
		case 3: KW_BOOLEAN_action((RuleContext)_localctx, actionIndex); break;
		case 4: KW_BREAK_action((RuleContext)_localctx, actionIndex); break;
		case 5: KW_CALLOUT_action((RuleContext)_localctx, actionIndex); break;
		case 6: KW_CONTINUE_action((RuleContext)_localctx, actionIndex); break;
		case 7: KW_ELSE_action((RuleContext)_localctx, actionIndex); break;
		case 8: KW_FALSE_action((RuleContext)_localctx, actionIndex); break;
		case 9: KW_FOR_action((RuleContext)_localctx, actionIndex); break;
		case 10: KW_WHILE_action((RuleContext)_localctx, actionIndex); break;
		case 11: KW_INT_action((RuleContext)_localctx, actionIndex); break;
		case 12: KW_RETURN_action((RuleContext)_localctx, actionIndex); break;
		case 13: KW_TRUE_action((RuleContext)_localctx, actionIndex); break;
		case 14: KW_VOID_action((RuleContext)_localctx, actionIndex); break;
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
		case 11: System.out.println("kw_int"); break;
		}
	}
	private void MENOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45: System.out.println("menor"); break;
		}
	}
	private void KW_FALSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.println("kw_false"); break;
		}
	}
	private void NO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31: System.out.print("!"); break;
		}
	}
	private void KW_BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("kw_boolean"); break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: System.out.println(" caracter "); break;
		}
	}
	private void KW_CONTINUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("kw_continue"); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
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
		case 13: System.out.println("kw_true"); break;
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
		case 5: System.out.println("kw_callout"); break;
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
		case 14: System.out.println("kw_void"); break;
		}
	}
	private void KW_BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("kw_break"); break;
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
		case 10: System.out.println("kw_while"); break;
		}
	}
	private void KW_FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: System.out.println("kw_for"); break;
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
		case 12: System.out.println("kw_return"); break;
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
		case 0: skip(); break;
		}
	}
	private void KW_IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("kw_if"); break;
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
		case 7: System.out.println("kw_else"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u017e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\7\2j\n\2\f\2\16\2m\13\2\3\2\3\2\3\2\3\3\6\3s\n\3\r\3\16\3t\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\7\21\u00e1\n\21\f\21\16\21\u00e4\13\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\5\23\u00f0\n\23\3\23"+
		"\6\23\u00f3\n\23\r\23\16\23\u00f4\3\23\3\23\3\24\3\24\3\24\3\24\6\24\u00fd"+
		"\n\24\r\24\16\24\u00fe\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u010c\n\25\3\25\3\25\3\26\5\26\u0111\n\26\3\26\7\26\u0114"+
		"\n\26\f\26\16\26\u0117\13\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"\3\2\b\3\2\f\f\5\2\13\f\17\17\"\"\3\2$$\5\2\62;CHch\5\2C\\aac|\6\2\62"+
		";C\\aac|\u0185\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5r\3\2\2\2\7x\3\2\2\2\t}\3"+
		"\2\2\2\13\u0087\3\2\2\2\r\u008f\3\2\2\2\17\u0099\3\2\2\2\21\u00a4\3\2"+
		"\2\2\23\u00ab\3\2\2\2\25\u00b3\3\2\2\2\27\u00b9\3\2\2\2\31\u00c1\3\2\2"+
		"\2\33\u00c7\3\2\2\2\35\u00d0\3\2\2\2\37\u00d7\3\2\2\2!\u00de\3\2\2\2#"+
		"\u00e8\3\2\2\2%\u00ef\3\2\2\2\'\u00f8\3\2\2\2)\u010b\3\2\2\2+\u0110\3"+
		"\2\2\2-\u011a\3\2\2\2/\u011d\3\2\2\2\61\u0120\3\2\2\2\63\u0123\3\2\2\2"+
		"\65\u0126\3\2\2\2\67\u0129\3\2\2\29\u012c\3\2\2\2;\u012f\3\2\2\2=\u0132"+
		"\3\2\2\2?\u0135\3\2\2\2A\u0138\3\2\2\2C\u013b\3\2\2\2E\u013e\3\2\2\2G"+
		"\u0141\3\2\2\2I\u0144\3\2\2\2K\u0147\3\2\2\2M\u014a\3\2\2\2O\u014f\3\2"+
		"\2\2Q\u0154\3\2\2\2S\u0157\3\2\2\2U\u015a\3\2\2\2W\u015f\3\2\2\2Y\u0164"+
		"\3\2\2\2[\u0169\3\2\2\2]\u016c\3\2\2\2_\u016f\3\2\2\2a\u0174\3\2\2\2c"+
		"\u0179\3\2\2\2ef\7\61\2\2fg\7\61\2\2gk\3\2\2\2hj\n\2\2\2ih\3\2\2\2jm\3"+
		"\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\f\2\2op\b\2\2\2p\4"+
		"\3\2\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2v"+
		"w\b\3\3\2w\6\3\2\2\2xy\7k\2\2yz\7h\2\2z{\3\2\2\2{|\b\4\4\2|\b\3\2\2\2"+
		"}~\7d\2\2~\177\7q\2\2\177\u0080\7q\2\2\u0080\u0081\7n\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7c\2\2\u0083\u0084\7p\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\b\5\5\2\u0086\n\3\2\2\2\u0087\u0088\7d\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7c\2\2\u008b\u008c\7m\2\2\u008c\u008d\3\2\2"+
		"\2\u008d\u008e\b\6\6\2\u008e\f\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091"+
		"\7c\2\2\u0091\u0092\7n\2\2\u0092\u0093\7n\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7w\2\2\u0095\u0096\7v\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\7\7"+
		"\2\u0098\16\3\2\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7p\2\2\u009c\u009d\7v\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\b\b"+
		"\2\u00a3\20\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7"+
		"\7u\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\t\t\2\u00aa"+
		"\22\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae"+
		"\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\n\n"+
		"\2\u00b2\24\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6"+
		"\7t\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\13\13\2\u00b8\26\3\2\2\2\u00b9"+
		"\u00ba\7y\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7n\2\2"+
		"\u00bd\u00be\7g\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\f\f\2\u00c0\30\3"+
		"\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\b\r\r\2\u00c6\32\3\2\2\2\u00c7\u00c8\7t\2\2"+
		"\u00c8\u00c9\7g\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc"+
		"\7t\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\16\16\2\u00cf"+
		"\34\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7w\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\17\17\2\u00d6\36\3\2\2"+
		"\2\u00d7\u00d8\7x\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7k\2\2\u00da\u00db"+
		"\7f\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\20\20\2\u00dd \3\2\2\2\u00de"+
		"\u00e2\7$\2\2\u00df\u00e1\n\4\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7$\2\2\u00e6\u00e7\b\21\21\2\u00e7\"\3\2\2"+
		"\2\u00e8\u00e9\7)\2\2\u00e9\u00ea\13\2\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ed\b\22\22\2\u00ed$\3\2\2\2\u00ee\u00f0\7/\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\4\62"+
		";\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\23\23\2\u00f7&\3\2\2"+
		"\2\u00f8\u00f9\7\62\2\2\u00f9\u00fa\7z\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd"+
		"\t\5\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\24\24\2\u0101(\3\2\2"+
		"\2\u0102\u0103\7v\2\2\u0103\u0104\7t\2\2\u0104\u0105\7w\2\2\u0105\u010c"+
		"\7g\2\2\u0106\u0107\7h\2\2\u0107\u0108\7c\2\2\u0108\u0109\7n\2\2\u0109"+
		"\u010a\7u\2\2\u010a\u010c\7g\2\2\u010b\u0102\3\2\2\2\u010b\u0106\3\2\2"+
		"\2\u010c\u010d\3\2\2\2\u010d\u010e\b\25\25\2\u010e*\3\2\2\2\u010f\u0111"+
		"\t\6\2\2\u0110\u010f\3\2\2\2\u0111\u0115\3\2\2\2\u0112\u0114\t\7\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\b\26\26\2\u0119"+
		",\3\2\2\2\u011a\u011b\7$\2\2\u011b\u011c\b\27\27\2\u011c.\3\2\2\2\u011d"+
		"\u011e\7^\2\2\u011e\u011f\b\30\30\2\u011f\60\3\2\2\2\u0120\u0121\7=\2"+
		"\2\u0121\u0122\b\31\31\2\u0122\62\3\2\2\2\u0123\u0124\7]\2\2\u0124\u0125"+
		"\b\32\32\2\u0125\64\3\2\2\2\u0126\u0127\7_\2\2\u0127\u0128\b\33\33\2\u0128"+
		"\66\3\2\2\2\u0129\u012a\7}\2\2\u012a\u012b\b\34\34\2\u012b8\3\2\2\2\u012c"+
		"\u012d\7\177\2\2\u012d\u012e\b\35\35\2\u012e:\3\2\2\2\u012f\u0130\7.\2"+
		"\2\u0130\u0131\b\36\36\2\u0131<\3\2\2\2\u0132\u0133\7*\2\2\u0133\u0134"+
		"\b\37\37\2\u0134>\3\2\2\2\u0135\u0136\7+\2\2\u0136\u0137\b  \2\u0137@"+
		"\3\2\2\2\u0138\u0139\7#\2\2\u0139\u013a\b!!\2\u013aB\3\2\2\2\u013b\u013c"+
		"\7-\2\2\u013c\u013d\b\"\"\2\u013dD\3\2\2\2\u013e\u013f\7\61\2\2\u013f"+
		"\u0140\b##\2\u0140F\3\2\2\2\u0141\u0142\7,\2\2\u0142\u0143\b$$\2\u0143"+
		"H\3\2\2\2\u0144\u0145\7/\2\2\u0145\u0146\b%%\2\u0146J\3\2\2\2\u0147\u0148"+
		"\7\'\2\2\u0148\u0149\b&&\2\u0149L\3\2\2\2\u014a\u014b\7(\2\2\u014b\u014c"+
		"\7(\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b\'\'\2\u014eN\3\2\2\2\u014f\u0150"+
		"\7~\2\2\u0150\u0151\7~\2\2\u0151\u0152\3\2\2\2\u0152\u0153\b((\2\u0153"+
		"P\3\2\2\2\u0154\u0155\7`\2\2\u0155\u0156\b))\2\u0156R\3\2\2\2\u0157\u0158"+
		"\7?\2\2\u0158\u0159\b**\2\u0159T\3\2\2\2\u015a\u015b\7?\2\2\u015b\u015c"+
		"\7?\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b++\2\u015eV\3\2\2\2\u015f\u0160"+
		"\7-\2\2\u0160\u0161\7?\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b,,\2\u0163"+
		"X\3\2\2\2\u0164\u0165\7/\2\2\u0165\u0166\7?\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\b--\2\u0168Z\3\2\2\2\u0169\u016a\7@\2\2\u016a\u016b\b..\2\u016b"+
		"\\\3\2\2\2\u016c\u016d\7>\2\2\u016d\u016e\b//\2\u016e^\3\2\2\2\u016f\u0170"+
		"\7@\2\2\u0170\u0171\7?\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b\60\60\2\u0173"+
		"`\3\2\2\2\u0174\u0175\7>\2\2\u0175\u0176\7?\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0178\b\61\61\2\u0178b\3\2\2\2\u0179\u017a\7#\2\2\u017a\u017b\7?\2\2"+
		"\u017b\u017c\3\2\2\2\u017c\u017d\b\62\62\2\u017dd\3\2\2\2\r\2kt\u00e2"+
		"\u00ef\u00f4\u00fe\u010b\u0110\u0113\u0115\63\3\2\2\3\3\3\3\4\4\3\5\5"+
		"\3\6\6\3\7\7\3\b\b\3\t\t\3\n\n\3\13\13\3\f\f\3\r\r\3\16\16\3\17\17\3\20"+
		"\20\3\21\21\3\22\22\3\23\23\3\24\24\3\25\25\3\26\26\3\27\27\3\30\30\3"+
		"\31\31\3\32\32\3\33\33\3\34\34\3\35\35\3\36\36\3\37\37\3  \3!!\3\"\"\3"+
		"##\3$$\3%%\3&&\3\'\'\3((\3))\3**\3++\3,,\3--\3..\3//\3\60\60\3\61\61\3"+
		"\62\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}