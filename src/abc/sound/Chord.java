package abc.sound;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Chord represents a chord (layered music) in a piece of music
 */
public class Chord implements Music {
    private final List<Note> notes;
    
    // Abstraction function
    //      Chord is a recursive data type that takes in a Note object and a Chord object and represents a musical
    //      chord (multiple notes played at the same time)
    //
    // Representation Invariant
    //      Chord can have
    //          1. Two Note objects, note1 and note2, representing two notes to be played at once
    //          2. A List of Note objects that contains all the notes to be played at once
    //          3. A Chord object and a Note object that should be played at the same time as the chord
    //      Chord must have a duration > 0 and must represent more than one Note
    //
    // Safety from Rep Exposure
    //      Chord is an immutable type and in the case of Lists, defensive copies will be made to prevent
    //      rep exposure

    /* Create a new Chord played for the duration of the first note's duration
     * @param notes the list of notes that are in the chord to be played
     */
    public Chord(List<Note> notes) {
        this.notes = notes;
    }
    /**
     * Based on the definition on the duration of a chord given by the 6.005 Project guidelines, the parser
     * will designate the length of the chord as the length of the first note.
     * So if it sees [A/2B], the length of the chord will be the length of A/2.
     * Thus, this method returns the duration of the first note provided to this object's constructor.
     * @return duration of this chord
     */
    public double duration() {
        return notes.get(0).duration();
    }

    /**
     * Transpose this chord
     * @param semitonesUp the number of semitones to increase the pitch of all of the notes in this chord by
     * @return a new chord with the original notes' pitches increased by semitonesUp semitones
     */
    public Chord transpose(int semitonesUp) {
        List<Note> notesCopy = new ArrayList<Note>(notes);
        for (Music note : notesCopy) {
            note = note.transpose(semitonesUp);
        }
        return new Chord(notesCopy);
    }


    
    /**
     * Play this chord
     * TODO double to int issue
     */
    public void play(SequencePlayer player, double atBeat) {
        int ticksPerBeat = player.getTicks();
        // get atBeat value in tick format
        int atBeatRationalized = (int) (atBeat * ticksPerBeat);
        // 
        for (Note note : notes) {
            int noteTicksDuration = (int) (note.duration() * ticksPerBeat);
            player.addNote(note.pitch().toMidiNote(), atBeatRationalized, noteTicksDuration);
        }

    }

}
