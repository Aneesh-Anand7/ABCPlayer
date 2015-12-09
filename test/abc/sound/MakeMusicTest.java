package abc.sound;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

public class MakeMusicTest {

    @Test
    public void testMakeMusicInvention() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/invention.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        SequencePlayer player = new SequencePlayer(file);
        music.play(player, 0);
    }
    
    @Test
    public void testMakeMusicChord() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/sample2.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        Pitch first = new Pitch('A');
        Pitch second = new Pitch('B');
        Pitch third = new Pitch('C');
        Pitch fourth = new Pitch('D');
        Note firstnote = new Note(1, first);
        Note secondnote = new Note(1, second);
        Note thirdnote = new Note(1, third);
        Note fourthnote = new Note(1, fourth);
        List<Note> chordnotes = new ArrayList<>();
        chordnotes.add(firstnote);
        chordnotes.add(secondnote);
        chordnotes.add(thirdnote);
        chordnotes.add(fourthnote);
        
        Chord chord = new Chord(chordnotes);
        assertEquals(music.toString(), "{music=[D,1.0C''1.0B'1.0A1.0]}");
    }
    
    @Test
    public void testMakeMusicNote() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/noteTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        System.err.println(music);
        assertEquals(music.toString(), "{music=B1.0}");
    }
    
    @Test
    public void testMakeMusicRest() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/restTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals(music.toString(), "{music=.1.0}");
    }
    
    @Test
    public void testMakeMusicTuplet() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/tupletTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals(music.toString(), "{music=B0.6666666666666666B0.6666666666666666B0.6666666666666666}");
    }
    @Test
    public void testMakeMusicTupletInsideChord() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/tupletInsideChordTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        System.err.println(music);
        assertEquals(music.toString(), "a");
    }

}
