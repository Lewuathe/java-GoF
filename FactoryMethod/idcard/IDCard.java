package idcard;
import framework.*;

public class IDCard extends Product {
	private String owner;
	private Integer id;
	IDCard(String owner, Integer id) {
		System.out.println("Make " + owner + "'s card");
		this.owner = owner;
		this.id    = id;
	}
	public void use() {
		System.out.println("Use " + owner + "'s card");
	}
	public String getOwner() {
		return owner;
	}
	public Integer getId() {
		return id;
	}
}
