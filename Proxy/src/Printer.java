/**
 * Created by sasakiumi on 3/4/14.
 */
public class Printer implements Printable {
    private String name;

    public Printer(String name) {
        this.name = name;
        heavyJob("Now loading...");
    }

    public Printer() {
        heavyJob("Now loading...");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        System.out.println("====== " + name + " =======");
        System.out.println(string);
    }

    public void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.print(".");
        }
        System.out.println("Done");
    }
}

