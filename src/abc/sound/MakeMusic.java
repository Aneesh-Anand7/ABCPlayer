package abc.sound;

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

    private Stack<Music> before1st = new Stack<>();

    // start off thinking we are inside a repeat

    private boolean inrepeat = true;

    private boolean altEnding = false;

    private Music fullPiece;

    private Map<String, String> headerInfo;

    private Map<String, Stack<Music>> voiceMusic = new HashMap<>();

    private Map<String, Music> finalVoiceMusic = new HashMap<>();

    private String currentVoice = "defaultvoice";
    
    private Map<String, Integer> measureAccidentals = new HashMap<>();

    // public Music getMusic() {

    // return stack.get(0);

    // }

    // public Music getFullPiece(){

    // return fullPiece;

    // }

    public Map<String, Music> getFullPiece() {

        Map<String, Music> returnMap = new HashMap<>();

        returnMap.put("music", fullPiece);

        return returnMap;

    }

    public void setHeaderInfo(Map<String, String> info) {

        headerInfo = info;

    }

    public Map<String, Music> getPieceMap() {

        return finalVoiceMusic;

    }

    @Override

    public void enterEveryRule(ParserRuleContext arg0) {

        // System.err.println("entering " + arg0.getText() + ", stack is " +
        // stack);

    }

    @Override

    public void exitEveryRule(ParserRuleContext arg0) {

        // System.err.println("exiting " + arg0.getText() + ", stack is " +
        // stack);

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

        // System.err.println("entering root" + ", stack is " + stack);

    }

    @Override

    public void exitRoot(RootContext ctx) {

        if (headerInfo.containsKey("voices")) {

            voiceMusic.put(currentVoice, repeat);
            for (String key : voiceMusic.keySet()) {
                Stack<Music> thisstack = voiceMusic.get(key);
                List<Music> reversestack = new ArrayList<>(thisstack);
                if (reversestack.size() >= 2) {
                    Concat concat = new Concat(reversestack.get(0), reversestack.get(1));
                    for (int i = 2; i < reversestack.size(); i++) {
                        concat = new Concat(concat, reversestack.get(i));
                    }
                    finalVoiceMusic.put(key, concat);
                    // only one thing in the stack, just put it in the final map
                    // as is
                } else {
                    finalVoiceMusic.put(key, voiceMusic.get(key).pop());
                }
            }
        } else {
            // place what ever is left in repeat into stack
            for (int j = 0; j <= repeat.size() - 1; j++) {
                stack.push(repeat.get(j));
            }

            // we want to reverse order of stack

            List<Music> reversestack = new ArrayList<>(stack);

            if (reversestack.size() >= 2) {

                Concat concat = new Concat(reversestack.get(0), reversestack.get(1));

                for (int i = 2; i < reversestack.size(); i++) {

                    concat = new Concat(concat, reversestack.get(i));

                }

                fullPiece = concat;

                // only one thing in the stack, just return it

            } else {

                fullPiece = reversestack.get(0);

            }

            // System.err.println(fullPiece);

            // System.err.println("exiting root" + ", stack is " + stack);

        }

    }

    @Override

    public void enterLine(LineContext ctx) {

        // TODO Auto-generated method stub

        // System.err.println("entering line" + ", stack is " + stack);

    }

    @Override

    public void exitLine(LineContext ctx) {

        // TODO Auto-generated method stub

        // System.err.println("exiting line" + ", stack is " + stack);

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

        // System.err.println("entering note" + ", stack is " + stack);

    }

    
    /**
     * TODO put in spec - user can have double sharp or double flat, but not any combination including 
     * a natural, (eg. #= or =b)
     */
    /**
     * 
     * Counts occurrences of a desired char in a String
     * 
     * @param string
     *            - String to be searched
     * 
     * @param desired
     *            - desired char
     * 
     * @return number of occurrences of char in String
     * 
     */

    private int countOccurrences(String string, char desired) {

        int count = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == desired) {

                count++;

            }

        }

        return count;

    }

    @Override

    public void exitNote(NoteContext ctx) {

        System.out.println("leaving the note" + ctx.getText());

        double duration;

        if (ctx.notelength() != null) {

            String text = ctx.notelength().getText();

            // fraction

            if (text.contains("/")) {

                String[] numbers = text.split("/");

                // no numerator or denominator

                if (numbers.length == 0) {

                    duration = 1.0;

                    // denominator only

                } else if (numbers[0].length() == 0) {

                    duration = 1.0 / Double.valueOf(numbers[1]);

                    // numerator only

                } else if (numbers.length == 1) {

                    duration = Double.valueOf(numbers[0]) / 2.0;

                } else {

                    duration = Double.valueOf(numbers[0]) / Double.valueOf(numbers[1]);

                }

                // no fraction

            } else {

                duration = Double.valueOf(text);

            }

        } else {

            duration = 1.0;

        }

        if (ctx.noteorrest().rest() != null) {

            Rest rest = new Rest(duration);

            repeat.push(rest);

        }

        else {

            String basenote = ctx.noteorrest().pitch().basenote().BASENOTE().getText();

            char basenotechar = basenote.charAt(0);

            Pitch pitch;

            if (Character.isLowerCase(basenotechar)) {

                basenotechar = basenote.toUpperCase().charAt(0);

                pitch = new Pitch(basenotechar);

                // (uppercase) C' (C apostrophe) should have the same meaning as
                // (lowercase) c

                pitch = pitch.transpose(12);

            }

            else {

                pitch = new Pitch(basenotechar);

            }

            String octave = null;

            if (ctx.noteorrest().pitch().octave() != null) {

                octave = ctx.noteorrest().pitch().octave().getText();

                int downoctaves = countOccurrences(octave, ',');

                int upoctaves = countOccurrences(octave, "'".charAt(0));

                int change = upoctaves - downoctaves; // + means net change up,
                                                      // - mean net change down

                pitch = pitch.transpose(change * 12);

            }

            pitch = pitch.transpose(keyChange(basenote));

            String accidental = null;

            if (ctx.noteorrest().pitch().accidental() != null) {

                accidental = ctx.noteorrest().pitch().accidental().getText();

                int numflats = countOccurrences(accidental, '_');

                int numsharps = countOccurrences(accidental, '^');
                
                int numnaturals = countOccurrences(accidental, '=');
                
                int naturalchange = 0;
                
                if(measureAccidentals.containsKey(basenote)){
                    naturalchange = -1 * measureAccidentals.get(basenote);
                }

                // TODO natural accidental implementation

                int netaccidental = numsharps - numflats + numnaturals * naturalchange;
                
                if(numnaturals > 0){
                    measureAccidentals.put(basenote, 0);
                }
                else{
                    measureAccidentals.put(basenote, netaccidental);
                }

                pitch = pitch.transpose(netaccidental);

            }

            Note note = new Note(duration, pitch);

            if (inrepeat) {

                repeat.push(note);

            }

        }

        // System.err.println("exiting note" + ", stack is " + stack);

    }

    /**
     * 
     * keyChange takes in a basenote and returns an int representing the number
     * of semitones that the
     * 
     * note should be transposed according to the keysignature.
     * 
     * @param basenote
     *            - the note we are looking to transpose
     * 
     * @return - the number of semitones the note should be transposed
     * 
     */

    public int keyChange(String basenote) {

        Map<String, Integer> accidentalMap = createAccidentalMap();

        String[] flatorder = { "B", "E", "A", "D", "G", "C", "F" };

        String[] sharporder = { "F", "C", "G", "D", "A", "E", "B" };

        String uppercasebasenote = basenote.toUpperCase();

        String key = headerInfo.get("key");

        Integer numAccidentals = accidentalMap.get(key);
        
        Integer measureEffect = 0;
        
        if(measureAccidentals.containsKey(basenote)){
            measureEffect = measureAccidentals.get(basenote);
        }

        if (numAccidentals != null) {

            if (numAccidentals == 0) {

                return 0 + measureEffect;

            }

            else if (numAccidentals > 0) {

                for (int i = 0; i < numAccidentals; i++) {

                    if (sharporder[i].equals(uppercasebasenote)) {

                        return 1 + measureEffect;

                    }

                }

            }

            else if (numAccidentals < 0) {

                numAccidentals = -1 * numAccidentals;

                for (int i = 0; i < numAccidentals; i++) {

                    if (flatorder[i].equals(uppercasebasenote)) {

                        return -1 + measureEffect;

                    }

                }

            }
        }

        return 0 + measureEffect;

    }

    public Map<String, Integer> createAccidentalMap() {

        Map<String, Integer> accidentalMap = new HashMap<>();

        accidentalMap.put("C", 0);

        accidentalMap.put("G", 1);

        accidentalMap.put("D", 2);

        accidentalMap.put("A", 3);

        accidentalMap.put("E", 4);

        accidentalMap.put("B", 5);

        accidentalMap.put("F#", 6);

        accidentalMap.put("C#", 7);

        accidentalMap.put("Am", 0);

        accidentalMap.put("Em", 1);

        accidentalMap.put("Bm", 2);

        accidentalMap.put("F#m", 3);

        accidentalMap.put("C#m", 4);

        accidentalMap.put("G#m", 5);

        accidentalMap.put("D#m", 6);

        accidentalMap.put("A#m", 7);

        accidentalMap.put("F", -1);

        accidentalMap.put("Bb", -2);

        accidentalMap.put("Eb", -3);

        accidentalMap.put("Ab", -4);

        accidentalMap.put("Db", -5);

        accidentalMap.put("Gb", -6);

        accidentalMap.put("Cb", -7);

        accidentalMap.put("Dm", -1);

        accidentalMap.put("Gm", -2);

        accidentalMap.put("Cm", -3);

        accidentalMap.put("Fm", -4);

        accidentalMap.put("Bbm", -5);

        accidentalMap.put("Ebm", -6);

        accidentalMap.put("Abm", -7);

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

        // Handled in exitNote

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

        // Handled in exitNote

    }

    @Override

    public void enterTupletelem(TupletelemContext ctx) {

        // TODO Auto-generated method stub

        // System.err.println("entering tupletelem" + ", stack is " + stack);

    }

    @Override

    public void exitTupletelem(TupletelemContext ctx) {

        double nplet = Double.valueOf(ctx.tupletspec().TUPLETSPEC().getText().substring(1));

        List<NoteelemContext> noteelems = ctx.noteelem();

        List<Music> tuplets = new ArrayList<>();

        int counter = (int) nplet;

        // Only need to include as many notes in the tuplet that are given by
        // the nplet

        while (counter > 0) {

            // System.err.println(noteelem.getText() + " " + + nplet);

            Music item = repeat.pop();

            if (item.isNote()) {

                Note note = (Note) item;

                Note tupletnote;

                if (nplet == 3) {

                    tupletnote = new Note(note.duration() * 2 / nplet, note.pitch());

                } else if (nplet == 2) {

                    tupletnote = new Note(note.duration() * 3 / nplet, note.pitch());

                    // should equal 4 - SPEC

                } else {

                    tupletnote = new Note(note.duration() * 3 / nplet, note.pitch());

                }

                tuplets.add(tupletnote);

            }

            counter -= 1;

            // reverse the order because stacks are last in first out

        }
        for (int i = tuplets.size() - 1; i >= 0; i--) {

            repeat.push(tuplets.get(i));
        }

        // System.err.println("exiting tupletelem" + ", stack is " + stack);
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

        // System.err.println("entering multinote" + ", stack is " + stack);

    }

    @Override

    public void exitMultinote(MultinoteContext ctx) {

        List<NoteContext> chordNotes = ctx.note();

        System.err.println(chordNotes);

        System.err.println(stack);

        List<Note> chord = new ArrayList<>();

        for (NoteContext notectx : chordNotes) {

            Note note = (Note) repeat.pop();

            chord.add(note);

        }

        Chord newchord = new Chord(chord);

        repeat.push(newchord);

        // System.err.println("exiting multinote" + ", stack is" + stack);

    }

    @Override

    public void enterBarline(BarlineContext ctx) {

    }

    @Override

    public void exitBarline(BarlineContext ctx) {
        if(ctx != null){
            measureAccidentals.clear();
        }

        if (ctx.getText().equals("|:") || ctx.getText().equals("[|") || ctx.getText().equals("||")

        || ctx.getText().equals("|]")) {

            System.out.println("at beginning of repeat");

            for (int j = 0; j <= repeat.size() - 1; j++) {

                stack.push(repeat.get(j));

                System.out.println("stack: " + stack);

                System.out.println("before1st: " + before1st);

                System.out.println("repeat: " + repeat);

            }

            inrepeat = true;

            repeat = new Stack<>();

        }

        else if (ctx.getText().equals(":|")) {

            if (repeat.size() > 0 && !(altEnding)) {

                System.out.println("at end of repeat");

                for (int i = 0; i < 2; i++) {

                    for (int j = 0; j <= repeat.size() - 1; j++) {

                        stack.push(repeat.get(j));

                        System.out.println("stack: " + stack);

                        System.out.println("before1st: " + before1st);

                        System.out.println("repeat: " + repeat);

                    }

                }

                repeat = new Stack<>();

            }

            if (altEnding) {

                System.out.println("at end of first alternate ending");

                for (int j = 0; j <= repeat.size() - 1; j++) {

                    stack.push(repeat.get(j));

                    System.out.println("stack: " + stack);

                    System.out.println("before1st: " + before1st);

                    System.out.println("repeat: " + repeat);

                }

                for (int k = 0; k <= before1st.size() - 1; k++) {

                    stack.push(before1st.get(k));

                    System.out.println("stack: " + stack);

                    System.out.println("before1st: " + before1st);

                    System.out.println("repeat: " + repeat);

                }

                repeat = new Stack<>();

                before1st = new Stack<>();

                altEnding = false;

            }

        }

    }

    @Override

    public void enterNthrepeat(NthrepeatContext ctx) {

        // TODO Auto-generated method stub

    }

    @Override

    public void exitNthrepeat(NthrepeatContext ctx) {

        if (ctx.getText().equals("[1")) {

            System.out.println("Found beginning of first alternate ending");

            for (int j = 0; j <= repeat.size() - 1; j++) {

                before1st.push(repeat.get(j));

                System.out.println("repeat: " + repeat);

                System.out.println("before1st: " + before1st);

                System.out.println("stack: " + stack);

                altEnding = true;

            }

        }

        else if (ctx.getText().equals("[2")) {

            System.out.println("Beginning of second alt ending");

            altEnding = false;

            System.out.println("repeat: " + repeat);

            System.out.println("before1st: " + before1st);

            System.out.println("stack: " + stack);

        }

    }

    @Override

    public void enterBodyvoice(BodyvoiceContext ctx) {

        // TODO Auto-generated method stub

    }

    @Override

    public void exitBodyvoice(BodyvoiceContext ctx) {

        if (currentVoice != null && repeat.size() > 0) {

            voiceMusic.put(currentVoice, repeat);

        }

        currentVoice = ctx.BODYVOICE().getText();

        if (currentVoice != null) {

            System.err.println(currentVoice);

            if (voiceMusic.containsKey(currentVoice)) {

                repeat = voiceMusic.get(currentVoice);

            }

            else {

                repeat = new Stack<Music>();

            }

        }

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
