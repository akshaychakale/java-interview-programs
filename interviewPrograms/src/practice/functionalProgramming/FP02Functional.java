package practice.functionalProgramming;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {
        System.out.println(addNumbersInListFunctional(List.of(1, 23, 56, 454, 65, 11, 22, 54)));
    }

    private static int sum(int a,int b){
        return a+b;
    }
    private static int addNumbersInListFunctional(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,FP02Functional::sum);

    }
}
