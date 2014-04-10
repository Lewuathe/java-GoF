import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class EmoticonsDiv1 {
    public static int[] decode(int code) {
        int[] ret = new int[2];
        ret[0] = code / 10000;
        ret[1] = code % 10000;
        return ret;
    }

    public int printSmiles(int smiles) {
        Queue<Integer> q = new LinkedList<Integer>();
        int[][] state = new int[1 << 1000][1 << 1000];
        for (int i = 0; i < 1 << 1000; i++) {
            for (int j = 0; j < 1 << 1000; j++) {
                state[i][j] = (1 << 1000);
            }
        }

//        state[i][j] : i = message, j = clipboard
        state[1][0] = 0;
        q.add(1 * 10000 + 0);

        while (!q.isEmpty()) {
            int[] ret = decode(q.poll());
            int message = ret[0];
            int clipboard = ret[1];

            if (state[message][message] > state[message][clipboard] + 1) {
                state[message][message] = state[message][clipboard] + 1;
                q.add(message * 10000 + message);
            }

            if (message + clipboard < (1 << 1000) && state[message + clipboard][clipboard] > state[message][clipboard] + 1) {
                state[message + clipboard][clipboard] = state[message][clipboard] + 1;
                if (message + clipboard == smiles) return state[message + clipboard][clipboard];
                q.add((message + clipboard) * 10000 + clipboard);
            }

            if (message > 0 && state[message - 1][clipboard] > state[message][clipboard] + 1) {
                state[message - 1][clipboard] = state[message][clipboard] + 1;
                if (message - 1 == smiles) return state[message - 1][clipboard];
                q.add((message - 1) * 10000 + clipboard);
            }

        }

        return 1 << 1000;
    }
}
