package jatinSdetVideo;

import java.util.HashMap;
import java.util.Map;

public class ShiftZeros {

    public static void main(String[] args) {
        int[] num = {1,43,0,6,0,9,0};

        shiftZerosLeft(num);
    }

    private static void shiftZerosLeft(int[] num) {
        int nonZeroValue=0;
        int temp=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] != 0){
                 temp = num[nonZeroValue];
                 num[nonZeroValue]=num[i];
                 num[i]=temp;
                 nonZeroValue++;
            }
        }

        for (int n : num){
            System.out.print(n);
        }
    }

    private static void findCharCounts(String str){
        char[] chars=str.toCharArray();

        Map<Character,Integer> freq=new HashMap<>();

        for(int i=0;i<chars.length;i++){
            if(freq.containsKey(chars[i])){
                freq.put(chars[i],freq.get(chars[i])+1);
            }else{
                freq.put(chars[i],1);
            }
        }

        System.out.println("freq: "+freq);
    }
}
