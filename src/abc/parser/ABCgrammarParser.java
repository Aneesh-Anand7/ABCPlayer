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
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NOTE=15, STRING=16, 
    NUMBER=17, SPACES=18;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_key = 4, 
    RULE_line = 5, RULE_length = 6, RULE_composer = 7, RULE_meter = 8, RULE_tempo = 9, 
    RULE_voice = 10, RULE_body = 11;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "key", "line", "length", "composer", 
    "meter", "tempo", "voice", "body"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'\r\n'", "'\n'", "'X'", "':'", "'T'", "'_'", "'^'", "'L'", "'/'", 
    "'C'", "'M'", "'|'", "'Q'", "'V'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, "NOTE", "STRING", "NUMBER", "SPACES"
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
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
    public BodyContext body() {
      return getRuleContext(BodyContext.class,0);
    }
    public TerminalNode EOF() { return getToken(ABCgrammarParser.EOF, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(24);
      header();
      setState(25);
      body();
      setState(26);
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

  public static class HeaderContext extends ParserRuleContext {
    public IndexContext index() {
      return getRuleContext(IndexContext.class,0);
    }
    public TitleContext title() {
      return getRuleContext(TitleContext.class,0);
    }
    public KeyContext key() {
      return getRuleContext(KeyContext.class,0);
    }
    public List<LineContext> line() {
      return getRuleContexts(LineContext.class);
    }
    public LineContext line(int i) {
      return getRuleContext(LineContext.class,i);
    }
    public HeaderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_header; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitHeader(this);
    }
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(28);
      index();
      setState(29);
      _la = _input.LA(1);
      if ( !(_la==T__0 || _la==T__1) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(30);
      title();
      setState(31);
      _la = _input.LA(1);
      if ( !(_la==T__0 || _la==T__1) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(37);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13))) != 0)) {
        {
        {
        setState(32);
        line();
        setState(33);
        _la = _input.LA(1);
        if ( !(_la==T__0 || _la==T__1) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(39);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(40);
      key();
      setState(41);
      _la = _input.LA(1);
      if ( !(_la==T__0 || _la==T__1) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
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

  public static class IndexContext extends ParserRuleContext {
    public TerminalNode NUMBER() { return getToken(ABCgrammarParser.NUMBER, 0); }
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
    enterRule(_localctx, 4, RULE_index);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(43);
      match(T__2);
      setState(44);
      match(T__3);
      setState(45);
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

  public static class TitleContext extends ParserRuleContext {
    public TerminalNode STRING() { return getToken(ABCgrammarParser.STRING, 0); }
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
    enterRule(_localctx, 6, RULE_title);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(47);
      match(T__4);
      setState(48);
      match(T__3);
      setState(49);
      match(STRING);
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
    public TerminalNode NOTE() { return getToken(ABCgrammarParser.NOTE, 0); }
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
    enterRule(_localctx, 8, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(52);
      _la = _input.LA(1);
      if (_la==T__5 || _la==T__6) {
        {
        setState(51);
        _la = _input.LA(1);
        if ( !(_la==T__5 || _la==T__6) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(54);
      match(NOTE);
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
    enterRule(_localctx, 10, RULE_line);
    try {
      setState(61);
      switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(56);
        length();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(57);
        composer();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(58);
        meter();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(59);
        tempo();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(60);
        voice();
        }
        break;
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
    enterRule(_localctx, 12, RULE_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(63);
      match(T__7);
      setState(64);
      match(T__3);
      setState(65);
      match(NUMBER);
      setState(66);
      match(T__8);
      setState(67);
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
    public TerminalNode STRING() { return getToken(ABCgrammarParser.STRING, 0); }
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
    enterRule(_localctx, 14, RULE_composer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(69);
      match(T__9);
      setState(70);
      match(T__3);
      setState(71);
      match(STRING);
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
    enterRule(_localctx, 16, RULE_meter);
    try {
      setState(81);
      switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(73);
        match(T__10);
        setState(74);
        match(T__3);
        {
        setState(75);
        match(NUMBER);
        setState(76);
        match(T__8);
        setState(77);
        match(NUMBER);
        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(78);
        match(T__9);
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(79);
        match(T__9);
        setState(80);
        match(T__11);
        }
        break;
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
    public TerminalNode NUMBER() { return getToken(ABCgrammarParser.NUMBER, 0); }
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
    enterRule(_localctx, 18, RULE_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(83);
      match(T__12);
      setState(84);
      match(T__3);
      setState(85);
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
    public TerminalNode STRING() { return getToken(ABCgrammarParser.STRING, 0); }
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
    enterRule(_localctx, 20, RULE_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(87);
      match(T__13);
      setState(88);
      match(T__3);
      setState(89);
      match(STRING);
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

  public static class BodyContext extends ParserRuleContext {
    public TerminalNode STRING() { return getToken(ABCgrammarParser.STRING, 0); }
    public BodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_body; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).enterBody(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCgrammarListener ) ((ABCgrammarListener)listener).exitBody(this);
    }
  }

  public final BodyContext body() throws RecognitionException {
    BodyContext _localctx = new BodyContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_body);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(91);
      match(STRING);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24`\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
      "\7\3&\n\3\f\3\16\3)\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
      "\5\3\6\5\6\67\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\b\3\b\3\b"+
      "\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nT"+
      "\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6"+
      "\b\n\f\16\20\22\24\26\30\2\4\3\2\3\4\3\2\b\t[\2\32\3\2\2\2\4\36\3"+
      "\2\2\2\6-\3\2\2\2\b\61\3\2\2\2\n\66\3\2\2\2\f?\3\2\2\2\16A\3\2\2\2"+
      "\20G\3\2\2\2\22S\3\2\2\2\24U\3\2\2\2\26Y\3\2\2\2\30]\3\2\2\2\32\33"+
      "\5\4\3\2\33\34\5\30\r\2\34\35\7\2\2\3\35\3\3\2\2\2\36\37\5\6\4\2\37"+
      " \t\2\2\2 !\5\b\5\2!\'\t\2\2\2\"#\5\f\7\2#$\t\2\2\2$&\3\2\2\2%\"\3"+
      "\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\5\n"+
      "\6\2+,\t\2\2\2,\5\3\2\2\2-.\7\5\2\2./\7\6\2\2/\60\7\23\2\2\60\7\3"+
      "\2\2\2\61\62\7\7\2\2\62\63\7\6\2\2\63\64\7\22\2\2\64\t\3\2\2\2\65"+
      "\67\t\3\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\21\2\29\13"+
      "\3\2\2\2:@\5\16\b\2;@\5\20\t\2<@\5\22\n\2=@\5\24\13\2>@\5\26\f\2?"+
      ":\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\r\3\2\2\2AB\7\n"+
      "\2\2BC\7\6\2\2CD\7\23\2\2DE\7\13\2\2EF\7\23\2\2F\17\3\2\2\2GH\7\f"+
      "\2\2HI\7\6\2\2IJ\7\22\2\2J\21\3\2\2\2KL\7\r\2\2LM\7\6\2\2MN\7\23\2"+
      "\2NO\7\13\2\2OT\7\23\2\2PT\7\f\2\2QR\7\f\2\2RT\7\16\2\2SK\3\2\2\2"+
      "SP\3\2\2\2SQ\3\2\2\2T\23\3\2\2\2UV\7\17\2\2VW\7\6\2\2WX\7\23\2\2X"+
      "\25\3\2\2\2YZ\7\20\2\2Z[\7\6\2\2[\\\7\22\2\2\\\27\3\2\2\2]^\7\22\2"+
      "\2^\31\3\2\2\2\6\'\66?S";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}