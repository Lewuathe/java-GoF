import java.io.*;

public class HTMLBuilder extends Builder {
	private String filename;
	private PrintWriter writer;
	private Boolean isCalledTitle = false;;
	public void makeTitle(String title) {
		if (isCalledTitle) {
			throw new RuntimeException();
		}
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body");
		writer.println("<h1>" + title + "</h1>");
		isCalledTitle = true;
	}
	public void makeString(String str) {
		if (!isCalledTitle) {
			throw new RuntimeException();
		}
		writer.println("<p>" + str + "</p>");
	}
	public void makeItems(String[] items) {
		if (!isCalledTitle) {
			throw new RuntimeException();
		}
		writer.println("<ul>");
		for (int i = 0; i < items.length; i++) {
			writer.println("<li>" + items[i] + "</li>");
		}
		writer.println("</ul>");
	}
	public void close() {
		if (!isCalledTitle) {
			throw new RuntimeException();
		}
		writer.println("</body></html>");
		writer.close();
	}
	public String getResult() {
		return filename;
	}
}
