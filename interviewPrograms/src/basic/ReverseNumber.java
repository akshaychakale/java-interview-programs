package basic;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = scan.nextInt();
        System.out.println(reverseNumber2(input));
    }

    private static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return rev;
    }

    private static int reverseNumber2(int num){
        long rev=0;
        boolean isNegative=num<0;

        if (isNegative){
            num=-num;
        }
        if (rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) {
        return 0;
        }
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return isNegative?-(int)rev:(int)rev;
    }

}
