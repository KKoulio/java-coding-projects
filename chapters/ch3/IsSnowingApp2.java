package chapters.ch3;

import java.util.Scanner;

/**
 * Here we ask the temperature and if it is raining, then we get back if it is snowing.
 * This app is an alternative version of the previous one.
 *
 * @author kyria
 */
public class IsSnowingApp2 {
    public static void main(String[] args) {
        // Init
        Scanner sc = new Scanner(System.in);
        int temperature;
        boolean isRaining, isSnowing;

        // Inputs
        System.out.println("What is the temperature: ");
        temperature = sc.nextInt();
        System.out.println("Is it raining outside?(true/false)");
        isRaining = sc.nextBoolean();

        // Calculation
        isSnowing = isRaining && (temperature < 0);

        // Output
        System.out.println("Is snowing: " + isSnowing);
    }
}
