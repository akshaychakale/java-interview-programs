package jatinSdetVideo;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "Hello world";

        findFreqOfChars1(str);
        findFreqOfChars2(str);
    }

    private static void findFreqOfChars2(String str) {
        char[] chars = str.toCharArray();

        Map<Character,Integer> freq = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!freq.containsKey(chars[i])){
                freq.put(chars[i],1);
            }else {
                freq.put(chars[i], freq.get(chars[i])+1);
            }
        }
        System.out.println(">>>: "+ freq);
    }

    private static void findFreqOfChars1(String str) {
        char[] chars = str.toCharArray();

        Map<Character,Integer> freq = new HashMap<>();
        for (char c : chars){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        System.out.println(freq);
    }
}
