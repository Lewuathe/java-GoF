package lambda;

import java.util.function.Consumer;

/**
 * Created by sasakiumi on 4/1/14.
 */
public class Main2 {
    public int x = 0;

    class FirstLevel {
        public int x = 1;
        void methodInFirstLevel(int x) {
            Consumer<Integer> myConsumer = (y) ->
            {
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("this.x = " + this.x);
                System.out.println("LambdaScopeTest.this.x = " + Main2.this.x);
            };
            myConsumer.accept(x);
        }
    }

    public static void main(String[] args) {
        Main2 m2 = new Main2();
        FirstLevel fl = m2.new FirstLevel();
        fl.methodInFirstLevel(23);
    }

}
