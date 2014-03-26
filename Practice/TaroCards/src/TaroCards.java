import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TaroCards {
	
	public long getNumber(int[] first, int[] second, int K) {
        HashSet<Integer> set = new HashSet<Integer>();
        long ret = 0;
        int size = first.length;
        for (int i = 0; i < (1 << size); i++) {
            set.clear();
            for (int j = 0; j < size; j++) {
                if ((i >> j & 1) == 1) {
                    set.add(first[j]);
                    set.add(second[j]);
                }

                if (set.size() > K) {
                    break;
                }
            }
            if (set.size() <= K) {
                ret++;
            }
        }
        return ret;
	}
}
