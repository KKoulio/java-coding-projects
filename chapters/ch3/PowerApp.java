package chapters.ch3;

import java.util.Scanner;

/**
 * Calculates a^b.
 *
 * @author kyria
 */
public class PowerApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        int result = 1;
        int i = 1;

        // Inputs
        System.out.println("Please insert a and b (a^b).");
        a = scanner.nextInt();
        b = scanner.nextInt();

        // Main Loop
        while (i <= b) {
            result = result * a;
            i++;
        }

        // Output
        System.out.println("Result: " + result);
    }
}
