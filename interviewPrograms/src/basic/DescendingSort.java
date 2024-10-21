package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DescendingSort {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i : arr){
            System.out.print(i);
        }

        List<Integer> l1 = new ArrayList<>();
        for (int i : arr){
            l1.add(i);
        }

        Collections.sort(l1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(l1);
    }
}
