import java.util.*;

/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static int height;
    public static int width;

    public static int encode(int x, int y) {
        return y * 1000 + x;
    }

    public static boolean isOk(int x, int y) {
        return y >= 0 && x >= 0 && y < height && x < width;
    }

    public static boolean bfs(int sx, int sy, char field[][]) {
        Queue<Integer> nowq = new LinkedList<Integer>();
        nowq.add(encode(sx, sy));

        int[] vx = {1, 0, -1, 0};
        int[] vy = {0, 1, 0, -1};

        boolean[][] check = new boolean[height][width];
        check[sy][sx] = true;

        for (int i = 0; i < 3; i++) {
            Queue<Integer> nextq = new LinkedList<Integer>();
            while (!nowq.isEmpty()) {
                int now = nowq.poll();
                int y = now / 1000;
                int x = now % 1000;

                for (int j = 0; j < 4; j++) {
                    int nx = x + vx[j];
                    int ny = y + vy[j];

                    if (!isOk(nx, ny)) {
                        continue;
                    }

                    if (check[ny][nx]) {
                        continue;
                    }

                    check[ny][nx] = true;

                    if (field[ny][nx] == 'g') {
                        System.out.println("YES");
                        return true;
                    } else if (field[ny][nx] == '#') {
                        nextq.add(encode(ny, nx));
                    } else {
                        nowq.add(encode(ny, nx));
                    }
                }
            }
            nowq = nextq;
        }
        System.out.printf("NO");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        height = H;
        width = W;

        char field[][] = new char[H][W];
        for (int i = 0; i < H; i++) {
            String row = sc.next();
            for (int j = 0; j < W; j++) {
                field[i][j] = row.charAt(j);
            }
        }

        int sx = -1;
        int sy = -1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (field[i][j] == 's') {
                    sx = j;
                    sy = i;
                }
            }
        }

        bfs(sx, sy, field);
    }
}
