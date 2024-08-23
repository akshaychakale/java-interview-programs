package basic;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        isPalindrome(scan.next());
        System.out.println("Enter a number : ");
        isPalindrome(scan.nextInt());
        scan.close();
    }

    private static void isPalindrome(String str) {
        String rev;
        StringBuilder s = new StringBuilder(str);
        rev = s.reverse().toString();
        if (str.equals(rev)) {
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not palindrome");
        }
    }

    private static void isPalindrome(int num) {
        int og = num;
        int rev = 0;
        while (num != 0) {
            int n = num;
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if (og == rev) {
            System.out.println("its palindrome");
        } else {
            System.out.println("its not palindrome");
        }

    }
}
