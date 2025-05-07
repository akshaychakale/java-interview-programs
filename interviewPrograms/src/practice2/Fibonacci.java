package practice2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("count :" );
        int count= scan.nextInt();

        printFibonacci(count);
    }

    private static void printFibonacci(int count) {
        int a=0, b=1, c=1;

        for (int i = 0; i < count; i++) {
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+" ");
        }
    }
}
