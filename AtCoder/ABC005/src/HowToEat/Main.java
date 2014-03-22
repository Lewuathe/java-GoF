package HowToEat;

import java.util.Scanner;

/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 1000;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            if (min > s) {
                min = s;
            }
        }
        System.out.println(min);
    }
}
