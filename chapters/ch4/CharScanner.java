package chapters.ch4;

import java.util.Scanner;

/**
 * Reads a char through the use of the Scanner.
 * Reads the whole line, but keeps only the character in the 1st position
 *
 * @author kyria
 */
public class CharScanner {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        char inputChar = ' ';

        // Input
        System.out.println("Please input a char: ");
        inputChar = scanner.nextLine().charAt(0);

        // Output
        System.out.println("Input char: " + inputChar);
    }
}
