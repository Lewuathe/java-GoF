public class TextBuilder extends Builder {
	private StringBuffer buffer = new StringBuffer();
	private Boolean isCalledTitle = false;;
	public void makeTitle(String title) {
		if (isCalledTitle) {
			throw new RuntimeException();
		}
		buffer.append("===============================\n");
		buffer.append("[ " + title + " ]");
		buffer.append("\n");
		isCalledTitle = true;
	}
	public void makeString(String str) {
		if (!isCalledTitle) {
			throw new RuntimeException();
		}
		buffer.append("* " + str + "\n");
		buffer.append("\n");
	}
	public void makeItems(String[] items) {
		if (!isCalledTitle) {
			throw new RuntimeException();
		}
		for (int i = 0; i < items.length; i++) {
			buffer.append("   - " + items[i] + "\n");
		}
		buffer.append("\n");
	}
	public void close() {
		if (!isCalledTitle) {
			throw new RuntimeException();
		}
		buffer.append("===============================");
	}

	public String getResult() {
		return buffer.toString();
	}
}
