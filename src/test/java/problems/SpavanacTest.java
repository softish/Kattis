package problems;

import org.junit.Test;

import java.time.DateTimeException;

import static org.junit.Assert.*;

public class SpavanacTest {

    @Test
    public void test45minRewind() {
        String resultingTime = Spavanac.rewindTimeByFactor(10, 10);
        assertEquals("9 25", resultingTime);
    }

    @Test
    public void test24HourWrapping() {
        String result = Spavanac.rewindTimeByFactor(0, 30);
        assertEquals("23 45", result);
    }

    @Test
    public void testLateEvening() {
        String result = Spavanac.rewindTimeByFactor(23, 40);
        assertEquals("22 55", result);
    }

    @Test
    public void testEarlyMorning() {
        String result = Spavanac.rewindTimeByFactor(1, 0);
        assertEquals("0 15", result);
    }

    @Test
    public void testOneMinuteBeforeMidnight() {
        String result = Spavanac.rewindTimeByFactor(23, 59);
        assertEquals("23 14", result);
    }

    @Test
    public void testMidnight() {
        String result = Spavanac.rewindTimeByFactor(0, 0);
        assertEquals("23 15", result);
    }

    @Test
    public void testOneMinuteAfterMidnight() {
        String result = Spavanac.rewindTimeByFactor(0, 1);
        assertEquals("23 16", result);
    }

    @Test
    public void testOnlySingleDigits() {
        String result = Spavanac.rewindTimeByFactor(7, 46);
        assertEquals("7 1", result);
    }

    @Test(expected = DateTimeException.class)
    public void testNotAnHour() {
        Spavanac.rewindTimeByFactor(42, 30);
    }

    @Test(expected = DateTimeException.class)
    public void testNotAMinute() {
        Spavanac.rewindTimeByFactor(0, 4711);
    }
}