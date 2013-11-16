public class PrintBanner extends Print {
	private Banner banner;
	public PrintBanner(String string) {
		this.banner = new Banner(string);
		//super(string);
	}
	public void printWeek() {
		banner.showWithParen();
	}
	public void printStrong() {
		banner.showWithAster();
	}
}
