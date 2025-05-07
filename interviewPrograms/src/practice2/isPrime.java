package practice2;

import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num= scan.nextInt();

        isPrimeNumber(num);
    }

    private static boolean isPrimeNumber(int num) {

        if (num <=1 ){
            System.out.println("It's not prime number");
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0) {
                System.out.println("Its not prime number");
                return false;
            }
        }

        System.out.println("Its prime number");
        return true;
    }
}
