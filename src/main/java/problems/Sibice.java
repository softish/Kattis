package problems;

import java.util.Scanner;

/**
 * Created by softish on 2018-07-07.
 */
public class Sibice {

    private int boxWidth;
    private int boxHeight;

    public static void main(String[] args) {
        Sibice sibice = new Sibice();
        Scanner scanner = new Scanner(System.in);

        sibice.setMatchBoxMetadata(scanner.nextLine());
        while (scanner.hasNext()) {
            System.out.println(sibice.doesFit(scanner.nextInt()) ? "DA" : "NE");
        }
    }

    boolean doesFit(int matchHeight) {
        return matchHeight <= lengthOfHypotenuse();
    }

    /**
     * Finds length of hypotenuse of the matchbox using the pythagorean theorem.
     *
     * @return the length
     */
    private double lengthOfHypotenuse() {
        return Math.sqrt(Math.pow(boxWidth, 2) + Math.pow(boxHeight, 2));
    }

    void setMatchBoxMetadata(String metadata) {
        String[] metadataElements = metadata.split(" ");
        this.boxWidth = Integer.parseInt(metadataElements[1]);
        this.boxHeight = Integer.parseInt(metadataElements[2]);
    }
}
