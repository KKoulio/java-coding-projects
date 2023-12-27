package chapters.ch3;

import java.util.Scanner;

/**
 * Calculates the factorial of N.
 *
 * @author kyria
 */
public class FactorialApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int i = 1, n = 0;
        int facto = 1;

        // Inputs
        System.out.println("Please insert a number N to calculate its Factorial: ");
        n = scanner.nextInt();

        // Main Loop
        while (i <= n) {
            facto *= i;
            i++;
        }

        // Output
        System.out.printf("Factorial of %d is: %d", n, facto);
    }
}
