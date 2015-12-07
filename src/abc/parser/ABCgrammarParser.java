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
    T__9=10, KEY=11, STRING=12, NUMBER=13, NEWLINE=14, SPACES=15;
  public static final int
    RULE_root = 0, RULE_index = 1, RULE_title = 2, RULE_line = 3, RULE_length = 4, 
    RULE_composer = 5, RULE_meter = 6, RULE_tempo = 7, RULE_voice = 8, RULE_endofline = 9, 
    RULE_comment = 10;
  public static final String[] ruleNames = {
    "root", "index", "title", "line", "length", "composer", "meter", "tempo", 
    "voice", "endofline", "comment"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'L:'", "'/'", "'C:'", "'M:'", "'Q:'", "'='", 
    "'V:'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, "KEY", 
    "STRING", "NUMBER", "NEWLINE", "SPACES"
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
    public TerminalNode KEY() { return getToken(ABCgrammarParser.KEY, 0); }
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
      setState(22);
      index();
      setState(23);
      title();
      setState(27);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9))) != 0)) {
        {
        {
        setState(24);
        line();
        }
        }
        setState(29);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(30);
      match(KEY);
      setState(31);
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
      setState(33);
      match(T__0);
      setState(34);
      match(NUMBER);
      setState(35);
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
      setState(37);
      match(T__1);
      setState(39); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(38);
        _la = _input.LA(1);
        if ( !(_la==STRING || _la==NUMBER) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(41); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==STRING || _la==NUMBER );
      setState(43);
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
    enterRule(_localctx, 6, RULE_line);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(51);
      switch (_input.LA(1)) {
      case T__2:
        {
        setState(45);
        length();
        }
        break;
      case T__4:
        {
        setState(46);
        composer();
        }
        break;
      case T__5:
        {
        setState(47);
        meter();
        }
        break;
      case T__6:
        {
        setState(48);
        tempo();
        }
        break;
      case T__8:
        {
        setState(49);
        voice();
        }
        break;
      case T__9:
        {
        setState(50);
        comment();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(53);
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
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
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
    enterRule(_localctx, 8, RULE_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(55);
      match(T__2);
      setState(56);
      match(NUMBER);
      setState(57);
      match(T__3);
      setState(58);
      match(NUMBER);
      setState(59);
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

  public static class ComposerContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
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
    enterRule(_localctx, 10, RULE_composer);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(61);
      match(T__4);
      setState(63); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(62);
        match(STRING);
        }
        }
        setState(65); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==STRING );
      setState(67);
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
    enterRule(_localctx, 12, RULE_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(69);
      match(T__5);
      {
      setState(70);
      match(NUMBER);
      setState(71);
      match(T__3);
      setState(72);
      match(NUMBER);
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
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
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
    enterRule(_localctx, 14, RULE_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(74);
      match(T__6);
      setState(75);
      match(NUMBER);
      setState(76);
      match(T__3);
      setState(77);
      match(NUMBER);
      setState(78);
      match(T__7);
      setState(79);
      match(NUMBER);
      setState(80);
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

  public static class VoiceContext extends ParserRuleContext {
    public TerminalNode STRING() { return getToken(ABCgrammarParser.STRING, 0); }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
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
    enterRule(_localctx, 16, RULE_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(82);
      match(T__8);
      setState(83);
      match(STRING);
      setState(84);
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
    enterRule(_localctx, 18, RULE_endofline);
    try {
      setState(88);
      switch (_input.LA(1)) {
      case T__9:
        enterOuterAlt(_localctx, 1);
        {
        setState(86);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(87);
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
    enterRule(_localctx, 20, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(90);
      match(T__9);
      setState(91);
      match(STRING);
      setState(92);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21a\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\2"+
      "\3\3\3\3\3\3\3\3\3\4\3\4\6\4*\n\4\r\4\16\4+\3\4\3\4\3\5\3\5\3\5\3"+
      "\5\3\5\3\5\5\5\66\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\6\7"+
      "B\n\7\r\7\16\7C\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
      "\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13[\n\13\3\f\3\f\3\f\3\f\3"+
      "\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\16\17^\2\30\3\2\2\2\4"+
      "#\3\2\2\2\6\'\3\2\2\2\b\65\3\2\2\2\n9\3\2\2\2\f?\3\2\2\2\16G\3\2\2"+
      "\2\20L\3\2\2\2\22T\3\2\2\2\24Z\3\2\2\2\26\\\3\2\2\2\30\31\5\4\3\2"+
      "\31\35\5\6\4\2\32\34\5\b\5\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2"+
      "\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\r\2\2!\"\7\2\2\3"+
      "\"\3\3\2\2\2#$\7\3\2\2$%\7\17\2\2%&\5\24\13\2&\5\3\2\2\2\')\7\4\2"+
      "\2(*\t\2\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\5"+
      "\24\13\2.\7\3\2\2\2/\66\5\n\6\2\60\66\5\f\7\2\61\66\5\16\b\2\62\66"+
      "\5\20\t\2\63\66\5\22\n\2\64\66\5\26\f\2\65/\3\2\2\2\65\60\3\2\2\2"+
      "\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\67\3\2"+
      "\2\2\678\5\24\13\28\t\3\2\2\29:\7\5\2\2:;\7\17\2\2;<\7\6\2\2<=\7\17"+
      "\2\2=>\5\24\13\2>\13\3\2\2\2?A\7\7\2\2@B\7\16\2\2A@\3\2\2\2BC\3\2"+
      "\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\5\24\13\2F\r\3\2\2\2GH\7\b\2"+
      "\2HI\7\17\2\2IJ\7\6\2\2JK\7\17\2\2K\17\3\2\2\2LM\7\t\2\2MN\7\17\2"+
      "\2NO\7\6\2\2OP\7\17\2\2PQ\7\n\2\2QR\7\17\2\2RS\5\24\13\2S\21\3\2\2"+
      "\2TU\7\13\2\2UV\7\16\2\2VW\5\24\13\2W\23\3\2\2\2X[\5\26\f\2Y[\7\20"+
      "\2\2ZX\3\2\2\2ZY\3\2\2\2[\25\3\2\2\2\\]\7\f\2\2]^\7\16\2\2^_\7\20"+
      "\2\2_\27\3\2\2\2\7\35+\65CZ";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}