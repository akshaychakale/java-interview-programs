package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {

    public static void main(String[] args) {
//        String input = "abcdabcdef";
//        int result = lengthOfLongestSubstring(input);
//        System.out.println(result);

        String[] strs = {"apple", "appetite", "application"};
        longestCommonPrefix(strs);

    }

    private static void longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (String s: strs){
            while (s.indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    System.out.println(" ");
                }
            }
        }
        System.out.println(prefix);
    }

}
