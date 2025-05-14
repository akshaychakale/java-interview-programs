package jatinSdetVideo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        String str = "12ab3";
        char[] chars=str.toCharArray();
        int left=0;
        int right=chars.length-1;

       while (left<right){
           if (!Character.isLetter(chars[left])){
               left++;
           } else if (!Character.isLetter(chars[right])) {
               right--;
           }else {
               char temp = chars[left];
               chars[left]=chars[right];
               chars[right]=temp;
               left++;
               right--;
           }
       }

        System.out.println(Arrays.toString(chars));
    }
}
