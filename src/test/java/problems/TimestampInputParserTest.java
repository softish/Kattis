package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimestampInputParserTest {

    private static final String CANNOT_PARSE_TEXT = "Cannot parse text";
    private static final String UNRECOGNIZED_FORMAT = "Unrecognized format";

    @Test
    public void testParsingTime() {
        TimestampInputParser timestampInputParser = new TimestampInputParser();
        timestampInputParser.parse("10 10");
        assertEquals(10, timestampInputParser.getHours());
        assertEquals(10, timestampInputParser.getMinutes());
    }

    @Test
    public void testParsingText() {
        TimestampInputParser timestampInputParser = new TimestampInputParser();
        try {
            timestampInputParser.parse("HH mm");
        } catch (TimestampParserException e) {
            assertEquals(CANNOT_PARSE_TEXT, e.getMessage());
        }
    }

    @Test
    public void testParsingOtherFormat() {
        TimestampInputParser timestampInputParser = new TimestampInputParser();

        try {
            timestampInputParser.parse("10:10");
        } catch (TimestampParserException e) {
            assertEquals(UNRECOGNIZED_FORMAT, e.getMessage());
        }
    }

    @Test
    public void testCorrectErrorMessage() {
        TimestampInputParser timestampInputParser = new TimestampInputParser();

        try {
            timestampInputParser.parse("Yoda");
        } catch (TimestampParserException e) {
            assertEquals(CANNOT_PARSE_TEXT, e.getMessage());
        }
    }

    @Test
    public void testOneDigit() {
        TimestampInputParser timestampInputParser = new TimestampInputParser();

        try {
            timestampInputParser.parse("1");
        } catch (TimestampParserException e) {
            assertEquals(UNRECOGNIZED_FORMAT, e.getMessage());
        }
    }

    @Test
    public void testEmptyInput() {
        TimestampInputParser timestampInputParser = new TimestampInputParser();

        try {
            timestampInputParser.parse("");
        } catch (TimestampParserException e) {
            assertEquals("Empty input", e.getMessage());
        }
    }

    @Test
    public void testIntOverflow() {
        TimestampInputParser timestampInputParser = new TimestampInputParser();

        try {
            timestampInputParser.parse(String.valueOf(Integer.MAX_VALUE + 1));
        } catch (TimestampParserException e) {
            assertEquals(UNRECOGNIZED_FORMAT, e.getMessage());
        }
    }

    @Test
    public void testTriplets() {
        TimestampInputParser timestampInputParser = new TimestampInputParser();

        try {
            timestampInputParser.parse("10 20 30");
        } catch (TimestampParserException e) {
            assertEquals(UNRECOGNIZED_FORMAT, e.getMessage());
        }
    }
}