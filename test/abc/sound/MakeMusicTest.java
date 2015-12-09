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
    // TODO
    //  - Sharps, flats, naturals, combinations of them
    //  - Doubled accidentals
    //  - Overriding accidentals
    // Chords
    // TODO
    // - Different #'s of notes
    // - Accidentals
    // - Different lengths
    // Tuplets
    // - Quadruplets, triplets, duplets
    // - Larger number of notes in tuplet than specified
    // TODO
    // - Chords in tuplet
    // - Different lengths
    // Repeats
    // - Contains |:, doesn't contains :|
    // - Major section repeat or beginning repeat
    // - Multiple repeats
    // - Alternate endings
    // Voices
    // - 1, 2, 3 voices
    // TODO
    // - Voices from start of piece, voices in middle of piece
    // - Interleaved vs. entirety
    // - Voices and repeats


    @Test
    public void testMakeMusicInvention() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        //TODO
        File file = new File("sample_abc/invention.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
    }

    @Test
    public void testLengths() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/lengths.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        Music toPlay = music.get("music");
        assertEquals(music.toString(),"{music=A0.25 A0.25 A0.5 A1.0 A2.0 A3.0 A4.0 A6.0 A8.0 A,0.25 A,0.25 A,0.5 A,1.0 A,2.0 A,3.0 A,4.0 A,6.0 A,8.0}");
    }
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
        assertEquals(music.toString(), "{music=G0.6666666666666666 E'0.6666666666666666 G'0.6666666666666666 A'1.0 F'0.5 G'0.5 .0.5 E'1.0 C'0.5 D'0.5 B0.75 .0.75 B0.75 C'0.75 D'0.75 E'0.75 F'1.0 F'1.0 F'1.0 B1.5 C'1.5 D'1.0 D'1.0 D'1.0}");
    }
    @Test
    public void testMakeMusicTupletInsideChord() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        //TODO
        File file = new File("sample_abc/tupletInsideChordTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        System.err.println(music);
        assertEquals(music.toString(), "a");
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
        //C D E F | G A B c |] C C C B :|
        System.in.read();
    }

    @Test
    public void testMakeMusicMusicBeforeVoices() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/musicBeforeVoiceTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals(music.toString(), "{V:1=D1.0 D1.0 D1.0 C1.0 C1.0 C1.0 C1.0 C'1.0, V:2=C1.0 C1.0 C1.0 C'1.0 D1.0 D1.0 D1.0 C1.0, defaultvoice=C1.0 D1.0 E1.0 F1.0 G1.0 A1.0 B1.0 C'1.0}");
    }

    @Test
    public void testMakeMusicAccidentals() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/accidentalTest.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals(music.toString(), "{music=B'1.0 B'1.0 B1.0 C'1.0 C'1.0 C'1.0 B'1.0 B'1.0 B'1.0 B'1.0 C'1.0 C'1.0 C'1.0 C'1.0 B,1.0 B,1.0 C1.0 C1.0}");
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
        assertEquals(music.toString(), "C1.0 D1.0 E1.0 F1.0 G1.0 A1.0 B1.0 C'1.0 G1.0 A1.0 B1.0 B1.0 C1.0 D1.0 E1.0 F1.0 "
                + "F1.0 E1.0 D1.0 C1.0");
        System.in.read();

    }

    // No double bars or repeats
    @Test
    public void testMakeMusicSample1() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/sample1.abc");
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

    // No double bars or repeats, just a single chord
    @Test
    public void testMakeMusicSample2() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/sample2.abc");
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

    // No double bars or repeats
    @Test
    public void testMakeMusicSample3() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/sample3.abc");
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
    public void testMakeMusicFurElise() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/fur_elise.abc");
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
    public void testMakeMusicNutcracker() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/tchmar.abc");
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
    public void testMakeMusicOctaves() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/octaves.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals(music.toString(), "{music=C,1.0 D,1.0 E,1.0 F,1.0 G,1.0 A,1.0 B,1.0 C1.0 D1.0 E1.0 F1.0 G1.0 A1.0 B1.0 C'1.0 D'1.0 E'1.0 F'1.0 G'1.0 A'1.0 B'1.0 C''1.0 D''1.0 E''1.0 F''1.0 G''1.0 A''1.0 B''1.0}");
    }
    @Test
    public void testMakeMusicScale() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/scale.abc");
        Map<String, Music> music = Music.parseBodyFromFile(file);
        assertEquals(music.toString(), "{music=C1.0 D1.0 E1.0 F1.0 G1.0 A1.0 B1.0 C'1.0 C'1.0 B1.0 A1.0 G1.0 F1.0 E1.0 D1.0 C1.0}");
    }

    @Test
    public void testVoices1() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/numb.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(1));
        Map<String, String> header = Music.parseHeader(headbody.get(0));
        System.out.println(header);
        Map<String,Music> music = Music.parseBody(headbody.get(1),header);
        
        SequencePlayer player = new SequencePlayer(file);
        double voicedelay = 0;
        if(music.keySet().contains("defaultvoice")){
            Music defaultvoice = music.get("defaultvoice");
            defaultvoice.play(player, 0);
            voicedelay = defaultvoice.duration()*player.getTicksDefaultNote();
        }
        
        for(String key: music.keySet()){
            if(!key.equals("defaultvoice")){
                System.out.println("key: " + key);
                music.get(key).play(player, 0);
            }
        }
        System.out.println("The music Map: " + music);
        System.out.println("Voice delay: " + voicedelay);
        player.play();
        System.in.read();
    }
}
