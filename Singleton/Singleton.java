public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("Make instance");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
