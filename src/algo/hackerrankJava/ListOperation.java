//
//The third line contains an integer,  (the number of queries).
//        The  subsequent lines describe the queries, and each query is described over two lines:
//
//        If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
//        If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
//        Constraints
//
//
//
//        Each element in is a 32-bit integer.
//        Output Format
//
//        Print the updated list  as a single line of space-separated integers.
//
//        Sample Input
//
//        5
//        12 0 1 78 12
//        2
//        Insert
//        5 23
//        Delete
//        0
//        Sample Output
//
//        0 1 78 12 23

package algo.hackerrankJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperation {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        // System.out.println("Size: "+ size);
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<size; i++) {
            list.add(scanner.nextInt());
        }

        int no_q = scanner.nextInt();

        while(no_q-- > 0) {
            switch(scanner.next()) {
                case "Insert":
                    list.add(scanner.nextInt(), scanner.nextInt());
                    break;
                case "Delete":
                    list.remove(scanner.nextInt());
                    break;
                default:
                    System.exit(-1);
                    break;
            }
        }
        scanner.close();
        for(Integer ele: list){
            System.out.print(ele + " ");
        }

    }
}
