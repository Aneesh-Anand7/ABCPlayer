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
    
    @Test
    public void testMakeMusicRepeat4() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/repeat4.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(1));
        Map<String, String> header = Music.parseHeader(headbody.get(0));
        System.out.println(header);
        Music music = Music.parseBody(headbody.get(1),header).get("music");
        System.out.println(music);
        SequencePlayer player = new SequencePlayer(file);
        music.play(player, 0);
        player.play();
        // |: C D E F |[1 G A B c | G A B B :|[2 F E D C |
        // Should be played as C D E F G A B c G A B B C D E F F E D C
        assertEquals(music.toString(), "Concat(Concat(Concat(Concat(Concat(Concat(Concat(Concat(Concat(Concat(Concat"
                + "(Concat(Concat(Concat(Concat(Concat(Concat(Concat(Concat(Concat(Concat(Concat(Concat"
                + "(C1.0 D1.0) E1.0) F1.0) G1.0) A1.0) B1.0) C'1.0) G1.0) A1.0) B1.0) B1.0) C1.0) D"
                + "1.0) E1.0) F1.0) F1.0) E1.0) D1.0) C1.0)");
        System.in.read();
        
    }
}
