package jatinSdetVideo;

import java.util.HashMap;
import java.util.Map;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "apple"};

// 		 # Output: {'apple': 3, 'banana': 2, 'orange': 1}

        getCount(arr);
    }

    private static void getCount(String[] arr){
        Map<String, Integer> countMap = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if (countMap.containsKey(arr[i])) {
                countMap.put(arr[i],countMap.get(arr[i])+1);
            }else{
                countMap.put(arr[i],1);
            }
        }

        System.out.println(countMap);
    }
}
