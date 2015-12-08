package abc.sound;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcListener;
import abc.parser.AbcParser.AccidentalContext;
import abc.parser.AbcParser.BarlineContext;
import abc.parser.AbcParser.BasenoteContext;

import abc.parser.AbcParser.BodyvoiceContext;
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
    private Music fullPiece;
    private Map<String, String> headerInfo;
    
//    public Music getMusic() {
//        return stack.get(0);
//    }
    
    public Music getFullPiece(){
        return fullPiece;
    }
    
    public void setHeaderInfo(Map<String, String> info){
        headerInfo = info;
    }
    
    
    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        //System.err.println("entering " + arg0.getText() + ", stack is " + stack);

    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        //System.err.println("exiting " + arg0.getText() + ", stack is " + stack);

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
        System.err.println("entering root" + ", stack is " + stack);

    }

    @Override
    public void exitRoot(RootContext ctx) {
        // do nothing, root has only one child so its value is
        // already on top of the stack
        //we want to reverse order of stack
        List<Music> reversestack = new ArrayList<>(stack);
        Concat concat = new Concat(reversestack.get(0), reversestack.get(1));
        for (int i = 2; i < reversestack.size(); i ++){
            concat = new Concat(concat, reversestack.get(i));
        }
        fullPiece = concat;
        System.err.println(fullPiece);
        System.err.println("exiting root" + ", stack is " + stack);
    }

    @Override
    public void enterLine(LineContext ctx) {
        // TODO Auto-generated method stub
        System.err.println("entering line" + ", stack is " + stack);
    }

    @Override
    public void exitLine(LineContext ctx) {
        // TODO Auto-generated method stub
        System.err.println("exiting line" + ", stack is " + stack);
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
        System.err.println("entering note" + ", stack is " + stack);
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
        double duration;
        if (ctx.notelength() != null) {
            String text = ctx.notelength().getText();
            // fraction
            if (text.contains("/")) {
                String[] numbers = text.split("/");
                System.err.println(numbers[0]);
                // no numerator or denominator
                if ((numbers[0].length() == 0)&&(numbers[1].length() == 0)) {
                  duration = 1.0;
                  // denominator only
                } else if (numbers[0].length() == 0){
                    duration = 1.0/Double.valueOf(numbers[1]);
                  // numerator only
                } else if (numbers[1].length() == 0){
                    duration = Double.valueOf(numbers[0])/2.0;
                } else {
                    duration = Double.valueOf(numbers[0])/Double.valueOf(numbers[1]);
                }
              // no fraction
            } else {
                duration = Double.valueOf(text);
            }
        } else {
            duration = 1.0;
        }
        if (ctx.noteorrest().rest() != null){
            Rest rest = new Rest(duration);
            stack.push(rest);
        }
        else{
            String basenote = ctx.noteorrest().pitch().basenote().BASENOTE().getText();
            char basenotechar = basenote.charAt(0);
            Pitch pitch;
            if(Character.isLowerCase(basenotechar)){
                basenotechar = basenote.toUpperCase().charAt(0);
                pitch =  new Pitch(basenotechar);
                //(uppercase) C' (C apostrophe) should have the same meaning as (lowercase) c
                pitch = pitch.transpose(12);
            }
            else{
                pitch =  new Pitch(basenotechar);
            }
            String octave = null;
            if(ctx.noteorrest().pitch().octave() != null){
                octave = ctx.noteorrest().pitch().octave().getText();
                int downoctaves = countOccurrences(octave, ',');
                int upoctaves = countOccurrences(octave, "'".charAt(0));
                int change = upoctaves - downoctaves;   //+ means net change up, - mean net change down
                pitch = pitch.transpose(change * 12);
            }
            pitch = pitch.transpose(keyChange(basenote));
            String accidental = null;
            if (ctx.noteorrest().pitch().accidental() != null){
                accidental = ctx.noteorrest().pitch().accidental().getText();
                int numflats = countOccurrences(accidental, '_');
                int numsharps = countOccurrences(accidental, '^');
                //TODO natural accidental implementation
                int netaccidental = numsharps - numflats;
                pitch = pitch.transpose(netaccidental);
            }
           Note note = new Note(duration, pitch);
           if(inrepeat){
               repeat.push(note);
           }
           else{
               stack.push(note);
           }
        }
        System.err.println("exiting note" + ", stack is " + stack);
    }
    
    /**
     * keyChange takes in a basenote and returns an int representing the number of semitones that the 
     * note should be transposed according to the keysignature.
     * @param basenote - the note we are looking to transpose
     * @return - the number of semitones the note should be transposed
     */
    public int keyChange(String basenote){
        Map<String, Integer> accidentalMap = createAccidentalMap();
        String[] flatorder = { "B", "E", "A", "D", "G", "C", "F"};
        String[] sharporder = { "F", "C", "G", "D", "A", "E", "B"};
        String uppercasebasenote = basenote.toUpperCase();
        String key = headerInfo.get("key");
        Integer numAccidentals = accidentalMap.get(key);
        System.err.println(accidentalMap.get(key));
        if(numAccidentals == 0){
            return 0;
        }
        else if (numAccidentals > 0){
            for (int i = 0; i < numAccidentals; i++){
                if (sharporder[i].equals(uppercasebasenote)){
                    return 1;
                }
            }
        }
        else if (numAccidentals < 0){
            numAccidentals = -1 * numAccidentals;
            for (int i = 0; i < numAccidentals; i++){
                if (flatorder[i].equals(uppercasebasenote)){
                    return -1;
                }
            }
        }
        return 0;
    }
    
    public Map<String, Integer> createAccidentalMap(){
        Map<String, Integer> accidentalMap = new HashMap<>();
        accidentalMap.put("C", 0);
        accidentalMap.put("G", 1);
        accidentalMap.put("D", 2);
        accidentalMap.put("A", 3);
        accidentalMap.put("E", 4);
        accidentalMap.put("B", 5);
        accidentalMap.put("F#", 6);
        accidentalMap.put("C#", 7);
        accidentalMap.put("F", -1);
        accidentalMap.put("Bb", -2);
        accidentalMap.put("Eb", -3);
        accidentalMap.put("Ab", -4);
        accidentalMap.put("Db", -5);
        accidentalMap.put("Gb", -6);
        accidentalMap.put("Cb", -7);
        accidentalMap.put("D", 2);
        accidentalMap.put("Dmaj", 2);
        accidentalMap.put("Dmajor", 2);
        accidentalMap.put("Dm", -1);
        accidentalMap.put("Dmin", -1);
        accidentalMap.put("Dminor", -1);
        accidentalMap.put("Am", 0);
        accidentalMap.put("DDor", 0);
        accidentalMap.put("DDorian", 0);
        accidentalMap.put("ELyd", 0);
        accidentalMap.put("DMix", 1);
        accidentalMap.put("DPhr", -2);
        accidentalMap.put("DLyd", 3);
        return accidentalMap;
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
        System.err.println("entering tupletelem" + ", stack is " + stack);
    }

    @Override
    public void exitTupletelem(TupletelemContext ctx) {
        double nplet = Double.valueOf(ctx.tupletspec().TUPLETSPEC().getText().substring(1));
        List<NoteelemContext> noteelems = ctx.noteelem();
        for(NoteelemContext noteelem: noteelems){
            Note note = (Note) stack.pop();
            Note tupletnote = new Note(note.duration()/nplet, note.pitch());
            if (inrepeat){
                repeat.push(tupletnote);
            }
            else{
                stack.push(tupletnote);
            }
        }
        System.err.println("exiting tupletelem" + ", stack is " + stack);
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
        System.err.println("entering multinote" + ", stack is " + stack);

    }

    @Override
    public void exitMultinote(MultinoteContext ctx) {
        List<NoteContext> chordNotes = ctx.note();
        List<Note> chord = new ArrayList<>();
        for(NoteContext notectx: chordNotes){
            Note note = (Note) stack.pop();
            chord.add(note);
        }
        Chord newchord = new Chord(chord);
        if(inrepeat){
            repeat.push(newchord);
        }
        else{
            stack.push(newchord);
        }
        System.err.println("exiting multinote" + ", stack is" + stack);
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
                    System.err.println(j);
                    stack.push(repeat.get(j));
                }
            }
        }
        else if (ctx.getText().equals("||")){
            //we want to reverse order of stack
            List<Music> reversestack = new ArrayList<>(stack);
            Concat concat = new Concat(reversestack.get(0), reversestack.get(1));
            for (int i = 2; i < reversestack.size(); i ++){
                concat = new Concat(concat, reversestack.get(i));
            }
            fullPiece = concat;
        }
        System.err.println("exiting barline" + ", stack is " + stack);
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
    public void enterEndofline(EndoflineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEndofline(EndoflineContext ctx) {
        // TODO Auto-generated method stub

    }

}
