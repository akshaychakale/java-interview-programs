package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for (int i:arr){
            System.out.print(i);
        }
    }
}
