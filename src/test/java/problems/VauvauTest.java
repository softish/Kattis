package problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VauvauTest {

    private static final String BOTH = "both";
    private static final String ONE = "one";
    private static final String NONE = "none";

    @Test
    public void testCreateDogs() {
        List<Dog> dogs = Vauvau.createDogs("1 2 3 4");
        assertEquals(1, dogs.get(0).getAggressiveDuration());
        assertEquals(2, dogs.get(0).getPassiveDuration());
        assertEquals(3, dogs.get(1).getAggressiveDuration());
        assertEquals(4, dogs.get(1).getPassiveDuration());
    }

    @Test
    public void testFindPersonnelAttacksSampleInput1() {
        List<Dog> dogs = Arrays.asList(new Dog(2, 2), new Dog(3, 3));
        String visitors = "1 3 4";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(BOTH, result[0]);
        assertEquals(ONE, result[1]);
        assertEquals(NONE, result[2]);
    }

    @Test
    public void testFindPersonnelAttacksSampleInput2() {
        List<Dog> dogs = Arrays.asList(new Dog(2, 3), new Dog(4, 5));
        String visitors = "4 9 5";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(ONE, result[0]);
        assertEquals(NONE, result[1]);
        assertEquals(NONE, result[2]);
    }

    @Test
    public void testFindPersonnelAttacksSampleInputArriveAtSameTime() {
        List<Dog> dogs = Arrays.asList(new Dog(2, 3), new Dog(4, 5));
        String visitors = "4 4 4";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(ONE, result[0]);
        assertEquals(ONE, result[1]);
        assertEquals(ONE, result[2]);
    }

    @Test
    public void testFindPersonnelAttacksSampleInputX() {
        List<Dog> dogs = Arrays.asList(new Dog(2, 2), new Dog(2, 2));
        String visitors = "1 1 3";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(BOTH, result[0]);
        assertEquals(BOTH, result[1]);
        assertEquals(NONE, result[2]);
    }

    @Test
    public void testFindPersonnelAttacksSampleInputY() {
        List<Dog> dogs = Arrays.asList(new Dog(1, 1), new Dog(1, 1));
        String visitors = "2 2 2";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(NONE, result[0]);
        assertEquals(NONE, result[1]);
        assertEquals(NONE, result[2]);
    }

    @Test
    public void testFindPersonnelAttacksSampleInputZ() {
        List<Dog> dogs = Arrays.asList(new Dog(1, 1), new Dog(1, 1));
        String visitors = "1 1 1";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(BOTH, result[0]);
        assertEquals(BOTH, result[1]);
        assertEquals(BOTH, result[2]);
    }

    @Test
    public void testFindPersonnelAttacksSampleInputUpperLimit() {
        List<Dog> dogs = Arrays.asList(new Dog(1, 1), new Dog(1, 1));
        String visitors = "999 1 2";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(BOTH, result[0]);
        assertEquals(BOTH, result[1]);
        assertEquals(NONE, result[2]);
    }

    @Test
    public void testFindPersonnelAttacksSampleInputDesc() {
        List<Dog> dogs = Arrays.asList(new Dog(2, 3), new Dog(4, 5));
        String visitors = "9 5 4";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(NONE, result[0]);
        assertEquals(NONE, result[1]);
        assertEquals(ONE, result[2]);
    }

    @Test
    public void testFindPersonnelAttacksSampleInputTwoDigit() {
        List<Dog> dogs = Arrays.asList(new Dog(10, 10), new Dog(10, 10));
        String visitors = "10 15 20";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(BOTH, result[0]);
        assertEquals(NONE, result[1]);
        assertEquals(NONE, result[2]);
    }

    @Test
    public void testFindPersonnelAttacksSampleInputAbc() {
        List<Dog> dogs = Arrays.asList(new Dog(2, 2), new Dog(2, 2));
        String visitors = "1 2 6";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(BOTH, result[0]);
        assertEquals(BOTH, result[1]);
        assertEquals(BOTH, result[2]);
    }

    @Test
    public void testFindPersonnelAttacksUnbalancedDurations() {
        List<Dog> dogs = Arrays.asList(new Dog(2, 3), new Dog(3, 2));
        String visitors = "1 3 4";
        String[] result = Vauvau.findPersonnelAttacks(dogs, visitors);
        assertEquals(BOTH, result[0]);
        assertEquals(ONE, result[1]);
        assertEquals(NONE, result[2]);
    }
}