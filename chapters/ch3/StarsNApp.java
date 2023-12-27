package chapters.ch3;

import java.util.Scanner;

/**
 * Prints N stars horizontally.
 *
 * @author kyria
 */
public class StarsNApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int n = 0;

        // Inputs
        System.out.println("Please insert a number of stars that you want printed horizontally: ");
        n = scanner.nextInt();

        // Main Loop
        while (i <= n) {
            System.out.print("*");
            i++;
        }
    }
}
