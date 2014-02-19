/**
 * Created by sasakiumi on 2/19/14.
 */
public abstract class Visitor {
    public abstract void visit(Directory directory);
    public abstract void visit(File file);
}
