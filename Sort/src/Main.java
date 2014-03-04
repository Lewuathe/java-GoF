import algos.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasakiumi on 3/4/14.
 */
public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(10);
        list.add(8);
        list.add(7);

        System.out.println(Sort.quickSort(list));
        System.out.println(Sort.mergeSort(list));
        System.out.println(Sort.bubbleSort(list));
    }
}
