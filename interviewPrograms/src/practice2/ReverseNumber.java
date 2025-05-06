package practice2;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(" reverse num :"+ reverseNum(num));

        String str = "Helloo world";

        reverseString(str);
        reverseWords(str);
    }

    public static int reverseNum(int n){
        int rev=0;
        while (n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }

    public static void reverseString(String str){
        char[] s = str.toCharArray();

        for (int i = s.length-1; i >= 0; i--) {
            System.out.print(s[i]);
        }
        System.out.println();
    }

    public static void reverseWords(String s){
        String[] words = s.split(" ");

        for (int i = words.length-1; i >=0 ; i--) {
            System.out.print(words[i]+ " ");
        }

    }
}
