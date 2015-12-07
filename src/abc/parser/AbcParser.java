// Generated from Abc.g4 by ANTLR 4.5.1

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
public class AbcParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, OCTAVE=16, 
    ACCIDENTAL=17, BASENOTE=18, REST=19, DIGIT=20, STRING=21, NEWLINE=22, 
    WHITESPACE=23;
  public static final int
    RULE_root = 0, RULE_line = 1, RULE_element = 2, RULE_noteelem = 3, RULE_note = 4, 
    RULE_noteorrest = 5, RULE_pitch = 6, RULE_notelength = 7, RULE_tupletelem = 8, 
    RULE_tupletspec = 9, RULE_multinote = 10, RULE_barline = 11, RULE_nthrepeat = 12, 
    RULE_bodyvoice = 13, RULE_comment = 14, RULE_endofline = 15;
  public static final String[] ruleNames = {
    "root", "line", "element", "noteelem", "note", "noteorrest", "pitch", 
    "notelength", "tupletelem", "tupletspec", "multinote", "barline", "nthrepeat", 
    "bodyvoice", "comment", "endofline"
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

  @Override
  public String getGrammarFileName() { return "Abc.g4"; }

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

  public AbcParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public TerminalNode EOF() { return getToken(AbcParser.EOF, 0); }
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(33); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(32);
        line();
        }
        }
        setState(35); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << REST) | (1L << WHITESPACE))) != 0) );
      setState(37);
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

  public static class LineContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public BodyvoiceContext bodyvoice() {
      return getRuleContext(BodyvoiceContext.class,0);
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterLine(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitLine(this);
    }
  }

  public final LineContext line() throws RecognitionException {
    LineContext _localctx = new LineContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_line);
    int _la;
    try {
      setState(48);
      switch (_input.LA(1)) {
      case T__1:
      case T__2:
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
      case T__9:
      case T__10:
      case T__11:
      case ACCIDENTAL:
      case BASENOTE:
      case REST:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(40); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(39);
          element();
          }
          }
          setState(42); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << REST) | (1L << WHITESPACE))) != 0) );
        setState(44);
        match(NEWLINE);
        }
        break;
      case T__12:
        enterOuterAlt(_localctx, 2);
        {
        setState(46);
        bodyvoice();
        }
        break;
      case T__14:
        enterOuterAlt(_localctx, 3);
        {
        setState(47);
        comment();
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

  public static class ElementContext extends ParserRuleContext {
    public NoteelemContext noteelem() {
      return getRuleContext(NoteelemContext.class,0);
    }
    public TupletelemContext tupletelem() {
      return getRuleContext(TupletelemContext.class,0);
    }
    public BarlineContext barline() {
      return getRuleContext(BarlineContext.class,0);
    }
    public NthrepeatContext nthrepeat() {
      return getRuleContext(NthrepeatContext.class,0);
    }
    public TerminalNode WHITESPACE() { return getToken(AbcParser.WHITESPACE, 0); }
    public ElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_element);
    try {
      setState(55);
      switch (_input.LA(1)) {
      case T__2:
      case ACCIDENTAL:
      case BASENOTE:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(50);
        noteelem();
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(51);
        tupletelem();
        }
        break;
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
      case T__9:
        enterOuterAlt(_localctx, 3);
        {
        setState(52);
        barline();
        }
        break;
      case T__10:
      case T__11:
        enterOuterAlt(_localctx, 4);
        {
        setState(53);
        nthrepeat();
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 5);
        {
        setState(54);
        match(WHITESPACE);
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

  public static class NoteelemContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public MultinoteContext multinote() {
      return getRuleContext(MultinoteContext.class,0);
    }
    public NoteelemContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noteelem; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNoteelem(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNoteelem(this);
    }
  }

  public final NoteelemContext noteelem() throws RecognitionException {
    NoteelemContext _localctx = new NoteelemContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_noteelem);
    try {
      setState(59);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(57);
        note();
        }
        break;
      case T__2:
        enterOuterAlt(_localctx, 2);
        {
        setState(58);
        multinote();
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

  public static class NoteContext extends ParserRuleContext {
    public NoteorrestContext noteorrest() {
      return getRuleContext(NoteorrestContext.class,0);
    }
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
    }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(61);
      noteorrest();
      setState(63);
      _la = _input.LA(1);
      if (_la==DIGIT) {
        {
        setState(62);
        notelength();
        }
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

  public static class NoteorrestContext extends ParserRuleContext {
    public PitchContext pitch() {
      return getRuleContext(PitchContext.class,0);
    }
    public TerminalNode REST() { return getToken(AbcParser.REST, 0); }
    public NoteorrestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noteorrest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNoteorrest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNoteorrest(this);
    }
  }

  public final NoteorrestContext noteorrest() throws RecognitionException {
    NoteorrestContext _localctx = new NoteorrestContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_noteorrest);
    try {
      setState(67);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(65);
        pitch();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(66);
        match(REST);
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

  public static class PitchContext extends ParserRuleContext {
    public TerminalNode BASENOTE() { return getToken(AbcParser.BASENOTE, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(AbcParser.ACCIDENTAL, 0); }
    public TerminalNode OCTAVE() { return getToken(AbcParser.OCTAVE, 0); }
    public PitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterPitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitPitch(this);
    }
  }

  public final PitchContext pitch() throws RecognitionException {
    PitchContext _localctx = new PitchContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(70);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(69);
        match(ACCIDENTAL);
        }
      }

      setState(72);
      match(BASENOTE);
      setState(74);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(73);
        match(OCTAVE);
        }
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

  public static class NotelengthContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public NotelengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelength; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNotelength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNotelength(this);
    }
  }

  public final NotelengthContext notelength() throws RecognitionException {
    NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_notelength);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      {
      setState(77); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(76);
        match(DIGIT);
        }
        }
        setState(79); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
      setState(89);
      _la = _input.LA(1);
      if (_la==T__0) {
        {
        setState(81);
        match(T__0);
        setState(87);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(83); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(82);
            match(DIGIT);
            }
            }
            setState(85); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        }
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

  public static class TupletelemContext extends ParserRuleContext {
    public TupletspecContext tupletspec() {
      return getRuleContext(TupletspecContext.class,0);
    }
    public List<NoteelemContext> noteelem() {
      return getRuleContexts(NoteelemContext.class);
    }
    public NoteelemContext noteelem(int i) {
      return getRuleContext(NoteelemContext.class,i);
    }
    public TupletelemContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletelem; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTupletelem(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTupletelem(this);
    }
  }

  public final TupletelemContext tupletelem() throws RecognitionException {
    TupletelemContext _localctx = new TupletelemContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_tupletelem);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(91);
      tupletspec();
      setState(93); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(92);
          noteelem();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(95); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,13,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class TupletspecContext extends ParserRuleContext {
    public TerminalNode DIGIT() { return getToken(AbcParser.DIGIT, 0); }
    public TupletspecContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletspec; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTupletspec(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTupletspec(this);
    }
  }

  public final TupletspecContext tupletspec() throws RecognitionException {
    TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(97);
      match(T__1);
      setState(98);
      match(DIGIT);
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

  public static class MultinoteContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public MultinoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_multinote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMultinote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMultinote(this);
    }
  }

  public final MultinoteContext multinote() throws RecognitionException {
    MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_multinote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(100);
      match(T__2);
      setState(102); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(101);
        note();
        }
        }
        setState(104); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << REST))) != 0) );
      setState(106);
      match(T__3);
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

  public static class BarlineContext extends ParserRuleContext {
    public BarlineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_barline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBarline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBarline(this);
    }
  }

  public final BarlineContext barline() throws RecognitionException {
    BarlineContext _localctx = new BarlineContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_barline);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(108);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

  public static class NthrepeatContext extends ParserRuleContext {
    public NthrepeatContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_nthrepeat; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNthrepeat(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNthrepeat(this);
    }
  }

  public final NthrepeatContext nthrepeat() throws RecognitionException {
    NthrepeatContext _localctx = new NthrepeatContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_nthrepeat);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(110);
      _la = _input.LA(1);
      if ( !(_la==T__10 || _la==T__11) ) {
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

  public static class BodyvoiceContext extends ParserRuleContext {
    public TerminalNode STRING() { return getToken(AbcParser.STRING, 0); }
    public BodyvoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_bodyvoice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBodyvoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBodyvoice(this);
    }
  }

  public final BodyvoiceContext bodyvoice() throws RecognitionException {
    BodyvoiceContext _localctx = new BodyvoiceContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_bodyvoice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(112);
      match(T__12);
      setState(113);
      match(T__13);
      setState(114);
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

  public static class CommentContext extends ParserRuleContext {
    public TerminalNode STRING() { return getToken(AbcParser.STRING, 0); }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(116);
      match(T__14);
      setState(117);
      match(STRING);
      setState(118);
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

  public static class EndoflineContext extends ParserRuleContext {
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public EndoflineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endofline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterEndofline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitEndofline(this);
    }
  }

  public final EndoflineContext endofline() throws RecognitionException {
    EndoflineContext _localctx = new EndoflineContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_endofline);
    try {
      setState(122);
      switch (_input.LA(1)) {
      case T__14:
        enterOuterAlt(_localctx, 1);
        {
        setState(120);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(121);
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

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\177\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3"+
      "\2\6\2$\n\2\r\2\16\2%\3\2\3\2\3\3\6\3+\n\3\r\3\16\3,\3\3\3\3\3\3\3"+
      "\3\5\3\63\n\3\3\4\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\5\5>\n\5\3\6\3"+
      "\6\5\6B\n\6\3\7\3\7\5\7F\n\7\3\b\5\bI\n\b\3\b\3\b\5\bM\n\b\3\t\6\t"+
      "P\n\t\r\t\16\tQ\3\t\3\t\6\tV\n\t\r\t\16\tW\5\tZ\n\t\5\t\\\n\t\3\n"+
      "\3\n\6\n`\n\n\r\n\16\na\3\13\3\13\3\13\3\f\3\f\6\fi\n\f\r\f\16\fj"+
      "\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
      "\3\21\3\21\5\21}\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32"+
      "\34\36 \2\4\3\2\7\f\3\2\r\16\u0082\2#\3\2\2\2\4\62\3\2\2\2\69\3\2"+
      "\2\2\b=\3\2\2\2\n?\3\2\2\2\fE\3\2\2\2\16H\3\2\2\2\20O\3\2\2\2\22]"+
      "\3\2\2\2\24c\3\2\2\2\26f\3\2\2\2\30n\3\2\2\2\32p\3\2\2\2\34r\3\2\2"+
      "\2\36v\3\2\2\2 |\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2"+
      "%&\3\2\2\2&\'\3\2\2\2\'(\7\2\2\3(\3\3\2\2\2)+\5\6\4\2*)\3\2\2\2+,"+
      "\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\30\2\2/\63\3\2\2\2\60\63"+
      "\5\34\17\2\61\63\5\36\20\2\62*\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2"+
      "\63\5\3\2\2\2\64:\5\b\5\2\65:\5\22\n\2\66:\5\30\r\2\67:\5\32\16\2"+
      "8:\7\31\2\29\64\3\2\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2"+
      "\2\2:\7\3\2\2\2;>\5\n\6\2<>\5\26\f\2=;\3\2\2\2=<\3\2\2\2>\t\3\2\2"+
      "\2?A\5\f\7\2@B\5\20\t\2A@\3\2\2\2AB\3\2\2\2B\13\3\2\2\2CF\5\16\b\2"+
      "DF\7\25\2\2EC\3\2\2\2ED\3\2\2\2F\r\3\2\2\2GI\7\23\2\2HG\3\2\2\2HI"+
      "\3\2\2\2IJ\3\2\2\2JL\7\24\2\2KM\7\22\2\2LK\3\2\2\2LM\3\2\2\2M\17\3"+
      "\2\2\2NP\7\26\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R[\3\2\2"+
      "\2SY\7\3\2\2TV\7\26\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ"+
      "\3\2\2\2YU\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[S\3\2\2\2[\\\3\2\2\2\\\21"+
      "\3\2\2\2]_\5\24\13\2^`\5\b\5\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2"+
      "\2\2b\23\3\2\2\2cd\7\4\2\2de\7\26\2\2e\25\3\2\2\2fh\7\5\2\2gi\5\n"+
      "\6\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\6\2\2m"+
      "\27\3\2\2\2no\t\2\2\2o\31\3\2\2\2pq\t\3\2\2q\33\3\2\2\2rs\7\17\2\2"+
      "st\7\20\2\2tu\7\27\2\2u\35\3\2\2\2vw\7\21\2\2wx\7\27\2\2xy\7\30\2"+
      "\2y\37\3\2\2\2z}\5\36\20\2{}\7\30\2\2|z\3\2\2\2|{\3\2\2\2}!\3\2\2"+
      "\2\22%,\629=AEHLQWY[aj|";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}