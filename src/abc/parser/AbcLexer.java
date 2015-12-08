// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, TUPLETSPEC=12, NOTELENGTH=13, BODYVOICE=14, COMMENT=15, 
    ACCIDENTAL=16, BASENOTE=17, OCTAVE=18, DIGIT=19, NEWLINE=20, WHITESPACE=21;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "TUPLETSPEC", "NOTELENGTH", "BODYVOICE", "COMMENT", 
    "ACCIDENTAL", "BASENOTE", "OCTAVE", "DIGIT", "NEWLINE", "WHITESPACE"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'z'", "'['", "']'", "'|'", "'||'", "'[|'", "'|]'", "':|'", "'|:'", 
    "'[1'", "'[2'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    "TUPLETSPEC", "NOTELENGTH", "BODYVOICE", "COMMENT", "ACCIDENTAL", "BASENOTE", 
    "OCTAVE", "DIGIT", "NEWLINE", "WHITESPACE"
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


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }


  public AbcLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "Abc.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00a1\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3"+
      "\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
      "\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\6\16"+
      "O\n\16\r\16\16\16P\5\16S\n\16\3\16\3\16\6\16W\n\16\r\16\16\16X\5\16"+
      "[\n\16\5\16]\n\16\3\17\3\17\3\17\3\17\3\17\5\17d\n\17\3\17\6\17g\n"+
      "\17\r\17\16\17h\3\17\3\17\3\17\5\17n\n\17\5\17p\n\17\3\20\3\20\7\20"+
      "t\n\20\f\20\16\20w\13\20\3\20\3\20\3\20\5\20|\n\20\5\20~\n\20\3\21"+
      "\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0087\n\21\3\22\3\22\3\23\6\23"+
      "\u008c\n\23\r\23\16\23\u008d\3\23\6\23\u0091\n\23\r\23\16\23\u0092"+
      "\5\23\u0095\n\23\3\24\3\24\3\25\3\25\3\25\5\25\u009c\n\25\5\25\u009e"+
      "\n\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
      "\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\7\3\2"+
      "\62;\6\2\60\60\62;C\\c|\5\2\60\60C\\c|\4\2CIci\4\2\13\13\"\"\u00b5"+
      "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
      "\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
      "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
      "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-"+
      "\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r8\3\2"+
      "\2\2\17;\3\2\2\2\21>\3\2\2\2\23A\3\2\2\2\25D\3\2\2\2\27G\3\2\2\2\31"+
      "J\3\2\2\2\33R\3\2\2\2\35c\3\2\2\2\37q\3\2\2\2!\u0086\3\2\2\2#\u0088"+
      "\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2"+
      "\2\2-.\7|\2\2.\4\3\2\2\2/\60\7]\2\2\60\6\3\2\2\2\61\62\7_\2\2\62\b"+
      "\3\2\2\2\63\64\7~\2\2\64\n\3\2\2\2\65\66\7~\2\2\66\67\7~\2\2\67\f"+
      "\3\2\2\289\7]\2\29:\7~\2\2:\16\3\2\2\2;<\7~\2\2<=\7_\2\2=\20\3\2\2"+
      "\2>?\7<\2\2?@\7~\2\2@\22\3\2\2\2AB\7~\2\2BC\7<\2\2C\24\3\2\2\2DE\7"+
      "]\2\2EF\7\63\2\2F\26\3\2\2\2GH\7]\2\2HI\7\64\2\2I\30\3\2\2\2JK\7*"+
      "\2\2KL\t\2\2\2L\32\3\2\2\2MO\t\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2"+
      "PQ\3\2\2\2QS\3\2\2\2RN\3\2\2\2RS\3\2\2\2S\\\3\2\2\2TZ\7\61\2\2UW\t"+
      "\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZV\3\2\2\2"+
      "Z[\3\2\2\2[]\3\2\2\2\\T\3\2\2\2\\]\3\2\2\2]\34\3\2\2\2^_\7X\2\2_`"+
      "\7<\2\2`d\7\"\2\2ab\7X\2\2bd\7<\2\2c^\3\2\2\2ca\3\2\2\2df\3\2\2\2"+
      "eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2io\3\2\2\2jp\7\f"+
      "\2\2km\7\17\2\2ln\7\f\2\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oj\3\2\2\2"+
      "ok\3\2\2\2p\36\3\2\2\2qu\7\'\2\2rt\t\4\2\2sr\3\2\2\2tw\3\2\2\2us\3"+
      "\2\2\2uv\3\2\2\2v}\3\2\2\2wu\3\2\2\2x~\7\f\2\2y{\7\17\2\2z|\7\f\2"+
      "\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}x\3\2\2\2}y\3\2\2\2~ \3\2\2\2\177"+
      "\u0087\7`\2\2\u0080\u0081\7`\2\2\u0081\u0087\7`\2\2\u0082\u0087\7"+
      "a\2\2\u0083\u0084\7a\2\2\u0084\u0087\7a\2\2\u0085\u0087\7?\2\2\u0086"+
      "\177\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3"+
      "\2\2\2\u0086\u0085\3\2\2\2\u0087\"\3\2\2\2\u0088\u0089\t\5\2\2\u0089"+
      "$\3\2\2\2\u008a\u008c\7)\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2"+
      "\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0095\3\2\2\2\u008f"+
      "\u0091\7.\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090"+
      "\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008b\3\2\2"+
      "\2\u0094\u0090\3\2\2\2\u0095&\3\2\2\2\u0096\u0097\t\2\2\2\u0097(\3"+
      "\2\2\2\u0098\u009e\7\f\2\2\u0099\u009b\7\17\2\2\u009a\u009c\7\f\2"+
      "\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
      "\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009e*\3\2\2\2\u009f\u00a0\t\6"+
      "\2\2\u00a0,\3\2\2\2\25\2PRXZ\\chmou{}\u0086\u008d\u0092\u0094\u009b"+
      "\u009d\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}