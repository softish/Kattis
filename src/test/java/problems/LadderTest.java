package problems;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by softish on 2018-04-03.
 */
public class LadderTest {

    @Test
    public void ladderHeightSampleInput1() {
        assertEquals(533, Ladder.ladderHeight(500, 70));
    }

    @Test
    public void ladderHeightSampleInput2() {
        assertEquals(5759, Ladder.ladderHeight(1000, 10));
    }
}