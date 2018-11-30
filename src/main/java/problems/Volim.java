package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by softish on 2018-04-07.
 */
class Volim {

    private static final int GAME_DURATION = 3 * 60 + 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPlayer = scanner.nextInt();
        int numEntries = scanner.nextInt();
        scanner.nextLine();
        int numScannedEntries = 0;
        List<String> gameData = new ArrayList<>();

        while (numScannedEntries < numEntries) {
            gameData.add(scanner.nextLine());
            numScannedEntries++;
        }

        System.out.println(finishingPlayer(firstPlayer, gameData));
    }

    static int finishingPlayer(int firstPlayer, List<String> gameData) {
        int currentPlayer = firstPlayer;
        int gameTime = 0;

        for (String dataPoint : gameData) {
            String[] values = dataPoint.trim().split(" ");

            gameTime += Integer.parseInt(values[0]);
            if (gameTime >= GAME_DURATION) {
                break;
            }

            if (values[1].equals("T")) {
                currentPlayer %= 8;
                currentPlayer++;
            }
        }

        return currentPlayer;
    }
}
