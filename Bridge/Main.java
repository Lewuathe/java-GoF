public class Main {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, JAPAN"));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, RUSSIA"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));
		RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, ENGLAND"));
		RandomDisplay d5 = new RandomDisplay(new TextFileDisplayImpl("text.txt"));

		d1.display();
		d2.display();
		d3.multiDisplay(3);
		d4.randomDisplay(10);
		d5.randomDisplay(10);
	}
}
		
