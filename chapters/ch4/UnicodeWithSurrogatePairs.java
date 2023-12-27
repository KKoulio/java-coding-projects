package chapters.ch4;

/**
 * To represent unicodes with >4 digits can be represented in UTF-16 by surrogate pairs.
 * There are calculators for doing this online such as:
 * https://russellcottrell.com/greek/utilities/SurrogatePairCalculator.htm
 * This is also done with Java's toChars Method
 *
 * @author kyria
 */
public class UnicodeWithSurrogatePairs {
    public static void main(String[] args) {
        int codePoint = 0x1F600; //Smiley

        // Convert
        System.out.println("Smiley: \uD83D\uDE00");

        // Convert with Java's toChars method
        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
