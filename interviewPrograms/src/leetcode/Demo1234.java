package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Demo1234 {
    public static void main(String[] args) {

        String str= "Print the characters and how many times each character is repeated";

        char[] ch =str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                map.put(ch[i],map.get(ch[i])+1);
            }else {
                map.put(ch[i], 1);
            }
        }
        System.out.println(map);
    }
}
