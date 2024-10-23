package practice.functionalProgramming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
//        printAllNumbersInListFunctional(List.of(1,23,56,454,65,11,22,54));
//        printAllEvenNumbersInListFunctional(List.of(1,23,56,454,65,11,22,54));

    }


//    private static  void print(int n){
//        System.out.println(n);
//    }

    private static void printAllNumbersInListFunctional(List<Integer> nums) {
       nums.stream()
               .forEach(System.out::println);
    }

//    private static boolean isEven(int n){
//        return n%2==0;
//    }
    private static void printAllEvenNumbersInListFunctional(List<Integer> number) {
        number.stream()
                .filter(n -> 2==0)
                .forEach(System.out::println);
    }

}
