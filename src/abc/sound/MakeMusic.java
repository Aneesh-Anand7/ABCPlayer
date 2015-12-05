package abc.sound;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcListener;
import abc.parser.AbcParser.AccidentalContext;
import abc.parser.AbcParser.BarlineContext;
import abc.parser.AbcParser.BasenoteContext;
import abc.parser.AbcParser.BodyContext;
import abc.parser.AbcParser.BodyvoiceContext;
import abc.parser.AbcParser.CommentContext;
import abc.parser.AbcParser.ElementContext;
import abc.parser.AbcParser.EndoflineContext;
import abc.parser.AbcParser.LineContext;
import abc.parser.AbcParser.MultinoteContext;
import abc.parser.AbcParser.NoteContext;
import abc.parser.AbcParser.NoteelemContext;
import abc.parser.AbcParser.NotelengthContext;
import abc.parser.AbcParser.NoteorrestContext;
import abc.parser.AbcParser.NthrepeatContext;
import abc.parser.AbcParser.OctaveContext;
import abc.parser.AbcParser.PitchContext;
import abc.parser.AbcParser.RestContext;
import abc.parser.AbcParser.RootContext;
import abc.parser.AbcParser.TupletelemContext;
import abc.parser.AbcParser.TupletspecContext;

public class MakeMusic implements AbcListener {
    private Stack<Music> stack = new Stack<>();
    public Music getMusic() {
        return stack.get(0);
    }
    
    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitTerminal(TerminalNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterRoot(RootContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitRoot(RootContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBody(BodyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBody(BodyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterLine(LineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitLine(LineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterElement(ElementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitElement(ElementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNoteelem(NoteelemContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNoteelem(NoteelemContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNote(NoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNote(NoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNoteorrest(NoteorrestContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNoteorrest(NoteorrestContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterPitch(PitchContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitPitch(PitchContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNotelength(NotelengthContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNotelength(NotelengthContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterAccidental(AccidentalContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAccidental(AccidentalContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBasenote(BasenoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBasenote(BasenoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterRest(RestContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitRest(RestContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTupletelem(TupletelemContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTupletelem(TupletelemContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTupletspec(TupletspecContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTupletspec(TupletspecContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBarline(BarlineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBarline(BarlineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNthrepeat(NthrepeatContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNthrepeat(NthrepeatContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBodyvoice(BodyvoiceContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBodyvoice(BodyvoiceContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterComment(CommentContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitComment(CommentContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEndofline(EndoflineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEndofline(EndoflineContext ctx) {
        // TODO Auto-generated method stub

    }

}
