package retries;

public class FindBalancedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};  //4

        findBalancedArray(arr);
    }

    private static void findBalancedArray(int[] arr) {
    int totalSum=0;
    for (int n: arr){
        totalSum+=n;
    }

    int leftSum=0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum= totalSum-leftSum-arr[i];

            if (leftSum==rightSum){
                System.out.println(">>>>>>>>> "+arr[i]);;
            }

            leftSum+=arr[i];
        }


    }
}
