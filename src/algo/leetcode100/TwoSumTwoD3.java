package algo.leetcode100;

//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
// find two numbers such that they add up to a specific target number.
// Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
// The tests are generated such that there is exactly one solution. You may not use the same element twice.
// Your solution must use only constant extra space.

import java.util.Arrays;

public class TwoSumTwoD3 {
    public static void main(String args[]) {
        int []arr = {2, 3, 6, 7, 9};
        int target = 10, s = 0, e = arr.length-1;
        int ans[] = new int[2];

        while (s < e) {
            int sum = arr[s] + arr[e];
            if(sum < target) {
                s++;
            } else if (sum > target) {
                e--;
            } else {
                ans[0] = s;
                ans[1] = e;
                break;
            }
        }

        System.out.println("The Index of sum of target: "+ Arrays.toString(ans));
    }
}

