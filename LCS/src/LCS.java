import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasakiumi on 3/13/14.
 */
public class LCS {
    public static String solve(String str1, String str2, int[][] table) {
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                Integer d = str1.charAt(i - 1) == str2.charAt(j - 1) ? 1 : 0;
                table[i][j] = Math.max(table[i - 1][j - 1] + d, Math.max(table[i][j - 1], table[i - 1][j]));
                System.out.printf("%d ", table[i][j]);
            }
            System.out.println("");
        }

        return "A";
    }
}
