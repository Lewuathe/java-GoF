import Heap.MyHeap;
import Heap.Node;

/**
 * Created by sasakiumi on 3/4/14.
 */
public class Main {
    public static void main(String[] args) {
        Node n1 = new Node<Integer>(1);
        Node n2 = new Node<Integer>(2);
        Node n3 = new Node<Integer>(3);
        n1.setLeft(n2);
        n1.setRight(n3);

        System.out.println(n1);

        MyHeap heap = new MyHeap();
        heap.addNode(2);
        heap.addNode(3);
        heap.addNode(10);
        heap.addNode(6);
        heap.addNode(4);
        heap.addNode(12);
        heap.addNode(1);
        System.out.println(heap);
        System.out.println(heap.popMin());
        System.out.println(heap);
        System.out.println(heap.popMin());
        System.out.println(heap);
    }
}
