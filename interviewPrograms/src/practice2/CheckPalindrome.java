package practice2;

public class CheckPalindrome {

    public static void main(String[] args) {
        int num = 1111;
        String str = "ZOOOZ";
        isPalindromeNumber(num);

        isPalindromeString(str);
    }

    private static void isPalindromeString(String str) {
        String rev;
        StringBuilder s = new StringBuilder(str);
        rev = s.reverse().toString();

        if (str.equals(rev)) {
            System.out.println("string is palindrome");
        }else {
            System.out.println("string is not palindrome");
        }
    }

    private static void isPalindromeNumber(int num) {
        int orignalNum=num;
        int rev=0;
        while (num !=0){
            rev=rev*10+num%10;
            num=num/10;
        }

        if (orignalNum==rev){
            System.out.println("Its palindrome number");
        }else {
            System.out.println("It's not palindrome ");
        }
    }
}
