import java.util.Scanner;

/**
 * Created by sasakiumi on 3/21/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();
        String r = new StringBuilder(s).reverse().toString();

        StringBuffer ret = new StringBuffer();

        int a = 0;
        int b = N - 1;
        while (a <= b) {
            boolean left = false;
            for (int i = 0; a + i <= b; i++) {
                if (s.charAt(a + i) < s.charAt(b - i)) {
                    left = true;
                    break;
                } else if (s.charAt(a + i) > s.charAt(b - i)) {
                    left = false;
                    break;
                }
            }

            if (left) {
                ret.append(s.charAt(a++) + "");
            } else {
                ret.append(s.charAt(b--) + "");
            }
        }


        System.out.println(ret.toString());

    }
}
