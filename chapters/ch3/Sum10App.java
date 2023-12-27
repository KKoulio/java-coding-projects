package chapters.ch3;

/**
 * Adds each number 1-10
 *
 * @author kyria
 */
public class Sum10App {
    public static void main(String[] args) {
        // Init
        int i = 1;
        int sum = 0;

        // Main Loop
        while (i <= 10){
            sum = sum + i;
            i++;
        }

        // Output
        System.out.println("Sum = " + sum);
    }
}
