package basic;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 88, 99, 99, 2};

//        Method 1
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);

//        Method 2
        findSecondLargest(arr);
        findSecondLargest2(arr);
    }

    public static void findSecondLargest(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("second largest no is: " + arr[arr.length - 2]);
    }

    public static void findSecondLargest2(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest=largest;
                largest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
