/**
 * Created by sasakiumi on 3/21/14.
 */
public class Main {
    public static int N = 6;
    public static int R = 10;
    public static int[] X = {1, 7, 15, 20, 30, 50};

    public static void main(String[] args) {
        int i = 0;
        int ans = 0;

        while (i < N) {
            int s = X[i++];
            while (i < N && X[i] <= s + R) {
                i++;
            }

            int p = X[i-1];

            while (i < N && X[i] <= p + R) {
                i++;
            }

            ans++;
        }

        System.out.println(ans);
    }
}
