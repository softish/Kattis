package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-09-29.
 */
public class Tarifa {

    private int monthlyTarget;
    private int nrOfMonthsActive;
    private int totalExpenditure;

    public static void main(String[] args) {
        Tarifa tarifa = new Tarifa();
        fetchInput(tarifa);
        displayResult(tarifa);
    }

    private static void fetchInput(Tarifa tarifa) {
        Scanner scanner = new Scanner(System.in);

        int line = 0;
        while (scanner.hasNext()) {
            int scannedInt = scanner.nextInt();

            if(line == 0) {
                tarifa.setMonthlyTarget(scannedInt);
            } else if(line == 1) {
                tarifa.setNrOfMonthsActive(scannedInt);
            } else {
                tarifa.addToTotalExpenditure(scannedInt);
            }

            line++;
        }
    }

    private static void displayResult(Tarifa tarifa) {
        System.out.println(tarifa.surfLeft());
    }

    public int surfLeft() {
        return monthlyTarget * (nrOfMonthsActive + 1) - totalExpenditure;
    }

    public void setMonthlyTarget(int monthlyTarget) {
        this.monthlyTarget = monthlyTarget;
    }

    public void setNrOfMonthsActive(int nrOfMonthsActive) {
        this.nrOfMonthsActive = nrOfMonthsActive;
    }

    public void addToTotalExpenditure(int totalExpenditure) {
        this.totalExpenditure += totalExpenditure;
    }
}
