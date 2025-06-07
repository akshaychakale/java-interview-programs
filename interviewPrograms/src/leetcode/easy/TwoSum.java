package leetcode.easy;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target=9;

//        int[] result = twoSumOptimised(nums, target);
//        System.out.println(nums[result[0]]+" "+nums[result[1]]);;
        twoSumOptimised2(nums,target);
    }

    private static void twoSumOptimised2(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];

            if(set.contains(complement)){
                int a=Math.min(nums[i],complement);
                int b=Math.max(nums[i],complement);
                System.out.println(a+" "+b);
                set.remove(complement);
            }else {
                set.add(nums[i]);
            }
        }
    }

    private static int[] twoSumOptimised(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    private static void twoSum(int[] nums, int target) {
        List<Integer> numList = new ArrayList<>();
        for(int n : nums){
            numList.add(n);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];

            if(numList.contains(complement)){
                System.out.println(nums[i]+" "+complement);
            }
        }
    }
}
