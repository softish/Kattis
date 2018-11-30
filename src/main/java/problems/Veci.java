package problems;

import java.util.*;

/**
 * Created by softish on 2018-05-10.
 */
class Veci {

    private static final Set<Integer> permutationsOfNumber;

    static {
        permutationsOfNumber = new HashSet<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(findClosestNumberWithSameDigits(scanner.nextInt()));
        }
    }

    static int findClosestNumberWithSameDigits(int number) {
        permutateNumber(number);
        Map<Integer, Integer> distances = measureDistance(number);
        Integer minimumDistanceKey = findShortestDistance(distances);
        Integer closestNumber = distances.get(minimumDistanceKey);
        return closestNumber == null ? 0 : closestNumber;
    }

    /**
     * Finds all permutationsOfNumber of the provided number.
     * Source: https://introcs.cs.princeton.edu/java/23recursion/Permutations.java.html
     *
     * @param number number to permutate
     */
    private static void permutateNumber(int number) {
        permutateNumber("", String.valueOf(number));
    }

    private static void permutateNumber(String prefix, String number) {
        int length = number.length();
        if (length == 0) {
            permutationsOfNumber.add(Integer.parseInt(prefix));
        } else {
            for (int i = 0; i < number.length(); i++) {
                permutateNumber(prefix + number.charAt(i), number.substring(0, i) + number.substring(i + 1, length));
            }
        }
    }

    private static Map<Integer, Integer> measureDistance(int number) {
        Map<Integer, Integer> permutationDistanceMapping = new HashMap<>();

        for (Integer permutation : permutationsOfNumber) {
            int distance = permutation - number;
            permutationDistanceMapping.put(distance, permutation);
        }

        permutationsOfNumber.clear();
        return permutationDistanceMapping;
    }

    private static Integer findShortestDistance(Map<Integer, Integer> distances) {
        Integer minimumDistanceKey = Integer.MAX_VALUE;
        for (Integer integer : distances.keySet()) {
            if (integer > 0 && integer < minimumDistanceKey) {
                minimumDistanceKey = integer;
            }
        }
        return minimumDistanceKey;
    }
}
