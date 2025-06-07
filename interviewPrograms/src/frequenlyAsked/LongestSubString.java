package frequenlyAsked;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstringg("babcabcbb")); // Output: 3 ("abc")
//        System.out.println(lengthOfLongestSubstringg("bbbbb"));    // Output: 1 ("b")

        String input = "abcabcbb";
        longestUniqueSubstringLength(input);
    }

    private static void longestUniqueSubstringLength(String str) {
        char[] chars=str.toCharArray();
        Set<Character> set = new HashSet<>();
        int left=0, right=0, maxLength=0, startIndex=0;

        while (right<chars.length){
           if(!set.contains(chars[right])){
               set.add(chars[right]);
               if(right-left+1>maxLength){
                   maxLength=right-left+1;
                   startIndex=left;
               }
               right++;
           }else {
               set.remove(chars[left]);
               left++;
           }
        }
        System.out.println("length: "+maxLength);
        System.out.println("subsdtring: "+str.substring(startIndex,startIndex+maxLength));
    }

    private static String lengthOfLongestSubstringg(String str) {
        char[] chars=str.toCharArray();
        Set<Character> seen = new HashSet<>();
        int left=0, right=0, maxLength=0, startIndex=0;

        while (right<chars.length){
            if(seen.contains(chars[right])){
                seen.remove(chars[left]);
                left++;
            }

            seen.add(chars[right]);

            if(right-left+1>maxLength){
                maxLength=right-left+1;
                startIndex=left;
            }
            right++;
        }


        return str.substring(startIndex,startIndex+maxLength);
    }
}
