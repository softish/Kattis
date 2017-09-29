package problems;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

/**
 * Created by softish on 2017-09-29.
 */
public class TarifaTest {

    private Tarifa tarifa;
    private InputStream inputStream;
    private InputStream oldInputStream;

    @Before
    public void setUp() throws Exception {
        tarifa = new Tarifa();
        oldInputStream = System.in;
    }

    @After
    public void tearDown() throws Exception {
        System.setIn(oldInputStream);
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }

    @Test
    public void surfLeft() throws Exception {
        String data =
                "10\n" +
                "3\n" +
                "4\n" +
                "6\n" +
                "2";
        inputStream = new ByteArrayInputStream(data.getBytes());
        System.setIn(inputStream);
        Tarifa.main(null);
        assertEquals(0,tarifa.surfLeft());
    }

    @Test
    public void surfLeft1() throws Exception {
        tarifa.setMonthlyTarget(10);
        tarifa.setNrOfMonthsActive(3);
        tarifa.addToTotalExpenditure(4);
        tarifa.addToTotalExpenditure(6);
        tarifa.addToTotalExpenditure(2);
        assertEquals(28, tarifa.surfLeft());
    }

    @Test
    public void surfLeft2() throws Exception {
        tarifa.setMonthlyTarget(10);
        tarifa.setNrOfMonthsActive(3);
        tarifa.addToTotalExpenditure(10);
        tarifa.addToTotalExpenditure(2);
        tarifa.addToTotalExpenditure(12);
        assertEquals(16, tarifa.surfLeft());
    }

    @Test
    public void surfLeft3() throws Exception {
        tarifa.setMonthlyTarget(15);
        tarifa.setNrOfMonthsActive(3);
        tarifa.addToTotalExpenditure(15);
        tarifa.addToTotalExpenditure(10);
        tarifa.addToTotalExpenditure(20);
        assertEquals(15, tarifa.surfLeft());
    }

    @Test
    public void surfLeft4() throws Exception {
        tarifa.setMonthlyTarget(15);
        tarifa.setNrOfMonthsActive(1);
        tarifa.addToTotalExpenditure(20);
        assertEquals(10, tarifa.surfLeft());
    }

    @Test
    public void surfLeft5() throws Exception {
        tarifa.setMonthlyTarget(15);
        tarifa.setNrOfMonthsActive(0);
        tarifa.addToTotalExpenditure(0);
        assertEquals(15, tarifa.surfLeft());
    }
}