package abc.sound;

/**
 * Abstraction Function: Rest represents a pause in a piece of music and implements the Music interface
 * 
 * Rep Invariant: Rest has a positive duration
 * 
 * Safety from rep exposure: Rest is an immutable type whose field is private and final and is accessed through
 *  a getter method that returns an immutable object
 */
public class Rest implements Music {
    private final double duration;
    
    private void checkRep() {
        assert duration >= 0;
    }
    
    /**
     * Make a Rest that lasts for duration beats
     * @param duration duration in beats, must be >= 0
     */
    public Rest(double duration) {
        this.duration = duration;
        checkRep();
    }
    /**
     * @return duration of this rest
     */
    public double duration() {
        return this.duration;
    }

    /**
     * Rests can't be transposed since they have not pitch value associated with them, so just return a copy of
     * the same rest
     */
    public Music transpose(int semitonesUp) {
        Rest restCopy = new Rest(this.duration);
        checkRep();
        return restCopy;
    }

    /**
     * Play this rest
     * Do nothing since a rest = silence for the declared duration
     */
    public void play(SequencePlayer player, double atBeat) {
        return;

    }

    @Override
    public int hashCode() {
        long durationBits = Double.doubleToLongBits(duration);
        return (int) (durationBits ^ (durationBits >>> 32));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final Rest other = (Rest) obj;
        return duration == other.duration;
    }
    
    @Override
    public String toString() {
        return "." + duration;
    }

    @Override
    public boolean isChord() {
        return false;
    }

    @Override
    public boolean isNote() {
        return false;
    }
}