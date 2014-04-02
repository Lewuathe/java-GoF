import org.junit.Test;
import static org.junit.Assert.*;

public class MicroStringsTest {
	
	@Test
	public void test0() {
		int A = 12;
		int D = 5;
		assertEquals("1272", new MicroStrings().makeMicroString(A, D));
	}
	
	@Test
	public void test1() {
		int A = 3;
		int D = 2;
		assertEquals("31", new MicroStrings().makeMicroString(A, D));
	}
	
	@Test
	public void test2() {
		int A = 31;
		int D = 40;
		assertEquals("31", new MicroStrings().makeMicroString(A, D));
	}
	
	@Test
	public void test3() {
		int A = 30;
		int D = 6;
		assertEquals("3024181260", new MicroStrings().makeMicroString(A, D));
	}
}
