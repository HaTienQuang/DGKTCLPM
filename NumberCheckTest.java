import static org.junit.Assert.*;
import org.junit.Test;

public class NumberCheckTest {

    // Path 1: sum chẵn
    @Test
    public void testEvenSum() {
        assertTrue(NumberCheck.check(3)); // 1+2+3 = 6 (chẵn)
    }

    // Path 2: sum lẻ
    @Test
    public void testOddSum() {
        assertFalse(NumberCheck.check(2)); // 1+2 = 3 (lẻ)
    }
    @Test   
    // Statement coverage: loop skipped (n=0)
    @Test
    public void testZero() {
        assertTrue(NumberCheck.check(0)); // sum = 0 (chẵn)
    }
    public void testZero() {
        assertTrue(NumberCheck.check(0)); // sum = 0 → chẵn
    }
}