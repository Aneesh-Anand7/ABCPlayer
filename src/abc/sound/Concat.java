package abc.sound;

import music.Concat;
import music.Music;
import music.SequencePlayer;
/**
 * Abstraction function: Concat is a recursive data type that implements the Music interface
 * and represents the concatenation of two Music 
 * variant objects. These are two things that will be played one after the other
 * 
 * Rep Invariant: Concat has two private, final fields, "first" and "second" representing the first and second
 *  notes/chords/rest to be played, respectively. Both first and second are Music variant types.
 *  
 * Safety from Rep Exposure: Concat is an immutable class whose fields are private and final and are accessed
 *  through getter methods that return immutable objects
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
     * @return first piece in this concatenation
     */
    public Music first() {
        return first;
    }
    
    /**
     * @return second piece in this concatenation
     */
    public Music second() {
        return second;
    }
    
    /**
     * @return duration of this concatenation
     */
    public double duration() {
        return first.duration() + second.duration();
    }
    
    /**
     * Play this concatenation.
     */
    public void play(SequencePlayer player, double atBeat) {
        first.play(player, atBeat);
        second.play(player, atBeat + first.duration());
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
        return first + " " + second;
    }

    @Override
    public abc.sound.Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }

}
