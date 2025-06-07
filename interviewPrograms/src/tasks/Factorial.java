package tasks;

public class Factorial {

//    1. Script/Code to find the factorial of a number:
//    Write code to calculate the factorial of a given number, which is the product of all positive integers from 1 to Input number
//    Example:
//            - Input: 5
//            - Output: Factorial of 5 is 120 (calculated as: 1*2*3*4*5)

    public static void main(String[] args) {
        int num = 5;

        getFactorial(num);
    }

    private static void getFactorial(int num) {
        if (num == 0) {
            System.out.println("0 has no factorial");
        } else if (num == 1) {
            System.out.println("factorial of 1 is 1");
        }
        int factorial=0;
        if (num>1){
            factorial=num*num*num;
        }

        System.out.println(">>>>"+ factorial);
    }
}
