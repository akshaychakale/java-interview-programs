package basic;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        int[] nums = {1,2,6,0,3,0,24,0,7};

        shiftZeros(nums);
    }

    private static void shiftZeros(int[] nums) {
        int nonZeroValue=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                int temp = nums[nonZeroValue];
                nums[nonZeroValue]=nums[i];
                nums[i]=temp;
                nonZeroValue++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
