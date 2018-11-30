package problems;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by softish on 2018-11-30.
 */
public class IsItHalloweenDotComTest {

    @Test
    public void isItHalloweenIsntIt() {
        boolean isHalloween = IsItHalloweenDotCom.isItHalloween("OCT 31");
        assertTrue(isHalloween);
    }

    @Test
    public void isItHalloweenNot() {
        boolean isHalloween = IsItHalloweenDotCom.isItHalloween("JUN 24");
        assertFalse(isHalloween);
    }

    @Test
    public void isItHalloweenOctalBase() {
        boolean isHalloween = IsItHalloweenDotCom.isItHalloween("DEC 25");
        assertTrue(isHalloween);
    }

    @Test
    public void isItHalloweenHumanReadableYup() {
        String isHalloweenHumanReadable = IsItHalloweenDotCom.isItHalloweenHumanReadable(true);
        assertEquals("yup", isHalloweenHumanReadable);
    }

    @Test
    public void isItHalloweenHumanReadableNope() {
        String isHalloweenHumanReadable = IsItHalloweenDotCom.isItHalloweenHumanReadable(false);
        assertEquals("nope", isHalloweenHumanReadable);
    }
}