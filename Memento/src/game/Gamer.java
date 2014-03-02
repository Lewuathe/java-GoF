package game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by sasakiumi on 3/3/14.
 */
public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitname = {
            "Apple", "Grape", "Banana", "Orange"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getFruits() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "Delicious";
        }
        return prefix + fruitname[random.nextInt(fruitname.length)];
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("Increase money");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("Decrease monay");
        } else if (dice == 6) {
            String f = getFruits();
            System.out.println("Get fruit: " + f);
            fruits.add(f);
        } else {
            System.out.printf("Nothing has been done");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String) it.next();
            if (f.startsWith("Delicious")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
}
