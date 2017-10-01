package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-30.
 */
public class Oddities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oddity checker, press [Q] to quit, [Enter] to start");
        scanner.nextLine();  // flush the number of test cases that follow

        System.out.print("$");
        while (scanner.hasNext()) {
            try {
                String string = scanner.next();

                if(string.equalsIgnoreCase("q")) {
                    System.out.println("Terminating ...");
                    break;
                }

                int value = Integer.parseInt(string);
                System.out.println(value + " is " + (value % 2 == 0 ? "even" : "odd"));
            } catch (NumberFormatException e) {
                System.err.println("Only integers are supported");
            }
            System.out.print("$");
        }
    }
}
