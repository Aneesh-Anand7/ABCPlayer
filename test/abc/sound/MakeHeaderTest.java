package abc.sound;

import java.util.Map;

import org.junit.Test;


public class MakeHeaderTest {

    @Test
    public void testMakeHeaderTitle() {
        Map<String, String> title = Music.parseHeader("X: 1 \n "
                + "T:Bagatelle No.25 in A, WoO.59 \n"
                + "C:Ludwig van Beethoven \n"
                + "V:1 \n"
                + "V:2 \n"
                + "M:3/8 \n"
                + "L:1/16 \n"
                + "Q:1/8=140 \n"
                + "K:Am");
        System.out.println(title);
//        assertEquals(title, new Number(0.00000001));
    }

}
