package basic;

public class FindBalancedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
//        int[] arr = {2, 8, 3, 4, 6};

        int balancedIndex = findBalancedIndex(arr);

        if (balancedIndex != -1) {
            System.out.println("The balanced element is: " + arr[balancedIndex]);
        } else {
            System.out.println("No balanced element found.");
        }

    }
    public static int findBalancedIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Right sum is total sum - left sum - current element
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i; // Return index of the balanced element
            }

            leftSum += arr[i]; // Update left sum
        }

        return -1; // No balanced index found
    }
}

