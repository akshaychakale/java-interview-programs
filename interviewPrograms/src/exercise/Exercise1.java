package exercise;

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
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        findIndices(nums, target);
    }

    public static void findIndices(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println("indices are :"+i+" & "+j);
                }

            }
        }
    }
}
