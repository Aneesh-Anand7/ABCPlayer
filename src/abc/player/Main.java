package abc.player;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.parser.SplitHeader;
import abc.sound.Music;
import abc.sound.SequencePlayer;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     * @throws IOException 
     * @throws InvalidMidiDataException 
     * @throws MidiUnavailableException 
     */
    public static void play(String file) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File abcFile = new File(file);
        List<String> headbody = SplitHeader.splitHeader(abcFile);
        System.out.println(headbody.get(1));
        Map<String, String> header = Music.parseHeader(headbody.get(0));
        System.out.println(header);
        Map<String, Music> music = Music.parseBody(headbody.get(1),header);
        System.out.println(music);
        SequencePlayer player = new SequencePlayer(abcFile);
        double voicedelay = 0;
        if(music.keySet().contains("defaultvoice")){
            Music defaultvoice = music.get("defaultvoice");
            defaultvoice.play(player, 0);
            voicedelay = defaultvoice.duration();
        }
        System.out.println(music);
        System.err.println(voicedelay);
        for(String key: music.keySet()){
            if(!key.equals("defaultvoice")){
                System.err.println(music.get(key));
                music.get(key).play(player, voicedelay);
            }
        }
        player.play();
    }

    public static void main(String[] args) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        play("sample_abc/waxies_dargle.abc");
    }
}
