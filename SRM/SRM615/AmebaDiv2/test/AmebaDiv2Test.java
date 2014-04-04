import org.junit.Test;
import static org.junit.Assert.*;

public class AmebaDiv2Test {
	
	@Test
	public void test0() {
		int[] X = new int[] {2,1,3,1,2};
		int A = 1;
		assertEquals(4, new AmebaDiv2().simulate(X, A));
	}
	
	@Test
	public void test1() {
		int[] X = new int[] {1,4,9,16,25,36,49};
		int A = 10;
		assertEquals(10, new AmebaDiv2().simulate(X, A));
	}
	
	@Test
	public void test2() {
		int[] X = new int[] {1,2,4,8,16,32,64,128,256,1024,2048};
		int A = 1;
		assertEquals(512, new AmebaDiv2().simulate(X, A));
	}
	
	@Test
	public void test3() {
		int[] X = new int[] {817,832,817,832,126,817,63,63,126,817,832,287,823,817,574};
		int A = 63;
		assertEquals(252, new AmebaDiv2().simulate(X, A));
	}
}
