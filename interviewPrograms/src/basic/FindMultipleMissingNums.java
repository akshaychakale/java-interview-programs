package basic;

import java.util.HashSet;
import java.util.Set;

public class FindMultipleMissingNums {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,15};
        Set<Integer> set = new HashSet<>();

        for (int i : arr){
            set.add(i);
        }

        int start = arr[0];
        int end= arr[arr.length-1];

        for (int i = start; i < end; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
