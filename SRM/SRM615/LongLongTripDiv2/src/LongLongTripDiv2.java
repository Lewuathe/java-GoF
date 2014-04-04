import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LongLongTripDiv2 {
	
	public String isAble(long D, int T, int B){
        long goal = 0L;
        for (int i = 0; i <= T; i++) {
            goal = 1 * i + (long)B * (long)(T - i);
            if (goal == D) {
                return "Possible";
            }
        }
        return "Impossible";
	}
}
