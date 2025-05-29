package frequenlyAsked;

public class BalancedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};

        getBalancedArray(arr);
        getBalancedArray2(arr);
    }

    private static void getBalancedArray2(int[] arr) {
        int mid=arr.length/2;
        int leftSum=0, rightSum=0;

        for (int i = 0; i < mid; i++) {
            leftSum+=arr[i];
            rightSum+=arr[mid+i];
        }
        System.out.println(Math.abs(leftSum-rightSum));
    }

    private static void getBalancedArray(int[] arr) {
        int totalSum=0;
        for(int n: arr){
            totalSum+=n;
        }
        int leftSum=0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum=totalSum-leftSum-arr[i];
            if (leftSum==rightSum){
                System.out.println(arr[i]);
            }
            leftSum+=arr[i];
        }


    }
}
