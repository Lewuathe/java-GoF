public class Triple {
	private static Triple instance1 = new Triple(0);
	private static Triple instance2 = new Triple(1);
	private static Triple instance3 = new Triple(2);

	private int id;
	private Triple(int id) {
		this.id = id;
	}
	public static Triple getInstance(int id) {
		if (id == 0) {
			return instance1;
		} else if (id == 1) {
			return instance2;
		} else {
			return instance3;
		}
	}

	public int getId() {
		return this.id;
	}
}
