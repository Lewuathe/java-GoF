import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sasakiumi on 3/18/14.
 */
public class Main {
    public static void main(String[] args) {
//        1 -> 0
//        2 -> 1
//        3 -> 2
//        4 -> 4
//        5 -> 6
//        6 -> 9
//        7 -> 12
//        8 -> 16
//        9 -> 20
//        10 -> 25
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(Math.max(r, g), b);

        List<Integer> steps = new ArrayList<Integer>();
        steps.add(0);
        for (int i = 1; i <= max; i++) {
            Integer pre = steps.get(i - 1);
            steps.add(pre + (i / 2));
        }

        Integer ans = steps.get(r) + steps.get(g) + steps.get(b);
        System.out.println(ans);
    }
}
