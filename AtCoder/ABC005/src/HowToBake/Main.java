package HowToBake;

import java.util.Scanner;

/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int Q = sc.nextInt();
        int[] ps = new int[Q];
        int max = 0;
        for (int i = 0; i < Q; i++) {
            ps[i] = sc.nextInt();
            if (ps[i] > max) {
                max = ps[i];
            }
        }

        int[] maxes = new int[max];
        int ret = 0;
        for (int i = 0; i < max; i++) {

            // Row orientation
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < N - i; x++) {
                    int tmp = 0;
                    for (int offset = 0; offset < i + 1; offset++) {
                        tmp += board[y][x + offset];
                    }
                    if (tmp > ret) {
                        ret = tmp;
                    }
                }
            }

            // Col orientation
            for (int y = 0; y < N - i; y++) {
                for (int x = 0; x < N; x++) {
                    int tmp = 0;
                    for (int offset = 0; offset < i + 1; offset++) {
                        tmp += board[y + offset][x];
                    }
                    if (tmp > ret) {
                        ret = tmp;
                    }
                }
            }

            // Square
            int size = (int) Math.round(Math.sqrt(i + 1));
            for (int y = 0; y < N - size + 1; y++) {
                for (int x = 0; x < N - size + 1; x++) {
                    int tmp = 0;
                    for (int yoffset = 0; yoffset < size; yoffset++) {
                        for (int xoffset = 0; xoffset < size; xoffset++) {
                            tmp += board[y + yoffset][x + xoffset];
                        }
                    }
                    if (tmp > ret) {
                        ret = tmp;
                    }
                }
            }

            maxes[i] = ret;
        }

        for (int i = 0; i < Q; i++) {
            int p = ps[i];
            System.out.println(maxes[p - 1]);
        }

    }
}
