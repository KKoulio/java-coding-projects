package chapters.ch2;

import java.util.Scanner;

/**
 * Converts Days, Hours, Minutes to Seconds
 *
 * @author kyria
 */
public class DHMToSec {
    public static void main(String[] args) {
        // Init
        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MINUTE = 60;

        Scanner sc = new Scanner(System.in);
        long days, hours, minutes, secs;
        long totalSeconds;

        // Get inputs
        System.out.println("Please give in the number of Days, Hours, Minutes, and Seconds. (Press Enter after each entry)");
        days = sc.nextLong();
        hours = sc.nextLong();
        minutes = sc.nextLong();
        secs = sc.nextLong();

        // Calculate
        totalSeconds = (days * SEC_PER_DAY) + (hours * SEC_PER_HOUR) + (minutes * SEC_PER_MINUTE) + (secs);

        // Output
        System.out.println("The total amount in seconds is: " + totalSeconds);
    }
}
