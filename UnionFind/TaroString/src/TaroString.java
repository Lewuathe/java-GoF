import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TaroString {
	
	public String getAnswer(String S) {
        int state = 0;
        int cCount = 0;
        int aCount = 0;
        int tCount = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'C') {
                state = 1;
                cCount++;
            } else if (c == 'A') {
                state = 2;
                aCount++;
            } else if (c == 'T' && state == 2) {
                state = 3;
                tCount++;
                break;
            }
        }
        if (state == 3 && cCount == 1 && aCount == 1 && tCount == 1) {
            return "Possible";
        } else {
            return "Impossible";
        }
    }
}
