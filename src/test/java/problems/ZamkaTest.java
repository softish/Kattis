package problems;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by softish on 2018-02-17.
 */
public class ZamkaTest {

    @Test
    public void sumOfDigits() {
        int actual = Zamka.sumOfDigits(3);
        assertEquals(3, actual);
    }

    @Test
    public void sumOfDigits2() {
        int actual = Zamka.sumOfDigits(42);
        assertEquals(6, actual);
    }

    @Test
    public void sumOfDigits3() {
        int actual = Zamka.sumOfDigits(404);
        assertEquals(8, actual);
    }

    @Test
    public void sumOfDigits4() {
        int actual = Zamka.sumOfDigits(1337);
        assertEquals(14, actual);
    }
}