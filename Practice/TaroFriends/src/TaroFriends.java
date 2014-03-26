import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TaroFriends {
	
	public int getNumber(int[] coordinates, int X) {
        int ret = 200000000;
        for (int i = 0; i < (1 << coordinates.length); i++) {
            int[] tmp = coordinates.clone();
            for (int j = 0; j < coordinates.length; j++) {
                if (((i >> j) & 1) == 1) {
                    tmp[j] += X;
                } else {
                    tmp[j] -= X;
                }
            }

            int min = 200000000;
            int max = -200000000;
            for (int j = 0; j < coordinates.length; j++) {
                if (max <= tmp[j]) {
                    max = tmp[j];
                }
                if (min >= tmp[j]) {
                    min = tmp[j];
                }
            }
            if (ret > (max - min)) {
                ret = max - min;
            }
        }
        return ret;
    }
}
