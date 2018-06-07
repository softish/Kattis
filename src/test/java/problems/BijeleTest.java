package problems;

import org.junit.Assert;
import org.junit.Test;

public class BijeleTest {

    @Test
    public void calculateDeltasSampleInput1() {
        Bijele.calculateDeltas("0 1 2 2 2 7".split(" "), Bijele.ChessPiece.values());
        int[] expected = {1, 0, 0, 0, 0, 1};
        Assert.assertArrayEquals(expected, Bijele.getDelta());
    }

    @Test
    public void calculateDeltasSampleInput2() {
        Bijele.calculateDeltas("2 1 2 1 2 1".split(" "), Bijele.ChessPiece.values());
        int[] expected = {-1, 0, 0, 1, 0, 7};
        Assert.assertArrayEquals(expected, Bijele.getDelta());
    }
}