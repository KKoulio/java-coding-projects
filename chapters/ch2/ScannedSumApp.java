package chapters.ch2;

import java.util.Scanner;

public class ScannedSumApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Please input 2 int numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println("The resulting sum is: " + sum);
    }
}
