package algo.leetcode100;
// Given an integer array nums,
// return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumD4 {
    public static void main (String args[]) {
        List<List<Integer>> triplets = new ArrayList<>();
        int []nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        // [-4, -1, -1, 0, 1, 2]
        for(int i=0; i<nums.length; i++) {
                if(i == 0 || (i-1 >= 0 && nums[i-1] != nums[i])) {
                int firstNo = nums[i];
                int target = -firstNo;
                List<List<Integer>> pairs = twoSum(nums, i+1, nums.length-1, target);
                    System.out.println("Pairs: "+ pairs);

                for(List<Integer> pair: pairs) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(firstNo);
                    triplet.add(pair.get(0));
                    triplet.add(pair.get(1));
                    triplets.add(triplet);
                }
            }
        }
        System.out.println("Triplets: "+ triplets.toString());

    }

    public static List<List<Integer>> twoSum(int []arr, int start, int end, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        int f = start, e = end;

        while(f < e) {
            if(f-1 >= start && arr[f-1] == arr[f]) {
                f++;
                continue;
            }

            if(e+1 <= end && arr[e+1] == arr[e]) {
                e--;
                continue;
            }

            if(arr[f] + arr[e] > target) {
                e--;
            } else if(arr[f] + arr[e] < target) {
                f++;
            } else {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[f]);
                pair.add(arr[e]);
                pairs.add(pair);
                f++;
            }
        }

        return pairs;
    }
}
