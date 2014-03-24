package IntegerTriangle;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by sasakiumi on 3/24/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] xs = new int[N];
        int[] ys = new int[N];

        for (int i = 0; i < N; i++) {
            xs[i] = sc.nextInt();
            ys[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++) {
                    int tmp = (xs[j] - xs[i]) * (ys[k] - ys[i]) - (ys[j] - ys[i]) * (xs[k] - xs[i]);
                    if (tmp % 2 == 0 && tmp != 0) {
                        count++;
                    }
                }
        }
        System.out.println(count);
    }
}
