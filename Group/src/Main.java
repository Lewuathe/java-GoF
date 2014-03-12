import group.MyGroup;
import group.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasakiumi on 3/12/14.
 */
public class Main {
    public static void main(String[] args) {
        List<Node> list = new ArrayList<Node>();
        list.add(new Node("A"));
        list.add(new Node("B"));
        list.add(new Node("C"));
        list.add(new Node("D"));
        list.add(new Node("E"));
        list.add(new Node("F"));

        MyGroup group = new MyGroup(list);
        group.merge("A", "B");
        group.merge("C", "D");
        group.merge("A", "C");
        group.merge("E", "F");

        System.out.println(group.find("A"));
        System.out.println(group.find("B"));
        System.out.println(group.find("C"));
        System.out.println(group.find("D"));
        System.out.println(group.find("E"));
        System.out.println(group.find("F"));
    }
}
