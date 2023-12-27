package chapters.ch2;

import java.util.Scanner;

/**
 * In this app we are simulating a simple ATM transaction of withdrawal.
 * We request an amount of money and the ATM provides us with bills of 500, 200, 100, 50, 20, 10 as well as
 * 1 euro coins.
 *
 * @author kyria
 */
public class ATMEuroApp {

    public static void main(String[] args) {
        // Init
        Scanner sc = new Scanner(System.in);
        int euros500, euros200, euros100, euros50, euros20, euros10, euros5;
        int remainingEuros;

        // Inputs
        System.out.println("Please type an integer amount of Euros you want to withdraw:");
        remainingEuros = sc.nextInt();

        // Calculations
        euros500 = remainingEuros / 500;
        remainingEuros = remainingEuros % 500;

        euros200 = remainingEuros / 200;
        remainingEuros = remainingEuros % 200;

        euros100 = remainingEuros / 100;
        remainingEuros = remainingEuros % 100;

        euros50 = remainingEuros / 50;
        remainingEuros = remainingEuros % 50;

        euros20 = remainingEuros / 20;
        remainingEuros = remainingEuros % 20;

        euros10 = remainingEuros / 10;
        remainingEuros = remainingEuros % 10;

        euros5 = remainingEuros / 5;
        remainingEuros = remainingEuros % 5;

        // remainingEuros is certainly an amount smaller than 5 which will be represented as 1 euros

        //Output
        System.out.printf("You will receive the following currency: \n " +
                "500 Euros: %d \n 200 Euros: %d \n 100 Euros: %d \n 50 Euros: %d \n 20 Euros: %d \n 10 Euros: %d \n " +
                "5 Euros: %d \n 1 Euros: %d \n", euros500, euros200, euros100, euros50, euros20, euros10, euros5, remainingEuros);
    }
}
