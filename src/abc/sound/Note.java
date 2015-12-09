package abc.sound;

import javax.sound.midi.MidiUnavailableException;

/**
 * Abstraction function: Note is a class that implements the Music interface and represents a single 
 *  musical note
 *  
 * Rep Invariant: Note has a non-negative duration, a pitch, and a designated instrument
 * 
 * Safety from rep exposure: Note is an immutable type and its fields are private and final
 *  and are accessed through getter
 *  functions that return immutable types
 */
public class Note implements Music {
    
    private final double duration;
    private final Pitch pitch;

    private void checkRep() {
        assert duration >= 0;
        assert pitch != null;
    }
    
    /**
     * Make a Note played by instrument for duration beats.
     * @param duration duration in beats, must be >= 0
     * @param pitch pitch to play
     * @param instrument instrument to use
     */
    public Note(double duration, Pitch pitch) {
        this.duration = duration;
        this.pitch = pitch;
        checkRep();
    }
    
    /**
     * Get this note's pitch
     * @return pitch of this note
     */
    public Pitch pitch() {
        return pitch;
    }
    
    /**
     * Get this note's duration
     * @return duration of this note as double
     */
    public double duration() {
        return this.duration;
    }

    /**
     * Transpose this note
     * @param semitonesUp the number of semitones to increase the pitch by
     * @return a new Note with the same duration and a pitch increase by semitonesUp semitones
     */
    public Note transpose(int semitonesUp) {
        Pitch newPitch = this.pitch.transpose(semitonesUp);
        return new Note(this.duration, newPitch);
    }

    /**
     * Play this note
     * @param atBeat: the beat to start at (in ticks) with respect to the beginning of the player
     * @param player the Sequence Player to play this note
     * @throws MidiUnavailableException 
     */
    public void play(SequencePlayer player, double atBeat) {
        int ticksPerBeat = player.getTicksDefaultNote();
        int newDuration = (int) (this.duration * ticksPerBeat);
        player.addNote(this.pitch.toMidiNote(), (int) atBeat, newDuration);
    }
    
    @Override
    public int hashCode() {
        long durationBits = Double.doubleToLongBits(duration);
        return (int) (durationBits ^ (durationBits >>> 32))
                + pitch.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final Note other = (Note) obj;
        return duration == other.duration
                && pitch.equals(other.pitch);
    }

    @Override
    public String toString() {
        return pitch.toString() + duration;
    }

    @Override
    public boolean isChord() {
        return false;
    }

    @Override
    public boolean isNote() {
        return true;
    }
}
