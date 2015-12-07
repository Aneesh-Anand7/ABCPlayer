package abc.sound;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import abc.parser.SplitHeader;

public class HeaderGrammarTest {

    @Test
    public void testFurElise() throws IOException {
        File file = new File("sample_abc/fur_elise.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testAbcSong() throws IOException {
        File file = new File("sample_abc/abc_song.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testInvention() throws IOException {
        File file = new File("sample_abc/invention.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testLittleNightMusic() throws IOException {
        File file = new File("sample_abc/little_night_music.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testPaddy() throws IOException {
        File file = new File("sample_abc/paddy.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testPiece1() throws IOException {
        File file = new File("sample_abc/piece1.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testPiece2() throws IOException {
        File file = new File("sample_abc/piece2.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testPrelude() throws IOException {
        File file = new File("sample_abc/prelude.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testSample1() throws IOException {
        File file = new File("sample_abc/sample1.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testSample2() throws IOException {
        File file = new File("sample_abc/sample2.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testSample3() throws IOException {
        File file = new File("sample_abc/sample3.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testSample4() throws IOException {
        File file = new File("sample_abc/sample4.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testScale() throws IOException {
        File file = new File("sample_abc/scale.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    @Test
    public void testWaxiesDargle() throws IOException {
        File file = new File("sample_abc/waxies_dargle.abc");
        List<String> headbody = SplitHeader.splitHeader(file);
        System.out.println(headbody.get(0));
        Music.parse(headbody.get(0),headbody.get(1));
    }
    
    
}
