package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-11-04.
 */
public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            System.out.println(transformNamingConvention(scanner.nextLine()));
        }
    }

    static String transformNamingConvention(String authorsNamingConvention) {
        String[] authors = authorsNamingConvention.split("-");
        StringBuilder stringBuilder = new StringBuilder();

        for (String author : authors) {
            stringBuilder.append(author.charAt(0));
        }

        return stringBuilder.toString();
    }
}
