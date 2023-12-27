package chapters.ch3;

import java.util.Scanner;

/**
 * This app asks the temperature and gives back an answer if it is snowing or not.
 */
public class IsSnowingApp {
    public static void main(String[] args) {
        //Init
        Scanner sc = new Scanner(System.in);
        int temperature;
        boolean isSnowing;

        // Input
        System.out.println("What is the temperature outside?");
        temperature = sc.nextInt();

        // Calculation
        isSnowing = temperature < 0; // If the temperature is lower than 0, then it is True

        // Output
        System.out.println("Is snowing: " + isSnowing);
    }
}
