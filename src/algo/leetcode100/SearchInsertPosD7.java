package algo.leetcode100;

public class SearchInsertPosD7 {
    public static void main(String args[]) {
        boolean isFound = false;
        int arr[] = {1,3,5,6}, target = 7, res = 0;
        for (int i = 0; i<arr.length; i++) {
            if(arr[i] == target) {
                isFound = true;
                res = i;
                break;
            } else if (arr[i] > target) {
                isFound = true;
                res = i;
                break;
            }
        }
        if(!isFound) {
            res = arr.length;
        }

        System.out.println("Result: "+ res);
    }
}
