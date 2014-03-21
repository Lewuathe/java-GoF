
import java.util.Scanner;

/**
 * Created by sasakiumi on 3/21/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 1; i <= 127 ; i++) {
            if (i % 3 == a && i % 5 == b && i % 7 == c) {
                System.out.println(i);
            }
        }
    }
}
