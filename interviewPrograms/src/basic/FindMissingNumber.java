package basic;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 7, 8};
        int length = nums.length + 1;

        int expected_sum = length * (length + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        System.out.println("expected_sum " + expected_sum);
        System.out.println("actualSum " + actualSum);
        System.out.println("missing number is : " + (expected_sum - actualSum));
    }
}
