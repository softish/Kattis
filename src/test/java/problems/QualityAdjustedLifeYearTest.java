package problems;

import org.junit.Test;

import java.util.stream.DoubleStream;

import static org.junit.Assert.assertEquals;

public class QualityAdjustedLifeYearTest {

    private final double absoluteErrorTolerance = Math.pow(10, -3);

    @Test
    public void testPeriod() {
        double qualityOfLife = 1.0;
        double numYears = 12.0;
        DoubleStream result = QualityAdjustedLifeYear.calculatePeriod(qualityOfLife, numYears);
        assertEquals(12.0, result.sum(), 0.0);
    }

    @Test
    public void testAccumulatedPeriods() {
        double[][] periods = {{1.0, 12.0}, {0.7, 5.2}};

        double result = QualityAdjustedLifeYear.calculateQALY(periods);
        assertEquals(15.64, result, absoluteErrorTolerance);
    }
}