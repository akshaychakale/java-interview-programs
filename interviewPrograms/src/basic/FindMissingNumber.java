package basic;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 7, 8,10};
        int length = nums.length + 1;

        int expected_sum = length * (length + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        System.out.println("expected_sum " + expected_sum);
        System.out.println("actualSum " + actualSum);
        System.out.println("missing number is : " + (expected_sum - actualSum));

        findMissingNumbers(nums);
    }

    public static void findMissingNumbers(int[] arr){
        Set<Integer> set = new HashSet<>();

        for (int s: arr){
            set.add(s);
        }

        int low=arr[0];
        int max=arr[arr.length-1];

        System.out.println("missing numbers: ");
        for (int i = low; i < max; i++) {
            if (!set.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
