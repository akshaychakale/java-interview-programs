package jatinSdetVideo;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8};

//        findMissingNum1(arr);
        findMissingNum2(arr);
    }

    private static void findMissingNum2(int[] arr) {
        int missingNum=0;
        for (int n : arr){
            missingNum=missingNum^n;
        }

        for (int i = 0; i <= arr[arr.length-1]; i++) {
            missingNum=missingNum^i;
        }

        System.out.println("missing num is : "+missingNum);
    }

    private static void findMissingNum1(int[] arr) {
        int sum=0;
        for (int n: arr){
            sum+=n;
        }
        System.out.println("sum: "+sum);

        int length=arr.length+1;
        int expectedSum= length*(length+1)/2;
        System.out.println("exp sum: "+expectedSum);
        System.out.println("missing number: "+ (expectedSum-sum));
    }
}
