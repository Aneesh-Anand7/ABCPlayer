package abc.sound;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

public class SequencePlayerTest {

    
    @Test
    public void testPiece1() {
        try {
            SequencePlayer player = new SequencePlayer(200, 4);
            
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 2);
           
            
            
            
            
            System.out.println(player);

            // play!
            player.play();
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        } catch (MidiUnavailableException mue) {
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            imde.printStackTrace();
        }
    }
    
    @Test
    public void testPiece2() {
        try {
            SequencePlayer player = new SequencePlayer(200, 4);
            
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 2);
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 0, 2);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 2, 2);
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 2, 2);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 6, 2);
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 6, 2);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 10, 2);
            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 10, 2);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 12, 4);
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 12, 4);
            
            player.addNote(new Pitch('G').toMidiNote(), 16, 4);
            player.addNote(new Pitch('G').transpose(12).toMidiNote(), 16, 4);
            player.addNote(new Pitch('B').toMidiNote(), 16, 4);
            player.addNote(new Pitch('G').toMidiNote(), 24, 4);
            
            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 32, 6);
            player.addNote(new Pitch('G').toMidiNote(), 38, 2);
            player.addNote(new Pitch('E').toMidiNote(), 44, 4);
            
            player.addNote(new Pitch('E').toMidiNote(), 48, 2);
            player.addNote(new Pitch('A').toMidiNote(), 50, 4);
            player.addNote(new Pitch('B').toMidiNote(), 54, 4);
            player.addNote(new Pitch('A').transpose(1).toMidiNote(), 58, 2);
            player.addNote(new Pitch('A').toMidiNote(), 60, 4);
            
            player.addNote(new Pitch('G').toMidiNote(), 64, 3);
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 67, 3);
            player.addNote(new Pitch('G').transpose(12).toMidiNote(), 70, 3);
            player.addNote(new Pitch('A').transpose(12).toMidiNote(), 73, 4);
            player.addNote(new Pitch('F').transpose(12).toMidiNote(), 77, 2);
            player.addNote(new Pitch('G').transpose(12).toMidiNote(), 79, 2);
            
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 83, 4);
            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 87, 2);
            player.addNote(new Pitch('D').transpose(12).toMidiNote(), 89, 2);
            player.addNote(new Pitch('B').toMidiNote(), 91, 3);
            
            
            
            
            System.out.println(player);

            // play!
            player.play();
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        } catch (MidiUnavailableException mue) {
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            imde.printStackTrace();
        }
    }
    

}
