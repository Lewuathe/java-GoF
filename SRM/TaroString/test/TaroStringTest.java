import org.junit.Test;
import static org.junit.Assert.*;

public class TaroStringTest {
	
	@Test
	public void test0() {
		String S = "XCYAZTX";
		assertEquals("Possible", new TaroString().getAnswer(S));
	}
	
	@Test
	public void test1() {
		String S = "CTA";
		assertEquals("Impossible", new TaroString().getAnswer(S));
	}
	
	@Test
	public void test2() {
		String S = "ACBBAT";
		assertEquals("Impossible", new TaroString().getAnswer(S));
	}
	
	@Test
	public void test3() {
		String S = "SGHDJHFIOPUFUHCHIOJBHAUINUIT";
		assertEquals("Possible", new TaroString().getAnswer(S));
	}
	
	@Test
	public void test4() {
		String S = "CCCATT";
		assertEquals("Impossible", new TaroString().getAnswer(S));
	}
}
