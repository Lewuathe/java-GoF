/**
 * Created by sasakiumi on 2/18/14.
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, World");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
    }
}
