package chapters.ch4;

/**
 * Prints all of the emojis
 * Breaks the line for every 16 characters
 *
 * @author kyria
 */
public class EmojiPrinter {
    public static void main(String[] args) {
        // Init
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int i = emojiStart;

        // Main Loop + Printing
        while (i <= emojiEnd) {
            System.out.print(Character.toChars(i));
            System.out.print(' '); // Space between each emoji
            i++;
            if (i % 16 == 0) System.out.print("\n"); // Breaks the line
        }
    }
}
