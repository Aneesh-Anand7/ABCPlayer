// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcParser}.
 */
public interface AbcListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AbcParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(AbcParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(AbcParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   */
  void enterBody(AbcParser.BodyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   */
  void exitBody(AbcParser.BodyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#line}.
   * @param ctx the parse tree
   */
  void enterLine(AbcParser.LineContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#line}.
   * @param ctx the parse tree
   */
  void exitLine(AbcParser.LineContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(AbcParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(AbcParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#noteelem}.
   * @param ctx the parse tree
   */
  void enterNoteelem(AbcParser.NoteelemContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#noteelem}.
   * @param ctx the parse tree
   */
  void exitNoteelem(AbcParser.NoteelemContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(AbcParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(AbcParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#noteorrest}.
   * @param ctx the parse tree
   */
  void enterNoteorrest(AbcParser.NoteorrestContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#noteorrest}.
   * @param ctx the parse tree
   */
  void exitNoteorrest(AbcParser.NoteorrestContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#pitch}.
   * @param ctx the parse tree
   */
  void enterPitch(AbcParser.PitchContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#pitch}.
   * @param ctx the parse tree
   */
  void exitPitch(AbcParser.PitchContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#octave}.
   * @param ctx the parse tree
   */
  void enterOctave(AbcParser.OctaveContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#octave}.
   * @param ctx the parse tree
   */
  void exitOctave(AbcParser.OctaveContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#notelength}.
   * @param ctx the parse tree
   */
  void enterNotelength(AbcParser.NotelengthContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#notelength}.
   * @param ctx the parse tree
   */
  void exitNotelength(AbcParser.NotelengthContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#accidental}.
   * @param ctx the parse tree
   */
  void enterAccidental(AbcParser.AccidentalContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#accidental}.
   * @param ctx the parse tree
   */
  void exitAccidental(AbcParser.AccidentalContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#basenote}.
   * @param ctx the parse tree
   */
  void enterBasenote(AbcParser.BasenoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#basenote}.
   * @param ctx the parse tree
   */
  void exitBasenote(AbcParser.BasenoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void enterRest(AbcParser.RestContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void exitRest(AbcParser.RestContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tupletelem}.
   * @param ctx the parse tree
   */
  void enterTupletelem(AbcParser.TupletelemContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tupletelem}.
   * @param ctx the parse tree
   */
  void exitTupletelem(AbcParser.TupletelemContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tupletspec}.
   * @param ctx the parse tree
   */
  void enterTupletspec(AbcParser.TupletspecContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tupletspec}.
   * @param ctx the parse tree
   */
  void exitTupletspec(AbcParser.TupletspecContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#multinote}.
   * @param ctx the parse tree
   */
  void enterMultinote(AbcParser.MultinoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#multinote}.
   * @param ctx the parse tree
   */
  void exitMultinote(AbcParser.MultinoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#barline}.
   * @param ctx the parse tree
   */
  void enterBarline(AbcParser.BarlineContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#barline}.
   * @param ctx the parse tree
   */
  void exitBarline(AbcParser.BarlineContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#nthrepeat}.
   * @param ctx the parse tree
   */
  void enterNthrepeat(AbcParser.NthrepeatContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#nthrepeat}.
   * @param ctx the parse tree
   */
  void exitNthrepeat(AbcParser.NthrepeatContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#bodyvoice}.
   * @param ctx the parse tree
   */
  void enterBodyvoice(AbcParser.BodyvoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#bodyvoice}.
   * @param ctx the parse tree
   */
  void exitBodyvoice(AbcParser.BodyvoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(AbcParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(AbcParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#endofline}.
   * @param ctx the parse tree
   */
  void enterEndofline(AbcParser.EndoflineContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#endofline}.
   * @param ctx the parse tree
   */
  void exitEndofline(AbcParser.EndoflineContext ctx);
}