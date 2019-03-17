package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-10-19.
 */
class TakeTwoStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            validateNumberRange(number);
            System.out.println(getWinner(number));
        }
    }

    static String getWinner(int number) {
        return number % 2 == 1 ? "Alice" : "Bob";
    }

    static void validateNumberRange(int number) {
        if (number < 1 || 10_000_000 < number) {
            throw new IndexOutOfBoundsException("Number should be between 1 and 10 000 000");
        }
    }
}
