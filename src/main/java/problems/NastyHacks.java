package problems;

import lib.Kattio;

class NastyHacks {

    private static final String EITHER = "does not matter";
    private static final String AD = "advertise";
    private static final String NO_AD = "do not advertise";

    public static void main(String[] args) {
        Kattio kattio = new Kattio(System.in);
        kattio.getInt();

        while (kattio.hasMoreTokens()) {
            System.out.println(decide(kattio.getInt(), kattio.getInt(), kattio.getInt()));
        }

        kattio.close();
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
