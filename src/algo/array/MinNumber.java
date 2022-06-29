package algo.array;

public class MinNumber {
    public static void main(String args[]) {
        int []arr = {8, 4, 6, 2, 5, 9, 12};
        int min = arr[0];
        for (int i = 1; i<arr.length; i++) {
//            if(arr[i] < min) {
//                min = arr[i];
//            }
            min = Math.min(arr[i], min);
        }
        System.out.println("Minimum: " + min);
    }
}
