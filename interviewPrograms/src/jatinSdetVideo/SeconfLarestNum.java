package jatinSdetVideo;

public class SeconfLarestNum {
    public static void main(String[] args) {
        int[] arr = {1,3,6,44,76,4,64,90};

        secondLargestNum(arr);
        secondSmallestNum(arr);
    }

    private static void secondSmallestNum(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i : arr){
            if (i < smallest){
                secondSmallest=smallest;
                smallest=i;
            } else if (i> smallest && i< secondSmallest) {
                secondSmallest=i;
            }
        }
        System.out.println("second smallest: "+secondSmallest);
    }

    private static void secondLargestNum(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondLargest && arr[i]< largest) {
                secondLargest=arr[i];
            }
        }

        System.out.println("second largest: "+secondLargest);
    }
}
