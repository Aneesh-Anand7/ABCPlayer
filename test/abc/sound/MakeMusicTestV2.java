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
/**
 * Tests that involve playing music
 * @category no_didit
 */
public class MakeMusicTestV2 {
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
    // Repeats
    // - Contains |:, doesn't contains :|
    // - Major section repeat or beginning repeat
    // - Multiple repeats
    // - Alternate endings
    // Voices
    // - 1, 2, 3 voices
    // - Voices from start of piece, voices in middle of piece
    // - Interleaved vs. entirety
    // - Voices and repeats
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
        //C D E F | G A B c |] C C C B :|
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
        //TODO
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
    public void testVoices1() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/fur_elise.abc");
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
    
    @Test
    public void testMusicBeforeVoices() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/musicBeforeVoiceTest.abc");
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
