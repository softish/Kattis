package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-10-19.
 */
public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextInt() % 2 == 1 ? "Alice" : "Bob");
        }
    }
}
