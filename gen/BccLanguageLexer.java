// Generated from C:/Users/gabri/Desktop/unal/2020-2 Lenguajes/santiago/SemanticAnalyzer/grammar\BccLanguage.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BccLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, MULOP=8, SUMOP=9, 
		COMPARISONOP=10, ASSIGNOP=11, DATATYPE=12, FUNCTION=13, VAR=14, PRINT=15, 
		INPUT=16, WHEN=17, IF=18, UNLESS=19, WHILE=20, REPEAT=21, RETURN=22, UNTIL=23, 
		LOOP=24, DO=25, ELSE=26, AND=27, OR=28, FOR=29, NEXT=30, BREAK=31, NOT=32, 
		BOOL=33, SUBS=34, ADD=35, END=36, NUM=37, FID=38, ID=39, ESP=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "MULOP", "SUMOP", 
			"COMPARISONOP", "ASSIGNOP", "DATATYPE", "FUNCTION", "VAR", "PRINT", "INPUT", 
			"WHEN", "IF", "UNLESS", "WHILE", "REPEAT", "RETURN", "UNTIL", "LOOP", 
			"DO", "ELSE", "AND", "OR", "FOR", "NEXT", "BREAK", "NOT", "BOOL", "SUBS", 
			"ADD", "END", "NUM", "FID", "ID", "ESP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'('", "')'", "';'", "'{'", "'}'", null, null, null, 
			null, null, "'function'", "'var'", "'print'", "'input'", "'when'", "'if'", 
			"'unless'", "'while'", "'repeat'", "'return'", "'until'", "'loop'", "'do'", 
			"'else'", "'and'", "'or'", "'for'", "'next'", "'break'", "'not'", null, 
			"'--'", "'++'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "MULOP", "SUMOP", "COMPARISONOP", 
			"ASSIGNOP", "DATATYPE", "FUNCTION", "VAR", "PRINT", "INPUT", "WHEN", 
			"IF", "UNLESS", "WHILE", "REPEAT", "RETURN", "UNTIL", "LOOP", "DO", "ELSE", 
			"AND", "OR", "FOR", "NEXT", "BREAK", "NOT", "BOOL", "SUBS", "ADD", "END", 
			"NUM", "FID", "ID", "ESP"
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


	public BccLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BccLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0128\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13p\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0087\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00fb"+
		"\n\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\5&\u0108\n&\3&\6&\u010b\n&\r&\16"+
		"&\u010c\3&\3&\6&\u0111\n&\r&\16&\u0112\5&\u0115\n&\3\'\3\'\6\'\u0119\n"+
		"\'\r\'\16\'\u011a\3(\6(\u011e\n(\r(\16(\u011f\3)\6)\u0123\n)\r)\16)\u0124"+
		"\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\b\5\2\'\',,\61\61\4\2--//\3\2"+
		"\62;\3\2\60\60\4\2C\\c|\5\2\13\f\17\17\"\"\2\u013a\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\t"+
		"Y\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25"+
		"o\3\2\2\2\27}\3\2\2\2\31\u0086\3\2\2\2\33\u0088\3\2\2\2\35\u0091\3\2\2"+
		"\2\37\u0095\3\2\2\2!\u009b\3\2\2\2#\u00a1\3\2\2\2%\u00a6\3\2\2\2\'\u00a9"+
		"\3\2\2\2)\u00b0\3\2\2\2+\u00b6\3\2\2\2-\u00bd\3\2\2\2/\u00c4\3\2\2\2\61"+
		"\u00ca\3\2\2\2\63\u00cf\3\2\2\2\65\u00d2\3\2\2\2\67\u00d7\3\2\2\29\u00db"+
		"\3\2\2\2;\u00de\3\2\2\2=\u00e2\3\2\2\2?\u00e7\3\2\2\2A\u00ed\3\2\2\2C"+
		"\u00fa\3\2\2\2E\u00fc\3\2\2\2G\u00ff\3\2\2\2I\u0102\3\2\2\2K\u0107\3\2"+
		"\2\2M\u0116\3\2\2\2O\u011d\3\2\2\2Q\u0122\3\2\2\2ST\7<\2\2T\4\3\2\2\2"+
		"UV\7.\2\2V\6\3\2\2\2WX\7*\2\2X\b\3\2\2\2YZ\7+\2\2Z\n\3\2\2\2[\\\7=\2\2"+
		"\\\f\3\2\2\2]^\7}\2\2^\16\3\2\2\2_`\7\177\2\2`\20\3\2\2\2ab\t\2\2\2b\22"+
		"\3\2\2\2cd\t\3\2\2d\24\3\2\2\2ep\7>\2\2fg\7?\2\2gp\7?\2\2hi\7>\2\2ip\7"+
		"?\2\2jp\7@\2\2kl\7@\2\2lp\7?\2\2mn\7#\2\2np\7?\2\2oe\3\2\2\2of\3\2\2\2"+
		"oh\3\2\2\2oj\3\2\2\2ok\3\2\2\2om\3\2\2\2p\26\3\2\2\2qr\7<\2\2r~\7?\2\2"+
		"st\7-\2\2t~\7?\2\2uv\7/\2\2v~\7?\2\2wx\7,\2\2x~\7?\2\2yz\7\61\2\2z~\7"+
		"?\2\2{|\7\'\2\2|~\7?\2\2}q\3\2\2\2}s\3\2\2\2}u\3\2\2\2}w\3\2\2\2}y\3\2"+
		"\2\2}{\3\2\2\2~\30\3\2\2\2\177\u0080\7p\2\2\u0080\u0081\7w\2\2\u0081\u0087"+
		"\7o\2\2\u0082\u0083\7d\2\2\u0083\u0084\7q\2\2\u0084\u0085\7q\2\2\u0085"+
		"\u0087\7n\2\2\u0086\177\3\2\2\2\u0086\u0082\3\2\2\2\u0087\32\3\2\2\2\u0088"+
		"\u0089\7h\2\2\u0089\u008a\7w\2\2\u008a\u008b\7p\2\2\u008b\u008c\7e\2\2"+
		"\u008c\u008d\7v\2\2\u008d\u008e\7k\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7p\2\2\u0090\34\3\2\2\2\u0091\u0092\7x\2\2\u0092\u0093\7c\2\2\u0093\u0094"+
		"\7t\2\2\u0094\36\3\2\2\2\u0095\u0096\7r\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a \3\2\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7r\2\2\u009e\u009f\7w\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7j\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8&\3\2\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7u\2\2"+
		"\u00af(\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7k\2"+
		"\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7"+
		"t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7c\2\2\u00bb\u00bc\7v\2\2\u00bc,\3\2\2\2\u00bd\u00be\7t\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3.\3\2\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7p\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7n\2\2\u00c9\60\3\2\2\2\u00ca"+
		"\u00cb\7n\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7r\2\2"+
		"\u00ce\62\3\2\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7q\2\2\u00d1\64\3\2\2"+
		"\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da"+
		"\7f\2\2\u00da8\3\2\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7t\2\2\u00dd:\3"+
		"\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7t\2\2\u00e1"+
		"<\3\2\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7z\2\2\u00e5"+
		"\u00e6\7v\2\2\u00e6>\3\2\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7t\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7m\2\2\u00ec@\3\2\2\2\u00ed"+
		"\u00ee\7p\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7v\2\2\u00f0B\3\2\2\2\u00f1"+
		"\u00f2\7v\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7w\2\2\u00f4\u00fb\7g\2\2"+
		"\u00f5\u00f6\7h\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9"+
		"\7u\2\2\u00f9\u00fb\7g\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb"+
		"D\3\2\2\2\u00fc\u00fd\7/\2\2\u00fd\u00fe\7/\2\2\u00feF\3\2\2\2\u00ff\u0100"+
		"\7-\2\2\u0100\u0101\7-\2\2\u0101H\3\2\2\2\u0102\u0103\7g\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u0105\7f\2\2\u0105J\3\2\2\2\u0106\u0108\7/\2\2\u0107\u0106"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u010b\t\4\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u0114\3\2\2\2\u010e\u0110\t\5\2\2\u010f\u0111\t\4\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u010e\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"L\3\2\2\2\u0116\u0118\7B\2\2\u0117\u0119\t\6\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bN\3\2\2\2"+
		"\u011c\u011e\t\6\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120P\3\2\2\2\u0121\u0123\t\7\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b)\2\2\u0127R\3\2\2\2\16\2o}\u0086"+
		"\u00fa\u0107\u010c\u0112\u0114\u011a\u011f\u0124\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}