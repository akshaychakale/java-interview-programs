package practice2;

import java.util.*;

public class CountCharacterAndSort {

    public static void main(String[] args) {
        String str = "Helllo worlddddd";

        char[] s =str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for (char ch : s){
            if (map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        System.out.println(map);

//        for (var v : map.entrySet()){
//            System.out.println(v.getKey()+" "+v.getValue());
//        }

        List<Map.Entry<Character,Integer>> entry = new ArrayList<>(map.entrySet());

        Collections.sort(entry, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());            }
        });

        //Descending order
        System.out.println(entry);
    }


}
