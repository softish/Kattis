package problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by softish on 2017-09-29.
 */
public class PotTest {

    @Test
    public void calculateSumSampleInput1() {
        List<Integer> values = new ArrayList<>();
        List<Integer> powers = new ArrayList<>();

        values.add(21);
        values.add(125);
        powers.add(2);
        powers.add(3);

        int result = Pot.calculateSum(values, powers);
        assertEquals(1953566, result);
    }

    @Test
    public void calculateSumSampleInput2() {
        List<Integer> values = new ArrayList<>();
        List<Integer> powers = new ArrayList<>();

        values.add(2);
        values.add(1);
        values.add(4);
        values.add(5);
        values.add(2);
        powers.add(3);
        powers.add(7);
        powers.add(3);
        powers.add(2);
        powers.add(2);

        int result = Pot.calculateSum(values, powers);
        assertEquals(102, result);
    }

    @Test
    public void calculateSumSampleInput3() {
        List<Integer> values = new ArrayList<>();
        List<Integer> powers = new ArrayList<>();

        values.add(21);
        values.add(10);
        values.add(4);
        powers.add(3);
        powers.add(2);
        powers.add(5);

        int result = Pot.calculateSum(values, powers);
        assertEquals(10385, result);
    }
}