package abc.sound;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.parser.SplitHeader;
/*
 * Tests for didit
 */
public class MakeMusicTest {

        
    //Testing strategy:
    // Notes:
    //  - Multiple octaves
    //  - Multiple key signatures
    //  - Different lengths (num/num), /num, /, num/, num
    // Rests:
    //  - Different lengths (num/num), /num, /, num/, num
    // Barlines:
    //  - Combinations of |, [|, ||, or |]
    // Accidentals
    //  - Sharps, flats, naturals, combinations of them
    //  - Doubled accidentals
    //  - Overriding accidentals
    // Chords
    // - Different #'s of notes
    // - Accidentals
    // - Different lengths
    // Tuplets
    // - Quadruplets, triplets, duplets
    // - Larger number of notes in tuplet than specified
    // - Different lengths
    // - Chords in tuplets
    // Repeats
    // - Contains |:, doesn't contains :|
    // - Major section repeat or beginning repeat
    // - Multiple repeats
    // - Alternate endings
    // Voices
    // - 1, 2, 3 voices
    // - Interleaved vs. entirety
    // - Voices and repeats

    @Test
    public void testMakeMusicFromChord() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/sample2.abc");
        Music music = Music.parseBodyFromFile(file).get("music");
        Pitch first = new Pitch('A');
        Pitch second = new Pitch('B').transpose(12);
        Pitch third = new Pitch('C').transpose(24);
        Pitch fourth = new Pitch('D').transpose(-12);
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
        assertEquals(chord, music);
    }

    @Test
    public void testLengths() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/lengths.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        Music toPlay = music.get("music");
        assertEquals("{music=A0.25 A0.25 A0.5 A1.0 A2.0 A3.0 A4.0 A6.0 A8.0 A,0.25 A,0.25 A,0.5 A,1.0 A,2.0 A,3.0 A,4.0 A,6.0 A,8.0}",music.toString());
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
        assertEquals("{music=[A1.0B'1.0C''1.0D,1.0]}",music.toString());
    }

    @Test
    public void testMakeMusicNote() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/noteTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals("{music=B1.0}",music.toString());
    }

    @Test
    public void testMakeMusicRest() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/restTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals("{music=.1.0}",music.toString());
    }
    @Test
    public void testAccidentalChord() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/chords_accidental.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals("{music=A1.0 [A2.0^A2.0C2.0^A2.0] ^A1.0 A1.0 C1.0 A1.0}",music.toString());
    }
    @Test
    public void testMakeMusicTuplet() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/tupletTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals("{music=G0.6666666666666666 E'0.6666666666666666 G'0.6666666666666666 A'1.0 F'0.5 G'0.5 .0.5 E'1.0 C'0.5 D'0.5 B0.75 .0.75 B0.75 C'0.75 D'0.75 E'0.75 F'1.0 F'1.0 F'1.0 B1.5 C'1.5 D'1.0 D'1.0 D'1.0}", music.toString());
    }
    @Test
    public void testMakeMusicTupletChord() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/tupletChord.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals("{music=G0.6666666666666666 A1.3333333333333333 E0.6666666666666666 B1.0 C1.0 A1.5 [B0.75C0.75] A1.0 B1.0 C1.0}", music.toString());
    }
    @Test
    public void testMakeMusicMusicBeforeVoices() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/musicBeforeVoiceTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals("{V:1\n"+
                "=C'1.0 B1.0 A1.0 G1.0 F1.0 E1.0 D1.0 C1.0, V:2\n"+
                "=C1.0 B,1.0 A,1.0 G,1.0 F,1.0 E,1.0 D,1.0 C,1.0, defaultvoice=C1.0 D1.0 E1.0 F1.0 G1.0 A1.0 B1.0 C'1.0}", music.toString());
    }

    //tests the behavior of accidentals such as persisting through a whole measure, only applying to one
    //octave, and being overridden by future accidentals, also handling naturals
    @Test
    public void testMakeMusicAccidentals() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/accidentalTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals("{music=B'1.0 B'1.0 B1.0 ^C'1.0 ^C'1.0 ^C'1.0 B'1.0 B'1.0 B'1.0 B'1.0 ^C'1.0 ^C'1.0 C'1.0 C'1.0 B,1.0 B,1.0 C1.0 C1.0}",music.toString());
    }
    @Test
    public void testMakeMusicDoubleAccidentals() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/accidentalTest2.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals("{music=B'1.0 B'1.0 B1.0 B1.0 ^C'1.0 ^C'1.0 B'1.0 B'1.0 C'1.0 C'1.0 C'1.0 C'1.0 ^A,1.0 ^A,1.0 C1.0 C1.0}",music.toString());
    }

    @Test
    public void testMakeMusicOctaves() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/octaves.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals("{music=C,1.0 D,1.0 E,1.0 F,1.0 G,1.0 A,1.0 B,1.0 C1.0 D1.0 E1.0 F1.0 G1.0 A1.0 B1.0 C'1.0 D'1.0 E'1.0 F'1.0 G'1.0 A'1.0 B'1.0 C''1.0 D''1.0 E''1.0 F''1.0 G''1.0 A''1.0 B''1.0}",music.toString());
    }
    @Test
    public void testMakeMusicScale() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/scale.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals("{music=C1.0 D1.0 E1.0 F1.0 G1.0 A1.0 B1.0 C'1.0 C'1.0 B1.0 A1.0 G1.0 F1.0 E1.0 D1.0 C1.0}",music.toString());
    }
}
