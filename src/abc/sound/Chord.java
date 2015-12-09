package abc.sound;

import java.util.ArrayList;
import java.util.List;

/**
 * Chord represents a chord (layered music) in a piece of music
 */
public class Chord implements Music {
    private final List<Note> notes;
    private final double duration;

    // Abstraction function
    //      Chord is a recursive data type that takes in a list of Note objects that represent a musical chord
    //           consisting of the notes represented by these Note objects (multiple notes played at the same time)
    //      The duration of the chord is the same as the duration of the first note in the notes list.
    //
    // Representation Invariant
    //      Chord must have a duration > 0
    //      Notes list must not be empty
    //
    // Safety from Rep Exposure
    //      Chord is an immutable type and in the case of Lists, defensive copies will be made to prevent
    //      rep exposure

    /* Create a new Chord played for the duration of the first note's duration
     * @param notes the list of notes that are in the chord to be played
     */
    public Chord(List<Note> notelist) {
        notes = new ArrayList<>();
        for(Note note: notelist){
            notes.add(note);
        }
        duration = notes.get(0).duration();
        checkRep();
    }

    private void checkRep() {
        assert duration > 0;
        assert notes.size() > 0;
    }
    /**
     * Get the list of notes in this chord
     * @return List of Note objects in this chord
     */
    public List<Note> getNotes() {
        List<Note> copyNotes = new ArrayList<Note>(notes);
        return copyNotes;
    }
    /**
     * Based on the definition on the duration of a chord given by the 6.005 Project guidelines, the parser
     * will designate the length of the chord as the length of the first note.
     * So if it sees [A/2B], the length of the chord will be the length of A/2.
     * Thus, this method returns the duration of the first note provided to this object's constructor.
     * @return duration of this chord
     */
    public double duration() {
        checkRep();
        return duration;
    }

    /**
     * Transpose this chord
     * @param semitonesUp the number of semitones to increase the pitch of all of the notes in this chord by
     * @return a new chord with the original notes' pitches increased by semitonesUp semitones
     */
    public Chord transpose(int semitonesUp) {
        List<Note> notesCopy = new ArrayList<Note>(notes);
        for (Note note : notesCopy) {
            note = note.transpose(semitonesUp);
        }
        checkRep();
        return new Chord(notesCopy);
    }



    /**
     * Play this chord
     * @param player the Sequence Player that will play this chord. The Sequence Player's number of ticks per beat 
     *      must be a common multiple of the denominator of every note's fractional duration in the chord. For example,
     *      if the chord contains notes with durations 1/4, 3/8, 1/64, the sequence player's number of ticks per beat
     *      must at least be 64.
     * @param atBeat the starting beat number (in ticks) for the chord
     * Plays this chord.
     *
     */
    public void play(SequencePlayer player, double atBeat) {
        int ticksPerBeat = player.getTicksDefaultNote();
        // get atBeat value in tick format
        //int atBeatRationalized = (int) (atBeat * ticksPerBeat);
        int noteTicksDuration = (int) (duration() * ticksPerBeat);
        checkRep();
        for (Note note : notes) {
            int thisNoteDuration = (int) (note.duration() * ticksPerBeat);
            player.addNote(note.pitch().toMidiNote(), (int) atBeat, thisNoteDuration);
        }

    }
    @Override
    public String toString() {
        String s = "[";
        for (Note note: notes) {
            s += note.toString();
        }
        s += "]";
        return s;
    }
    @Override
    public boolean isChord() {
        return true;
    }
    @Override
    public boolean isNote() {
        return false;
    }

}
