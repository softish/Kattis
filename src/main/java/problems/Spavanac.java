package problems;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Spavanac {

    private static final int REWIND_BY_MINUTES_FACTOR = 45;
    private static final String TIME_PATTERN = "H m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            try {
                String rewindedTime = rewindTimeByFactor(scanner.nextLine());
                System.out.println(rewindedTime);
            } catch (DateTimeParseException e) {
                System.out.println("Expected format is: H m");
            }
        }
    }

    static String rewindTimeByFactor(String input) {
        LocalTime localTime = LocalTime.parse(input, DateTimeFormatter.ofPattern(TIME_PATTERN));
        return localTime.minusMinutes(REWIND_BY_MINUTES_FACTOR).format(DateTimeFormatter.ofPattern(TIME_PATTERN));
    }
}
