import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MicroStrings {
	
	public String makeMicroString(int A, int D) {
        List<Integer> nums = new ArrayList<Integer>();

        int a = A;
        int d = D;
        nums.add(a);
        while (a - d >= 0) {
            nums.add(a - d);
            d += D;
        }
        StringBuffer buf = new StringBuffer();
        for (Integer n : nums) {
            buf.append(n.toString());
        }
        return buf.toString();
	}
}
