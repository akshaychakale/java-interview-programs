package basic;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String str1=scan.next();
        System.out.println("Enter 1st String: ");
        String str2=scan.next();
        scan.close();
        if (isAnagram(str1,str2)) {
            System.out.println("Its anagram");
        }else {
            System.out.println("not an anagram");
        }
    }

    private static boolean isAnagram(String s1, String s2){
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        if (str1.length != str2.length) {
            System.out.println("length not same so not anagram");
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }
}
