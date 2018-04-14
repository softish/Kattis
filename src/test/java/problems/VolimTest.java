package problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by softish on 2018-04-07.
 */
public class VolimTest {

    @Test
    public void finishingPlayerSampleInput1() {
        String[] values = new String[]{
                "20 T",
                "50 T",
                "80 T",
                "50 T",
                "30 T"
        };
        int result = Volim.finishingPlayer(1, Arrays.asList(values));
        assertEquals(5, result);
    }

    @Test
    public void finishingPlayerSampleInput2() {
        String[] values = new String[]{
                "100 T",
                "100 N",
                "100 T",
                "100 T",
                "100 N"
        };
        int result = Volim.finishingPlayer(3, Arrays.asList(values));
        assertEquals(4, result);
    }

    @Test
    public void finishingPlayerSampleInput3() {
        String[] values = new String[]{
                "70 T",
                "50 P",
                "30 N",
                "50 T",
                "30 P",
                "80 T"
        };
        int result = Volim.finishingPlayer(5, Arrays.asList(values));
        assertEquals(7, result);
    }

    @Test
    public void finishingPlayerCustomInput1Modulo() {
        String[] values = new String[]{
                "10 T",
                "10 T",
                "10 T",
                "10 T",
                "10 T",
                "10 T",
                "10 T",
        };
        int result = Volim.finishingPlayer(1, Arrays.asList(values));
        assertEquals(8, result);
    }

    @Test
    public void finishingPlayerCustomInput2ModuloFullCircle() {
        String[] values = new String[]{
                "10 T",
                "10 T",
                "10 T",
                "10 T",
                "10 T",
                "10 T",
                "10 T",
                "10 T",
        };
        int result = Volim.finishingPlayer(1, Arrays.asList(values));
        assertEquals(1, result);
    }
}