package chapters.ch3;

import java.util.Scanner;

/**
 * Decides if the lights of the car should be on.
 * This is based on these factors:
 * While it is raining, is it dark? or are we going over 100km?
 * These are std based inputs
 *
 * @author kyria
 */
public class LightsApp {

    public static void main(String[] args) {
        // Init
        Scanner sc = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int carSpeed = 0;
        boolean lightsOn = false;

        // Inputs
        System.out.println("Is it raining right now?(true/false)");
        isRaining = sc.nextBoolean();

        System.out.println("Is it dark right now?(true/false)");
        isDark = sc.nextBoolean();

        System.out.println("How fast are you going? (km/h)");
        carSpeed = sc.nextInt();

        // Calculations
        isRunning = carSpeed > 100;

        lightsOn = isRaining && (isDark || isRunning);

        // Output
        System.out.println("The car lights are on: " + lightsOn);
    }
}
