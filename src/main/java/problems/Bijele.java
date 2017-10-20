package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by softish on 2017-10-20.
 */
public class Bijele {

    private static Map<ChessPiece, Integer> chessPieceSetMap;
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
            int referenceCount = chessPieceSetMap.get(values[i]);

            delta[i] = referenceCount - actualCount;
        }
    }

    static {
        chessPieceSetMap = new HashMap<>();
        delta = new int[ChessPiece.values().length];
        chessPieceSetMap.put(ChessPiece.KING, 1);
        chessPieceSetMap.put(ChessPiece.QUEEN, 1);
        chessPieceSetMap.put(ChessPiece.ROOK, 2);
        chessPieceSetMap.put(ChessPiece.BISHOP, 2);
        chessPieceSetMap.put(ChessPiece.KNIGHT, 2);
        chessPieceSetMap.put(ChessPiece.PAWN, 8);
    }

    enum ChessPiece {
        KING,
        QUEEN,
        ROOK,
        BISHOP,
        KNIGHT,
        PAWN
    }
}