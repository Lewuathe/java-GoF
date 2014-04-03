package striped;

import java.util.Scanner;

/**
 * Created by sasakiumi on 4/3/14.
 */
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cost = sc.nextInt();

        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }

        int res = 1 << 10;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {

                int tmp = 0;
                for (int k = 0; k < n; k++) {
                    if (k % 2 == 0 && as[k] - 1 != i) {
                        tmp++;
                    } else if (k % 2 == 1 && as[k] - 1 != j) {
                        tmp++;
                    }
                }
                res = Math.min(res, tmp);

                tmp = 0;
                for (int k = 0; k < n; k++) {
                    if (k % 2 == 0 && as[k] - 1 != j) {
                        tmp++;
                    } else if (k % 2 == 1 && as[k] - 1 != i){
                        tmp++;
                    }
                }
                res = Math.min(res, tmp);

            }
        }
        System.out.println(res * cost);
    }
}
