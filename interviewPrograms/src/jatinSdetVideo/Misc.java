package jatinSdetVideo;

import java.util.*;

public class Misc {

    public static void main(String[] args) {
        //Length of last world
//        String string = " Hello    world ";
//        String str=string.trim();
//
//        int count=0;
//        for (int i = str.length()-1; i >=0 ; i--) {
//            if (str.charAt(i) != ' ') {
//                count++;
//            }else if(count>0){
//                System.out.println(count);
//                break;
//            }
//
//        }

//   2     Reverse only letters
//        String str = "12am34";
//        char[] chars=str.toCharArray();
//        int left=0;
//        int right= chars.length-1;
//
//        while (left<right){
//            if (!Character.isLetter(chars[left])) {
//                left++;
//            } else if (!Character.isLetter(chars[right])) {
//                right--;
//            }else {
//                char temp = chars[left];
//                chars[left]=chars[right];
//                chars[right]=temp;
//                left++;
//                right--;
//            }
//        }
//        System.out.println(new String(chars));

//      3  Frequency of chars
//        String str = "my name is akshay";
//        char[] chars=str.toCharArray();
//
//        Map<Character,Integer> freqMap = new HashMap<>();
//        for (char c: chars){
//            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
//        }
//        System.out.println(freqMap);

////        missing number 1
//        int[] arr= {1,3,4,5,6,7,8};
//        int length= arr.length+1;
//        int expectedSum=length*(length+1)/2;
//        int actualSum=0;
//        for (int i : arr){
//            actualSum+=i;
//        }
//        System.out.println("missing num: "+ (expectedSum-actualSum));

//        missing number multiple
        //method 1
//        int[] arr = {1, 3, 4, 5, 7, 8};
//        int start = arr[0];
//        int end = arr[arr.length - 1];
//        Set<Integer> set = new HashSet<>();
//        for (int i : arr) {
//            set.add(i);
//        }
//        for (int i = start; i < end; i++) {
//            if (!set.contains(i)) {
////                System.out.println(i);
//            }
//        }
//        //Method2
//        boolean found = false;
//        for (int i = start; i < end; i++) {
//            for (int j = start; j < arr.length; j++) {
//                if (arr[j] == i) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
////                System.out.println(i);
//
//            }

//        find vowels
            String s = "my  name is akshay 12 !@##";
            char[] chars =s.toCharArray();

            String vowels= "";
            String consulates = "";
            String numbers = "";

        int v=0,c=0,n=0;
        for (int i = 0; i < chars.length; i++) {
            if ("aeiouAEIOU".indexOf(chars[i])!=-1){
                vowels+=chars[i];
        }else if(Character.isLetter(chars[i])){
                consulates+=chars[i];
            }else if(Character.isDigit(chars[i])){
               numbers+=chars[i];
            }else {
//                System.out.println(chars[i]);
            }
        }
        System.out.println(vowels);
        System.out.println(consulates);
        System.out.println(numbers);


    }


}

