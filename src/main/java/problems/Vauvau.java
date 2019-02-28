package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by softish on 2018-07-04.
 */
public class Vauvau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String dogTimes = scanner.nextLine();
            String visitorTimes = scanner.nextLine();
            List<Dog> dogs = createDogs(dogTimes);
            printResult(findPersonnelAttacks(dogs, visitorTimes));
        }
    }

    static List<Dog> createDogs(String dogTimes) {
        List<Dog> dogs = new ArrayList<>();
        String[] times = dogTimes.split(" ");
        Dog dogOne = new Dog(Integer.valueOf(times[0]), Integer.valueOf(times[1]));
        Dog dogTwo = new Dog(Integer.valueOf(times[2]), Integer.valueOf(times[3]));
        dogs.add(dogOne);
        dogs.add(dogTwo);

        return dogs;
    }

    static String[] findPersonnelAttacks(List<Dog> dogs, String visitors) {
        String[] servicePersonnelArrivals = visitors.split(" ");
        List<String> result = new ArrayList<>();

        for (String servicePerson : servicePersonnelArrivals) {
            for (Dog dog : dogs) {
                dog.deduceAggressiveness(Integer.valueOf(servicePerson));
            }

            if (dogs.get(0).isAggressive() && dogs.get(1).isAggressive()) {
                result.add(Result.BOTH.name().toLowerCase());
            } else if ((dogs.get(0).isAggressive() || dogs.get(1).isAggressive())) {
                result.add(Result.ONE.name().toLowerCase());
            } else if (!dogs.get(0).isAggressive() && !dogs.get(1).isAggressive()) {
                result.add(Result.NONE.name().toLowerCase());
            }
        }

        return result.toArray(new String[0]);
    }

    private static void printResult(String[] results) {
        for (String result : results) {
            System.out.println(result);
        }
    }
}

class Dog {

    private int aggressiveDuration;
    private int passiveDuration;
    private boolean aggressive;

    Dog(int aggressiveDuration, int passiveDuration) {
        this.aggressiveDuration = aggressiveDuration;
        this.passiveDuration = passiveDuration;
    }

    int getAggressiveDuration() {
        return aggressiveDuration;
    }

    int getPassiveDuration() {
        return passiveDuration;
    }

    boolean isAggressive() {
        return aggressive;
    }

    void deduceAggressiveness(int timeOfDay) {
        aggressive = timeOfDay % (aggressiveDuration + passiveDuration + 1) <= aggressiveDuration;
    }
}

enum Result {
    BOTH,
    ONE,
    NONE
}