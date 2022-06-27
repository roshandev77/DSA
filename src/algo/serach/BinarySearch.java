package algo.serach;

public class BinarySearch {
    public static void main(String args[]) {
        int []arr = {2, 6, 8, 9, 12, 13, 14, 26};
        int foundAt;
        foundAt = doBinarySearch(arr, 0, arr.length-1, 26);
        System.out.println("Item Found At: " + foundAt);
    }

    static int doBinarySearch(int []arr, int left, int right, int tar) {
        int mid;
        if(right >= left) {
            mid = (left + right ) / 2;

            if(arr[mid] == tar) {
                return mid;
            } else if (tar < arr[mid]) {
                return doBinarySearch(arr, left, mid-1, tar);
            } else if(tar > arr[mid]) {
                return doBinarySearch(arr, mid +1, right, tar);
            }
        }
        return -1;
    }
}
