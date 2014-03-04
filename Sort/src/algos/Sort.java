package algos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by sasakiumi on 3/4/14.
 */
public class Sort {
    public static List quickSort(List<Integer> list) {
        if (list.size() < 1) {
            return list;
        }

        Integer pivot = list.get(0);
        List left = new ArrayList<Integer>();
        List right = new ArrayList<Integer>();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < pivot) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }

        left = quickSort(left);
        right = quickSort(right);

        left.add(pivot);
        left.addAll(right);

        return left;
    }

    private static List merge(List<Integer> left, List<Integer> right) {
        List sortedList = new ArrayList<Integer>();
        Integer leftIndex = 0;
        Integer rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                sortedList.add(left.get(leftIndex));
                leftIndex += 1;
            } else {
                sortedList.add(right.get(rightIndex));
                rightIndex += 1;
            }
        }

        if (leftIndex < left.size()) {
            sortedList.addAll(left.subList(leftIndex, left.size()));
        }
        if (rightIndex < right.size()) {
            sortedList.addAll(right.subList(rightIndex, right.size()));
        }

        return sortedList;
    }

    public static List mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List left = list.subList(0, mid);
        List right = list.subList(mid, list.size());

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }


    public static List bubbleSort(List<Integer> list) {
        for (int i = list.size()-1; i > 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (list.get(i) < list.get(j)) {
                    Collections.swap(list, i, j);
                }
            }
        }
        return list;
    }
}
