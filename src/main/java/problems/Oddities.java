package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-30.
 */
public class Oddities {
    public static void main(String[] args) {
        int[] values = readValues();
        calculateAndDisplayResult(values);
    }

    private static int[] readValues() {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();
        int[] values = new int[numberOfInputs];

        int i = 0;
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            values[i] = value;
            i++;

            if(i == numberOfInputs) {
                break;
            }
        }

        return values;
    }

    private static void calculateAndDisplayResult(int[] values) {
        for (int j = 0; j < values.length; j++) {
            int value = values[j];
            String type = value % 2 == 0 ? "even" : "odd";
            System.out.println(value + " is " + type);
        }
    }
}
