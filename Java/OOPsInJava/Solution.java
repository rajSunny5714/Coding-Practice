import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> sumOfKxKMatrices(ArrayList<ArrayList<Integer>> arr, int k) {
		//    Write your code here.
		int n = arr.size();
		ArrayList<ArrayList<Integer> > ans = new ArrayList<ArrayList<Integer>> (n - k + 1);
		for (int i = 0; i <= n - k; i++) {
			ans.add(new ArrayList<Integer>(n - k + 1));
			for (int j = 0; j <= n - k; j++) {
				int sm = 0;
				for (int x = 0; x < k; x++) {
					for (int y = 0; y < k; y++) {
						sm += (arr.get(x + i).get(y + j));
					}
				}
				ans.get(i).add(sm);
			}
		}

		return ans;
	}
}
