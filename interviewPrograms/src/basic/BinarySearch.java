package basic;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 54, 89, 45, 797, 132, 10, 40};
        int x = 10;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("element not fount");
        } else {
            System.out.println("Element "+x+" is present at index " + result);
        }
    }

    private static int binarySearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

//         check if X is present at mid
            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
//     if element not present
        return -1;
    }
}
