package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-11-04.
 */
public class Trik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            int currentIndex = 1;

            for (Character character : line.toCharArray()) {
                if (character.equals('A') && currentIndex == 1) {
                    currentIndex = 2;
                } else if (character.equals('A') && currentIndex == 2) {
                    currentIndex = 1;
                } else if (character.equals('B') && currentIndex == 2) {
                    currentIndex = 3;
                } else if (character.equals('B') && currentIndex == 3) {
                    currentIndex = 2;
                } else if (character.equals('C') && currentIndex == 1) {
                    currentIndex = 3;
                } else if (character.equals('C') && currentIndex == 3) {
                    currentIndex = 1;
                }
            }

            System.out.println(currentIndex);
        }
    }
}
