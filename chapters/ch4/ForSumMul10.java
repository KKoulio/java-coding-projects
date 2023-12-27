package chapters.ch4;

/**
 * An example of using for.
 * Calculates the SUM and MUL of the first 10 numbers
 *
 * @author kyria
 */
public class ForSumMul10 {
    public static void main(String[] args) {
        // Init
        int sum = 0;
        int mul = 1;

        // Main Example Loop
        for (int i = 1; i <= 10; i++){
            sum += i;
            mul *= i;
        }

        // Output
        System.out.printf("Sum is: %d \nMul is: %d", sum, mul);
    }
}
