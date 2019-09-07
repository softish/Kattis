package problems;

import org.junit.Test;

import java.time.DateTimeException;
import java.time.format.DateTimeParseException;

import static org.junit.Assert.assertEquals;

public class SpavanacTest {

    @Test
    public void testDoubleDigitResult() {
        String result = Spavanac.rewindTimeByFactor("23 40");
        assertEquals("22 55", result);
    }

    @Test
    public void testOnlySingleDigitInput() {
        String result = Spavanac.rewindTimeByFactor("1 1");
        assertEquals("0 16", result);
    }

    @Test
    public void testOneMinuteBeforeMidnight() {
        String result = Spavanac.rewindTimeByFactor("23 59");
        assertEquals("23 14", result);
    }

    @Test
    public void testMidnight() {
        String result = Spavanac.rewindTimeByFactor("0 0");
        assertEquals("23 15", result);
    }

    @Test
    public void testOnlySingleDigitsResult() {
        String result = Spavanac.rewindTimeByFactor("7 46");
        assertEquals("7 1", result);
    }

    @Test(expected = DateTimeParseException.class)
    public void testUntrimmedInput() {
        Spavanac.rewindTimeByFactor("       10 15      ");
    }

    @Test(expected = DateTimeParseException.class)
    public void testTripleInput() {
        Spavanac.rewindTimeByFactor("10 20 30");
    }

    @Test(expected = DateTimeParseException.class)
    public void testOtherInputFormat() {
        Spavanac.rewindTimeByFactor("10:20");
    }

    @Test(expected = DateTimeParseException.class)
    public void testEmptyInput() {
        Spavanac.rewindTimeByFactor("");
    }

    @Test(expected = DateTimeParseException.class)
    public void testWhitespaceInput() {
        Spavanac.rewindTimeByFactor("         ");
    }

    @Test(expected = DateTimeException.class)
    public void testNotAnHour() {
        Spavanac.rewindTimeByFactor("42 30");
    }

    @Test(expected = DateTimeException.class)
    public void testNotAMinute() {
        Spavanac.rewindTimeByFactor("0 4711");
    }
}