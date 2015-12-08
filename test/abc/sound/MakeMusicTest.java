package abc.sound;

import java.io.File;
import java.io.IOException;

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

}
