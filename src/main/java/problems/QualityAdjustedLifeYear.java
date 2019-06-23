package problems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfEntriesSupplied = Integer.parseInt(in.nextLine());
        double[][] input = new double[numberOfEntriesSupplied][];
        int entriesLeft = 0;
        while (in.hasNextLine() && entriesLeft < numberOfEntriesSupplied) {
            String line = in.nextLine();
            String[] digits = line.split(" ");
            input[entriesLeft] = new double[] {Double.parseDouble(digits[0]), Double.parseDouble(digits[1])};
            entriesLeft++;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println(decimalFormat.format(calculateQALY(input)));
    }

    public static double calculateQALY(double[][] values) {
        double sum = 0;
        for (double[] value : values) {
            sum += calculatePeriod(value[0], value[1]);
        }
        return sum;
    }

    public static double calculatePeriod(double qualityOfLife, double numYears) {
        return qualityOfLife * numYears;
    }
}
