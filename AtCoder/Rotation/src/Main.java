import java.util.Scanner;

/**
 * Created by sasakiumi on 3/18/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input[][] = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                input[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                char tmp = input[i][j];
                input[i][j] = input[3-i][3-j];
                input[3-i][3-j] = tmp;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf(input[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
