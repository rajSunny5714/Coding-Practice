import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maxXor(int L, int R) {
           int L_xor_R = L ^ R;

        // Get position of MSB in L^R.
        int position = 0;
        while(L_xor_R > 0)
        {
            L_xor_R /= 2;
            position++;
        }

        // Generate a number having 'position' bits and all of them are 1s.
        int ans = 0, num = 1;
        while(position-- > 0)
        {
            ans += num;
            num *= 2;
        }

        return ans;
    }
}