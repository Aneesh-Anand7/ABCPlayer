// Generated from ABCgrammar.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ABCgrammarParser}.
 */
public interface ABCgrammarListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(ABCgrammarParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(ABCgrammarParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#index}.
   * @param ctx the parse tree
   */
  void enterIndex(ABCgrammarParser.IndexContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#index}.
   * @param ctx the parse tree
   */
  void exitIndex(ABCgrammarParser.IndexContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#title}.
   * @param ctx the parse tree
   */
  void enterTitle(ABCgrammarParser.TitleContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#title}.
   * @param ctx the parse tree
   */
  void exitTitle(ABCgrammarParser.TitleContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#key}.
   * @param ctx the parse tree
   */
  void enterKey(ABCgrammarParser.KeyContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#key}.
   * @param ctx the parse tree
   */
  void exitKey(ABCgrammarParser.KeyContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#line}.
   * @param ctx the parse tree
   */
  void enterLine(ABCgrammarParser.LineContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#line}.
   * @param ctx the parse tree
   */
  void exitLine(ABCgrammarParser.LineContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#length}.
   * @param ctx the parse tree
   */
  void enterLength(ABCgrammarParser.LengthContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#length}.
   * @param ctx the parse tree
   */
  void exitLength(ABCgrammarParser.LengthContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#composer}.
   * @param ctx the parse tree
   */
  void enterComposer(ABCgrammarParser.ComposerContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#composer}.
   * @param ctx the parse tree
   */
  void exitComposer(ABCgrammarParser.ComposerContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#meter}.
   * @param ctx the parse tree
   */
  void enterMeter(ABCgrammarParser.MeterContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#meter}.
   * @param ctx the parse tree
   */
  void exitMeter(ABCgrammarParser.MeterContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#tempo}.
   * @param ctx the parse tree
   */
  void enterTempo(ABCgrammarParser.TempoContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#tempo}.
   * @param ctx the parse tree
   */
  void exitTempo(ABCgrammarParser.TempoContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(ABCgrammarParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(ABCgrammarParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#endofline}.
   * @param ctx the parse tree
   */
  void enterEndofline(ABCgrammarParser.EndoflineContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#endofline}.
   * @param ctx the parse tree
   */
  void exitEndofline(ABCgrammarParser.EndoflineContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCgrammarParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(ABCgrammarParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCgrammarParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(ABCgrammarParser.CommentContext ctx);
}