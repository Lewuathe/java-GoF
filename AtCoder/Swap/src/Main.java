import java.util.Scanner;

/**
 * Created by sasakiumi on 3/18/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[6];
        for (int i = 0; i < 6; i++) {
            nums[i] = i + 1;
        }

        int n = sc.nextInt();

        for (int i = 0; i < n % 30; i++) {
            int first = (i % 5);
            int second = (i % 5) + 1;

            int tmp = nums[first];
            nums[first] = nums[second];
            nums[second] = tmp;
        }

        for (int j = 0; j < 6; j++) {
            System.out.printf("%d", nums[j]);
        }
        System.out.println("");
    }
}
