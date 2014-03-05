package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sasakiumi on 3/4/14.
 */
public class MyHeap {
    private List<Integer> root;
    private Integer size;
    private static Integer initialCapacity = 1000000;
    private static Integer zeroFactor = -10000000;

    public MyHeap() {
        root = new ArrayList(MyHeap.initialCapacity);
        root.add(zeroFactor);
        size = 0;
    }

    public Integer popMin() {
        Integer min = root.get(1);
        // Swap min value and last value
        Collections.swap(root, 1, size);
        root.remove(size);
        size -= 1;

        Integer currentIndex = 1;
        Integer leftIndex = currentIndex * 2;
        Integer rightIndex = currentIndex * 2 + 1;
        while (currentIndex < size) {
            if (root.get(currentIndex) > root.get(leftIndex) || root.get(currentIndex) > root.get(leftIndex)) {
                if (root.get(leftIndex) < root.get(rightIndex)) {
                    Collections.swap(root, leftIndex, currentIndex);
                    currentIndex = leftIndex;
                } else {
                    Collections.swap(root, rightIndex, currentIndex);
                    currentIndex = rightIndex;
                }
                leftIndex = currentIndex * 2;
                rightIndex = currentIndex * 2 + 1;
            } else {
                return min;
            }
        }
        return min;
    }

    public Integer getMin() {
        return root.get(1);
    }

    public void addNode(Integer i) {
        root.add(i);
        size += 1;

        Integer parentIndex = size / 2;
        Integer childIndex = size;

        while (parentIndex > 0 && root.get(parentIndex) > root.get(childIndex)) {
            Integer parent = root.get(parentIndex);
            Integer child = root.get(childIndex);
            if (parent > child) {
                Collections.swap(root, parentIndex, childIndex);
            }
            childIndex = parentIndex;
            parentIndex = childIndex / 2;
        }
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p/>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return root.toString();
    }
}
