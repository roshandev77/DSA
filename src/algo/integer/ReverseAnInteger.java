package algo.integer;

public class ReverseAnInteger {
    public static void main(String args[]) {
        int num = -123;
        boolean isNegative = false;
        int rev_num = 0;
        if (num < 0){
            isNegative = true;
            num *= -1;
        }

        while (num > 0) {
            rev_num = (rev_num * 10) + (num % 10);
            num = num / 10;
        }

        if(isNegative) {
            rev_num *= -1;
        }
        System.out.println("Reversed Number: " + rev_num);
    }
}
