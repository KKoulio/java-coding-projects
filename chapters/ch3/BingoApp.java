package chapters.ch3;

import java.util.Scanner;

/**
 * Asks the user for a number.
 * If the user gives in the correct number determined by the app, they get a "Bingo!" message.
 * Else, they get a try again message.
 *
 * @author kyria
 */
public class BingoApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;

        // Inputs
        System.out.println("Guess the number I am thinking: ");
        inputNum = scanner.nextInt();

        // Calculation + Output
        if (key == inputNum) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Wrong! Restart and guess again!");
        }
    }
}
