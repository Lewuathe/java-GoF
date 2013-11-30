import java.io.*;

public class TextFileDisplayImpl extends DisplayImpl {
	private String string = "";
	private int width;
	public TextFileDisplayImpl(String filename) {
		try {
			Reader reader = new FileReader(filename);
			BufferedReader br = new BufferedReader(reader);
			String str = br.readLine();
			while(str != null){
				string += str;
				str = br.readLine();
			}
			this.width = string.getBytes().length;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void rawOpen() {
		printLine();
	}
	public void rawPrint() {
		System.out.println("|" + string + "|");
	}
	public void rawClose() {
		printLine();
	}
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
