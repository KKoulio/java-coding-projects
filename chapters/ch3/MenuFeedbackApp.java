package chapters.ch3;

import java.util.Scanner;

/**
 * Prints a menu.
 * Gives feedback based on the choice
 *
 * @author kyria
 */
public class MenuFeedbackApp {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Main Loop + Input + Output
        do {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Inserted Successfully");
            } else if (choice == 2) {
                System.out.println("Searched Successfully");
            } else if (choice == 3) {
                System.out.println("Deleted Successfully");
            } else if (choice == 4) {
                System.out.println("Updated Successfully");
            } else if (choice == 5) {
                System.out.println("Now exiting...");
            } else {
                System.out.println("Invalid choice");
            }
        } while (choice != 5);

        // Output
        System.out.println("Goodbye!");
    }
}
