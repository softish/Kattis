package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by softish on 2017-09-29.
 */
class Pot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>(numberOfEntries);
        List<Integer> powers = new ArrayList<>(numberOfEntries);

        readValues(scanner, numbers, powers);
        int sum = calculateSum(numbers, powers);

        System.out.println(sum);
    }

    private static void readValues(Scanner scanner, List<Integer> numbers, List<Integer> powers) {
        while (scanner.hasNext()) {
            String input = scanner.next();

            if(input.equals("x"))
                break;

            int number = Integer.parseInt(input.substring(0, input.length() - 1));
            int power = Integer.parseInt(input.substring(input.length() - 1));
            numbers.add(number);
            powers.add(power);
        }
    }

    static int calculateSum(List<Integer> numbers, List<Integer> powers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += Math.pow(numbers.get(i), powers.get(i));
        }
        return sum;
    }
}
