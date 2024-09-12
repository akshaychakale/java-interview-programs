package basic;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};

        mergeTwoArray1(arr1,arr2);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        mergeTwoArray2(arr1,arr2);
    }

    public static void mergeTwoArray1(int[] arr1,int[] arr2){
        int[] merged = new int[arr1.length+arr2.length];

        System.arraycopy(arr1,0,merged,0,arr1.length);
        System.arraycopy(arr2,0,merged,arr1.length,arr2.length);

        System.out.println(Arrays.toString(merged));
    }

    public static void mergeTwoArray2(int[] arr1,int[] arr2){
        int[] merged = new int[arr1.length+arr2.length];

        int pos=0;

        for(int el : arr1){
            merged[pos]=el;
            pos++;
        }

        for(int el:arr2){
            merged[pos]=el;
            pos++;
        }

        System.out.println(Arrays.toString(merged));
    }
}
