import java.util.Scanner;

/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] weights = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
            sum += weights[i];
        }

        if (sum % 2 == 1) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < (1 << N); i++) {
            int total = 0;
            for (int j = 0; j < N; j++) {
                if ((i >> j) % 2 == 1) {
                    total += weights[j];
                }
            }
            if (total == (sum / 2)) {
                System.out.println("YES");
                return;
            }

        }
    }
}
