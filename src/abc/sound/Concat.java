package abc.sound;

/**
 * Abstraction function: Concat is a recursive data type that implements the Music interface
 * and represents the concatenation of two Music variant objects (Note, Rest, Chord, Concat).
 * These two objects will be played one right after the other.
 * 
 * Rep Invariant: The first and second music objects are not null;
 *  
 * Safety from Rep Exposure: Concat is an immutable class with private and final fields with immutable object values
 *  that are accessed through getter methods, which thus return immutable objects.
 *
 */
public class Concat implements Music {
    
    private final Music first;
    private final Music second;
    
    private void checkRep() {
        assert first != null;
        assert second != null;
    }
    
    /**
     * Make a Music sequence that plays m1 followed by m2.
     * @param m1 music to play first
     * @param m2 music to play second
     */
    public Concat(Music m1, Music m2) {
        this.first = m1;
        this.second = m2;
        checkRep();
    }

    /**
     * Get the first Music object to be played
     * @return first piece in this concatenation
     */
    public Music first() {
        return first;
    }
    
    /**
     * Get the second Music object to be played
     * @return second piece in this concatenation
     */
    public Music second() {
        return second;
    }
    
    /**
     * Get the duration of the entire concatenation
     * @return duration of this concatenation
     */
    public double duration() {
        return first.duration() + second.duration();
    }
    
    /**
     * Play this concatenation.
     * @
     */
    public void play(SequencePlayer player, double atBeat) {
        int ticksPerBeat = player.getTicks();
        // get atBeat value in tick format
        int atBeatRationalized = (int) (atBeat * ticksPerBeat);
        this.playWithTicks(player, atBeatRationalized);
        
    }

    public void playWithTicks(SequencePlayer player, int atBeat) {
        first.play(player, atBeat);
        int secondBeat = (int) (atBeat + first.duration() * player.getTicksDefaultNote());
        second.play(player, secondBeat);
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        return first.hashCode() + prime * second.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final Concat other = (Concat) obj;
        return first.equals(other.first) && second.equals(other.second);
    }

    @Override
    public String toString() {
        return first.toString() + second.toString();
    }

    @Override
    public abc.sound.Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }

}
