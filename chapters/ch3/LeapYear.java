package chapters.ch3;

import java.util.Scanner;

/**
 * Takes in a year.
 * Calculates if it is a leap year
 *
 * @author kyria
 */
public class LeapYear {
    public static void main(String[] args) {
        //Init
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        // Input
        System.out.println("Please insert the date you want to be checked: ");
        year = scanner.nextInt();

        // Feedback
        if ((year % 400) == 0){
            System.out.printf("%d is a leap year.", year);
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.printf("%d is a leap year.", year);
        } else {
            System.out.printf("%d is not a leap year.", year);
        }
    }
}
