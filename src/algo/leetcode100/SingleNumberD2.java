package algo.leetcode100;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

// Solutions
//For anyone who didn't understood why this works here is an explanation. This XOR operation works because it's
//like XORing all the numbers by itself. So if the array is {2,1,4,5,2,4,1} then it will be like we are performing
// this operation
//((2^2)^(1^1)^(4^4)^(5)) => (0^0^0^5) => 5.


public class SingleNumberD2 {
    public static void main(String args[]) {
        int []arr = {4, 1, 2, 1, 2};
        int ans = 0;
        for(int num:arr) {
            ans ^= num;
        }
        System.out.println("The Single Number: "+ ans);
    }
}
