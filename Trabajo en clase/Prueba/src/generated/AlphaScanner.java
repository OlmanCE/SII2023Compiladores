// Generated from C:/Users/olman/IdeaProjects/Prueba\AlphaScanner.g4 by ANTLR 4.12.0
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlphaScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, ASSIGN=2, PIZQ=3, PDER=4, VIR=5, DOSPUN=6, SUM=7, SUB=8, MUL=9, 
		DIV=10, MODU=11, EQUALITY=12, DIF=13, MINOR=14, MAJOR=15, MINEUQU=16, 
		MAEQUAL=17, IF=18, WHILE=19, LET=20, THEN=21, ELSE=22, IN=23, DO=24, BEGIN=25, 
		END=26, CONST=27, VAR=28, ID=29, NUM=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "SUM", "SUB", "MUL", 
			"DIV", "MODU", "EQUALITY", "DIF", "MINOR", "MAJOR", "MINEUQU", "MAEQUAL", 
			"IF", "WHILE", "LET", "THEN", "ELSE", "IN", "DO", "BEGIN", "END", "CONST", 
			"VAR", "ID", "NUM", "LETTER", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'('", "')'", "'~'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'if'", "'while'", 
			"'let'", "'then'", "'else'", "'in'", "'do'", "'begin'", "'end'", "'const'", 
			"'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "SUM", "SUB", 
			"MUL", "DIV", "MODU", "EQUALITY", "DIF", "MINOR", "MAJOR", "MINEUQU", 
			"MAEQUAL", "IF", "WHILE", "LET", "THEN", "ELSE", "IN", "DO", "BEGIN", 
			"END", "CONST", "VAR", "ID", "NUM", "WS"
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


	public AlphaScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlphaScanner.g4"; }

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
		"\u0004\u0000\u001f\u00b5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u009f\b\u001c\n\u001c\f\u001c"+
		"\u00a2\t\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u00a6\b\u001d\n\u001d"+
		"\f\u001d\u00a9\t\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0004 \u00b0\b \u000b \f \u00b1\u0001 \u0001 \u0000\u0000!\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u0000?\u0000A\u001f"+
		"\u0001\u0000\u0002\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u00b6\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000"+
		"\u0000\u0001C\u0001\u0000\u0000\u0000\u0003E\u0001\u0000\u0000\u0000\u0005"+
		"H\u0001\u0000\u0000\u0000\u0007J\u0001\u0000\u0000\u0000\tL\u0001\u0000"+
		"\u0000\u0000\u000bN\u0001\u0000\u0000\u0000\rP\u0001\u0000\u0000\u0000"+
		"\u000fR\u0001\u0000\u0000\u0000\u0011T\u0001\u0000\u0000\u0000\u0013V"+
		"\u0001\u0000\u0000\u0000\u0015X\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000"+
		"\u0000\u0000\u0019]\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000"+
		"\u001db\u0001\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000!g\u0001"+
		"\u0000\u0000\u0000#j\u0001\u0000\u0000\u0000%m\u0001\u0000\u0000\u0000"+
		"\'s\u0001\u0000\u0000\u0000)w\u0001\u0000\u0000\u0000+|\u0001\u0000\u0000"+
		"\u0000-\u0081\u0001\u0000\u0000\u0000/\u0084\u0001\u0000\u0000\u00001"+
		"\u0087\u0001\u0000\u0000\u00003\u008d\u0001\u0000\u0000\u00005\u0091\u0001"+
		"\u0000\u0000\u00007\u0097\u0001\u0000\u0000\u00009\u009b\u0001\u0000\u0000"+
		"\u0000;\u00a3\u0001\u0000\u0000\u0000=\u00aa\u0001\u0000\u0000\u0000?"+
		"\u00ac\u0001\u0000\u0000\u0000A\u00af\u0001\u0000\u0000\u0000CD\u0005"+
		";\u0000\u0000D\u0002\u0001\u0000\u0000\u0000EF\u0005:\u0000\u0000FG\u0005"+
		"=\u0000\u0000G\u0004\u0001\u0000\u0000\u0000HI\u0005(\u0000\u0000I\u0006"+
		"\u0001\u0000\u0000\u0000JK\u0005)\u0000\u0000K\b\u0001\u0000\u0000\u0000"+
		"LM\u0005~\u0000\u0000M\n\u0001\u0000\u0000\u0000NO\u0005:\u0000\u0000"+
		"O\f\u0001\u0000\u0000\u0000PQ\u0005+\u0000\u0000Q\u000e\u0001\u0000\u0000"+
		"\u0000RS\u0005-\u0000\u0000S\u0010\u0001\u0000\u0000\u0000TU\u0005*\u0000"+
		"\u0000U\u0012\u0001\u0000\u0000\u0000VW\u0005/\u0000\u0000W\u0014\u0001"+
		"\u0000\u0000\u0000XY\u0005%\u0000\u0000Y\u0016\u0001\u0000\u0000\u0000"+
		"Z[\u0005=\u0000\u0000[\\\u0005=\u0000\u0000\\\u0018\u0001\u0000\u0000"+
		"\u0000]^\u0005!\u0000\u0000^_\u0005=\u0000\u0000_\u001a\u0001\u0000\u0000"+
		"\u0000`a\u0005<\u0000\u0000a\u001c\u0001\u0000\u0000\u0000bc\u0005>\u0000"+
		"\u0000c\u001e\u0001\u0000\u0000\u0000de\u0005<\u0000\u0000ef\u0005=\u0000"+
		"\u0000f \u0001\u0000\u0000\u0000gh\u0005>\u0000\u0000hi\u0005=\u0000\u0000"+
		"i\"\u0001\u0000\u0000\u0000jk\u0005i\u0000\u0000kl\u0005f\u0000\u0000"+
		"l$\u0001\u0000\u0000\u0000mn\u0005w\u0000\u0000no\u0005h\u0000\u0000o"+
		"p\u0005i\u0000\u0000pq\u0005l\u0000\u0000qr\u0005e\u0000\u0000r&\u0001"+
		"\u0000\u0000\u0000st\u0005l\u0000\u0000tu\u0005e\u0000\u0000uv\u0005t"+
		"\u0000\u0000v(\u0001\u0000\u0000\u0000wx\u0005t\u0000\u0000xy\u0005h\u0000"+
		"\u0000yz\u0005e\u0000\u0000z{\u0005n\u0000\u0000{*\u0001\u0000\u0000\u0000"+
		"|}\u0005e\u0000\u0000}~\u0005l\u0000\u0000~\u007f\u0005s\u0000\u0000\u007f"+
		"\u0080\u0005e\u0000\u0000\u0080,\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"i\u0000\u0000\u0082\u0083\u0005n\u0000\u0000\u0083.\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005d\u0000\u0000\u0085\u0086\u0005o\u0000\u0000\u0086"+
		"0\u0001\u0000\u0000\u0000\u0087\u0088\u0005b\u0000\u0000\u0088\u0089\u0005"+
		"e\u0000\u0000\u0089\u008a\u0005g\u0000\u0000\u008a\u008b\u0005i\u0000"+
		"\u0000\u008b\u008c\u0005n\u0000\u0000\u008c2\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005e\u0000\u0000\u008e\u008f\u0005n\u0000\u0000\u008f\u0090\u0005"+
		"d\u0000\u0000\u00904\u0001\u0000\u0000\u0000\u0091\u0092\u0005c\u0000"+
		"\u0000\u0092\u0093\u0005o\u0000\u0000\u0093\u0094\u0005n\u0000\u0000\u0094"+
		"\u0095\u0005s\u0000\u0000\u0095\u0096\u0005t\u0000\u0000\u00966\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005v\u0000\u0000\u0098\u0099\u0005a\u0000"+
		"\u0000\u0099\u009a\u0005r\u0000\u0000\u009a8\u0001\u0000\u0000\u0000\u009b"+
		"\u00a0\u0003=\u001e\u0000\u009c\u009f\u0003=\u001e\u0000\u009d\u009f\u0003"+
		"?\u001f\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1:\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a7\u0003?\u001f\u0000"+
		"\u00a4\u00a6\u0003?\u001f\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8<\u0001\u0000\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0000\u0000\u0000\u00ab>\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u000209\u0000\u00ad@\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b0\u0007\u0001\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0006 \u0000\u0000\u00b4B\u0001\u0000\u0000\u0000\u0005"+
		"\u0000\u009e\u00a0\u00a7\u00b1\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}