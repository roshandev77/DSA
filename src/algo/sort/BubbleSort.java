package algo.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int []arr = {5, 1, 4, 2, 8};
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j = 0; j<n-i-1; j++) {
                System.out.println("Here");
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("Itr: "+ Arrays.toString(arr));
        }
    }
}
