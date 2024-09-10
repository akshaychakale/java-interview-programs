package basic;

import java.util.Scanner;

public class IsFactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No:");
        findFactorial(scan.nextInt());
        scan.close();
    }

    public static void findFactorial(int num){
        if (num<0){
            System.out.println("Factorial for does not exist for negative nos");
        }
        if (num == 0) {
            System.out.println("Factorial of 0 is 1");
        }
        else {
            int factorial =1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of "+num+" is "+factorial);
        }

    }
}
