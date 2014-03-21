import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class EmoticonsDiv2 {
    private int initialSmiles;
    public int dfs(int smiles, int current, int clip, int seconds) {
        if (current == smiles) {
            return seconds;
        }

        if (current > smiles) {
            return 100000;
        }

        int op1 = dfs(smiles, current + clip, clip, seconds + 1);
        int op2 = dfs(smiles, current * 2, current, seconds + 2);
        return Math.min(op1, op2);
    }
	
	public int printSmiles(int smiles) {
        initialSmiles = smiles;
		return dfs(smiles, 1, 1, 1);
	}
}
