package chapters.ch2;

import java.util.Scanner;

/**
 * Takes in an amount of Euros and converts it to Dollars and Cents
 *
 * @author kyria
 */
public class EuroToDollarConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PARITY = 99;
        int inputEuro;
        int usDollars;

        System.out.println("Please give an amount of Euros to convert into dollars:");
        inputEuro = sc.nextInt();
        usDollars = (inputEuro * PARITY) / 100;

        // Show time
        System.out.printf("The total amount of %d Euros, is equal to %d Dollars \n", inputEuro, usDollars);

        // Some extras
        int usCents = (inputEuro * PARITY) % 100;
        System.out.printf("Don't forget your change! \nHere it is: %d Cents \n", usCents);
    }
}
