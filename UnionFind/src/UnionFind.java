
/**
 * Created by sasakiumi on 3/24/14.
 */
public class UnionFind {
    private static int INITIAL_CAPACITY = 10;
    private int[] parents = new int[INITIAL_CAPACITY];
    private int[] rank = new int[INITIAL_CAPACITY];

    public UnionFind() {
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            parents[i] = i;
        }
    }

    public int find(int x) {
        if (parents[x] == x) {
            return x;
        } else {
            return parents[x] = find(parents[x]);
        }
    }

    public void unite(int x, int y) {
        x = find(x);
        y = find(y);

        if (x == y) {
            return;
        }

        if (rank[x] < rank[y]) {
            parents[x] = y;
        } else {
            parents[y] = x;
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
        }
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
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
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            if (i != INITIAL_CAPACITY - 1) {
                sb.append(parents[i] + ",");
            } else {
                sb.append(parents[i] + "]");
            }
        }
        return sb.toString();
    }
}
