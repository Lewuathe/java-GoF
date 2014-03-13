import graph.MyGraph;
import graph.Node;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sasakiumi on 3/12/14.
 */
public class Main {
    public static void main(String[] args) {
        Node s = new Node(0);
        List nodes = Arrays.asList(s, new Node(1), new Node(2), new Node(3));
        int[][] d = {
                {0, 2, 6, Node.INF},
                {Node.INF, 0, 3, Node.INF},
                {Node.INF, Node.INF, 0, 2},
                {Node.INF, Node.INF, Node.INF, 0}
        };

        MyGraph.dijikstra(nodes, d, s);

        Iterator it = nodes.iterator();
        while (it.hasNext()) {
            System.out.println(((Node)it.next()).getCost());
        }
    }
}
