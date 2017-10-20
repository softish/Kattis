package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-10-20.
 */
public class Bijele {

    private static int[] delta;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String[] pieces = scanner.nextLine().trim().split(" ");
            ChessPiece[] values = ChessPiece.values();

            calculateDeltas(pieces, values);
            displayResults();
        }
    }

    private static void displayResults() {
        for (int i = 0; i < delta.length; i++) {
            System.out.print(delta[i] + " ");
        }
    }

    private static void calculateDeltas(String[] pieces, ChessPiece[] values) {
        for (int i = 0; i < pieces.length; i++) {
            int actualCount = Integer.parseInt(pieces[i]);
            int referenceCount = values[i].getAmount();

            delta[i] = referenceCount - actualCount;
        }
    }

    static {
        delta = new int[ChessPiece.values().length];
    }

    enum ChessPiece {
        KING(1),
        QUEEN(1),
        ROOK(2),
        BISHOP(2),
        KNIGHT(2),
        PAWN(8);

        private final int amount;

        ChessPiece(int amount) {
            this.amount = amount;
        }

        int getAmount() {
            return amount;
        }
    }
}
