package chapters.ch3;

import java.util.Scanner;

/**
 * Calculates Min between 2 numbers
 *
 * @author kyria
 */
public class MinApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        // Inputs
        System.out.println("Please insert two integers. (Press Enter after each one)");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Calculations
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        // Output
        System.out.printf("The min value between %d and %d is: %d", num1, num2, min);
    }
}
