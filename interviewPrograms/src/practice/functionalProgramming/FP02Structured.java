package practice.functionalProgramming;

import java.util.List;

public class FP02Structured {

    public static void main(String[] args) {
        addNumbersInListStructured(List.of(1, 23, 56, 454, 65, 11, 22, 54));
    }

    private static void addNumbersInListStructured(List<Integer> numbers) {
        int sum=0;

        for(int n : numbers){
            sum+=n;
        }
        System.out.println("Sum is : "+sum);
    }
}
