package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-10-20.
 */
public class ColdputerScience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int numNegativeEntries = 0;

        while (scanner.hasNextInt()) {
            if(scanner.nextInt() < 0) {
                numNegativeEntries++;
            }
        }

        System.out.println(numNegativeEntries);
    }
}
