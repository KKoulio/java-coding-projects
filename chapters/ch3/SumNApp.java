package chapters.ch3;

import java.util.Scanner;

/**
 * Adds n numbers with each other
 *
 * @author kyria
 */
public class SumNApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int n = 0;
        int sum = 0;

        // Inputs
        System.out.println("Please insert a number N: ");
        n = scanner.nextInt();

        // Main Loop
        while (i <= n){
            sum = sum + i;
            i++;
        }

        // Output
        System.out.println("Sum = " + sum);
    }
}
