package chapters.ch3;

import java.util.Scanner;

/**
 * Calculates the absolute of a number given
 *
 * @author kyria
 */
public class AbsApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        // Inputs
        System.out.println("Please give in a number to calculate its absolute: ");
        num = scanner.nextInt();

        // Calculation
        abs = (num > 0) ? num : - num;

        // Output
        System.out.printf("The absolute number of %d is: %d", num, abs);
    }
}
