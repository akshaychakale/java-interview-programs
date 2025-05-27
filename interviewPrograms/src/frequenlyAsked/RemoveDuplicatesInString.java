package frequenlyAsked;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
    }

    private static String removeDuplicates(String str) {
        StringBuilder string = new StringBuilder();
        Set<Character> set = new HashSet<>();
        char[] chars =str.toCharArray();
        for (char c: chars){
            if(!set.contains(c)){
                set.add(c);
                string=string.append(c);
            }
        }

        return string.toString();
    }
}
