package frequenlyAsked;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringg("babcabcbb")); // Output: 3 ("abc")
        System.out.println(lengthOfLongestSubstringg("bbbbb"));    // Output: 1 ("b")
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
