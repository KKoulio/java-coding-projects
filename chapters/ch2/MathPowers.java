package chapters.ch2;

import java.util.Scanner;

/**
 * This app uses the Math.pow(), from the class Math, to calculate powers.
 * Also, during printing we are typecasting into Int type for better showcase.
 * In case we leave it as it is, the amount printed will be Double type.
 *
 * @author kyria
 */
public class MathPowers {
    public static void main(String[] args) {
        // Init
        Scanner sc = new Scanner(System.in);
        int num;

        // Inputs
        System.out.println("Please insert an int to calculate its powers:");
        num = sc.nextInt();

        // Output
        System.out.printf("%d's powers are: \n Cube: %d \n Square: %d",
                num, (int) Math.pow(num, 3), (int) Math.pow(num, 2)); // The blanks at line start are for show
    }
}
