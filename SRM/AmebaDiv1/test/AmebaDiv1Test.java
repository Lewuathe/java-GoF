import org.junit.Test;
import static org.junit.Assert.*;

public class AmebaDiv1Test {
	
	@Test
	public void test0() {
		int[] X = new int[] {3,2,1};
		assertEquals(2, new AmebaDiv1().count(X));
	}
	
	@Test
	public void test1() {
		int[] X = new int[] {2,2,2,2,2,2,4,2,2,2};
		assertEquals(2, new AmebaDiv1().count(X));
	}
	
	@Test
	public void test2() {
		int[] X = new int[] {1,2,4,8,16,32,64,128,256,1024,2048};
		assertEquals(11, new AmebaDiv1().count(X));
	}
	
	@Test
	public void test3() {
		int[] X = new int[] {854,250,934,1000,281,250,281,467,854,562,934,1000,854,500,562};
		assertEquals(7, new AmebaDiv1().count(X));
	}
}
