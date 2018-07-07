package problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SibiceTest {

    private Sibice sibice;

    @Before
    public void setUp() {
        sibice = new Sibice();
    }

    @Test
    public void doesFitSampleInput1() {
        sibice.setMatchBoxMetadata("5 3 4");
        assertTrue(sibice.doesFit(3));
        assertTrue(sibice.doesFit(4));
        assertTrue(sibice.doesFit(5));
        assertFalse(sibice.doesFit(6));
        assertFalse(sibice.doesFit(7));
    }

    @Test
    public void doesFitSampleInput2() {
        sibice.setMatchBoxMetadata("2 12 17");
        assertFalse(sibice.doesFit(21));
        assertTrue(sibice.doesFit(20));
    }
}