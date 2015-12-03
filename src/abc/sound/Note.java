package abc.sound;


/**
 * Note represents a note played by a piano? 
 */
public class Note implements Music {
    
    private final double duration;
    private final Pitch pitch;
    private final Instrument instrument = Instrument.PIANO;

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
     * @return pitch of this note
     */
    public Pitch pitch() {
        return pitch;
    }
    
    /**
     * @return duration of this note
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
     *TODO find out solution to double to int issue
     */
    public void play(SequencePlayer player, double atBeat) {
        int ticksPerBeat = player.getTicks();
        int newDuration = (int) (this.duration * ticksPerBeat);
//        player.addNote(this.pitch.toMidiNote(), atBeat, newDuration);
        
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
}
