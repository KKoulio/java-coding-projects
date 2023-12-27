package chapters.ch3;

import java.util.Scanner;

/**
 * An aircraft has 2 fuel tanks.
 * The pilot is asked if tank1 is at 1/4 capacity, then if tank2 is at 1/4 capacity.
 * If 1 out 2 is at said capacity, we get an orange light indication.
 * If 2 out 2 are at said capacity, we get a red light indication.
 *
 * @author kyria
 */
public class RedOrangeSignal {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        boolean tankOneCapacity = false;
        boolean tankTwoCapacity = false;
        boolean orangeLightOn = false;
        boolean redLightOn = false;

        // Input
        System.out.println("Is tank N.1 at 1/4 capacity? (true/false)");
        tankOneCapacity = scanner.nextBoolean();

        System.out.println("Is tank N.2 at 1/4 capacity? (true/false)");
        tankTwoCapacity = scanner.nextBoolean();

        // Calculations
        orangeLightOn = tankOneCapacity || tankTwoCapacity;
        redLightOn = tankOneCapacity && tankTwoCapacity;

        // Output
        System.out.printf("Orange light on: %b \nRed light on: %b", orangeLightOn, redLightOn);
    }
}
