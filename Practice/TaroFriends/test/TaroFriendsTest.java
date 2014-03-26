import org.junit.Test;
import static org.junit.Assert.*;

public class TaroFriendsTest {
	
	@Test
	public void test0() {
		int[] coordinates = new int[] {-3, 0, 1};
		int X = 3;
		assertEquals(3, new TaroFriends().getNumber(coordinates, X));
	}
	
	@Test
	public void test1() {
		int[] coordinates = new int[] {4, 7, -7};
		int X = 5;
		assertEquals(4, new TaroFriends().getNumber(coordinates, X));
	}
	
	@Test
	public void test2() {
		int[] coordinates = new int[] {-100000000, 100000000};
		int X = 100000000;
		assertEquals(0, new TaroFriends().getNumber(coordinates, X));
	}
	
	@Test
	public void test3() {
		int[] coordinates = new int[] {3, 7, 4, 6, -10, 7, 10, 9, -5};
		int X = 7;
		assertEquals(7, new TaroFriends().getNumber(coordinates, X));
	}
	
	@Test
	public void test4() {
		int[] coordinates = new int[] {-4, 0, 4, 0};
		int X = 4;
		assertEquals(4, new TaroFriends().getNumber(coordinates, X));
	}
	
	@Test
	public void test5() {
		int[] coordinates = new int[] {7};
		int X = 0;
		assertEquals(0, new TaroFriends().getNumber(coordinates, X));
	}
}
