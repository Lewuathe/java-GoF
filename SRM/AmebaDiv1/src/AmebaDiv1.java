import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AmebaDiv1 {
	
	public int count(int[] X) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < X.length; i++) {
            set.add(X[i]);
        }

        for (Iterator it = set.iterator(); it.hasNext(); ){
            Integer amaeba = (Integer) it.next();
            for (int j = 0; j < X.length; j++) {
                if (amaeba == X[j]) {
                    amaeba += X[j];
                }
            }

            if (set.contains(amaeba)) {
                set2.add(amaeba);
            }
        }

        return set.size() - set2.size();
	}
}
