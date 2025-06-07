package jatinSdetVideo;

import java.util.*;

public class GetFistAndLastIndexOfDuplicateElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,3,3,4,5};
        getFistAndLastIndexOfDuplicateElement2(arr);
    }

    private static void getFistAndLastIndexOfDuplicateElement2(int[] arr){
        Set<Integer> set = new HashSet<>();
        int duplicate=0;
        for (int i: arr){
            if(!set.add(i)){
                duplicate=i;
                break;
            }
        }

        int left = 0, right = arr.length - 1;

        // Find first occurrence
        while (left < arr.length && arr[left] != duplicate) {
            left++;
        }

        // Find last occurrence
        while (right >= 0 && arr[right] != duplicate) {
            right--;
        }

        System.out.println("right "+right);
        System.out.println("left "+left);
    }
    private static void getFistAndLastIndexOfDuplicateElement(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i: arr){
            list.add(i);
        }

        Set<Integer> set = new HashSet<>();
        int duplicate=0;
        for (int i: arr){
            if(!set.add(i)){
                duplicate=i;
                break;
            }
        }

        System.out.println(list.indexOf(duplicate));
        System.out.println(list.lastIndexOf(duplicate));
    }
}
