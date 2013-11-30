public class RandomDisplay extends Display {
	public RandomDisplay(DisplayImpl impl) {
		super(impl);
	}
	public void randomDisplay(int times) {
		int ran = (int)(Math.random() * times);
		open();
		for (int i = 0; i < ran; i++) {
			print();
		}
		close();
	}
}
