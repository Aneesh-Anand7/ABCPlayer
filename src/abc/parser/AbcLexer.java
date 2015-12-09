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
    TUPLETSPEC=10, NTHREPEAT=11, NOTELENGTH=12, BODYVOICE=13, COMMENT=14, 
    ACCIDENTAL=15, BASENOTE=16, OCTAVE=17, DIGIT=18, NEWLINE=19, WHITESPACE=20;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "TUPLETSPEC", "NTHREPEAT", "NOTELENGTH", "BODYVOICE", "COMMENT", "ACCIDENTAL", 
    "BASENOTE", "OCTAVE", "DIGIT", "NEWLINE", "WHITESPACE"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'z'", "'['", "']'", "'|'", "'||'", "'[|'", "'|]'", "':|'", "'|:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, "TUPLETSPEC", 
    "NTHREPEAT", "NOTELENGTH", "BODYVOICE", "COMMENT", "ACCIDENTAL", "BASENOTE", 
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u009f\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4"+
      "\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
      "\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\fJ\n\f\3\r\6\rM\n\r\r\r\16"+
      "\rN\5\rQ\n\r\3\r\3\r\6\rU\n\r\r\r\16\rV\5\rY\n\r\5\r[\n\r\3\16\3\16"+
      "\3\16\3\16\3\16\5\16b\n\16\3\16\6\16e\n\16\r\16\16\16f\3\16\3\16\3"+
      "\16\5\16l\n\16\5\16n\n\16\3\17\3\17\7\17r\n\17\f\17\16\17u\13\17\3"+
      "\17\3\17\3\17\5\17z\n\17\5\17|\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
      "\3\20\5\20\u0085\n\20\3\21\3\21\3\22\6\22\u008a\n\22\r\22\16\22\u008b"+
      "\3\22\6\22\u008f\n\22\r\22\16\22\u0090\5\22\u0093\n\22\3\23\3\23\3"+
      "\24\3\24\3\24\5\24\u009a\n\24\5\24\u009c\n\24\3\25\3\25\2\2\26\3\3"+
      "\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
      "\37\21!\22#\23%\24\'\25)\26\3\2\7\3\2\62;\6\2\60\60\62;C\\c|\5\2\60"+
      "\60C\\c|\4\2CIci\4\2\13\13\"\"\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
      "\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
      "\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
      "\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
      "\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2"+
      "\2\13\63\3\2\2\2\r\66\3\2\2\2\179\3\2\2\2\21<\3\2\2\2\23?\3\2\2\2"+
      "\25B\3\2\2\2\27I\3\2\2\2\31P\3\2\2\2\33a\3\2\2\2\35o\3\2\2\2\37\u0084"+
      "\3\2\2\2!\u0086\3\2\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u009b\3\2"+
      "\2\2)\u009d\3\2\2\2+,\7|\2\2,\4\3\2\2\2-.\7]\2\2.\6\3\2\2\2/\60\7"+
      "_\2\2\60\b\3\2\2\2\61\62\7~\2\2\62\n\3\2\2\2\63\64\7~\2\2\64\65\7"+
      "~\2\2\65\f\3\2\2\2\66\67\7]\2\2\678\7~\2\28\16\3\2\2\29:\7~\2\2:;"+
      "\7_\2\2;\20\3\2\2\2<=\7<\2\2=>\7~\2\2>\22\3\2\2\2?@\7~\2\2@A\7<\2"+
      "\2A\24\3\2\2\2BC\7*\2\2CD\t\2\2\2D\26\3\2\2\2EF\7]\2\2FJ\7\63\2\2"+
      "GH\7]\2\2HJ\7\64\2\2IE\3\2\2\2IG\3\2\2\2J\30\3\2\2\2KM\t\2\2\2LK\3"+
      "\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PL\3\2\2\2PQ\3\2\2\2"+
      "QZ\3\2\2\2RX\7\61\2\2SU\t\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3"+
      "\2\2\2WY\3\2\2\2XT\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZR\3\2\2\2Z[\3\2\2\2"+
      "[\32\3\2\2\2\\]\7X\2\2]^\7<\2\2^b\7\"\2\2_`\7X\2\2`b\7<\2\2a\\\3\2"+
      "\2\2a_\3\2\2\2bd\3\2\2\2ce\t\3\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2f"+
      "g\3\2\2\2gm\3\2\2\2hn\7\f\2\2ik\7\17\2\2jl\7\f\2\2kj\3\2\2\2kl\3\2"+
      "\2\2ln\3\2\2\2mh\3\2\2\2mi\3\2\2\2n\34\3\2\2\2os\7\'\2\2pr\t\4\2\2"+
      "qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t{\3\2\2\2us\3\2\2\2v|\7\f"+
      "\2\2wy\7\17\2\2xz\7\f\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{v\3\2\2\2"+
      "{w\3\2\2\2|\36\3\2\2\2}\u0085\7`\2\2~\177\7`\2\2\177\u0085\7`\2\2"+
      "\u0080\u0085\7a\2\2\u0081\u0082\7a\2\2\u0082\u0085\7a\2\2\u0083\u0085"+
      "\7?\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081"+
      "\3\2\2\2\u0084\u0083\3\2\2\2\u0085 \3\2\2\2\u0086\u0087\t\5\2\2\u0087"+
      "\"\3\2\2\2\u0088\u008a\7)\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2"+
      "\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0093\3\2\2\2\u008d"+
      "\u008f\7.\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e"+
      "\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0089\3\2\2"+
      "\2\u0092\u008e\3\2\2\2\u0093$\3\2\2\2\u0094\u0095\t\2\2\2\u0095&\3"+
      "\2\2\2\u0096\u009c\7\f\2\2\u0097\u0099\7\17\2\2\u0098\u009a\7\f\2"+
      "\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b"+
      "\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009c(\3\2\2\2\u009d\u009e\t\6"+
      "\2\2\u009e*\3\2\2\2\26\2INPVXZafkmsy{\u0084\u008b\u0090\u0092\u0099"+
      "\u009b\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}