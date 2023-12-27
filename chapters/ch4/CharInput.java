package chapters.ch4;

import java.io.IOException;

/**
 * Reads the input using System.in.Read()
 * Returns print of it in Char
 *
 * @author kyria
 */
public class CharInput {
    public static void main(String[] args) throws IOException {
        // Init
        int inputChar = ' ';

        System.out.println("Please input an ASCII character: ");
        inputChar = System.in.read(); // Reads only the 1st character

        System.out.println("Char: " + (char) inputChar);
    }
}
