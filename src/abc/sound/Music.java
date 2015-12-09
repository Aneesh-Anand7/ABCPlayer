package abc.sound;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.gui.Trees;
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

// Datatype definition:
// Music = Note(duration:double, pitch:Pitch)
// + Rest(duration:double)
// + Concat(m1:Music, m2:Music)
// + Chord(n1:Note, c2: Chord)
//
/**
 * Abstraction Function: Music is an interface the represents a piece of music played by some instrument
 * 
 * Rep Invariant: Music has a non-negative duration
 * 
 * Safety from Rep Exposure: Music is an interface, and all classes that implement it are immutable
 *
 */
public interface Music {
    
    /**
     * 
     * @param file
     * @return
     * @throws IOException
     */
    public static Map<String, String> parseHeaderFromFile(File file) throws IOException {
        List<String> headAndBody = SplitHeader.splitHeader(file);
        String header = headAndBody.get(0);
        return parseHeader(new String(header));
    }
    
    /**
     * 
     * @param file
     * @return
     * @throws IOException
     */
    public static Music parseBodyFromFile(File file) throws IOException {
        List<String> headAndBody = SplitHeader.splitHeader(file);
        String body = headAndBody.get(1);
        return parseBody(new String(body), new HashMap<String, String>());
    }
    
    /**
     * 
     * @param head
     * @return
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
        // see what's happening
        
        // 
        MakeHeaderV2 headerMaker = new MakeHeaderV2();
        new ParseTreeWalker().walk(headerMaker, tree);
        return headerMaker.getHeader();
    }
    
    /**
     * 
     * @param body
     * @param headerInfo
     * @return
     */
    public static Music parseBody(String body, Map<String, String> headerInfo) {
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
        return musicMaker.getFullPiece();
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
    

    public static void main(String[] args) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File file = new File("sample_abc/invention.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(1));
        Map<String, String> header = parseHeader(headbody.get(0));
        System.out.println(header);
        Music music = parseBody(headbody.get(1),header);
        System.out.println(music);
        SequencePlayer player = new SequencePlayer(file);
        music.play(player, 0);
        player.play();
    }
}