package algo.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIArrayOperation {
    public static void main(String args[]) {
        List<Integer> number = new ArrayList<>();
        Collections.addAll(number, 2, 4, 6, 9, 2);
//        number.add(2);
//        number.add(4);
//        number.add(6);
//        number.add(9);
//        number.add(2);

//        int number[] = {2, 4, 6, 9, 2};

        System.out.println("List: "+ number);

        List<Integer> sqNum = number.stream().map(x -> x*x).collect(Collectors.toList());

        List<Integer> cubeNum = number.stream().map(x->x*x*x).collect(Collectors.toList());

        Set<Integer> uniqueCube = cubeNum.stream().collect(Collectors.toSet());

        List<Integer> sortedCubeNum = uniqueCube.stream().sorted().collect(Collectors.toList());



        System.out.println("Square of the numbers: "+ sqNum + " Sorted Cube " + sortedCubeNum);

        Set<Integer> uniqueSqSet = number.stream().map(x -> x*x).collect(Collectors.toSet());

        System.out.println("Square of the numbers in set: "+ uniqueSqSet);

        number.stream().filter(x -> x % 2 != 0).forEach(y -> System.out.println("Even Num : "+ y));

        List<Integer> evenNum = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers: "+ evenNum);

        int evenSum = evenNum.stream().reduce(0, (ans, i) -> ans + i);
        System.out.println("Even Sum "+ evenSum);

        int res = number.stream().filter(x -> x % 2 == 0).reduce(0,(ans, i) -> ans+i);

        System.out.println("Result: "+ res);
    }
}
