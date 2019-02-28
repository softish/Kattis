package problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    private Dog dog;

    @Before
    public void setUp() {
        dog = new Dog(2, 2);
    }

    @Test
    public void testDeduceAggressiveness() {
        dog.deduceAggressiveness(1);
        assertTrue(dog.isAggressive());
    }

    @Test
    public void testDeduceAggressiveness2() {
        dog.deduceAggressiveness(2);
        assertTrue(dog.isAggressive());
    }

    @Test
    public void testDeduceAggressiveness3() {
        dog.deduceAggressiveness(3);
        assertFalse(dog.isAggressive());
    }

    @Test
    public void testDeduceAggressiveness4() {
        dog.deduceAggressiveness(4);
        assertFalse(dog.isAggressive());
    }

    @Test
    public void testDeduceAggressiveness5() {
        dog.deduceAggressiveness(5);
        assertTrue(dog.isAggressive());
    }
}