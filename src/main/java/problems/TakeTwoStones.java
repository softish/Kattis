package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-10-19.
 */
public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            System.out.println(getWinner(number));
        }
    }

    private static String getWinner(int number) {
        return number % 2 == 1 ? "Alice" : "Bob";
    }
}
