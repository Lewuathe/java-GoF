public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir  = new Directory("bin");
			Directory tmpdir  = new Directory("tmp");
			Directory usrdir  = new Directory("usr");
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			bindir.add(new File("vi", 100000));
			bindir.add(new File("ls", 200000));
			rootdir.printList();

			System.out.println("");
			System.out.println("Making usr entries...");
			Directory yuki   = new Directory("yuki");
			Directory hanako = new Directory("hanako");
			Directory tomura = new Directory("tomura");
			usrdir.add(yuki);
			usrdir.add(hanako);
			usrdir.add(tomura);
			yuki.add(new File("diary.html", 1000));
			yuki.add(new File("Composite.java", 123));
			hanako.add(new File("memo.txt", 10201));
			tomura.add(new File("game.doc", 12));
			tomura.add(new File(".gitignore", 9824));
			rootdir.printList();
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
