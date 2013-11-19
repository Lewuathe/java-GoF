package idcard;
import framework.*;

public class IDCard extends Product {
	private String owner;
	IDCard(String owner) {
		System.out.println("Make " + owner + "'s card");
		this.owner = owner;
	}
	public void use() {
		System.out.println("Use " + owner + "'s card");
	}
	public String getOwner() {
		return owner;
	}
}
