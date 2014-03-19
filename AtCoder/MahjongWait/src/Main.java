import java.util.Scanner;

/**
 * Created by sasakiumi on 3/19/14.
 */
public class Main {
    public static void search(int tiles[], boolean isHead, String ans, int order) {
        for (int i = 0; i < 9; i++) {
            if (tiles[i] >= 3) {
                if (i + 1 < order) {
                    return;
                }
                if (isHead) {
                    return;
                }
                int tmp[] = tiles.clone();
                tmp[i] -= 3;
                String tmpAns = ans + String.format("(%d%d%d)", i + 1, i + 1, i + 1);
                search(tmp, isHead, tmpAns, i + 1);
            }
        }

        for (int i = 0; i < 7; i++) {
            if (tiles[i] >= 1 && tiles[i + 1] >= 1 && tiles[i + 2] >= 1) {
                if (i + 1 < order) {
                    return;
                }
                if (isHead) {
                    return;
                }
                int tmp[] = tiles.clone();
                tmp[i] -= 1;
                tmp[i + 1] -= 1;
                tmp[i + 2] -= 1;
                String tmpAns = ans + String.format("(%d%d%d)", i + 1, i + 2, i + 3);
                search(tmp, isHead, tmpAns, i + 1);
            }
        }

        for (int i = 0; i < 9; i++) {
            if (tiles[i] >= 2 && !isHead) {
                if (i + 1 < order) {
                    return;
                }
                int tmp[] = tiles.clone();
                tmp[i] -= 2;
                String tmpAns = ans + String.format("(%d%d)", i + 1, i + 1);
                search(tmp, true, tmpAns, i + 1);
            }
        }

        // No more mentsu
        int oneCount = 0;
        int twoCount = 0;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += tiles[i];
            if (tiles[i] == 1) {
                oneCount += 1;
            } else if (tiles[i] == 2) {
                twoCount += 1;
            }
        }

        // 000100000
        if (oneCount == 1 && sum == 1) {
            for (int i = 0; i < 9; i++) {
                if (tiles[i] == 1) {
                    ans += String.format("[%d]", i + 1);
                    System.out.println(ans);
                    return;
                }
            }
        }

        // 000001100
        if (oneCount == 2 && sum == 2) {
            for (int i = 0; i < 8; i++) {
                if (tiles[0] == 1 && tiles[1] == 1) {
                    ans += "[12]";
                    System.out.println(ans);
                    return;
                } else if (tiles[7] == 1 && tiles[8] == 1) {
                    ans += "[89]";
                    System.out.println(ans);
                    return;
                } else if (tiles[i] == 1 && tiles[i + 1] == 1) {
                    ans += String.format("[%d%d]", i + 1, i + 2);
                    System.out.println(ans);
                    return;
                }
            }
        }

        if (twoCount == 1 && sum == 2) {
            for (int i = 0; i < 9; i++) {
                if (tiles[i] == 2) {
                    ans += String.format("[%d%d]", i + 1, i + 1);
                    System.out.println(ans);
                    return;
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hand = sc.next();

        int tiles[] = new int[9];

        // Initialization
        for (int i = 0; i < 9; i++) {
            tiles[i] = 0;
        }

        // Setting tiles array
        for (int i = 0; i < 13; i++) {
            Integer tile = Integer.parseInt("" + hand.charAt(i));
            tiles[tile - 1] += 1;
        }


        search(tiles, false, "", 1);
    }
}
