package chapters.ch4;

/**
 * Simple character printing examples
 *
 * @author kyria
 */
public class CharPrinting {
    public static void main(String[] args) {
        // Init
        char ch1 = 's';
        char ch2 = '8';

        // Print
        System.out.println("Char: " + ch1 + ", Ordinal: " + (int) ch1);
        System.out.println("Char: " + ch2 + ", Ordinal: " + (int) ch2);

        // Print with Format
        System.out.printf("Char: %c, Ordinal: %d\n", ch1, (int)ch1);
        System.out.printf("Char: %c, Ordinal: %d\n", ch2, (int)ch2);
    }
}
