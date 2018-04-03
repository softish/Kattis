package problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by softish on 2018-02-17.
 */
public class TriTest {

    @Test
    public void introduceSignsSampleInput1() {
        String actual = Tri.introduceSigns(Arrays.asList(5, 3, 8));
        assertEquals("5+3=8", actual);
    }

    @Test
    public void introduceSignsSampleInput2() {
        String actual = Tri.introduceSigns(Arrays.asList(5, 15, 3));
        assertEquals("5=15/3", actual);
    }
}