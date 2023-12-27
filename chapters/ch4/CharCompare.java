package chapters.ch4;

/**
 * Compares 2 characters, one in Greek and one in English.
 * Returns which character has greater value
 * UTF-2 contains both ASCII and Greek.
 *
 * @author kyria
 */
public class CharCompare {
    public static void main(String[] args) {
        // Init
        char a = 'α';
        char b = 'b';
        boolean greekIsGreater = false;

        // Print
        System.out.println((int) a);
        System.out.println((int) b);

        if (a > b) greekIsGreater = true;

        // Print
        System.out.println("Greek is greater: " + greekIsGreater);
    }
}
