package problems;

import java.util.Scanner;

/**
 * Created by softish on 2018-04-07.
 */
class TheEasiestProblemIsThisOne {

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

        return findDigitSumFactor(n, 11);
    }

    private static int findDigitSumFactor(int n, int p) {
        if (digitSum(n * p) == digitSum(n)) {
            return p;
        } else if (p > 100_000) {
            return -1;
        } else {
            return findDigitSumFactor(n, p + 1);
        }
    }

    static int digitSum(int number) {
        return digitSum(number, 0, number, 0);
    }

    private static int digitSum(int number, int sum, int auxNumber, int i) {
        if (i >= String.valueOf(number).length()) {
            return sum;
        } else {
            return digitSum(number, sum + auxNumber % 10, auxNumber / 10, ++i);
        }
    }
}
