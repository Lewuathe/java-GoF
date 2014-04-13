package B;

import java.util.Scanner;

/**
 * Created by sasakiumi on 4/13/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        int current = 0;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            int k = (i + 1) % N;
            A[k] = A[i] ^ B[i];
        }

        if (B[0] != (A[0] ^ A[1])) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }
}
