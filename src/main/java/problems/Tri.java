package problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by softish on 2018-02-17.
 */
class Tri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            List<Integer> values = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            System.out.println(introduceSigns(values));
        }
    }

    static String introduceSigns(List<Integer> values) {
        int first = values.get(0);
        int middle = values.get(1);
        int last = values.get(2);

        if (!getOperator(first, middle, last).equals("")) {
            return String.valueOf(first) +
                    getOperator(first, middle, last) +
                    middle +
                    "=" +
                    last;
        } else {
            return String.valueOf(first) +
                    "=" +
                    middle +
                    getOperator(middle, last, first) +
                    last;
        }
    }

    private static String getOperator(int a, int b, int result) {
        if (a + b == result) {
            return "+";
        } else if (a - b == result) {
            return "-";
        } else if (a * b == result) {
            return "*";
        } else if (a / b == result) {
            return "/";
        } else {
            return "";
        }
    }
}
