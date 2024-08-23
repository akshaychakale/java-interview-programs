package basic;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no");

        if(isPrime(scan.nextInt())){
            System.out.println("its prime");
        }{
            System.out.println("its not prime");
        }
    }

    private static boolean isPrime(int num){
        int m=num/2;
        if (num <= 1) {
            System.out.println("not a prime number");
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num%i==0) {
                System.out.println("not a prime number");
                return false;
            }
        }
        System.out.println("Its prime number");
        return true;
    }
}
