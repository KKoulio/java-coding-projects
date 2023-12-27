package chapters.ch3;

import java.util.Scanner;

/**
 * Prints a menu at least once until the user used the std input to inserted 3.
 *
 * @author kyria
 */
public class DoWhileMenuApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Main Loop
        do {
            System.out.println("Please choose one of the following:");
            System.out.println("1. Insert Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
        } while (choice != 3);

        // Output + Exit
        System.out.println("Exit selected. Goodbye..");
    }
}
