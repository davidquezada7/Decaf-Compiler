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
		WHITESPACE=1, COMMENT=2, KW_IF=3, KW_BOOLEAN=4, KW_BREAK=5, KW_CALLOUT=6, 
		KW_CONTINUE=7, KW_ELSE=8, KW_FALSE=9, KW_FOR=10, KW_WHILE=11, KW_INT=12, 
		KW_RETURN=13, KW_TRUE=14, KW_VOID=15, STRING=16, ERR1_CHAR=17, ERR2_CHAR=18, 
		CHAR=19, ERR3_CHAR=20, ERR4_CHAR=21, ERR5_CHAR=22, INT=23, HEX=24, ERR_HEX=25, 
		BOOLEAN=26, ID=27, QUOTE=28, BSLASH=29, PYC=30, LSBRACKET=31, RSBRACKET=32, 
		LCBRACKET=33, RCBRACKET=34, COMMA=35, PA=36, PC=37, NO=38, PLUS=39, DIV=40, 
		MULT=41, RES=42, PRCNT=43, AND=44, OR=45, POT=46, IG=47, DIG=48, PLUS_IG=49, 
		MIN_IG=50, MAYOR=51, MENOR=52, MAYORIGUAL=53, MENORIGUAL=54, NOIGUAL=55;
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
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "COMMENT", "KW_IF", "KW_BOOLEAN", "KW_BREAK", "KW_CALLOUT", 
		"KW_CONTINUE", "KW_ELSE", "KW_FALSE", "KW_FOR", "KW_WHILE", "KW_INT", 
		"KW_RETURN", "KW_TRUE", "KW_VOID", "STRING", "ERR1_CHAR", "ERR2_CHAR", 
		"CHAR", "ERR3_CHAR", "AUXERROR3", "ERR4_CHAR", "ERR5_CHAR", "INT", "HEX", 
		"ERR_HEX", "BOOLEAN", "ID", "QUOTE", "BSLASH", "PYC", "LSBRACKET", "RSBRACKET", 
		"LCBRACKET", "RCBRACKET", "COMMA", "PA", "PC", "NO", "PLUS", "DIV", "MULT", 
		"RES", "PRCNT", "AND", "OR", "POT", "IG", "DIG", "PLUS_IG", "MIN_IG", 
		"MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", "NOIGUAL"
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
		case 1: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		case 16: ERR1_CHAR_action((RuleContext)_localctx, actionIndex); break;
		case 17: ERR2_CHAR_action((RuleContext)_localctx, actionIndex); break;
		case 18: CHAR_action((RuleContext)_localctx, actionIndex); break;
		case 19: ERR3_CHAR_action((RuleContext)_localctx, actionIndex); break;
		case 21: ERR4_CHAR_action((RuleContext)_localctx, actionIndex); break;
		case 22: ERR5_CHAR_action((RuleContext)_localctx, actionIndex); break;
		case 23: INT_action((RuleContext)_localctx, actionIndex); break;
		case 24: HEX_action((RuleContext)_localctx, actionIndex); break;
		case 25: ERR_HEX_action((RuleContext)_localctx, actionIndex); break;
		case 26: BOOLEAN_action((RuleContext)_localctx, actionIndex); break;
		case 27: ID_action((RuleContext)_localctx, actionIndex); break;
		case 28: QUOTE_action((RuleContext)_localctx, actionIndex); break;
		case 29: BSLASH_action((RuleContext)_localctx, actionIndex); break;
		case 30: PYC_action((RuleContext)_localctx, actionIndex); break;
		case 31: LSBRACKET_action((RuleContext)_localctx, actionIndex); break;
		case 32: RSBRACKET_action((RuleContext)_localctx, actionIndex); break;
		case 33: LCBRACKET_action((RuleContext)_localctx, actionIndex); break;
		case 34: RCBRACKET_action((RuleContext)_localctx, actionIndex); break;
		case 35: COMMA_action((RuleContext)_localctx, actionIndex); break;
		case 36: PA_action((RuleContext)_localctx, actionIndex); break;
		case 37: PC_action((RuleContext)_localctx, actionIndex); break;
		case 38: NO_action((RuleContext)_localctx, actionIndex); break;
		case 39: PLUS_action((RuleContext)_localctx, actionIndex); break;
		case 40: DIV_action((RuleContext)_localctx, actionIndex); break;
		case 41: MULT_action((RuleContext)_localctx, actionIndex); break;
		case 42: RES_action((RuleContext)_localctx, actionIndex); break;
		case 43: PRCNT_action((RuleContext)_localctx, actionIndex); break;
		case 44: AND_action((RuleContext)_localctx, actionIndex); break;
		case 45: OR_action((RuleContext)_localctx, actionIndex); break;
		case 46: POT_action((RuleContext)_localctx, actionIndex); break;
		case 47: IG_action((RuleContext)_localctx, actionIndex); break;
		case 48: DIG_action((RuleContext)_localctx, actionIndex); break;
		case 49: PLUS_IG_action((RuleContext)_localctx, actionIndex); break;
		case 50: MIN_IG_action((RuleContext)_localctx, actionIndex); break;
		case 51: MAYOR_action((RuleContext)_localctx, actionIndex); break;
		case 52: MENOR_action((RuleContext)_localctx, actionIndex); break;
		case 53: MAYORIGUAL_action((RuleContext)_localctx, actionIndex); break;
		case 54: MENORIGUAL_action((RuleContext)_localctx, actionIndex); break;
		case 55: NOIGUAL_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void PRCNT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42: System.out.print(" % "); break;
		}
	}
	private void MENOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 51: System.out.print(" < "); break;
		}
	}
	private void KW_BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.print("kw_boolean"); break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: System.out.print(" caracter "); break;
		}
	}
	private void KW_TRUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: System.out.print("kw_true"); break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26: System.out.print("id"); break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43: System.out.print(" and "); break;
		}
	}
	private void IG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46: System.out.print(" = "); break;
		}
	}
	private void QUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27: System.out.print("\""); break;
		}
	}
	private void RES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41: System.out.print(" - "); break;
		}
	}
	private void KW_CALLOUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.print("kw_callout"); break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25: System.out.print("boolean"); break;
		}
	}
	private void KW_BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.print("kw_break"); break;
		}
	}
	private void MIN_IG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 49: System.out.print(" -= "); break;
		}
	}
	private void POT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45: System.out.print(" ^ "); break;
		}
	}
	private void HEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23: System.out.print("numero hexadecimal"); break;
		}
	}
	private void RSBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31: System.out.print(" ] "); break;
		}
	}
	private void COMMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34: System.out.print(" , "); break;
		}
	}
	private void KW_FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: System.out.print("kw_for"); break;
		}
	}
	private void KW_WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: System.out.print("kw_while"); break;
		}
	}
	private void ERR5_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21: System.out.print(" expecting ''', found '\\ n' "); break;
		}
	}
	private void KW_RETURN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: System.out.print("kw_return"); break;
		}
	}
	private void LCBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32: System.out.print(" { "); break;
		}
	}
	private void NOIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 54: System.out.print(" != "); break;
		}
	}
	private void PLUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38: System.out.print(" + "); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}
	private void KW_IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.print("kw_if"); break;
		}
	}
	private void RCBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33: System.out.print(" } "); break;
		}
	}
	private void PLUS_IG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 48: System.out.print(" += "); break;
		}
	}
	private void KW_INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: System.out.print("kw_int"); break;
		}
	}
	private void KW_FALSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.print("kw_false"); break;
		}
	}
	private void NO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37: System.out.print(" ! "); break;
		}
	}
	private void KW_CONTINUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.print("kw_continue"); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}
	private void PYC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29: System.out.print(";"); break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22: System.out.print("numero entero"); break;
		}
	}
	private void MENORIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 53: System.out.print(" <= "); break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40: System.out.print(" * "); break;
		}
	}
	private void ERR2_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: System.out.print(" unexpected char: 'p' "); break;
		}
	}
	private void LSBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30: System.out.print(" [ "); break;
		}
	}
	private void KW_VOID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: System.out.print("kw_void"); break;
		}
	}
	private void DIG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 47: System.out.print(" == "); break;
		}
	}
	private void ERR3_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: System.out.print(" unexpected char: Allowed one char "); break;
		}
	}
	private void ERR_HEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24: System.out.print("hexadecimal no valido"); break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44: System.out.print(" or "); break;
		}
	}
	private void MAYOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 50: System.out.print(" > "); break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39: System.out.print(" / "); break;
		}
	}
	private void ERR1_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: System.out.print(" unexpected char: ''' "); break;
		}
	}
	private void ERR4_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20: System.out.print(" unexpected char: '\"' "); break;
		}
	}
	private void MAYORIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 52: System.out.print(" >= "); break;
		}
	}
	private void BSLASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28: System.out.print("\\"); break;
		}
	}
	private void PA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35: System.out.print(" ( "); break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: System.out.print(" string"); break;
		}
	}
	private void KW_ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.print("kw_else"); break;
		}
	}
	private void PC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36: System.out.print(" ) "); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u01c3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\6\2u\n\2\r\2\16\2v\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3\177\n\3\f\3\16\3\u0082\13\3\3\3\5\3\u0085\n"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f6"+
		"\n\21\f\21\16\21\u00f9\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u0113\n\24\3\24\3\24\3\24\3\25\3\25\3\25\6\25\u011b\n\25"+
		"\r\25\16\25\u011c\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\5\31\u0130\n\31\3\31\6\31\u0133\n\31"+
		"\r\31\16\31\u0134\3\31\3\31\3\32\3\32\3\32\3\32\6\32\u013d\n\32\r\32\16"+
		"\32\u013e\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0151\n\34\3\34\3\34\3\35\5\35\u0156\n\35\3"+
		"\35\7\35\u0159\n\35\f\35\16\35\u015c\13\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\38\39\39\39\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\27/\30\61\31\63"+
		"\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61"+
		"c\62e\63g\64i\65k\66m\67o8q9\3\2\13\5\2\13\f\17\17\"\"\3\2\f\f\4\2\13"+
		"\13^^\6\2$$^^ppvv\6\2\"\"$$))^^\3\2))\5\2\62;CHch\5\2C\\aac|\6\2\62;C"+
		"\\aac|\u01d2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\3t\3\2\2\2\5z\3\2\2\2\7\u0088\3\2\2\2\t\u008d"+
		"\3\2\2\2\13\u0097\3\2\2\2\r\u009f\3\2\2\2\17\u00a9\3\2\2\2\21\u00b4\3"+
		"\2\2\2\23\u00bb\3\2\2\2\25\u00c3\3\2\2\2\27\u00c9\3\2\2\2\31\u00d1\3\2"+
		"\2\2\33\u00d7\3\2\2\2\35\u00e0\3\2\2\2\37\u00e7\3\2\2\2!\u00ee\3\2\2\2"+
		"#\u00fd\3\2\2\2%\u0102\3\2\2\2\'\u0108\3\2\2\2)\u0117\3\2\2\2+\u0121\3"+
		"\2\2\2-\u0123\3\2\2\2/\u0128\3\2\2\2\61\u012f\3\2\2\2\63\u0138\3\2\2\2"+
		"\65\u0142\3\2\2\2\67\u0150\3\2\2\29\u0155\3\2\2\2;\u015f\3\2\2\2=\u0162"+
		"\3\2\2\2?\u0165\3\2\2\2A\u0168\3\2\2\2C\u016b\3\2\2\2E\u016e\3\2\2\2G"+
		"\u0171\3\2\2\2I\u0174\3\2\2\2K\u0177\3\2\2\2M\u017a\3\2\2\2O\u017d\3\2"+
		"\2\2Q\u0180\3\2\2\2S\u0183\3\2\2\2U\u0186\3\2\2\2W\u0189\3\2\2\2Y\u018c"+
		"\3\2\2\2[\u018f\3\2\2\2]\u0194\3\2\2\2_\u0199\3\2\2\2a\u019c\3\2\2\2c"+
		"\u019f\3\2\2\2e\u01a4\3\2\2\2g\u01a9\3\2\2\2i\u01ae\3\2\2\2k\u01b1\3\2"+
		"\2\2m\u01b4\3\2\2\2o\u01b9\3\2\2\2q\u01be\3\2\2\2su\t\2\2\2ts\3\2\2\2"+
		"uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\2\2\2y\4\3\2\2\2z{\7\61\2"+
		"\2{|\7\61\2\2|\u0080\3\2\2\2}\177\n\3\2\2~}\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0085\7\f\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\b\3\3\2\u0087\6\3\2\2\2\u0088\u0089\7k\2\2"+
		"\u0089\u008a\7h\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\4\4\2\u008c\b\3"+
		"\2\2\2\u008d\u008e\7d\2\2\u008e\u008f\7q\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7n\2\2\u0091\u0092\7g\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u0096\b\5\5\2\u0096\n\3\2\2\2\u0097\u0098\7"+
		"d\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7c\2\2\u009b\u009c"+
		"\7m\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\6\6\2\u009e\f\3\2\2\2\u009f"+
		"\u00a0\7e\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7n\2\2"+
		"\u00a3\u00a4\7q\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\b\7\7\2\u00a8\16\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa"+
		"\u00ab\7q\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7k\2\2"+
		"\u00ae\u00af\7p\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b3\b\b\b\2\u00b3\20\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\3\2\2"+
		"\2\u00b9\u00ba\b\t\t\2\u00ba\22\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd"+
		"\7c\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\b\n\n\2\u00c2\24\3\2\2\2\u00c3\u00c4\7h\2\2"+
		"\u00c4\u00c5\7q\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\b\13\13\2\u00c8\26\3\2\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7j\2\2\u00cb"+
		"\u00cc\7k\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\3\2\2"+
		"\2\u00cf\u00d0\b\f\f\2\u00d0\30\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3"+
		"\7p\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\r\r\2\u00d6"+
		"\32\3\2\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7v\2\2\u00da"+
		"\u00db\7w\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\3\2\2"+
		"\2\u00de\u00df\b\16\16\2\u00df\34\3\2\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2"+
		"\7t\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\b\17\17\2\u00e6\36\3\2\2\2\u00e7\u00e8\7x\2\2\u00e8\u00e9\7q\2"+
		"\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\b\20\20\2\u00ed \3\2\2\2\u00ee\u00f7\7$\2\2\u00ef\u00f6\n\3\2\2\u00f0"+
		"\u00f1\7^\2\2\u00f1\u00f6\7)\2\2\u00f2\u00f3\7^\2\2\u00f3\u00f6\7$\2\2"+
		"\u00f4\u00f6\t\4\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f2"+
		"\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7$"+
		"\2\2\u00fb\u00fc\b\21\21\2\u00fc\"\3\2\2\2\u00fd\u00fe\7)\2\2\u00fe\u00ff"+
		"\7)\2\2\u00ff\u0100\7)\2\2\u0100\u0101\b\22\22\2\u0101$\3\2\2\2\u0102"+
		"\u0103\7)\2\2\u0103\u0104\7^\2\2\u0104\u0105\n\5\2\2\u0105\u0106\7)\2"+
		"\2\u0106\u0107\b\23\23\2\u0107&\3\2\2\2\u0108\u0112\7)\2\2\u0109\u0113"+
		"\n\6\2\2\u010a\u010b\7^\2\2\u010b\u0113\7p\2\2\u010c\u010d\7^\2\2\u010d"+
		"\u0113\7v\2\2\u010e\u010f\7^\2\2\u010f\u0113\7^\2\2\u0110\u0111\7^\2\2"+
		"\u0111\u0113\7$\2\2\u0112\u0109\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u010c"+
		"\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\7)\2\2\u0115\u0116\b\24\24\2\u0116(\3\2\2\2\u0117\u0118\7)\2\2"+
		"\u0118\u011a\n\7\2\2\u0119\u011b\5+\26\2\u011a\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\7)\2\2\u011f\u0120\b\25\25\2\u0120*\3\2\2\2\u0121\u0122\n\7\2\2"+
		"\u0122,\3\2\2\2\u0123\u0124\7)\2\2\u0124\u0125\7$\2\2\u0125\u0126\7)\2"+
		"\2\u0126\u0127\b\27\26\2\u0127.\3\2\2\2\u0128\u0129\7)\2\2\u0129\u012a"+
		"\7^\2\2\u012a\u012b\7)\2\2\u012b\u012c\7\f\2\2\u012c\u012d\b\30\27\2\u012d"+
		"\60\3\2\2\2\u012e\u0130\7/\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2"+
		"\u0130\u0132\3\2\2\2\u0131\u0133\4\62;\2\u0132\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\b\31\30\2\u0137\62\3\2\2\2\u0138\u0139\7\62\2\2\u0139\u013a\7z"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u013d\t\b\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\b\32\31\2\u0141\64\3\2\2\2\u0142\u0143\7\62\2\2\u0143"+
		"\u0144\7z\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\33\32\2\u0146\66\3\2\2"+
		"\2\u0147\u0148\7v\2\2\u0148\u0149\7t\2\2\u0149\u014a\7w\2\2\u014a\u0151"+
		"\7g\2\2\u014b\u014c\7h\2\2\u014c\u014d\7c\2\2\u014d\u014e\7n\2\2\u014e"+
		"\u014f\7u\2\2\u014f\u0151\7g\2\2\u0150\u0147\3\2\2\2\u0150\u014b\3\2\2"+
		"\2\u0151\u0152\3\2\2\2\u0152\u0153\b\34\33\2\u01538\3\2\2\2\u0154\u0156"+
		"\t\t\2\2\u0155\u0154\3\2\2\2\u0156\u015a\3\2\2\2\u0157\u0159\t\n\2\2\u0158"+
		"\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\b\35\34\2\u015e"+
		":\3\2\2\2\u015f\u0160\7$\2\2\u0160\u0161\b\36\35\2\u0161<\3\2\2\2\u0162"+
		"\u0163\7^\2\2\u0163\u0164\b\37\36\2\u0164>\3\2\2\2\u0165\u0166\7=\2\2"+
		"\u0166\u0167\b \37\2\u0167@\3\2\2\2\u0168\u0169\7]\2\2\u0169\u016a\b!"+
		" \2\u016aB\3\2\2\2\u016b\u016c\7_\2\2\u016c\u016d\b\"!\2\u016dD\3\2\2"+
		"\2\u016e\u016f\7}\2\2\u016f\u0170\b#\"\2\u0170F\3\2\2\2\u0171\u0172\7"+
		"\177\2\2\u0172\u0173\b$#\2\u0173H\3\2\2\2\u0174\u0175\7.\2\2\u0175\u0176"+
		"\b%$\2\u0176J\3\2\2\2\u0177\u0178\7*\2\2\u0178\u0179\b&%\2\u0179L\3\2"+
		"\2\2\u017a\u017b\7+\2\2\u017b\u017c\b\'&\2\u017cN\3\2\2\2\u017d\u017e"+
		"\7#\2\2\u017e\u017f\b(\'\2\u017fP\3\2\2\2\u0180\u0181\7-\2\2\u0181\u0182"+
		"\b)(\2\u0182R\3\2\2\2\u0183\u0184\7\61\2\2\u0184\u0185\b*)\2\u0185T\3"+
		"\2\2\2\u0186\u0187\7,\2\2\u0187\u0188\b+*\2\u0188V\3\2\2\2\u0189\u018a"+
		"\7/\2\2\u018a\u018b\b,+\2\u018bX\3\2\2\2\u018c\u018d\7\'\2\2\u018d\u018e"+
		"\b-,\2\u018eZ\3\2\2\2\u018f\u0190\7(\2\2\u0190\u0191\7(\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0193\b.-\2\u0193\\\3\2\2\2\u0194\u0195\7~\2\2\u0195\u0196"+
		"\7~\2\2\u0196\u0197\3\2\2\2\u0197\u0198\b/.\2\u0198^\3\2\2\2\u0199\u019a"+
		"\7`\2\2\u019a\u019b\b\60/\2\u019b`\3\2\2\2\u019c\u019d\7?\2\2\u019d\u019e"+
		"\b\61\60\2\u019eb\3\2\2\2\u019f\u01a0\7?\2\2\u01a0\u01a1\7?\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\b\62\61\2\u01a3d\3\2\2\2\u01a4\u01a5\7-\2\2"+
		"\u01a5\u01a6\7?\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\b\63\62\2\u01a8f\3"+
		"\2\2\2\u01a9\u01aa\7/\2\2\u01aa\u01ab\7?\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\b\64\63\2\u01adh\3\2\2\2\u01ae\u01af\7@\2\2\u01af\u01b0\b\65\64"+
		"\2\u01b0j\3\2\2\2\u01b1\u01b2\7>\2\2\u01b2\u01b3\b\66\65\2\u01b3l\3\2"+
		"\2\2\u01b4\u01b5\7@\2\2\u01b5\u01b6\7?\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8"+
		"\b\67\66\2\u01b8n\3\2\2\2\u01b9\u01ba\7>\2\2\u01ba\u01bb\7?\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\b8\67\2\u01bdp\3\2\2\2\u01be\u01bf\7#\2\2\u01bf"+
		"\u01c0\7?\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\b98\2\u01c2r\3\2\2\2\21"+
		"\2v\u0080\u0084\u00f5\u00f7\u0112\u011c\u012f\u0134\u013e\u0150\u0155"+
		"\u0158\u015a9\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\b\b\3\t\t\3\n\n\3"+
		"\13\13\3\f\f\3\r\r\3\16\16\3\17\17\3\20\20\3\21\21\3\22\22\3\23\23\3\24"+
		"\24\3\25\25\3\27\26\3\30\27\3\31\30\3\32\31\3\33\32\3\34\33\3\35\34\3"+
		"\36\35\3\37\36\3 \37\3! \3\"!\3#\"\3$#\3%$\3&%\3\'&\3(\'\3)(\3*)\3+*\3"+
		",+\3-,\3.-\3/.\3\60/\3\61\60\3\62\61\3\63\62\3\64\63\3\65\64\3\66\65\3"+
		"\67\66\38\67\398";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}