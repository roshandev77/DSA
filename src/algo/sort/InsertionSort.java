package algo.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        int []arr = {6, 5, 3, 2, 1, 4, 8};

//            6 5 3 2 1 8     6 5 3 2 4 8
//            5 6 3 2 1 8     5 6 3 2 4 8
//            3 5 6 2 1 8     3 5 6 2 4 8
//            2 3 5 6 1 8     2 3 5 6 4 8
//            1 2 3 5 6 8
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i] < arr[0]) {
                int temp = arr[i];
                shiftRight(arr, i, 0 );
                arr[0] = temp;
//                move element to 0th pos and shift the rest to right
            } else {
                for (int j = 0; j < i; j++) {
                    if(arr[i] < arr[j]) {
                        int temp = arr[i];
                        shiftRight(arr, i, j);
                        arr[j] = temp;
//                        move element to jth and shift the rest to right
                    }
                }

            }
        }
        System.out.println("Sorted Array : "+ Arrays.toString(arr));
    }
    static void shiftRight(int []arr, int i, int limit){
        for (int k = i ; k>limit; k--) {
            arr[k] = arr[k-1];
        }
    }
}
