package A;

import java.util.Scanner;

/**
 * Created by sasakiumi on 4/13/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vx = {1, 0, -1, 0};
        int[] vy = {0, 1, 0, -1};

        int[][] board = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (j + vx[k] >= 0 && j + vx[k] < 4 && i + vy[k] >= 0 && i + vy[k] < 4
                            && board[i + vy[k]][j + vx[k]] == board[i][j]) {
                        System.out.println("CONTINUE");
                        return;
                    }
                }
            }
        }
        System.out.println("GAMEOVER");
    }
}
