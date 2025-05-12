package jatinSdetVideo;

public class ReverseNumber {

    public static void main(String[] args) {
        int num=1234567565;
        System.out.println("number :"+num);
        reverseNum1(num);
    }

    private static void reverseNum1(int num) {
        int rev=0;

        while (num!=0) {
            int lastDigit= num % 10;

            if (rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && lastDigit>7) {
                System.out.println(0);
                System.exit(0);
            } else if (rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && lastDigit>-8) {
                System.out.println(0);
                System.exit(0);
            }
            rev = rev * 10 + lastDigit;
            num/=10;
        }
        System.out.println("reverse :"+rev);
    }
}
