package chapters.ch2;

import java.util.Locale;

/**
 * Use Locale to change what some of the symbols are used for.
 * In this example we are using Greek(el) in order to use "," instead of "." as a separator for thousands.
 *
 * @author kyria
 */
public class TypeSuffixDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        long num = 2_147_483_647L;
        System.out.printf(Locale.forLanguageTag("el"), "%d ", num);
    }
}
