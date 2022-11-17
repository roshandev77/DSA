package algo.leetcode100;

import java.util.Arrays;

public class JumpGameD8 {
    public static void main(String args[]) {
        Solution sol = new Solution();
        int arr[] = {3,2,1,0,4};
        System.out.println("Result : " + sol.canJump(arr));
    }
}

class Solution {
    public boolean canJump(int nums[]) {
        System.out.println(Arrays.toString(nums));
        int lastIdx = nums.length-1;
        return true;
    }
}
