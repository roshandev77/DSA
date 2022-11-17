package algo.leetcode100;
//Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
// ans[i] is the number of 1's in the binary representation of i.
//        Example 1:
//        Input: n = 2
//        Output: [0,1,1]
//        Explanation:
//        0 --> 0
//        1 --> 1
//        2 --> 10

import java.util.Arrays;

public class CountingBitsD6 {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(getBitCount(5)));
    }

    public static int[] getBitCount(int n) {
        int []res = new int[n+1];
        for (int i=1; i<=n; i++) {
            if((i&1) == 0) {
                res[i] = res[i/2];
            } else {
                res[i] = res[i-1]+1;
            }
        }
        return res;
    }
}
