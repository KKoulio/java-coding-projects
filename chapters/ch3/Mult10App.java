package chapters.ch3;

/**
 * Multiplies each number 1-10
 *
 * @author kyria
 */
public class Mult10App {
    public static void main(String[] args) {
        // Init
        int i = 1;
        int mul = 1;

        // Main Loop
        while (i <= 10){
            mul = mul * i;
            i++;
        }

        // Output
        System.out.println("Mul = " + mul);
    }
}
