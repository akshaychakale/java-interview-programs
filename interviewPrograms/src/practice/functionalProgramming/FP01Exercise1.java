package practice.functionalProgramming;

import java.util.List;

public class FP01Exercise1 {
    public static void main(String[] args) {
        //Exercise1 : print all odd numbers from the list
        printAllOddNumbersInListFunctional(List.of(1, 23, 56, 454, 65, 11, 22, 54));

        //Exercise2 : print all the course individually
        printAllCourses(List.of("Spring", "Spring boot", "microservices", "api", "kotlin"));

        //Exercise3 : print all the course containing Spring
        printAllCoursesContainingSpring(List.of("Spring", "Spring boot", "microservices", "api", "kotlin"));

        //Exercise4 : print all the course containing at least 4 letters
        printAllCoursesContainingFourLetters(List.of("Spring", "Spring boot", "microservices", "api", "kotlin"));

        //Exercise 5 : print cubes of odd numbers
        printCubesOfOddNumbersInListFunctional(List.of(1, 23, 56, 454, 65, 11, 22, 54));

        //Exercise 6 : add the numbers in list


    }



    private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(num -> num % 2 != 0).map(num -> num * num * num).forEach(System.out::println);
        System.out.println("--------------------------------------");
    }

    private static void printAllCoursesContainingFourLetters(List<String> courses) {
        courses.stream().filter(n -> n.length() > 3).forEach(System.out::println);
        System.out.println("--------------------------------");
    }

    private static void printAllCoursesContainingSpring(List<String> courses) {
        courses.stream().filter(n -> n.contains("Spring")).forEach(System.out::println);
        System.out.println("--------------------------------");
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream().map(course -> course + " "+ course.length()).forEach(System.out::println);
        System.out.println("--------------------------------<<");
    }

    private static void printAllOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
        System.out.println("--------------------------------");
    }
}
