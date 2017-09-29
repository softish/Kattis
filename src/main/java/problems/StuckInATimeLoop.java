package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-29.
 */
public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        for (int i = 1; i <= target; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
