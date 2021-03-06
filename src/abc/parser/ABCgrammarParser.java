// Generated from ABCgrammar.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCgrammarParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, KEY=13, STRING=14, NUMBER=15, NEWLINE=16, 
    SPACES=17;
  public static final int
    RULE_root = 0, RULE_index = 1, RULE_title = 2, RULE_key = 3, RULE_line = 4, 
    RULE_length = 5, RULE_composer = 6, RULE_meter = 7, RULE_tempo = 8, 
    RULE_voice = 9, RULE_endofline = 10, RULE_comment = 11;
  public static final String[] ruleNames = {
    "root", "index", "title", "key", "line", "length", "composer", "meter", 
    "tempo", "voice", "endofline", "comment"
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

  @Override
  public String getGrammarFileName() { return "ABCgrammar.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


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

  public ABCgrammarParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public IndexContext index() {
      return getRuleContext(IndexContext.class,0);
    }
    public TitleContext title() {
      return getRuleContext(TitleContext.class,0);
    }
    public KeyContext key() {
      return getRuleContext(KeyContext.class,0);
    }
    public TerminalNode EOF() { return getToken(ABCgrammarParser.EOF, 0); }
    public List<LineContext> line() {
      return getRuleContexts(LineContext.class);
    }
    public LineContext line(int i) {
      return getRuleContext(LineContext.class,i);
    }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(24);
      index();
      setState(25);
      title();
      setState(29);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__10) | (1L << T__11))) != 0)) {
        {
        {
        setState(26);
        line();
        }
        }
        setState(31);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(32);
      key();
      setState(33);
      match(EOF);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class IndexContext extends ParserRuleContext {
    public TerminalNode NUMBER() { return getToken(ABCgrammarParser.NUMBER, 0); }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public IndexContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_index; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterIndex(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitIndex(this);
    }
  }

  public final IndexContext index() throws RecognitionException {
    IndexContext _localctx = new IndexContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_index);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(35);
      match(T__0);
      setState(36);
      match(NUMBER);
      setState(37);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TitleContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public List<TerminalNode> STRING() { return getTokens(ABCgrammarParser.STRING); }
    public TerminalNode STRING(int i) {
      return getToken(ABCgrammarParser.STRING, i);
    }
    public List<TerminalNode> NUMBER() { return getTokens(ABCgrammarParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(ABCgrammarParser.NUMBER, i);
    }
    public TitleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterTitle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitTitle(this);
    }
  }

  public final TitleContext title() throws RecognitionException {
    TitleContext _localctx = new TitleContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_title);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(39);
      match(T__1);
      setState(41); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(40);
        _la = _input.LA(1);
        if ( !(_la==STRING || _la==NUMBER) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(43); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==STRING || _la==NUMBER );
      setState(45);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class KeyContext extends ParserRuleContext {
    public TerminalNode KEY() { return getToken(ABCgrammarParser.KEY, 0); }
    public KeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterKey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitKey(this);
    }
  }

  public final KeyContext key() throws RecognitionException {
    KeyContext _localctx = new KeyContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_key);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(47);
      match(KEY);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class LineContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public LengthContext length() {
      return getRuleContext(LengthContext.class,0);
    }
    public ComposerContext composer() {
      return getRuleContext(ComposerContext.class,0);
    }
    public MeterContext meter() {
      return getRuleContext(MeterContext.class,0);
    }
    public TempoContext tempo() {
      return getRuleContext(TempoContext.class,0);
    }
    public VoiceContext voice() {
      return getRuleContext(VoiceContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public LineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_line; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterLine(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitLine(this);
    }
  }

  public final LineContext line() throws RecognitionException {
    LineContext _localctx = new LineContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_line);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(55);
      switch (_input.LA(1)) {
      case T__2:
        {
        setState(49);
        length();
        }
        break;
      case T__4:
        {
        setState(50);
        composer();
        }
        break;
      case T__5:
        {
        setState(51);
        meter();
        }
        break;
      case T__8:
        {
        setState(52);
        tempo();
        }
        break;
      case T__10:
        {
        setState(53);
        voice();
        }
        break;
      case T__11:
        {
        setState(54);
        comment();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(57);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class LengthContext extends ParserRuleContext {
    public List<TerminalNode> NUMBER() { return getTokens(ABCgrammarParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(ABCgrammarParser.NUMBER, i);
    }
    public LengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterLength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitLength(this);
    }
  }

  public final LengthContext length() throws RecognitionException {
    LengthContext _localctx = new LengthContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(59);
      match(T__2);
      setState(60);
      match(NUMBER);
      setState(61);
      match(T__3);
      setState(62);
      match(NUMBER);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ComposerContext extends ParserRuleContext {
    public List<TerminalNode> STRING() { return getTokens(ABCgrammarParser.STRING); }
    public TerminalNode STRING(int i) {
      return getToken(ABCgrammarParser.STRING, i);
    }
    public ComposerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_composer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterComposer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitComposer(this);
    }
  }

  public final ComposerContext composer() throws RecognitionException {
    ComposerContext _localctx = new ComposerContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_composer);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(64);
      match(T__4);
      setState(66); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(65);
        match(STRING);
        }
        }
        setState(68); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==STRING );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class MeterContext extends ParserRuleContext {
    public List<TerminalNode> NUMBER() { return getTokens(ABCgrammarParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(ABCgrammarParser.NUMBER, i);
    }
    public MeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterMeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitMeter(this);
    }
  }

  public final MeterContext meter() throws RecognitionException {
    MeterContext _localctx = new MeterContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(70);
      match(T__5);
      setState(76);
      switch (_input.LA(1)) {
      case NUMBER:
        {
        {
        setState(71);
        match(NUMBER);
        setState(72);
        match(T__3);
        setState(73);
        match(NUMBER);
        }
        }
        break;
      case T__6:
        {
        setState(74);
        match(T__6);
        }
        break;
      case T__7:
        {
        setState(75);
        match(T__7);
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TempoContext extends ParserRuleContext {
    public List<TerminalNode> NUMBER() { return getTokens(ABCgrammarParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(ABCgrammarParser.NUMBER, i);
    }
    public TempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterTempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitTempo(this);
    }
  }

  public final TempoContext tempo() throws RecognitionException {
    TempoContext _localctx = new TempoContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(78);
      match(T__8);
      setState(79);
      match(NUMBER);
      setState(80);
      match(T__3);
      setState(81);
      match(NUMBER);
      setState(82);
      match(T__9);
      setState(83);
      match(NUMBER);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class VoiceContext extends ParserRuleContext {
    public List<TerminalNode> STRING() { return getTokens(ABCgrammarParser.STRING); }
    public TerminalNode STRING(int i) {
      return getToken(ABCgrammarParser.STRING, i);
    }
    public List<TerminalNode> NUMBER() { return getTokens(ABCgrammarParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(ABCgrammarParser.NUMBER, i);
    }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_voice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(85);
      match(T__10);
      setState(87); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(86);
        _la = _input.LA(1);
        if ( !(_la==STRING || _la==NUMBER) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(89); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==STRING || _la==NUMBER );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class EndoflineContext extends ParserRuleContext {
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(ABCgrammarParser.NEWLINE, 0); }
    public EndoflineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endofline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterEndofline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitEndofline(this);
    }
  }

  public final EndoflineContext endofline() throws RecognitionException {
    EndoflineContext _localctx = new EndoflineContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_endofline);
    try {
      setState(93);
      switch (_input.LA(1)) {
      case T__11:
        enterOuterAlt(_localctx, 1);
        {
        setState(91);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(92);
        match(NEWLINE);
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CommentContext extends ParserRuleContext {
    public TerminalNode STRING() { return getToken(ABCgrammarParser.STRING, 0); }
    public TerminalNode NEWLINE() { return getToken(ABCgrammarParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(95);
      match(T__11);
      setState(96);
      match(STRING);
      setState(97);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23f\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3"+
      "\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\6\4,\n\4\r\4\16\4-\3\4\3\4\3\5\3\5"+
      "\3\6\3\6\3\6\3\6\3\6\3\6\5\6:\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
      "\3\b\6\bE\n\b\r\b\16\bF\3\t\3\t\3\t\3\t\3\t\3\t\5\tO\n\t\3\n\3\n\3"+
      "\n\3\n\3\n\3\n\3\n\3\13\3\13\6\13Z\n\13\r\13\16\13[\3\f\3\f\5\f`\n"+
      "\f\3\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3"+
      "\2\20\21e\2\32\3\2\2\2\4%\3\2\2\2\6)\3\2\2\2\b\61\3\2\2\2\n9\3\2\2"+
      "\2\f=\3\2\2\2\16B\3\2\2\2\20H\3\2\2\2\22P\3\2\2\2\24W\3\2\2\2\26_"+
      "\3\2\2\2\30a\3\2\2\2\32\33\5\4\3\2\33\37\5\6\4\2\34\36\5\n\6\2\35"+
      "\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3"+
      "\2\2\2\"#\5\b\5\2#$\7\2\2\3$\3\3\2\2\2%&\7\3\2\2&\'\7\21\2\2\'(\5"+
      "\26\f\2(\5\3\2\2\2)+\7\4\2\2*,\t\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2"+
      "\2-.\3\2\2\2./\3\2\2\2/\60\5\26\f\2\60\7\3\2\2\2\61\62\7\17\2\2\62"+
      "\t\3\2\2\2\63:\5\f\7\2\64:\5\16\b\2\65:\5\20\t\2\66:\5\22\n\2\67:"+
      "\5\24\13\28:\5\30\r\29\63\3\2\2\29\64\3\2\2\29\65\3\2\2\29\66\3\2"+
      "\2\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;<\5\26\f\2<\13\3\2\2\2=>\7\5"+
      "\2\2>?\7\21\2\2?@\7\6\2\2@A\7\21\2\2A\r\3\2\2\2BD\7\7\2\2CE\7\20\2"+
      "\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\17\3\2\2\2HN\7\b\2\2I"+
      "J\7\21\2\2JK\7\6\2\2KO\7\21\2\2LO\7\t\2\2MO\7\n\2\2NI\3\2\2\2NL\3"+
      "\2\2\2NM\3\2\2\2O\21\3\2\2\2PQ\7\13\2\2QR\7\21\2\2RS\7\6\2\2ST\7\21"+
      "\2\2TU\7\f\2\2UV\7\21\2\2V\23\3\2\2\2WY\7\r\2\2XZ\t\2\2\2YX\3\2\2"+
      "\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\25\3\2\2\2]`\5\30\r\2^`\7\22\2"+
      "\2_]\3\2\2\2_^\3\2\2\2`\27\3\2\2\2ab\7\16\2\2bc\7\20\2\2cd\7\22\2"+
      "\2d\31\3\2\2\2\t\37-9FN[_";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}