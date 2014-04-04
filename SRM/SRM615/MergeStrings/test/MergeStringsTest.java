import org.junit.Test;
import static org.junit.Assert.*;

public class MergeStringsTest {
	
	@Test
	public void test0() {
		String S = "??CC??";
		String A = "ABC";
		String B = "BCC";
		assertEquals("ABCCBC", new MergeStrings().getmin(S, A, B));
	}
	
	@Test
	public void test1() {
		String S = "WHAT?";
		String A = "THE";
		String B = "WA";
		assertEquals("", new MergeStrings().getmin(S, A, B));
	}
	
	@Test
	public void test2() {
		String S = "PARROT";
		String A = "PARROT";
		String B = "";
		assertEquals("PARROT", new MergeStrings().getmin(S, A, B));
	}
	
	@Test
	public void test3() {
		String S = "???????????";
		String A = "AZZAA";
		String B = "AZAZZA";
		assertEquals("AAZAZZAAZZA", new MergeStrings().getmin(S, A, B));
	}
	
	@Test
	public void test4() {
		String S = "????K??????????????D???K???K????????K?????K???????";
		String A = "KKKKKDKKKDKKDDKDDDKDKK";
		String B = "KDKDDKKKDDKDDKKKDKDKKDDDDDDD";
		assertEquals("KDKDKDKKKDDKDDKKKDKDKKDKDDDKDDDKKDKKKDKKDDKDDDKDKK", new MergeStrings().getmin(S, A, B));
	}
}
