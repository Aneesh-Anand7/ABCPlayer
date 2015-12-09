package abc.sound;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import abc.parser.SplitHeader;

public class SplitHeaderTest {

    // Test if SplitHeader can truly do its job of splitting an abc file into String versions of its header
    // and body
    @Test
    public void testSplitHeader() throws IOException {
        File file = new File("sample_abc/piece1.abc");
        List<String> headAndBody = SplitHeader.splitHeader(file);
        String header = headAndBody.get(0);
        String body = headAndBody.get(1);
        assertEquals("X: 1\nT:Piece No.1\nM:4/4\nL:1/4\nQ:1/4=140\nK:C", header);
        assertEquals("C C C3/4 D/4 E |\nE3/4 D/4 E3/4 F/4 G2 |\n"
                + "(3c/2c/2c/2 (3G/2G/2G/2 (3E/2E/2E/2 (3C/2C/2C/2 |"
                + "\nG3/4 F/4 E3/4 D/4 C2 ||\n", body);
    }

}
