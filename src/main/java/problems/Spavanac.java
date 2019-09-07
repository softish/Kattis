package problems;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Spavanac {

    private static final int REWIND_BY_MINUTES_FACTOR = 45;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            TimestampInputParser timestampInputParser = new TimestampInputParser();
            try {
                timestampInputParser.parse(line);
                String rewindedTime = rewindTimeByFactor(timestampInputParser.getHours(), timestampInputParser.getMinutes());
                System.out.println(rewindedTime);
            } catch (TimestampParserException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static String rewindTimeByFactor(int hour, int minute) {
        LocalTime localTime = LocalTime.of(hour, minute, 0);
        return localTime.minusMinutes(REWIND_BY_MINUTES_FACTOR).format(DateTimeFormatter.ofPattern("H m"));
    }
}

class TimestampInputParser {

    private int hours;
    private int minutes;

    void parse(String timestamp) {
        validateInputIsNotEmpty(timestamp);
        validateInputIsParsable(timestamp.split(" "));
    }

    private void validateInputIsNotEmpty(String timestamp) {
        if (timestamp.isEmpty()) {
            throw new TimestampParserException("Empty input");
        }
    }

    private void validateInputIsParsable(String[] timeParts) {
        try {
            hours = Integer.parseInt(timeParts[0]);
            minutes = Integer.parseInt(timeParts[1]);
        } catch (NumberFormatException e) {
            if (timeParts.length == 1 && Character.isDigit(timeParts[0].charAt(0))) {
                throw new TimestampParserException("Unrecognized format");
            }
            throw new TimestampParserException("Cannot parse text");
        } catch (IndexOutOfBoundsException e) {
            throw new TimestampParserException("Unrecognized format");
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}

class TimestampParserException extends RuntimeException {
    TimestampParserException(String message) {
        super(message);
    }
}
