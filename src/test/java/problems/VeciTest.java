package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by softish on 2018-05-10.
 */
public class VeciTest {

    @Test
    public void sameDigitsSampleInput1() {
        int result = Veci.findClosestNumberWithSameDigits(156);
        assertEquals(165, result);
    }

    @Test
    public void sameDigitsSampleInput2() {
        int result = Veci.findClosestNumberWithSameDigits(330);
        assertEquals(0, result);
    }

    @Test
    public void sameDigitsSampleInput3() {
        int result = Veci.findClosestNumberWithSameDigits(27711);
        assertEquals(71127, result);
    }
}