package abc.sound;


/**
 * Music represents a piece of music played by a piano.
 */
// Datatype definition:
// Music = Note(duration:double, pitch:Pitch)
// + Rest(duration:double)
// + Concat(m1:Music, m2:Music)
// + Chord(n1:Note, c2: Chord)
//
public interface Music {
    
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
    
}