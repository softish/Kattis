package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by softish on 2018-04-14.
 */
public class AutoriTest {

    @Test
    public void transformNamingConventionSampleInput1() {
        String result = Autori.transformNamingConvention("Knuth-Morris-Pratt");
        assertEquals("KMP", result);
    }

    @Test
    public void transformNamingConventionSampleInput2() {
        String result = Autori.transformNamingConvention("Mirko-Slavko");
        assertEquals("MS", result);
    }

    @Test
    public void transformNamingConventionSampleInput3() {
        String result = Autori.transformNamingConvention("Pasko-Patak");
        assertEquals("PP", result);
    }
}