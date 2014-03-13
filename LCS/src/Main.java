/**
 * Created by sasakiumi on 3/13/14.
 */
public class Main {
    public static void main(String[] args) {
        int table[][] = new int[10][10];
        String str1 = "abcbdab";
        String str2 = "bdcaba";
        String ret = LCS.solve(str1, str2, table);
        System.out.println(ret);
    }
}
