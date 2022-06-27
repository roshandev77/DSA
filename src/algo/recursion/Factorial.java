package algo.recursion;

public class Factorial {
    static int fact = 1;
    public static void main(String args[]) {
        int num = 5;
        System.out.println(findFactorial(num));
    }

    static int findFactorial(int num) {
        fact *= num;
        if(num == 1) {
            return fact;
        }
        return findFactorial(num -1);
    }
}
