import java.util.*;

import static java.util.Arrays.*;

/**
 * Created by sasakiumi on 3/21/14.
 */
public class Main {
    public static int n = 5;
    public static int[] s = {1, 2, 4, 6, 8};
    public static int[] t = {3, 5, 7, 9, 10};

    public static void main(String[] args) {
        int tasks = 0;
        int currentTime = 0;

        for (int i = 0; i < n; i++) {
            if (currentTime < s[i]) {
                tasks += 1;
                currentTime = t[i];
            }
        }
        System.out.println(tasks);
    }
}
