package chapters.ch2;

import java.util.Scanner;

/**
 * In this app we provide 3 int numbers that are shown back as the date in form of DD/MM/YY.
 *
 * @author kyria
 */
public class NumbersToDateApp {

    public static void main(String[] args) {
        // Init
        Scanner sc = new Scanner(System.in);
        int day, month, year;

        // Input
        System.out.println("Please type 3 numbers to represent Day, Month, and Year. (Press Enter after each input)");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        // Calculation
        year = year % 100; // This will show the last 2-digits of the number given e.g. 2023 will be shown as 23.

        // Output
        System.out.printf("The date inserted shown as DD/MM/YY is: %d/%d/%d", day, month, year);
    }
}
