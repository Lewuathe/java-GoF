import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static int encode(int temperature, int count) {
        return 100 * count + temperature;
    }
    public static int bfs(int A, int B) {
        Queue<Integer> nowq = new LinkedList<Integer>();
        nowq.add(encode(A, 0));

        int ops[] = {1, -1, 5, -5, 10, -10};

        while (!nowq.isEmpty()) {
            int now = nowq.poll();
            int count = now / 100;
            int temperature = now % 100;
            if (temperature == B) {
                System.out.println(count);
                return count;
            }
            for (int i = 0; i < 6; i++) {
                int op = ops[i];
                nowq.add(encode(temperature + op, count + 1));
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        bfs(A, B);
    }
}
