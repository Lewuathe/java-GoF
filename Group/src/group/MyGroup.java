package group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sasakiumi on 3/12/14.
 */
public class MyGroup {
    private List<Node> nodes;

    public MyGroup(List<Node> nodes) {
        this.nodes = nodes;
        for (Integer i = 0; i < nodes.size(); i++) {
            this.nodes.get(i).setParent(new Node(i.toString()));
        }
    }

    public void merge(String val1, String val2) {
        Iterator<Node> it = this.nodes.iterator();
        Node n1 = null;
        Node n2 = null;
        while (it.hasNext()) {
            Node n = it.next();
            if (n.getVal().equals(val1)) {
                n1 = n;
            } else if (n.getVal().equals(val2)) {
                n2 = n;
            }
        }

        if (n1 == null || n2 == null) {
            throw new RuntimeException();
        }

        n2.setParent(n1);
    }

    public String find(String val) {
        Iterator<Node> it = this.nodes.iterator();
        Node foundNode = null;
        while (it.hasNext()) {
            Node n = it.next();
            if (n.getVal().equals(val)) {
                foundNode = n;
            }
        }

        if (foundNode == null) {
            throw new RuntimeException();
        }

        Node currentNode = foundNode;
        while (currentNode.getParent() != null) {
            currentNode = currentNode.getParent();
        }
        return currentNode.getVal();
    }
}
