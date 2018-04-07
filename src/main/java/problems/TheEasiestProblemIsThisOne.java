package problems;

import java.util.Scanner;

/**
 * Created by softish on 2018-04-07.
 */
public class TheEasiestProblemIsThisOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            try {
                System.out.println(findDigitSumFactor(n));
            } catch (IllegalArgumentException e) {
                System.out.println();
            }
        }
    }

    static int findDigitSumFactor(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Argument must be greater than zero.");
        }

        for (int p = 11; p < 100_000; p++) {
            if (digitSum(n * p) == digitSum(n)) {
                return p;
            }
        }

        return -1;
    }

    static int digitSum(int number) {
        int sum = 0;
        int auxNumber = number;

        for (int i = 0; i < String.valueOf(number).length(); i++) {
            sum += auxNumber % 10;
            auxNumber /= 10;
        }

        return sum;
    }
}
