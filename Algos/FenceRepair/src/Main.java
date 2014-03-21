import java.util.Arrays;


/**
 * Created by sasakiumi on 3/21/14.
 */
public class Main {
    public static int N = 3;
    public static int[] L = {8, 5, 8};

    public static void main(String[] args) {
        Arrays.sort(L);

        int cost = L[0] + L[1];
        for (int i = 2; i < N; i++) {
            cost += cost + L[i];
        }

        System.out.println(cost);
    }
}
