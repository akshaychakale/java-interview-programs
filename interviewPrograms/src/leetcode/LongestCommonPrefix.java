package leetcode;

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

    private static String longestCommonPrefix(String[] strs) {
       String prefix=strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix)!=0) {
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                return " ";
            }
        }
        System.out.println(prefix);
        return  prefix;
    }

    private static int lengthOfLongestSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int left=0,right=0;
        int maxLength=0;

        while (right < str.length()) {
            char currentChar = str.charAt(right);

            if (!set.contains(currentChar)) {
                set.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
