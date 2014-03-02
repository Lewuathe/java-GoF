/**
 * Created by sasakiumi on 3/2/14.
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.println("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
