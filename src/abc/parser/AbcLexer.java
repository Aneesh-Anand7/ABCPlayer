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
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, OCTAVE=16, 
    ACCIDENTAL=17, BASENOTE=18, REST=19, DIGIT=20, STRING=21, NEWLINE=22, 
    WHITESPACE=23;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "OCTAVE", "ACCIDENTAL", 
    "BASENOTE", "REST", "DIGIT", "STRING", "NEWLINE", "WHITESPACE"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'/'", "'('", "'['", "']'", "'|'", "'||'", "'[|'", "'|]'", "':|'", 
    "'|:'", "'[1'", "'[2'", "'V'", "':'", "'%'", null, null, null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, "OCTAVE", "ACCIDENTAL", "BASENOTE", "REST", 
    "DIGIT", "STRING", "NEWLINE", "WHITESPACE"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\177\b\1\4\2"+
      "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
      "\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
      "\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
      "\30\t\30\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3"+
      "\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
      "\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21X\n\21\r\21\16\21Y\3\21"+
      "\6\21]\n\21\r\21\16\21^\5\21a\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
      "\22\5\22j\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26s\n\26\r\26"+
      "\16\26t\3\27\3\27\3\27\5\27z\n\27\5\27|\n\27\3\30\3\30\2\2\31\3\3"+
      "\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
      "\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\6\4\2CIci\3\2\62;\b\2"+
      "))..\60\60C\\^^c|\4\2\13\13\"\"\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
      "\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
      "\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
      "\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
      "\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2"+
      "\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2"+
      "\17>\3\2\2\2\21A\3\2\2\2\23D\3\2\2\2\25G\3\2\2\2\27J\3\2\2\2\31M\3"+
      "\2\2\2\33P\3\2\2\2\35R\3\2\2\2\37T\3\2\2\2!`\3\2\2\2#i\3\2\2\2%k\3"+
      "\2\2\2\'m\3\2\2\2)o\3\2\2\2+r\3\2\2\2-{\3\2\2\2/}\3\2\2\2\61\62\7"+
      "\61\2\2\62\4\3\2\2\2\63\64\7*\2\2\64\6\3\2\2\2\65\66\7]\2\2\66\b\3"+
      "\2\2\2\678\7_\2\28\n\3\2\2\29:\7~\2\2:\f\3\2\2\2;<\7~\2\2<=\7~\2\2"+
      "=\16\3\2\2\2>?\7]\2\2?@\7~\2\2@\20\3\2\2\2AB\7~\2\2BC\7_\2\2C\22\3"+
      "\2\2\2DE\7<\2\2EF\7~\2\2F\24\3\2\2\2GH\7~\2\2HI\7<\2\2I\26\3\2\2\2"+
      "JK\7]\2\2KL\7\63\2\2L\30\3\2\2\2MN\7]\2\2NO\7\64\2\2O\32\3\2\2\2P"+
      "Q\7X\2\2Q\34\3\2\2\2RS\7<\2\2S\36\3\2\2\2TU\7\'\2\2U \3\2\2\2VX\7"+
      ")\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Za\3\2\2\2[]\7.\2\2\\"+
      "[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`W\3\2\2\2`\\\3"+
      "\2\2\2a\"\3\2\2\2bj\7`\2\2cd\7`\2\2dj\7`\2\2ej\7a\2\2fg\7a\2\2gj\7"+
      "a\2\2hj\7?\2\2ib\3\2\2\2ic\3\2\2\2ie\3\2\2\2if\3\2\2\2ih\3\2\2\2j"+
      "$\3\2\2\2kl\t\2\2\2l&\3\2\2\2mn\7|\2\2n(\3\2\2\2op\t\3\2\2p*\3\2\2"+
      "\2qs\t\4\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u,\3\2\2\2v|\7"+
      "\f\2\2wy\7\17\2\2xz\7\f\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{v\3\2\2"+
      "\2{w\3\2\2\2|.\3\2\2\2}~\t\5\2\2~\60\3\2\2\2\n\2Y^`ity{\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}