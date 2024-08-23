package basic;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        String str = "Hippopotamus";

        char[] ch=str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {

            if (map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i])+1);
            }else {
                map.put(ch[i],1);
            }
        }

        System.out.println(map);

        for (var m: map.entrySet()){
            if (m.getValue()<2){
                System.out.print(m.getKey());
            }
        }
    }
}
