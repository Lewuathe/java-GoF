import org.junit.Test;
import static org.junit.Assert.*;

public class MinimumSquareTest {
	
	@Test
	public void test0() {
		int[] x = new int[] {0, 3};
		int[] y = new int[] {0, 7};
		int K = 2;
		assertEquals(81L, new MinimumSquare().minArea(x, y, K));
	}
	
	@Test
	public void test1() {
		int[] x = new int[] {-4, 3, 1};
		int[] y = new int[] {3 , -1, -2};
		int K = 2;
		assertEquals(16L, new MinimumSquare().minArea(x, y, K));
	}
	
	@Test
	public void test2() {
		int[] x = new int[] {0, 0, 1, 1, 2, 2};
		int[] y = new int[] {0, 1, 0, 1, 0, 1};
		int K = 4;
		assertEquals(9L, new MinimumSquare().minArea(x, y, K));
	}
	
	@Test
	public void test3() {
		int[] x = new int[] {1000000000, 1000000000, 1000000000, -1000000000, -1000000000, -1000000000};
		int[] y = new int[] {1000000000, 0, -1000000000, 1000000000, 0, -1000000000};
		int K = 3;
		assertEquals(4000000008000000004L, new MinimumSquare().minArea(x, y, K));
	}
	
	@Test
	public void test4() {
		int[] x = new int[] {-47881, 28623, 1769, -38328, -16737, 16653, -23181, 37360, 41429, 26282, 254, 728, 8299, -41080, -29498, 17488, -23937, -11, 33319, 25232};
		int[] y = new int[] {-46462, 48985, -43820, -19587, -33593, -28337, 13667, -48131, -5568, -2332, -41918, -31370, -3695, 42599, -37788, -40096, 39049, 25045, -2122, 3874};
		int K = 8;
		assertEquals(1695545329L, new MinimumSquare().minArea(x, y, K));
	}
}
