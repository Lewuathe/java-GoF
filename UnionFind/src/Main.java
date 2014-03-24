/**
 * Created by sasakiumi on 3/24/14.
 */
public class Main {
    public static void main(String[] args) {
        UnionFind uf = new UnionFind();
        uf.unite(1, 2);
        uf.unite(1, 5);
        uf.unite(4, 6);
        uf.unite(4, 7);
        uf.unite(1, 4);
        System.out.println(uf.toString());
        System.out.println(uf.same(2, 7));
    }
}
