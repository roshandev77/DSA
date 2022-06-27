package algo.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
        int []arr = {3, 7, 2, 9, 6, 1};
//        int []sorted_arr = new int[arr.length];
//        ArrayList<Integer> sorted_arr = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++ ) {
            int min_idx = i;
            for(int j = i+1;  j<arr.length; j++) {
                if(arr[j] < arr[min_idx]) {
                        min_idx = j;
                }
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }

            System.out.println("Itr: "+ Arrays.toString(arr));
        }

        System.out.println("Sorted Ele: "+ Arrays.toString(arr));
    }
}
