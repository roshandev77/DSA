package algo.array;

public class AddArrayEle {
    public static void main(String args[]) {
        int []arr = {2, 4, 7, 8, 9};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is/are : "+ sum);
    }

}
