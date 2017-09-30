package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-30.
 */
public class Oddities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();  // flush the number of test cases that follow

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            System.out.println(value + " is " + (value % 2 == 0 ? "even" : "odd"));
        }
    }
}
