package practice.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
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

        //Create a list with even numbers filtered from a list
        List<Integer> result3 = printEvenNumbersFromList(List.of(1, 23, 56, 454, 65, 11, 22, 54));
        System.out.println(result3);

        //create a list with length of course titles
        List<String> result4 = printCourseWithLengthOfTitles(List.of("Spring", "Spring boot", "microservices", "api", "kotlin", "android"));
        System.out.println(result4);

    }

    private static List<String> printCourseWithLengthOfTitles(List<String> courses) {
        return courses.stream()
                .map(course ->course+" "+course.length())
                .collect(Collectors.toList());
    }

    private static List<Integer> printEvenNumbersFromList(List<Integer> numbers) {
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
