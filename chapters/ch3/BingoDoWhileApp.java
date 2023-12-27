package chapters.ch3;

import java.util.Scanner;

/**
 * A simple number guess example.
 * This example is using the do-while method which is used in cryptography to guess keys or passwords.
 * This is called brute-force.
 *
 * @author kyria
 */
public class BingoDoWhileApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int key = 10;
        int inputNumber = 0;
        boolean bingo = false;

        // Main Loop
        do {
            System.out.println("Guess the number I am thinking: ");
            inputNumber = scanner.nextInt();

            // Calculation + Output
            if (inputNumber == key) {
                bingo = true;
                System.out.println("Bingo! You guessed correctly!");
            } else {
                System.out.println("Wrong! Try again.");
            }
        } while (!bingo);
    }
}
