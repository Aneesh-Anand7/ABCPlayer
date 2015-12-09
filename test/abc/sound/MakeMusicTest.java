package abc.sound;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.parser.SplitHeader;

public class MakeMusicTest {

    @Test
    public void testMakeMusicInvention() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/invention.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(1));
        Map<String, String> header = Music.parseHeader(headbody.get(0));
        System.out.println(header);
        Music music = Music.parseBody(headbody.get(1),header);
        System.out.println(music);
        SequencePlayer player = new SequencePlayer(300);
        music.play(player, 0);
        player.play();
        System.in.read();
    }

    @Test
    public void testMakeMusicRepeat1() throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/repeat1.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(1));
        Map<String, String> header = Music.parseHeader(headbody.get(0));
        System.out.println(header);
        Music music = Music.parseBody(headbody.get(1),header);
        System.out.println(music);
        SequencePlayer player = new SequencePlayer(file);
        music.play(player, 0);
        player.play();
        System.in.read();
    }
    
        
}
