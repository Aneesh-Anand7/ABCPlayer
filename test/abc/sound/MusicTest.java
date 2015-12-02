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
     *                  two rests
     *                  two chords
     *                  one chord one note
     *                  one chord one concat
     *                  one chord one rest
     *  Duration - (non-cartesian product test)
     *              one note one concat
     *              one chord one rest
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
    public void TestConcatOneConcatOneRest(){
        Pitch C = new Pitch('C');
        Pitch D = new Pitch('D');
        Rest rest = new Rest(1);
        Note c = new Note(1, C);
        Note d = new Note(2, D);
        Concat test = new Concat(c, d);
        Concat newtest = new Concat(test, rest);
        assertEquals(newtest.first(), test);
        assertEquals(newtest.second(), rest);
    }
    
    @Test
    public void TestConcatOneNoteOneRest(){
        Pitch C = new Pitch('C');
        Rest rest = new Rest(1);
        Note c = new Note(1, C);
        Concat test = new Concat(c, rest);
        assertEquals(test.first(), c);
        assertEquals(test.second(), rest);
    }
    
    @Test
    public void TestConcatTwoChords(){
        Pitch C = new Pitch('C');
        Pitch D = new Pitch('D');
        Pitch G = new Pitch('G');
        Pitch F = new Pitch('F');
        Note c = new Note(1, C);
        Note d = new Note(2, D);
        Note g = new Note(3, G);
        Note f = new Note(4, F);
        Chord cd = new Chord(c,d);
        Chord gf = new Chord(g,f);
        Concat both = new Concat(cd, gf);
        assertEquals(both.first(), cd);
        assertEquals(both.second(), gf);
    }
    
    @Test
    public void TestConcatOneChordOneNote(){
        Pitch C = new Pitch('C');
        Pitch D = new Pitch('D');
        Pitch F = new Pitch('F');
        Note c = new Note(1, C);
        Note d = new Note(2, D);
        Note f = new Note(4, F);
        Chord cd = new Chord(c,d);
        Concat both = new Concat(cd, f);
        assertEquals(both.first(), cd);
        assertEquals(both.second(), f);
    }
    
    @Test
    public void TestConcatOneChordOneConcat(){
        Pitch C = new Pitch('C');
        Pitch D = new Pitch('D');
        Pitch F = new Pitch('F');
        Note c = new Note(1, C);
        Note d = new Note(2, D);
        Note f = new Note(4, F);
        Chord cd = new Chord(c,d);
        Chord df = new Chord(d,f);
        Concat both = new Concat(cd, f);
        Concat last = new Concat(both, df);
        assertEquals(last.first(), both);
        assertEquals(last.second(), df);
    }
    
    @Test
    public void TestConcatOneChordOneRest(){
        Pitch C = new Pitch('C');
        Pitch D = new Pitch('D');
        Rest rest = new Rest(1);
        Note c = new Note(1, C);
        Note d = new Note(2, D);
        Chord cd = new Chord(c,d);
        Concat both = new Concat(cd, rest);
        assertEquals(both.first(), cd);
        assertEquals(both.second(), rest);
    }
    
    @Test
    public void TestConcatDurationOneNoteOneConcat(){
        Pitch C = new Pitch('C');
        Pitch D = new Pitch('D');
        Pitch F = new Pitch('F');
        Note c = new Note(1, C);
        Note d = new Note(2, D);
        Note f = new Note(4, F);
        Concat cd = new Concat(c,d);
        Concat cdf = new Concat(cd, f);
        assertEquals(cdf.first(), cd);
        assertEquals(cdf.second(), f);
    }
}
