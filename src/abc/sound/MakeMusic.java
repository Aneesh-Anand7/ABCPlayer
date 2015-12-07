package abc.sound;

import java.util.ArrayList;
import java.util.List;
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
    private Stack<Music> repeat = new Stack<>();
    private boolean inrepeat = false;
    public Music getMusic() {
        return stack.get(0);
    }
    
    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        System.err.println("entering " + arg0.getText() + ", stack is " + stack);

    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        System.err.println("exiting " + arg0.getText() + ", stack is " + stack);

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
        // do nothing, root has only one child so its value is
        // already on top of the stack

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
        
    }
    
    /**
     * Counts occurrences of a desired char in a String
     * @param string - String to be searched
     * @param desired - desired char
     * @return number of occurrences of char in String
     */
    private int countOccurrences(String string, char desired){
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == desired){
                count ++;
            }
        }
        return count;
    }

    @Override
    public void exitNote(NoteContext ctx) {
        double duration = Double.valueOf(ctx.notelength().getText());
        if (ctx.noteorrest().rest() != null){
            Rest rest = new Rest(duration);
            stack.push(rest);
        }
        else{
            char basenote = ctx.noteorrest().pitch().basenote().getText().charAt(0);
            Pitch pitch = new Pitch(basenote);
            String octave = null;
            if(ctx.noteorrest().pitch().octave() != null){
                octave = ctx.noteorrest().pitch().octave().getText();
                int downoctaves = countOccurrences(octave, ',');
                int upoctaves = countOccurrences(octave, "'".charAt(0));
                int change = upoctaves - downoctaves;   //+ means net change up, - mean net change down
                pitch.transpose(change * 12);
            }
            String accidental = null;
            if (ctx.noteorrest().pitch().accidental() != null){
                accidental = ctx.noteorrest().pitch().accidental().getText();
                int numflats = countOccurrences(accidental, '_');
                int numsharps = countOccurrences(accidental, '^');
                //TODO natural accidental implementation
                int netaccidental = numsharps - numflats;
                pitch.transpose(netaccidental);
            }
           Note note = new Note(duration, pitch);
           if(inrepeat){
               repeat.push(note);
           }
           else{
               stack.push(note);
           }
        }
    }

    @Override
    public void enterNoteorrest(NoteorrestContext ctx) {

    }

    @Override
    public void exitNoteorrest(NoteorrestContext ctx) {
     // Handled in exitNote

    }

    @Override
    public void enterPitch(PitchContext ctx) {

    }

    @Override
    public void exitPitch(PitchContext ctx) {
        // Handled in exitNote

    }

    @Override
    public void enterOctave(OctaveContext ctx) {

    }

    @Override
    public void exitOctave(OctaveContext ctx) {
     // Handled in exitNote

    }

    @Override
    public void enterNotelength(NotelengthContext ctx) {

    }

    @Override
    public void exitNotelength(NotelengthContext ctx) {
     // Handled in exitNote

    }

    @Override
    public void enterAccidental(AccidentalContext ctx) {
    }

    @Override
    public void exitAccidental(AccidentalContext ctx) {
        //Handled in exitNote

    }

    @Override
    public void enterBasenote(BasenoteContext ctx) {

    }

    @Override
    public void exitBasenote(BasenoteContext ctx) {
        // Handled in exitNote

    }

    @Override
    public void enterRest(RestContext ctx) {

    }

    @Override
    public void exitRest(RestContext ctx) {
        //Handled in exitNote

    }

    @Override
    public void enterTupletelem(TupletelemContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTupletelem(TupletelemContext ctx) {
        double nplet = Double.valueOf(ctx.tupletspec().DIGIT().getText());
        List<NoteelemContext> noteelems = ctx.noteelem();
        for(NoteelemContext noteelem: noteelems){
            Note note = (Note) stack.pop();
            if (inrepeat){
                repeat.push(new Note(note.duration()/nplet, note.pitch()));
            }
            else{
                stack.push(new Note(note.duration()/nplet, note.pitch()));
            }
        }
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
        List<NoteContext> chordNotes = ctx.note();
        List<Note> chord = new ArrayList<>();
        for(NoteContext notectx: chordNotes){
            Note note = (Note) stack.pop();
            chord.add(note);
        }
        if(inrepeat){
            repeat.push(new Chord(chord));
        }
        else{
            stack.push(new Chord(chord));
        }
    }

    @Override
    public void enterBarline(BarlineContext ctx) {

    }

    @Override
    public void exitBarline(BarlineContext ctx) {
        if (ctx.getText().equals("|:")){
            inrepeat = true;
        }
        else if (ctx.getText().equals(":|")){
            for (int i = 0; i < 2; i ++){
                for (int j = repeat.size() - 1; i >= 0; i--){
                    stack.push(repeat.get(j));
                }
            }
        }

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
