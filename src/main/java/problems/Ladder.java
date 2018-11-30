package problems;

import java.util.Scanner;

/**
 * Created by softish on 2018-04-03.
 */
public class Ladder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            System.out.println(ladderHeight(scanner.nextDouble(), scanner.nextDouble()));
        }
    }

    static int ladderHeight(double h, double v) {
        double result = h / Math.sin(Math.toRadians(v));
        return (int) Math.ceil(result);
    }
}
