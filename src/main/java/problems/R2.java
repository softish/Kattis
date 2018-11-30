package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-29.
 */
public class R2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputComponents = scanner.nextLine().split(" ");

        int r1 = Integer.parseInt(inputComponents[0]);
        int s = Integer.parseInt(inputComponents[1]);

        int r2 = 2 * s - r1;

        System.out.println(r2);
    }
}
