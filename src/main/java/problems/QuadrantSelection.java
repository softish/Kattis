package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-29.
 */
class QuadrantSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quadrant = deduceQuadrant(scanner.nextInt(), scanner.nextInt());

        System.out.println(quadrant);
    }

    private static int deduceQuadrant(int x, int y) {
        if(isPositive(x) && isPositive(y))
            return 1;
        else if(!isPositive(x) && isPositive(y))
            return  2;
        else if(!isPositive(x) && !isPositive(y))
            return 3;
        else
            return 4;
    }

    private static boolean isPositive(int number) {
        return number > 0;
    }
}
