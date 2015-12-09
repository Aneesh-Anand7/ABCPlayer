package abc.sound;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.parser.ABCgrammarLexer;
import abc.parser.ABCgrammarParser;
import abc.parser.AbcLexer;
import abc.parser.AbcParser;
import abc.parser.SplitHeader;

/**
 * An immutable data type representing a MIDI playable piece of music consisting of notes and rests
 */


public interface Music {
    // Datatype definition:
    // Music = Note(duration:double, pitch:Pitch)
    // + Rest(duration:double)
    // + Concat(m1:Music, m2:Music)
    // + Chord(n1:Note, c2: Chord)
    //
    
    /**
     * Abstraction Function: Music represents a piece of music played by some instrument
     * 
     * Rep Invariant: Music has a non-negative duration
     * 
     * Safety from Rep Exposure: Music is an interface, and all classes that implement it are immutable
     *
     */

    /**
     * Parse the header content of an abc music file
     * @param file the abc music file from which to parse the content of the header
     * @return A map containing the parsed values of the abc music file's declared or default meter, 
     *          note length, tempo, and key signature
     * @throws IOException
     */
    public static Map<String, String> parseHeaderFromFile(File file) throws IOException {
        List<String> headAndBody = SplitHeader.splitHeader(file);
        String header = headAndBody.get(0);
        return parseHeader(new String(header));
    }

    /**
     * Parse the body content of an abc music file
     * @param file the abc music file from which to parse the content of the body
     * @return
     * @throws IOException
     */
    public static Map<String, Music> parseBodyFromFile(File file) throws IOException {
        List<String> headAndBody = SplitHeader.splitHeader(file);
        String body = headAndBody.get(1);
        return parseBody(new String(body), new HashMap<String, String>());
    }

    /**
     * Parse the header content from a string in abc music file header format
     * @param head A String in abc music file header format, according to 6.005 guidelines
     *      Every fractional value in the header, such as those found for default note length, has a nominator
     *      and a denominator
     * @return A map containing the parsed values of the abc music file's declared or default meter, 
     *          note length, tempo, and key signature
     */
    public static Map<String, String> parseHeader(String head) {
        // take in string of abc language and convert to stream, then to tokens, then parse
        CharStream headstream = new ANTLRInputStream(head);
        ABCgrammarLexer lexer = new ABCgrammarLexer(headstream);
        // handle errors found by lexer
        lexer.reportErrorsAsExceptions();
        TokenStream tokens = new CommonTokenStream(lexer);
        ABCgrammarParser parser = new ABCgrammarParser(tokens);
        // handle errors found by parser
        parser.reportErrorsAsExceptions();
        ParseTree tree = parser.root();
        MakeHeaderV2 headerMaker = new MakeHeaderV2();
        new ParseTreeWalker().walk(headerMaker, tree);
        return headerMaker.getHeader();
    }

    /**
     * Parse the body content of an abc music file
     * @param body A String in abc music file body format, according to 6.005 guidelines
     * @param headerInfo
     * @return
     */
    public static Map<String, Music> parseBody(String body, Map<String, String> headerInfo) {
        CharStream bodystream = new ANTLRInputStream(body);
        AbcLexer bodylexer = new AbcLexer(bodystream);
        bodylexer.reportErrorsAsExceptions();
        TokenStream bodyTokens = new CommonTokenStream(bodylexer);
        AbcParser parser = new AbcParser(bodyTokens);
        parser.reportErrorsAsExceptions();
        ParseTree tree = parser.root();
        //Trees.inspect(tree, parser);
        MakeMusic musicMaker = new MakeMusic();
        musicMaker.setHeaderInfo(headerInfo);
        new ParseTreeWalker().walk(musicMaker, tree);
        if(headerInfo.containsKey("voices")){
            return musicMaker.getPieceMap();
        }

        else{
            return musicMaker.getFullPiece();
        }
    }


    /**
     * @return total duration of this piece in beats
     */
    public double duration();


    /**
     * Transpose all notes upward or downward in pitch.
     * @param semitonesUp semitones by which to transpose
     * @return for Music m, return m' such that for all notes n in m, the
     *         corresponding note n' in m' has
     *         n'.pitch() == n.pitch().transpose(semitonesUp), and m' is
     *         otherwise identical to m
     */

    public Music transpose(int semitonesUp);

    /**
     * Play this piece.
     * @param player player to play on
     * @param atBeat when to play
     */
    void play(SequencePlayer player, double atBeat);


    /**
     * @return whether or not the Music is of type Chord
     */
    public boolean isChord();

    /**
     * @return whether or not the Music is of type Note
     */
    public boolean isNote();

    public static void main(String[] args) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/fur_elise_snippet.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(1));
        Map<String, String> header = parseHeader(headbody.get(0));
        System.out.println(header);
        Map<String, Music> music = parseBody(headbody.get(1),header);
        System.out.println(music);
        SequencePlayer player = new SequencePlayer(file);
        double voicedelay = 0;
        if(music.keySet().contains("defaultvoice")){
            Music defaultvoice = music.get("defaultvoice");
            defaultvoice.play(player, 0);
            voicedelay = defaultvoice.duration()*player.getTicksDefaultNote();
        }
        for(String key: music.keySet()){
            if(!key.equals("defaultvoice")){
                music.get(key).play(player, voicedelay);
            }
        }
        player.play();
    }
}