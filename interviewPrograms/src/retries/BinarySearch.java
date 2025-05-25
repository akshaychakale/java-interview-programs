package retries;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 54, 89, 45, 797, 132, 10, 40};

        int x =10;
        Arrays.sort(arr);
//        binarySearchElemnt(arr,x);
        binarySearch(arr,x);
    }

    private static int binarySearchElemnt(int[] arr,int target) {
        int low=0;
        int high=arr.length-1;

        while (low<=high){
            int mid = low+(high-low)/2;

            if (arr[mid] == target) {
                System.out.println("element found");
                return mid;
            }

            if (arr[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        System.out.println("element not found");
        return -1;
    }

    private static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        while (low<=high){
            int mid = low+(high-low)/2;

            if (arr[mid]==target){
                System.out.println("element found: "+mid);
                return mid;
            }

            if (arr[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        System.out.println("not found");
       return -1;
    }
}
