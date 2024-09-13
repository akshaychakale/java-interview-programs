package exercise;

import java.util.*;

public class Exercise1 {
    /*
     Description
       Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up
       to target.
       Example
       Input: nums = [2, 7, 11, 15], target = 9
       Output: [0, 1]
       Constraints
       You may assume that each input would have exactly one solution, and you may not use the same element twice.
       You can return the answer in any order.
     */
    public static void main(String[] args) {
        int[] nums = {-2, 7, 11, 15};
        int target = 5;
        int[] res = findIndices3(nums, target);
        System.out.println(Arrays.toString(res));
        List<Integer> result = findIndices(nums, target);
        if (!result.isEmpty()) {
            System.out.println("indices are :" + result);
        } else
            System.out.println("indices not available for target: " + target);

    }

    public static List<Integer> findIndices(int[] arr, int target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    indices.add(i);
                    indices.add(j);
                    return indices;
                }
            }
        }
        return indices;
    }
    public static List<Integer> findIndices2(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                indices.add(map.get(complement));
                indices.add(i);
                return indices; // Return as soon as we find the pair
            }
            map.put(arr[i], i); // Store the index of the current number
        }

        return indices; // Return empty list if no pair is found
    }

    public static int[] findIndices3(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                   return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }
}
