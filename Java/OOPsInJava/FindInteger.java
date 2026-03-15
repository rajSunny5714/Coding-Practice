import java.util.ArrayList;
import java.io.*; 

public class FindInteger {
	public static int findInteger(int n, int k) {
		// Write your code here
			int mid = n / 2;
		if (n % 2 != 0) {
			mid += 1;
		}
		int result = 0;
		if (k <= mid) {
			result = (k - 1) * 2 + 1;
		}
		 else {
			k -= mid;
			result = (k - 1) * 2 + 2;
		}
		return result;
	}

}
