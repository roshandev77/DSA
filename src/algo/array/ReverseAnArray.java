package algo.array;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String args[]) {
        int []arr = {4, 6, 8, 5, 2, 1, 9};
        int left = 0; // First index of array
        int right = arr.length-1; // Last index of array

        System.out.println("Original Array: "+ Arrays.toString(arr));

        while(right > left) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }

        System.out.println("Reversed Array: "+ Arrays.toString(arr));
    }
}
