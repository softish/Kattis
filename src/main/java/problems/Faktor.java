package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-10-02.
 */
class Faktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int numberOfArticles = scanner.nextInt();
            int impactFactor = scanner.nextInt();
            double roundedImpactFactor = impactFactor;

            if(impactFactor > 1) {
                roundedImpactFactor = impactFactor - 0.99;
            }

            int result = calculateResult(numberOfArticles, roundedImpactFactor);
            System.out.println(result);
        }
    }

    private static int calculateResult(int numberOfArticles, double roundedImpactFactor) {
        return (int) Math.ceil(numberOfArticles * roundedImpactFactor);
    }
}
