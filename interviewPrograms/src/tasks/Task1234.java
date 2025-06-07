package tasks;

import java.util.*;

public class Task1234 {
    public static void main(String[] args) {
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> nonAnagram = new ArrayList<String>();

        Map<String, String> map = new HashMap<>();


        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (isAnagram(strs[i],strs[j])&& !map.containsKey(strs[i])){
//                    map.put(strs[i],);
                }else {
//                    map.put(strs[i],strs[j]);
                }
            }
        }


    }

    private static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] l1 = new char[str1.length()];
        char[] l2 = new char[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            l1[i] = (str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            l2[i]=(str2.charAt(i));
        }
        Arrays.sort(l1);
        Arrays.sort(l2);

        if(Arrays.equals(l1,l2)){
            return true;
        }

        return false;
    }
}
