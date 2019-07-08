package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QualityAdjustedLifeYearTest {

    private final double absoluteErrorTolerance = Math.pow(10, -3);

    @Test
    public void testAccumulatedPeriods() {
        double[][] periods = {{1.0, 12.0}, {0.7, 5.2}};

        double result = QualityAdjustedLifeYear.calculateQALY(periods);
        assertEquals(15.64, result, absoluteErrorTolerance);
    }
}