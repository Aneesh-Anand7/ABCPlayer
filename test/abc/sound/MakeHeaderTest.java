package abc.sound;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.junit.Test;


public class MakeHeaderTest {

    @Test
    public void testMakeHeaderFromStringFurElise() {
        Map<String, String> title = Music.parseHeader("X: 1 \n "
                + "T:Bagatelle No.25 in A, WoO.59 \n"
                + "C:Ludwig van Beethoven \n"
                + "V:1 \n"
                + "V:2 \n"
                + "M:3/8 \n"
                + "L:1/16 \n"
                + "Q:1/8=140 \n"
                + "K:Am");
        assertEquals("3/8", title.get("meter"));
        assertEquals("1/16" , title.get("length"));
        assertEquals("1/8=140", title.get("tempo"));
        assertEquals("Am", title.get("key"));
    }
    
    
    @Test
    public void testMakeHeaderInvention() throws IOException {
        File file = new File("sample_abc/invention.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/8" , title.get("length"));
        assertEquals("1/4=70", title.get("tempo"));
        assertEquals("C", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderLittleNight() throws IOException {
        File file = new File("sample_abc/little_night_music.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/8" , title.get("length"));
        assertEquals("1/4=140", title.get("tempo"));
        assertEquals("G", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderAbc_song() throws IOException {
        File file = new File("sample_abc/abc_song.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/4" , title.get("length"));
        assertEquals("1/4=100", title.get("tempo"));
        assertEquals("D", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderPaddy() throws IOException {
        File file = new File("sample_abc/paddy.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("6/8", title.get("meter"));
        assertEquals("1/8" , title.get("length"));
        assertEquals("1/8=200", title.get("tempo"));
        assertEquals("D", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderPiece1() throws IOException {
        File file = new File("sample_abc/piece1.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/4" , title.get("length"));
        assertEquals("1/4=140", title.get("tempo"));
        assertEquals("C", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderPiece2() throws IOException {
        File file = new File("sample_abc/piece2.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/4" , title.get("length"));
        assertEquals("1/4=200", title.get("tempo"));
        assertEquals("C", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderPrelude() throws IOException {
        File file = new File("sample_abc/prelude.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/16" , title.get("length"));
        assertEquals("1/4=70", title.get("tempo"));
        assertEquals("C", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderSample1() throws IOException {
        File file = new File("sample_abc/sample1.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/8" , title.get("length"));
        assertEquals("1/8=100", title.get("tempo"));
        assertEquals("C", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderSample2() throws IOException {
        File file = new File("sample_abc/sample2.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/8" , title.get("length"));
        assertEquals("1/8=100", title.get("tempo"));
        assertEquals("C", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderSample3() throws IOException {
        File file = new File("sample_abc/sample3.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/8" , title.get("length"));
        assertEquals("1/8=100", title.get("tempo"));
        assertEquals("Cm", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderSample4() throws IOException {
        File file = new File("sample_abc/sample4.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/8" , title.get("length"));
        assertEquals("1/8=100", title.get("tempo"));
        assertEquals("C", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderScale() throws IOException {
        File file = new File("sample_abc/scale.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/4" , title.get("length"));
        assertEquals("1/4=120", title.get("tempo"));
        assertEquals("C", title.get("key"));
    }
    
    @Test
    public void testMakeHeaderWaxiesDargle() throws IOException {
        File file = new File("sample_abc/waxies_dargle.abc");
        Map<String, String> title = Music.parseHeaderFromFile(file);
        assertEquals("4/4", title.get("meter"));
        assertEquals("1/8" , title.get("length"));
        assertEquals("1/4=180", title.get("tempo"));
        assertEquals("G", title.get("key"));
    }
}
