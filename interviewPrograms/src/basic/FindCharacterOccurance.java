package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindCharacterOccurance {
    public static void main(String[] args) {
        String str = "hello my name is akshay ";

        char[] chars = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(str.charAt(i))) {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Character,Integer> m: map.entrySet()){
            System.out.print(m.getKey()+":"+m.getValue()+" ");
        }
//        for (var entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
    }
}
