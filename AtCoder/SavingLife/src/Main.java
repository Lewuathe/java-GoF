import java.util.Scanner;

/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pattern = sc.next();

        int N = pattern.length();

        boolean[] b = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (pattern.charAt(i) == 'o') {
                b[i] = true;
            }
        }

        int ret = 999;
        for (int i = 0; i < (1 << 10); i++) {
            int count = 0;
            boolean[] now = new boolean[N];

            for (int j = 0; j < N; j++) {
                if ((i >> j) % 2 == 0) {
                    continue;
                }
                count += 1;
            }
        }
    }
}
