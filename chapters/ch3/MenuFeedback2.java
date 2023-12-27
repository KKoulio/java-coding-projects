package chapters.ch3;

import java.util.Scanner;

/**
 * Prints a menu for the user.
 * The user inputs a number 1-4 for a choice in the menu.
 * Input 5 exits.
 * If any other input is given outside 1-5, the user gets an appropriate message.
 * Any other input prints an error message on console.
 *
 * @author kyria
 */
public class MenuFeedback2 {
    public static void main(String[] args) {
        //Init
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        //Main Loop
        do {
            // Menu print. All this can be done with a method for more optimising
            System.out.println("Please choose an option from the menu below:");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            if (scanner.hasNextInt()) { // Checks if the input was an integer else we get a message regarding the error
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
                    System.out.println("Number must be from 1-5.");
                }
            } else {
                System.out.println("Wrong type of input. Try again..");
                scanner.nextLine(); // This assures that the scanner does not keep the input for the next Loop
            }
        } while (choice != 5);
    }
}
