package algo.leetcode100;
//Given an integer array nums,
// find the contiguous subarray (containing at least one number)
// which has the largest sum and return its sum.
//A subarray is a contiguous part of an array.
//        Example 1:
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.
public class MaximumSumArrayD9 {
    public static void main(String args[]) {
        int []arr = {-2,-1};
        int maxSum = arr[0];
        int currSum = 0;
        for(int i = 0; i<arr.length; i++) {
            currSum += arr[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Max Sum : "+ maxSum);
    }
}
