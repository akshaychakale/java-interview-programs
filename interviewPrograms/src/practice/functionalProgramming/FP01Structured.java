package practice.functionalProgramming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(1,23,56,454,65,11,22,54));
        printAllEvenNumbersInListStructured(List.of(1,23,56,454,65,11,22,54));
    }

    private static void printAllEvenNumbersInListStructured(List<Integer> nums) {
        for (int n : nums){
            if (n%2 == 0) {
                System.out.println(n);
            }
        }
    }

    private static void printAllNumbersInListStructured(List<Integer> nums) {
        for (int n : nums){
            System.out.println(n);
        }
    }

}
