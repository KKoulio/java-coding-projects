package chapters.ch3;

import java.util.Scanner;

/**
 * Counts the digits of a number given.
 *
 * @author kyria
 */
public class DigitCountApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;

        // Inputs
        System.out.println("Please insert a number (int):");
        inputNum = scanner.nextInt();

        // Loop
        num = inputNum;
        do {
            count++;
            num = num / 10;
        } while (num != 0);

        System.out.printf("Number: %d consists of %d digits.", inputNum, count);
    }
}
