import java.util.Scanner;

/**
 * Created by sasakiumi on 3/17/14.
 */
public class SnowDepth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer h1 = sc.nextInt();
        Integer h2 = sc.nextInt();

        System.out.println(h1 - h2);
    }
}
