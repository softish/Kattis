package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-29.
 */
class SolvingForCarrots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        System.out.println(numbers[1]);
    }
}
