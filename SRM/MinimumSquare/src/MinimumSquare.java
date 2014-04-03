import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MinimumSquare {
	
	public long minArea(int[] x, int[] y, int K) {
        int n = x.length;
        long ret = 9000000008000000004L;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int maxX = -1000000000;
                int minX = 1000000000;
                int maxY = -1000000000;
                int minY = 1000000000;
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        maxX = Math.max(maxX, x[k]);
                        minX = Math.min(minX, x[k]);
                        maxY = Math.max(maxY, y[k]);
                        minY = Math.min(minY, y[k]);
                    }
                }
                long l = Math.max(maxX - minX + 2, maxY - minY + 2);
                ret = Math.min(ret, l * l);
            }
        }
        return ret;
    }
}
