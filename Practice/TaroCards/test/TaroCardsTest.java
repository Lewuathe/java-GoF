import org.junit.Test;
import static org.junit.Assert.*;

public class TaroCardsTest {
	
	@Test
	public void test0() {
		int[] first = new int[] {1, 2};
		int[] second = new int[] {2, 3};
		int K = 2;
		assertEquals(3L, new TaroCards().getNumber(first, second, K));
	}
	
	@Test
	public void test1() {
		int[] first = new int[] {3, 1, 2};
		int[] second = new int[] {1, 1, 1};
		int K = 3;
		assertEquals(8L, new TaroCards().getNumber(first, second, K));
	}
	
	@Test
	public void test2() {
		int[] first = new int[] {4, 2, 1, 3};
		int[] second = new int[] {1, 2, 3, 4};
		int K = 5;
		assertEquals(16L, new TaroCards().getNumber(first, second, K));
	}
	
	@Test
	public void test3() {
		int[] first = new int[] {1, 2, 3, 4, 5, 6, 7};
		int[] second = new int[] {2, 1, 10, 9, 3, 2, 2};
		int K = 3;
		assertEquals(17L, new TaroCards().getNumber(first, second, K));
	}
	
	@Test
	public void test4() {
		int[] first = new int[] {1};
		int[] second = new int[] {2};
		int K = 1;
		assertEquals(1L, new TaroCards().getNumber(first, second, K));
	}
	
	@Test
	public void test5() {
		int[] first = new int[] {6, 20, 1, 11, 19, 14, 2, 8, 15, 21, 9, 10, 4, 16, 12, 17, 13, 22, 7, 18, 3, 5};
		int[] second = new int[] {4, 5, 10, 7, 6, 2, 1, 10, 10, 7, 9, 4, 5, 9, 5, 10, 10, 3, 6, 6, 4, 4};
		int K = 14;
		assertEquals(2239000L, new TaroCards().getNumber(first, second, K));
	}
}
