package chapters.ch3;

public class BreakAndContinueDEMO {
    public static void main(String[] args) {
        // Init
        int i = 0;
        int j = 0;
        int result = 0;

        // Example of Break
        while (true) {
            if (i == 10) break; // By adding the break command we avoid an indefinite loop
            i++;
        }

        // Example of continue
        while (j <= 10) {
            j++;
            if (j == 5) continue;
            result += j;
        }
    }
}
