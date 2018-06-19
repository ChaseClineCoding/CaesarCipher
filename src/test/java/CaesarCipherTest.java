import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class CaesarCipherTest {

    @Test
    public void test1() {
        String u = "I should have known that you would have a perfect answer for me!!!";
        List<String> v = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
        assertEquals(v, CaesarCipher.movingShift(u, 1));
//        assertEquals(u, CaesarCipher.demovingShift(CaesarCipher.movingShift(u, 1), 1));
    }

    @Test
    public void test2() {
        String u = "I should ha";
        List<String> v = Arrays.asList("J v", "lta", "sl ", "rl", "");
        assertEquals(v, CaesarCipher.movingShift(u, 1));
//        assertEquals(u, CaesarCipher.demovingShift(CaesarCipher.movingShift(u, 1), 1));
    }

    @Test
    public void test3() {
        String u = "I shou";
        List<String> v = Arrays.asList("J ", "vl", "ta", "", "");
        assertEquals(v, CaesarCipher.movingShift(u, 1));
//        assertEquals(u, CaesarCipher.demovingShift(CaesarCipher.movingShift(u, 1), 1));
    }

    @Test
    public void test4() {
        String u = "I";
        List<String> v = Arrays.asList("J", "", "", "", "");
        assertEquals(v, CaesarCipher.movingShift(u, 1));
//        assertEquals(u, CaesarCipher.demovingShift(CaesarCipher.movingShift(u, 1), 1));
    }
}