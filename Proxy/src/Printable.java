/**
 * Created by sasakiumi on 3/4/14.
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}
