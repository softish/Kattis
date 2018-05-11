package problems;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Scanner;

/**
 * Created by softish on 2018-05-10.
 */
public class Veci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(sameDigits(scanner.nextInt()));
        }
    }

    static int sameDigits(int number) {
        for (int i = number + 1; i < 999_999; i++) {
            if (digitDecomposition(i).equals(digitDecomposition(number))) {
                return i;
            }
        }

        return 0;
    }

    static Multiset<Integer> digitDecomposition(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        Multiset<Integer> set = HashMultiset.create();

        for (char digit : digits) {
            set.add(Integer.parseInt(String.valueOf(digit)));
        }

        return set;
    }
}
