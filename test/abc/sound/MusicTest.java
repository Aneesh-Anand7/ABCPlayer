package abc.sound;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

/**
 * Tests for the MusicTest abstract data type
 */
public class MusicTest {
    /**
     * Testing Strategy
     * Pitch
     *  Constructor - test ints and chars (valid and invalid)
     *  Transpose = x < -12
     *              -12 < x < 0
     *              0 < x < 12
     *              12 < x
     *  Difference = x < -12
     *              -12 < x < 0
     *              0 < x < 12
     *              12 < x
     *  Less than = less than, equal to, greater than
     *  equals = two same, not same
     *  hashcode
     *  tomidinote
     *  toString
     *  
     * Concat
     *  Constructor - two notes
     *                  one note one concat
     *                  two concats
     *                  one note one rest
     *                  one concat one rest
     *  Duration
     *  Transpose
     *  Play
     *  
     * Music
     *  Constructor
     *  duration - 
     *  transpose -
     *  play
     *  
     * Note
     *  Constructor
     *  duration
     *  transpose
     *  play
     *  
     * Rest
     *  Constructor
     *  durations
     *  transpose
     *  play
     *  
     */
    
    @Test
    public void TestConcatTwoNotes(){
        Pitch C = new Pitch('C');
        Pitch D = new Pitch('D');
        Note c = new Note(1, C);
        Note d = new Note(2, D);
        Concat test = new Concat(c, d);
        assertEquals(test.first(), c);
        assertEquals(test.second(), d);
    }
    
    @Test
    public void TestConcatOneNoteOneConcat(){
        Pitch C = new Pitch('C');
        Pitch D = new Pitch('D');
        Pitch G = new Pitch('G');
        Note c = new Note(1, C);
        Note d = new Note(2, D);
        Note g = new Note(3, G);
        Concat test = new Concat(c, d);
        Concat newtest = new Concat(test, g);
        assertEquals(newtest.first(), test);
        assertEquals(newtest.second(), g);
    }
    
    @Test
    public void TestConcatTwoConcat(){
        Pitch C = new Pitch('C');
        Pitch D = new Pitch('D');
        Pitch G = new Pitch('G');
        Pitch F = new Pitch('F');
        Note c = new Note(1, C);
        Note d = new Note(2, D);
        Note g = new Note(3, G);
        Note f = new Note(4, F);
        Concat first = new Concat(c, d);
        Concat second = new Concat(g, f);
        Concat both = new Concat(first, second);
        assertEquals(both.first(), first);
        assertEquals(both.second(), second);
    }
    
    @Test
    public void TestConcatOneNoteOneRest(){
        Pitch C = new Pitch('C');
        Pitch D = new Pitch('D');
        Pitch G = new Pitch('G');
        Note c = new Note(1, C);
        Note d = new Note(2, D);
        Note g = new Note(3, G);
        Concat test = new Concat(c, d);
        Concat newtest = new Concat(test, g);
        assertEquals(newtest.first(), test);
        assertEquals(newtest.second(), g);
    }
}
