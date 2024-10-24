package practice.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Exercise {
    public static void main(String[] args) {
        //Square every number in list and return sum of all
        int result = printSquareOfNumbersWithSumInList(List.of(1, 23, 56, 454, 65, 11, 22, 54));
        System.out.println(result);

        //print sum of odd numbers in list
       int result2 = printSumOfOddNumbersInList(List.of(1, 23, 56, 454, 65, 11, 22, 54));
        System.out.println(result2);

        //Create a list of even numbers from a list
        List result3 = printEvenNumbersFromList(List.of(1, 23, 56, 454, 65, 11, 22, 54));
        System.out.println(result3);
    }

    private static List printEvenNumbersFromList(List<Integer> numbers) {
       return numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    private static int printSumOfOddNumbersInList(List<Integer> numbers) {
       return numbers.stream().filter(num -> num % 2 != 0).reduce(0, Integer::sum);
    }

    private static int printSquareOfNumbersWithSumInList(List<Integer> numbers) {
        return numbers.stream().map(num -> num * num).reduce(0, Integer::sum);

    }
}
