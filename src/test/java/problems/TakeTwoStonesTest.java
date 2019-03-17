package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TakeTwoStonesTest {

    private static final String ALICE = "Alice";
    private static final String BOB = "Bob";

    @Test
    public void testGetWinnerOdd() {
        String winner = TakeTwoStones.getWinner(1);
        assertEquals(ALICE, winner);
    }

    @Test
    public void testGetWinnerEven() {
        String winner = TakeTwoStones.getWinner(2);
        assertEquals(BOB, winner);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testLowerBound() {
        TakeTwoStones.validateNumberRange(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpperBound() {
        TakeTwoStones.validateNumberRange(10_000_001);
    }
}