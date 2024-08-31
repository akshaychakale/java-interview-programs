package basic;

import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter count: ");
        fibonacci(scan.nextInt());
    }

    public static void fibonacci(int count) {
        int a = 0, b = 1, c = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");

            a = b;
            b = c;
            c = a + b;
        }


    }
}
