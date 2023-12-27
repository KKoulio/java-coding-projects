package chapters.ch3;

import java.util.Scanner;

/**
 * Calculates min between two integers with the use of the Ternary Operator
 *
 * @author kyria
 */
public class MinTernaryOpApp {
    public static void main(String[] args) {
        // Initializing
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        // Inputs
        System.out.println("Please insert two integers. (Press Enter after each one)");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Calculation
        min = (num1 < num2) ? num1 : num2;

        // Output
        System.out.printf("The min value between %d and %d is: %d", num1, num2, min);
    }
}
