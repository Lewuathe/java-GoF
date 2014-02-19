/**
 * Created by sasakiumi on 2/19/14.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Makeing root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 100000));
            bindir.add(new File("latex", 2000));
            rootdir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 100));
            hanako.add(new File("memo.text", 300));
            hanako.add(new File("game.doc", 300));
            tomura.add(new File("junk.mail", 100));
            rootdir.accept(new ListVisitor());
        }
        catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
