package abc.sound;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

public class MakeMusicTest {

    @Test
    public void testMakeMusicInvention() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/invention.abc");
        Music music = Music.parseBodyFromFile(file);
        SequencePlayer player = new SequencePlayer(120);
        music.play(player, 0);
    }
    
    @Test
    public void testMakeMusicChord() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/sample2.abc");
        Music music = Music.parseBodyFromFile(file);
        Pitch first = Pitch('A');
        Pitch second = Pitch('B');
        Pitch third = Pitch('C');
        Pitch fourth = Pitch('D');
        Note firstnote = Note(1, first);
        Note secondnote = Note(1, second);
        Note thirdnote = Note(1, third);
        Note fourthnote = Note(1, fourth);
        List<Note> chordnotes = new ArrayList<>();
        chordnotes.add(firstnote);
        chordnotes.add(secondnote);
        chordnotes.add(thirdnote);
        chordnotes.add(fourthnote);
        Chord chord = new Chord(chordnotes);
        assertEquals(chord, music);
    }

}
