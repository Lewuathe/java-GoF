import org.junit.Test;
import static org.junit.Assert.*;

public class MinimumSquareEasyTest {
	
	@Test
	public void test0() {
		int[] x = new int[] {0, 1, 2};
		int[] y = new int[] {0, 1, 5};
		assertEquals(4L, new MinimumSquareEasy().minArea(x, y));
	}
	
	@Test
	public void test1() {
		int[] x = new int[] {-1, -1, 0, 2, 0};
		int[] y = new int[] {-2, -1, 0, -1, -2};
		assertEquals(9L, new MinimumSquareEasy().minArea(x, y));
	}
	
	@Test
	public void test2() {
		int[] x = new int[] {1000000000, -1000000000, 1000000000, -1000000000};
		int[] y = new int[] {1000000000, 1000000000, -1000000000, -1000000000};
		assertEquals(4000000008000000004L, new MinimumSquareEasy().minArea(x, y));
	}
	
	@Test
	public void test3() {
		int[] x = new int[] {93, 34, 12, -11, -7, -21, 51, -22, 59, 74, -19, 29, -56, -95, -96, 9, 44, -37, -54, -21};
		int[] y = new int[] {64, 12, -43, 20, 55, 74, -20, -54, 24, 20, -18, 77, 86, 22, 47, -24, -33, -57, 5, 7};
		assertEquals(22801L, new MinimumSquareEasy().minArea(x, y));
	}
}
