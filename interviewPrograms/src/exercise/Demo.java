package exercise;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //Count the each char in this string and sort it in descending order
        String str = "this is java problem";

        char[] ch=str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for (char c : ch){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        for ( var v : map.entrySet()){
            System.out.print(v.getKey()+":"+v.getValue()+" ");
        }

        System.out.println();

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2) {

                return e2.getValue().compareTo(e1.getValue());
            }
        });

        System.out.println(entryList);

        }


    }
