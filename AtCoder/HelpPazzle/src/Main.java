import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sasakiumi on 3/22/14.
 */
public class Main {
    public static int BOARD_SIZE = 8;

    public static boolean dfs(int pos, int remains, char[][] board) {
        if (remains == 0) {
            return true;
        }

        if (pos == 64) {
            return false;
        }

        int x = pos / 8;
        int y = pos % 8;

        if (board[y][x] == 'Q') {
            if (isPuttable(x, y, board)) {
                if (dfs(pos + 1, remains - 1, board)) {
                    return true;
                }
            }
        } else {
            if (isPuttable(x, y, board)) {
                board[y][x] = 'Q';
                if (dfs(pos + 1, remains - 1, board)) {
                    return true;
                }
                board[y][x] = '.';
            }

            if (dfs(pos + 1, remains, board)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isOk(int x, int y) {
        return y >= 0 && x >= 0 && y < 8 && x < 8;
    }

    public static boolean isPuttable(int x, int y, char[][] board) {
        for (int dy = -1; dy <= 1; dy++) {
            for (int dx = -1; dx <= 1; dx++) {
                if (dx == 0 && dy == 0) {
                    continue;
                }
                int tx = x, ty = y;
                while (true) {
                    tx += dx;
                    ty += dy;
                    if (!isOk(tx, ty)) {
                        break;
                    }

                    if (board[ty][tx] == 'Q') {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            String st = sc.next();
            for (int j = 0; j < 8; j++) {
                board[i][j] = st.charAt(j);
            }
        }

        if (dfs(0, 8, board)) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.printf("%c", board[i][j]);
                }
                System.out.println("");
            }
        } else {
            System.out.println("No Answer");
        }


    }
}
