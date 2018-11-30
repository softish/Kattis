package problems;

import java.util.Scanner;

/**
 * Created by softish on 2018-11-30.
 */
public class IsItHalloweenDotCom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(isItHalloweenHumanReadable(isItHalloween(scanner.nextLine())));
        }
    }

    static String isItHalloweenHumanReadable(boolean isHalloween) {
        return isHalloween ? "yup" : "nope";
    }

    static boolean isItHalloween(String date) {
        return "OCT 31".equals(date) || "DEC 25".equals(date);
    }
}
