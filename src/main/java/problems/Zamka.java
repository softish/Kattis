package problems;

import java.util.Scanner;

/**
 * Created by softish on 2018-02-17.
 */
public class Zamka {

    private static final int NUM_INPUTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ldx = new int[NUM_INPUTS];
        int index = 0;

        while (scanner.hasNext()) {
            ldx[index++ % NUM_INPUTS] = scanner.nextInt();
            if (index % NUM_INPUTS == 0) {
                System.out.println(determineInteger(ldx, true));
                System.out.println(determineInteger(ldx, false));
            }
        }
    }

    private static int determineInteger(int[] ldx, boolean isMinimal) {
        int integer = 0;
        for (int i = ldx[0]; i <= ldx[1]; i++) {
            if (sumOfDigits(i) == ldx[2]) {
                integer = i;
                if (isMinimal) {
                    break;
                }
            }
        }

        return integer;
    }

    protected static int sumOfDigits(int n) {
        return sumOfDigits(n, 0, 1);
    }

    private static int sumOfDigits(int n, int sum, int i) {
        if (i > Math.log(Integer.MAX_VALUE)) {
            return sum;
        }

        return sumOfDigits(n / 10, sum + n % 10, ++i);
    }
}
