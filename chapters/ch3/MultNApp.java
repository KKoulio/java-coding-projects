package chapters.ch3;

import java.util.Scanner;

/**
 * Multiplies N numbers with each other
 *
 * @author kyria
 */
public class MultNApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int n = 0;
        int mul = 1;

        // Inputs
        System.out.println("Please insert a number N: ");
        n = scanner.nextInt();

        // Main Loop
        while (i <= n){
            mul = mul * i;
            i++;
        }

        // Output
        System.out.println("Mul = " + mul);
    }
}
