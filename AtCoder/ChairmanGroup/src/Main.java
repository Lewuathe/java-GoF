import java.util.Scanner;

/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[][] friend = new boolean[N][N];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            friend[a][b] = friend[b][a] = true;
        }

        int ret = 0;
        for (int i = 0; i < (1 << N); i++) {
            int count = 0;
            boolean flag = true;

            for (int a = 0; a < N; a++) {
                if ((i >> a) % 2 == 0) {
                    continue;
                }

                count += 1;
                for (int b = a + 1; b < N; b++) {
                    if ((i >> b) % 2 == 0) {
                        continue;
                    }

                    if (!friend[a][b]) {
                        flag = false;
                    }
                }
            }

            if (flag) {
                ret = Math.max(ret, count);
            }
        }
        System.out.println(ret);
    }
}
