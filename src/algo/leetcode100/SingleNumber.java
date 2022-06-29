package algo.leetcode100;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

public class SingleNumber {
    public static void main(String args[]) {
        int []arr = {4, 1, 2, 1, 2};
        int ans = 0;
        for(int num:arr) {
            ans ^= num;
        }
        System.out.println("The Single Number: "+ ans);
    }
}
