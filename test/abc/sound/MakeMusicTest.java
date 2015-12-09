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

public class MakeMusicTest {

//    @Test
//    public void testMakeMusicInvention() throws IOException, MidiUnavailableException, InvalidMidiDataException {
//        File file = new File("sample_abc/invention.abc");
//        List<String> headbody = SplitHeader.splitHeader(file);
//        System.out.println(headbody.get(1));
//        Map<String, String> header = Music.parseHeader(headbody.get(0));
//        System.out.println(header);
//        Music music = Music.parseBody(headbody.get(1),header).get("music");
//        System.out.println(music);
//        SequencePlayer player = new SequencePlayer(300);
//        music.play(player, 0);
//        player.play();
//        System.in.read();
//    }
//    
//    @Test
//    public void testMakeMusicChord() throws IOException, MidiUnavailableException, InvalidMidiDataException {
//        File file = new File("sample_abc/sample2.abc");
//        Music music = Music.parseBodyFromFile(file).get("music");
//        Pitch first = new Pitch('A');
//        Pitch second = new Pitch('B');
//        Pitch third = new Pitch('C');
//        Pitch fourth = new Pitch('D');
//        Note firstnote = new Note(1, first);
//        Note secondnote = new Note(1, second);
//        Note thirdnote = new Note(1, third);
//        Note fourthnote = new Note(1, fourth);
//        List<Note> chordnotes = new ArrayList<>();
//        chordnotes.add(firstnote);
//        chordnotes.add(secondnote);
//        chordnotes.add(thirdnote);
//        chordnotes.add(fourthnote);
//        Chord chord = new Chord(chordnotes);
//        assertEquals(chord, music);
//    }

    // covers repeat with opening and closing |: ... :|
    @Test

    public void testMakeMusicInvention() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/invention.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
    }
    
    public void testMakeMusicRepeat1() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/repeat1.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(1));
        Map<String, String> header = Music.parseHeader(headbody.get(0));
        System.out.println(header);
        Music music = Music.parseBody(headbody.get(1),header).get("music");
        System.out.println(music);

        SequencePlayer player = new SequencePlayer(file);
        music.play(player, 0);
        player.play();
        System.in.read();
    }
    
    // covers repeat with no opening, only closing :|
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

    public void testMakeMusicRepeat2() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/repeat2.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(1));
        Map<String, String> header = Music.parseHeader(headbody.get(0));
        System.out.println(header);
        Music music = Music.parseBody(headbody.get(1),header).get("music");
        System.out.println(music);
        SequencePlayer player = new SequencePlayer(file);
        music.play(player, 0);
        player.play();
        System.in.read();
    }
    
    // covers repeat starting from end of major piece "|]", closing with :|
    @Test
    public void testMakeMusicRepeat3() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/repeat3.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(1));
        Map<String, String> header = Music.parseHeader(headbody.get(0));
        System.out.println(header);
        Music music = Music.parseBody(headbody.get(1),header).get("music");
        System.out.println(music);
        SequencePlayer player = new SequencePlayer(file);
        music.play(player, 0);
        player.play();
        System.in.read();

    }
}
