import org.junit.Test;
import static org.junit.Assert.*;

public class LeftAndRightHandedDiv2Test {
	
	@Test
	public void test0() {
		String S = "L";
		assertEquals(0, new LeftAndRightHandedDiv2().count(S));
	}
	
	@Test
	public void test1() {
		String S = "RRR";
		assertEquals(0, new LeftAndRightHandedDiv2().count(S));
	}
	
	@Test
	public void test2() {
		String S = "LRLRLR";
		assertEquals(2, new LeftAndRightHandedDiv2().count(S));
	}
	
	@Test
	public void test3() {
		String S = "LLLRRR";
		assertEquals(0, new LeftAndRightHandedDiv2().count(S));
	}
	
	@Test
	public void test4() {
		String S = "RLRLRL";
		assertEquals(3, new LeftAndRightHandedDiv2().count(S));
	}
}
