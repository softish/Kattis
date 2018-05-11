package problems;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * Created by softish on 2018-05-10.
 */
public class VeciTest {

    @Test
    public void sameDigitsSampleInput1() {
        int result = Veci.sameDigits(156);
        assertEquals(165, result);
    }

    @Test
    public void sameDigitsSampleInput2() {
        int result = Veci.sameDigits(330);
        assertEquals(0, result);
    }

    @Test
    public void sameDigitsSampleInput3() {
        int result = Veci.sameDigits(27711);
        assertEquals(71127, result);
    }

    @Test
    public void digitDecompositionTest() {
        Multiset result = Veci.digitDecomposition(1);
        assertEquals(HashMultiset.create(Collections.singletonList(1)), result);
    }

    @Test
    public void digitDecompositionTest2() {
        Multiset result = Veci.digitDecomposition(12);
        assertEquals(HashMultiset.create(Arrays.asList(1, 2)), result);
    }

    @Test
    public void digitDecompositionTest3() {
        Multiset result = Veci.digitDecomposition(101);
        assertEquals(HashMultiset.create(Arrays.asList(1, 0, 1)), result);
    }
}