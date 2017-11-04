package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-11-04.
 */
public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String[] authors = scanner.nextLine().split("-");

            StringBuilder stringBuilder = new StringBuilder();
            for (String author : authors) {
                stringBuilder.append(author.charAt(0));
            }

            System.out.println(stringBuilder.toString());
        }
    }
}
