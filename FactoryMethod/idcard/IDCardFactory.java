package idcard;

import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
	private List owners = new ArrayList();
	private Map<String, Integer> idList = new HashMap<String, Integer>();
	private Integer lastId = 0;
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner, lastId++);
	}
	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
		idList.put(((IDCard)product).getOwner(), ((IDCard)product).getId());
	}
	public List getOwners() {
		return owners;
	}
	public Map getIdList() {
		return idList;
	}
}
