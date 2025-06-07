package frequenlyAsked;

import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "aabccd";
        
        firstNonRepeatingChar2(s);
    }

    private static Character firstNonRepeatingChar2(String s){
        char[] chars = s.toCharArray();
         Map<Character,Integer> seen = new LinkedHashMap<>();

         for(char c: chars){
           seen.put(c,seen.getOrDefault(c,0)+1);
         }

        for (var val: seen.entrySet()){
            if(val.getValue()==1){
                System.out.println(val);
                break;
            }
        }
        return ' ';
    }

    private static Character firstNonRepeatingChar(String s) {
        char[] chars=s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char c: chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (var c: map.entrySet()){
            if (c.getValue()==1){
                System.out.println(c);
                return c.getKey();
            }
        }
        return null;
    }
}
