package ChangeSeats;

import java.util.Scanner;

/**
 * Created by sasakiumi on 3/24/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int x0 = sc.nextInt();
        int a = sc.nextInt();
        int p = sc.nextInt();
        int[] scores = new int[N * M];

        if (a % p == 0) {
            if (x0 <= (x0 + a) % p) {
                // No need to change
                System.out.println(0);
                return;
            } else {
                System.out.println(2 * (N - 1));
                return;
            }
        }

        for (int i = 0; i < N * M; i++) {
            scores[i] = (x0 + a) % p;
        }


    }
}
