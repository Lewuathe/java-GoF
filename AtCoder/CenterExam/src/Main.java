import java.util.Scanner;

/**
 * Created by sasakiumi on 3/21/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String cs = sc.next();

        int[] correct = new int[4];
        for (int i = 0; i < 4; i++) {
            correct[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            int c = Integer.parseInt("" + cs.charAt(i));
            correct[c-1] += 1;
        }

        int max = 0;
        int min = 100000;
        for (int i = 0; i < 4; i++) {
            if (max < correct[i]) {
                max = correct[i];
            }
            if (min > correct[i]) {
                min = correct[i];
            }
        }

        System.out.printf("%d %d\n", max, min);
    }
}
