package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-30.
 */
public class Oddities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            String type = value % 2 == 0 ? "even" : "odd";
            System.out.println(value + " is " + type);
        }
    }
}
