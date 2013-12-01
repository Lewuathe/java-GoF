import java.util.Random;

public class RandomStrategy implements Strategy {
	private Random random;
	public RandomStrategy(int seed) {
		random = new Random(seed);
	}
	public Hand nextHand() {
		int handValue = random.nextInt(3);
		return Hand.getHand(handValue);
	}
	public void study(boolean win) {
		;
	}
}
