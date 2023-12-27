package chapters.ch2;

import java.util.Scanner;

/**
 * Ask the user for an amount of seconds, then turn it into Days, Hours, and Minutes.
 * Also, provide remaining Seconds.
 *
 * @author kyria
 */
public class SecondsDemo {

    public static void main(String[] args) {
        // Init
        Scanner sc = new Scanner(System.in);
        final int DAY = 24 * 3600;
        final int HOUR = 3600;
        final int MINUTE = 60;
        int inputSeconds = 0, days = 0, hours = 0, minutes = 0, remainingSeconds = 0;

        System.out.println("Please input the amount of seconds:");
        inputSeconds = sc.nextInt();
        remainingSeconds = inputSeconds; // After each transaction we are adding the remaining seconds here

        days = remainingSeconds / DAY;
        remainingSeconds = remainingSeconds % DAY;

        hours = remainingSeconds / HOUR;
        remainingSeconds = remainingSeconds % HOUR;

        minutes = remainingSeconds / MINUTE;
        remainingSeconds = remainingSeconds % MINUTE;

        // Exit
        System.out.printf("The amount of %d seconds is equal to: %d Day(s), %d Hour(s), %d Minute(s), and %d Second(s)",
                inputSeconds, days, hours, minutes, remainingSeconds);
    }

}
