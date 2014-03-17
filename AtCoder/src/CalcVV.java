import java.util.Scanner;

/**
 * Created by sasakiumi on 3/17/14.
 */
public class CalcVV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer m = sc.nextInt();

        Integer ans = null;
        if (m < 100) {
            ans = 0;
        } else if (100 <= m && m <= 5000) {
            ans = m / 100;
        } else if (6000 <= m && m <= 30000) {
            ans = (m / 1000) + 50;
        } else if (35000 <= m && m <= 70000) {
            ans = (((m / 1000) - 30) / 5) + 80;
        } else if (70000 <= m) {
            ans = 89;
        }

        if (ans.toString().length() < 2) {
            System.out.println("0" + ans);
        } else {
            System.out.println(ans);
        }
    }
}
