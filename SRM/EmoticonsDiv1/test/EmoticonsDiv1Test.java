import org.junit.Test;
import static org.junit.Assert.*;

public class EmoticonsDiv1Test {
	
	@Test
	public void test0() {
		int smiles = 2;
		assertEquals(2, new EmoticonsDiv1().printSmiles(smiles));
	}
	
	@Test
	public void test1() {
		int smiles = 4;
		assertEquals(4, new EmoticonsDiv1().printSmiles(smiles));
	}
	
	@Test
	public void test2() {
		int smiles = 6;
		assertEquals(5, new EmoticonsDiv1().printSmiles(smiles));
	}
	
	@Test
	public void test3() {
		int smiles = 18;
		assertEquals(8, new EmoticonsDiv1().printSmiles(smiles));
	}
	
	@Test
	public void test4() {
		int smiles = 11;
		assertEquals(8, new EmoticonsDiv1().printSmiles(smiles));
	}
}
