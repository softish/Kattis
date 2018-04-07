package problems;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by softish on 2018-04-07.
 */
public class TheEasiestProblemIsThisOneTest {

    @Test
    public void findDigitSumFactorSampleInput1() {
        int result = TheEasiestProblemIsThisOne.findDigitSumFactor(3029);
        assertEquals(37, result);
    }

    @Test
    public void findDigitSumFactorSampleInput2() {
        int result = TheEasiestProblemIsThisOne.findDigitSumFactor(4);
        assertEquals(28, result);
    }

    @Test
    public void findDigitSumFactorSampleInput3() {
        int result = TheEasiestProblemIsThisOne.findDigitSumFactor(5);
        assertEquals(28, result);
    }

    @Test
    public void findDigitSumFactorSampleInput4() {
        int result = TheEasiestProblemIsThisOne.findDigitSumFactor(42);
        assertEquals(25, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findDigitSumFactorSampleInput5() {
        TheEasiestProblemIsThisOne.findDigitSumFactor(0);
    }

    @Test
    public void digitSum() {
        int result = TheEasiestProblemIsThisOne.digitSum(3);
        assertEquals(3, result);
    }

    @Test
    public void digitSum1() {
        int result = TheEasiestProblemIsThisOne.digitSum(123);
        assertEquals(6, result);
    }

    @Test
    public void digitSum2() {
        int result = TheEasiestProblemIsThisOne.digitSum(101);
        assertEquals(2, result);
    }
}