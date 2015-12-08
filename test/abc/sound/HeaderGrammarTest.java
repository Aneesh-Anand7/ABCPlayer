package abc.sound;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import abc.parser.SplitHeader;

public class HeaderGrammarTest {

    @Test
    public void testFurElise() throws IOException {
        File file = new File("sample_abc/fur_elise.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testAbcSong() throws IOException {
        File file = new File("sample_abc/abc_song.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testInvention() throws IOException {
        File file = new File("sample_abc/invention.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testLittleNightMusic() throws IOException {
        File file = new File("sample_abc/little_night_music.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testPaddy() throws IOException {
        File file = new File("sample_abc/paddy.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testPiece1() throws IOException {
        File file = new File("sample_abc/piece1.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testPiece2() throws IOException {
        File file = new File("sample_abc/piece2.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testPrelude() throws IOException {
        File file = new File("sample_abc/prelude.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testSample1() throws IOException {
        File file = new File("sample_abc/sample1.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testSample2() throws IOException {
        File file = new File("sample_abc/sample2.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testSample3() throws IOException {
        File file = new File("sample_abc/sample3.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testSample4() throws IOException {
        File file = new File("sample_abc/sample4.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testScale() throws IOException {
        File file = new File("sample_abc/scale.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    @Test
    public void testWaxiesDargle() throws IOException {
        File file = new File("sample_abc/waxies_dargle.abc");
        System.out.println(SplitHeader.splitHeader(file).get(0));
        Music.parseHeaderFromFile(file);
    }
    
    
}
