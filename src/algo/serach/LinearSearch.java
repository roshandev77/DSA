package algo.serach;

public class LinearSearch {
    public static void main(String args[]) {
        int A[] = {2, 3, 7, 8, 6};
        naiveSimpleLS(A, 6);
        increasePer(A, 6);
    }

    public static void naiveSimpleLS(int arr[], int tar) {
        int cnt = 0;
        for(int i =0; i<arr.length; i++ ) {
            cnt += 1;
            if(arr[i] == tar) {
                System.out.println("Found the target at : " + i);
                break;
            }
        }
        System.out.println("The number of Iteration : "+ cnt);
    }

    public static void increasePer(int arr[], int tar) {
        int cnt = 0;
        int left = 0;
        int right = arr.length-1;

        while (left != right) {
            cnt += 1;
            if(arr[left] == tar) {
                System.out.println("Found at index: " + left);
                break;
            }

            if (arr[right] == tar) {
                System.out.println("Found at index: "+ right);
                break;
            }

            left++;
            right--;
        }

        System.out.println("Number of times loop iterated: "+ cnt);
    }
}
