/**
 * Created by sasakiumi on 3/2/14.
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver" + generator.getNumber());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}
