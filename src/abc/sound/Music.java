package abc.sound;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
import abc.parser.AbcParser.RootContext;
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
    
    public static void parse(String head, String body) {
            CharStream headstream = new ANTLRInputStream(head);
            ABCgrammarLexer lexer = new ABCgrammarLexer(headstream);
            lexer.reportErrorsAsExceptions();
            TokenStream tokens = new CommonTokenStream(lexer);
            ABCgrammarParser parser = new ABCgrammarParser(tokens);
            parser.reportErrorsAsExceptions();
            ParseTree tree = parser.root();
//            
//            CharStream bodystream = new ANTLRInputStream(body);
//            AbcLexer bodylexer = new AbcLexer(bodystream);
//            bodylexer.reportErrorsAsExceptions();
//            TokenStream bodyTokens = new CommonTokenStream(bodylexer);
//            AbcParser parser = new AbcParser(bodyTokens);
//            parser.reportErrorsAsExceptions();
//            ParseTree tree = parser.root();
            System.err.println(tree.toStringTree(parser));
            Trees.inspect(tree, parser);
    }
    
    
    /**
     * @return total duration of this piece in beats
     */
    double duration();
    
    /**
     * Transpose all notes upward or downward in pitch.
     * @param semitonesUp semitones by which to transpose
     * @return for Music m, return m' such that for all notes n in m, the
     *         corresponding note n' in m' has
     *         n'.pitch() == n.pitch().transpose(semitonesUp), and m' is
     *         otherwise identical to m
     */
    Music transpose(int semitonesUp);
    
    /**
     * Play this piece.
     * @param player player to play on
     * @param atBeat when to play
     */
    void play(SequencePlayer player, double atBeat);
    
    public static void main(String[] args) throws IOException {
        File file = new File("sample_abc/fur_elise.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        parse(headbody.get(0),headbody.get(1));
    }
}