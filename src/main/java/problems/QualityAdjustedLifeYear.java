package problems;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfEntriesSupplied = Integer.parseInt(in.nextLine());
        double[][] input = new double[numberOfEntriesSupplied][];
        int entriesLeft = 0;

        while (in.hasNextLine() && entriesLeft < numberOfEntriesSupplied) {
            String line = in.nextLine();
            String[] digits = line.split(" ");
            input[entriesLeft] = new double[]{Double.parseDouble(digits[0]), Double.parseDouble(digits[1])};
            entriesLeft++;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println(decimalFormat.format(calculateQALY(input)));
    }

    public static double calculateQALY(double[][] values) {
        return Arrays.stream(values)
                .flatMapToDouble(period -> DoubleStream.of(Arrays.stream(period).reduce(1, (q, y) -> q * y)))
                .sum();
    }
}
