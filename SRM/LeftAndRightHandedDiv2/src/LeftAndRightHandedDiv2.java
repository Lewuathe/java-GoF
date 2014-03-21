import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class LeftAndRightHandedDiv2 {

    public int count(String S) {
        int sum = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            char c1 = S.charAt(i);
            char c2 = S.charAt(i + 1);
            if (c1 == 'R' && c2 == 'L') {
                sum += 1;
            }
        }
        return sum;
    }
}
