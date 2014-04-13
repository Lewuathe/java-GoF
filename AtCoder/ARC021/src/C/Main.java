package C;

import java.util.Scanner;

/**
 * Created by sasakiumi on 4/13/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            D[i] = sc.nextInt();
        }

        // A + (A + D) + (A + 2*D) + (A + 3*D) + (A + 4*D)= 5A + 10D
        // dp[i][j] i:建物iまでに j:j回増築を行った
        // 時の価格の最小値
        // dp[i+1][j] = min(dp[i][j-k] + , )
        int[][] dp = new int[N + 1][K + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                dp[i][j] = 1000000000;
            }
        }

        for (int i = 0; i <= N; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= K; j++) {
//                dp[i + 1][j] = Math.min(dp[i + 1][j - 1] + A[i] + (j - 1) * D[i], dp[i][j]);
                dp[i + 1][j] = dp[i][j];
                for (int k = 1; k <= j; k++) {
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j - k] + k * A[i] + (k * (k - 1) * D[i] / 2));
                }
            }
        }
//
//        for (int i = 0; i <= N; i++) {
//            for (int j = 0; j <= K; j++) {
//                System.out.printf("%d ", dp[i][j]);
//            }
//            System.out.println("");
//        }

        System.out.println(dp[N][K]);
    }
}
