import framework.*;
import idcard.*;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Nobita");
		Product card2 = factory.create("Takeshi");
		Product card3 = factory.create("Shizuka");
		card1.use();
		card2.use();
		card3.use();
	}
}
