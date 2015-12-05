// Generated from ABCgrammar.g4 by ANTLR 4.5.1

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
public class ABCgrammarLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, KEY=13, STRING=14, NUMBER=15, NEWLINE=16, 
    SPACES=17;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "KEY", "STRING", "NUMBER", "NEWLINE", "SPACES"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'L:'", "'/'", "'C:'", "'M:'", "'C'", "'C|'", 
    "'Q:'", "'='", "'V:'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, "KEY", "STRING", "NUMBER", "NEWLINE", "SPACES"
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


  public ABCgrammarLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "ABCgrammar.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23p\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
      "\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
      "\r\3\r\3\16\3\16\3\16\3\16\5\16J\n\16\3\16\5\16M\n\16\3\16\5\16P\n"+
      "\16\3\17\6\17S\n\17\r\17\16\17T\3\17\6\17X\n\17\r\17\16\17Y\5\17\\"+
      "\n\17\3\20\6\20_\n\20\r\20\16\20`\3\21\3\21\5\21e\n\21\3\21\5\21h"+
      "\n\21\3\22\6\22k\n\22\r\22\16\22l\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6"+
      "\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
      "\3\2\t\4\2CIci\4\2%%dd\4\2OOoo\3\2C\\\3\2c|\3\2\62;\3\2\"\"x\2\3\3"+
      "\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
      "\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
      "\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
      "\2#\3\2\2\2\3%\3\2\2\2\5(\3\2\2\2\7+\3\2\2\2\t.\3\2\2\2\13\60\3\2"+
      "\2\2\r\63\3\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23;\3\2\2\2\25>\3\2\2"+
      "\2\27@\3\2\2\2\31C\3\2\2\2\33E\3\2\2\2\35[\3\2\2\2\37^\3\2\2\2!g\3"+
      "\2\2\2#j\3\2\2\2%&\7Z\2\2&\'\7<\2\2\'\4\3\2\2\2()\7V\2\2)*\7<\2\2"+
      "*\6\3\2\2\2+,\7N\2\2,-\7<\2\2-\b\3\2\2\2./\7\61\2\2/\n\3\2\2\2\60"+
      "\61\7E\2\2\61\62\7<\2\2\62\f\3\2\2\2\63\64\7O\2\2\64\65\7<\2\2\65"+
      "\16\3\2\2\2\66\67\7E\2\2\67\20\3\2\2\289\7E\2\29:\7~\2\2:\22\3\2\2"+
      "\2;<\7S\2\2<=\7<\2\2=\24\3\2\2\2>?\7?\2\2?\26\3\2\2\2@A\7X\2\2AB\7"+
      "<\2\2B\30\3\2\2\2CD\7\'\2\2D\32\3\2\2\2EF\7M\2\2FG\7<\2\2GI\3\2\2"+
      "\2HJ\t\2\2\2IH\3\2\2\2JL\3\2\2\2KM\t\3\2\2LK\3\2\2\2LM\3\2\2\2MO\3"+
      "\2\2\2NP\t\4\2\2ON\3\2\2\2OP\3\2\2\2P\34\3\2\2\2QS\t\5\2\2RQ\3\2\2"+
      "\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\\\3\2\2\2VX\t\6\2\2WV\3\2\2\2XY"+
      "\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[R\3\2\2\2[W\3\2\2\2\\\36\3"+
      "\2\2\2]_\t\7\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a \3\2\2\2"+
      "bd\7\17\2\2ce\7\f\2\2dc\3\2\2\2de\3\2\2\2eh\3\2\2\2fh\7\f\2\2gb\3"+
      "\2\2\2gf\3\2\2\2h\"\3\2\2\2ik\t\b\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2"+
      "\2lm\3\2\2\2mn\3\2\2\2no\b\22\2\2o$\3\2\2\2\r\2ILOTY[`dgl\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}