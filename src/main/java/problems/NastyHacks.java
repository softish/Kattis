package problems;

import java.util.Scanner;

public class NastyHacks {

    private static final String EITHER = "does not matter";
    private static final String AD = "advertise";
    private static final String NO_AD = "do not advertise";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

        while (scanner.hasNext()) {
            System.out.println(decide(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
    }

    private static String decide(int revenueWithoutAd, int revenueWhenUsingAd, int costOfAd) {
        if (revenueWithoutAd == revenueWhenUsingAd - costOfAd) {
            return EITHER;
        } else if (revenueWithoutAd < revenueWhenUsingAd - costOfAd) {
            return AD;
        } else {
            return NO_AD;
        }
    }
}
