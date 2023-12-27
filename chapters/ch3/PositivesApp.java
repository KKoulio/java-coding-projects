package chapters.ch3;

import java.util.Scanner;

/**
 * Asks for numbers until a negative number is given.
 * Returns the number of positive numbers given.
 *
 * @author kyria
 */
public class PositivesApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int count = 0;

        // Input
        System.out.println("Please insert a positive number (or a negative number for exit).");
        num = scanner.nextInt();

        // Main Loop
        while (num >= 0) {
            System.out.println("Positive number inserted..");
            count++;
            System.out.println("Please insert a positive number (or a negative number for exit).");
            num = scanner.nextInt();
        }

        // Output
        System.out.println("Total positive numbers inserted: " + count);
    }
}
