package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-29.
 */
class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= target; i++) {
            stringBuilder.append(i).append(" Abracadabra\n");
        }

        System.out.println(stringBuilder.toString());
    }
}
