import org.junit.Test;
import static org.junit.Assert.*;

public class LongLongTripDiv2Test {
	
	@Test
	public void test0() {
		long D = 10L;
		int T = 6;
		int B = 3;
		assertEquals("Possible", new LongLongTripDiv2().isAble(D, T, B));
	}
	
	@Test
	public void test1() {
		long D = 10L;
		int T = 5;
		int B = 3;
		assertEquals("Impossible", new LongLongTripDiv2().isAble(D, T, B));
	}
	
	@Test
	public void test2() {
		long D = 50L;
		int T = 100;
		int B = 2;
		assertEquals("Impossible", new LongLongTripDiv2().isAble(D, T, B));
	}
	
	@Test
	public void test3() {
		long D = 120L;
		int T = 10;
		int B = 11;
		assertEquals("Impossible", new LongLongTripDiv2().isAble(D, T, B));
	}
	
	@Test
	public void test4() {
		long D = 10L;
		int T = 10;
		int B = 9999;
		assertEquals("Possible", new LongLongTripDiv2().isAble(D, T, B));
	}
	
	@Test
	public void test5() {
		long D = 1000L;
		int T = 100;
		int B = 10;
		assertEquals("Possible", new LongLongTripDiv2().isAble(D, T, B));
	}
	
	@Test
	public void test6() {
		long D = 1000010000100001L;
		int T = 1100011;
		int B = 1000000000;
		assertEquals("Possible", new LongLongTripDiv2().isAble(D, T, B));
	}
}
