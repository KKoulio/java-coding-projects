package chapters.ch3;

import java.util.Scanner;

/**
 * Calculates the absolute number using the ternary operator
 *
 * @author kyria
 */
public class AbsTern {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;

        // Inputs
        System.out.println("Please input a number to calculate its Absolute: ");
        num1 = scanner.nextInt();

        // Calculation + Output
        System.out.printf("The absolute number of %d is %d", num1, (num1 > 0) ? num1 : -num1);
    }
}
