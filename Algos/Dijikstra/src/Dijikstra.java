import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by sasakiumi on 3/31/14.
 */
public class Dijikstra {
    public static int INF = 1 << 10;

    public static int[] decode(int v) {
        int[] ret = new int[2];
        ret[0] = v / 1000;
        ret[1] = v % 1000;
        return ret;
    }

    public static int shortestPath(int[][] adj, int s, int N, int g) {
        int d[] = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = INF;
        }
        d[s] = 0;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(1000 * 0 + s);
        while (!q.isEmpty()) {
            int[] val = decode(q.poll());
            int dist = val[0];
            int vertex = val[1];
            if (dist > d[vertex]) continue;
            for (int i = 0; i < N; i++) {
                if (d[i] > d[vertex] + adj[vertex][i]) {
                    d[i] = d[vertex] + adj[vertex][i];
                    q.add(1000 * d[i] + i);
                }
            }

        }
        return d[g];

    }
}
