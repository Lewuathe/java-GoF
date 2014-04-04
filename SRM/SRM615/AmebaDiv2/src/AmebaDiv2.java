import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AmebaDiv2 {
	
	public int simulate(int[] X, int A) {
        int current = A;
        for (int i = 0; i < X.length; i++) {
            if (X[i] == current) {
                current += X[i];
            }
        }
        return current;
	}
}
