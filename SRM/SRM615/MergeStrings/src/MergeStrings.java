import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MergeStrings {

    public String minString(String a, String b) {
        if (a == "") {
            return b;
        }
        int minlen = Math.min(a.length(), b.length());
        for (int i = 0; i < minlen; i++) {
            if (a.charAt(i) < b.charAt(i)) {
                return a;
            } else if (a.charAt(i) > b.charAt(i)) {
                return b;
            } else {
                continue;
            }
        }
        return a;
    }

	public String getmin(String S, String A, String B) {
        String ans = "";
        for (int i = 0; i < (1 << S.length()); i++) {
            int a = 0;
            int b = 0;
            boolean flag = true;
            StringBuffer buf = new StringBuffer();
            for (int j = 0; j < S.length(); j++) {
                if ((i >> j & 1) == 1 && a < A.length()) {
                    buf.append(A.charAt(a++) + "");
                }
                if ((i >> j & 1) == 0 && b < B.length()) {
                    buf.append(B.charAt(b++) + "");
                }
            }
            while (a < A.length()) {
                buf.append(A.charAt(a++) + "");
            }
            while (b < B.length()) {
                buf.append(B.charAt(b++) + "");
            }
            String ret = buf.toString();
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == '?') continue;
                if (S.charAt(j) != ret.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans = minString(ans, ret);
            }

        }
        return ans;
	}
}
