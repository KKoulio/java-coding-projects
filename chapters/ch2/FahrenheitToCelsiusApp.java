package chapters.ch2;

import java.util.Scanner;

public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        // Init
        Scanner sc = new Scanner(System.in);
        int fahrenheit, celsius;

        // Input
        System.out.println("Please give in the temperature in Fahrenheit:");
        fahrenheit = sc.nextInt();

        // Calculations
        celsius = (5 * (fahrenheit - 32)) / 9;

        // Output
        System.out.println("The temperature in Celsius is: " + celsius);
    }
}
