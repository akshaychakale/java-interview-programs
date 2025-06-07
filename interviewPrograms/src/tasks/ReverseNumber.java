package tasks;

public class ReverseNumber {
//    7. Reverse a Number
//    Given a number, reverse its digits without using any built-in functions.
//    Example 1:
//    Input: 1234
//    Output: 4321
//    Example 2:
//    Input: 1
//    Output: 1
    public static void main(String[] args) {
        int num= 1234;
        reverseNumber(num);
    }

    private static void reverseNumber(int num){
        int rev = 0;

        while (num!=0){
            rev = rev*10+num%10;
            num/=10;
        }

        System.out.println("reverse : "+ rev);
    }
}
