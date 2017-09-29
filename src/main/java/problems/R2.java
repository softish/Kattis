package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-29.
 */
public class R2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputComponents = scanner.nextLine().split(" ");

        int R1 = Integer.parseInt(inputComponents[0]);
        int S = Integer.parseInt(inputComponents[1]);

        int R2 = 2 * S - R1;

        System.out.println(R2);
    }
}
