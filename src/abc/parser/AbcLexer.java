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
    T__9=10, T__10=11, T__11=12, T__12=13, BODYVOICE=14, COMMENT=15, ACCIDENTAL=16, 
    BASENOTE=17, OCTAVE=18, DIGIT=19, NEWLINE=20, WHITESPACE=21;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "BODYVOICE", "COMMENT", "ACCIDENTAL", 
    "BASENOTE", "OCTAVE", "DIGIT", "NEWLINE", "WHITESPACE"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'/'", "'z'", "'('", "'['", "']'", "'|'", "'||'", "'[|'", "'|]'", 
    "':|'", "'|:'", "'[1'", "'[2'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, "BODYVOICE", "COMMENT", "ACCIDENTAL", "BASENOTE", "OCTAVE", 
    "DIGIT", "NEWLINE", "WHITESPACE"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u008d\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3"+
      "\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
      "\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
      "\3\17\3\17\3\17\3\17\6\17T\n\17\r\17\16\17U\3\17\3\17\3\17\5\17[\n"+
      "\17\5\17]\n\17\3\20\3\20\6\20a\n\20\r\20\16\20b\3\20\3\20\3\20\5\20"+
      "h\n\20\5\20j\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21s\n\21\3"+
      "\22\3\22\3\23\6\23x\n\23\r\23\16\23y\3\23\6\23}\n\23\r\23\16\23~\5"+
      "\23\u0081\n\23\3\24\3\24\3\25\3\25\3\25\5\25\u0088\n\25\5\25\u008a"+
      "\n\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
      "\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\7\6\2"+
      "\60\60\62;C\\c|\5\2\60\60C\\c|\4\2CIci\3\2\62;\4\2\13\13\"\"\u009b"+
      "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
      "\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
      "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
      "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-"+
      "\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3"+
      "\2\2\2\179\3\2\2\2\21<\3\2\2\2\23?\3\2\2\2\25B\3\2\2\2\27E\3\2\2\2"+
      "\31H\3\2\2\2\33K\3\2\2\2\35N\3\2\2\2\37^\3\2\2\2!r\3\2\2\2#t\3\2\2"+
      "\2%\u0080\3\2\2\2\'\u0082\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-."+
      "\7\61\2\2.\4\3\2\2\2/\60\7|\2\2\60\6\3\2\2\2\61\62\7*\2\2\62\b\3\2"+
      "\2\2\63\64\7]\2\2\64\n\3\2\2\2\65\66\7_\2\2\66\f\3\2\2\2\678\7~\2"+
      "\28\16\3\2\2\29:\7~\2\2:;\7~\2\2;\20\3\2\2\2<=\7]\2\2=>\7~\2\2>\22"+
      "\3\2\2\2?@\7~\2\2@A\7_\2\2A\24\3\2\2\2BC\7<\2\2CD\7~\2\2D\26\3\2\2"+
      "\2EF\7~\2\2FG\7<\2\2G\30\3\2\2\2HI\7]\2\2IJ\7\63\2\2J\32\3\2\2\2K"+
      "L\7]\2\2LM\7\64\2\2M\34\3\2\2\2NO\7X\2\2OP\7<\2\2PQ\7\"\2\2QS\3\2"+
      "\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\\\3\2\2\2"+
      "W]\7\f\2\2XZ\7\17\2\2Y[\7\f\2\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\W\3"+
      "\2\2\2\\X\3\2\2\2]\36\3\2\2\2^`\7\'\2\2_a\t\3\2\2`_\3\2\2\2ab\3\2"+
      "\2\2b`\3\2\2\2bc\3\2\2\2ci\3\2\2\2dj\7\f\2\2eg\7\17\2\2fh\7\f\2\2"+
      "gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2id\3\2\2\2ie\3\2\2\2j \3\2\2\2ks\7`"+
      "\2\2lm\7`\2\2ms\7`\2\2ns\7a\2\2op\7a\2\2ps\7a\2\2qs\7?\2\2rk\3\2\2"+
      "\2rl\3\2\2\2rn\3\2\2\2ro\3\2\2\2rq\3\2\2\2s\"\3\2\2\2tu\t\4\2\2u$"+
      "\3\2\2\2vx\7)\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u0081\3"+
      "\2\2\2{}\7.\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
      "\3\2\2\2\u0080w\3\2\2\2\u0080|\3\2\2\2\u0081&\3\2\2\2\u0082\u0083"+
      "\t\5\2\2\u0083(\3\2\2\2\u0084\u008a\7\f\2\2\u0085\u0087\7\17\2\2\u0086"+
      "\u0088\7\f\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a"+
      "\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u008a*\3\2\2\2\u008b"+
      "\u008c\t\6\2\2\u008c,\3\2\2\2\17\2UZ\\bgiry~\u0080\u0087\u0089\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}