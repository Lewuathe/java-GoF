package graph;

import java.util.*;

/**
 * Created by sasakiumi on 3/12/14.
 */
/*
 *
 *
 */

public class MyGraph {

    public static void dijikstra(List<Node> nodes, int[][] d, Node s) {
        Queue queue = new PriorityQueue<Node>();
        for (int i = 0; i < nodes.size(); i++) {
            nodes.get(i).setCost(d[s.getId()][nodes.get(i).getId()]);
            queue.add(nodes.get(i));
        }

        while (!queue.isEmpty()) {
            Node w = (Node) Collections.min(queue);
            queue.remove(w);

            Iterator it = queue.iterator();
            while (it.hasNext()) {
                Node u = (Node) it.next();
                d[w.getId()][u.getId()] = Math.min(d[w.getId()][u.getId()] + w.getCost(), u.getCost());
                u.setCost(d[w.getId()][u.getId()]);
            }
        }
    }
}
