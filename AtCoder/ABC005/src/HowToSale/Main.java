package HowToSale;

import java.util.Scanner;

/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int N = sc.nextInt();
        int[] takoyakis = new int[N];
        boolean[] sold = new boolean[N];
        for (int i = 0; i < N; i++) {
            takoyakis[i] = sc.nextInt();
            sold[i] = false;
        }


        int M = sc.nextInt();
        boolean[] gets = new boolean[M];
        int[] customers = new int[M];
        for (int i = 0; i < M; i++) {
            customers[i] = sc.nextInt();
            gets[i] = false;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (customers[i] - t <= takoyakis[j] && customers[i] >= takoyakis[j] && !sold[j]) {
                    sold[j] = true;
                    gets[i] = true;
                    break;
                }
            }
        }


        for (int i = 0; i < M; i++) {
            if (!gets[i]) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
