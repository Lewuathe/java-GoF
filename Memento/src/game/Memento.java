package game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class Memento {
    int money;
    ArrayList fruits;

    public int getMoney() {
        return money;
    }

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public List getFruits() {
        return (List)fruits.clone();
    }
}
