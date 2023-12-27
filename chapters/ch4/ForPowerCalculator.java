package chapters.ch4;

import java.util.Scanner;

/**
 * Takes in a and b.
 * Calculates a^b
 *
 * @author kyria
 */
public class ForPowerCalculator {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;

        // Input
        System.out.println("Please input a then b:");
        a = scanner.nextInt();
        b = scanner.nextInt();

        // Calculating
        for (int i = 1; i <= b; i++){
            result *= a;
        }

        // Output
        System.out.println("The resulting power is: " + result);
    }
}
