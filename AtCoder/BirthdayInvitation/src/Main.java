import java.util.Scanner;

/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static int k;

    public static int dfs(int human, int cards[]) {
        if (human == 0) {
            if (cards[0] == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int total = 0;
        for (int i = 0; i < k; i++) {
            if (i != human && cards[i] == 1) {
                cards[i] = 0;
                total += dfs(human - 1, cards);
                cards[i] = 1;
            }
        }
        return total;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        k = K;
        int cards[] = new int[K];
        for (int i = 0; i < K; i++) {
            cards[i] = 1;
        }

        int res = dfs(K - 1, cards);
        for (int i = 0; i < N - K ; i++) {
            res *= (N - i);
        }
        for (int i = N - K; i > 0; i--) {
            res /= i;
        }
        System.out.println(res);
    }
}
