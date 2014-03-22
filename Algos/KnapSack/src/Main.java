/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static int n = 4;
    public static int[] ws = {2, 1, 3, 2};
    public static int[] vs = {3, 2, 4, 2};
    public static int W = 5;

    public static void main(String[] args) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= W; j++) {
                if (j < ws[i]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - ws[i]] + vs[i]);
                }
            }
        }
        System.out.println(dp[n][W]);
    }
}
