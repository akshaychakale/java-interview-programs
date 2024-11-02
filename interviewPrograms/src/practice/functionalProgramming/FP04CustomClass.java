package practice.functionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        super();
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String toString() {
        return name + ":" + noOfStudents + ":" + reviewScore;
    }

}

public class FP04CustomClass {


    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000)
        );

//        //allMatch, noneMatch, anyMatch

        Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
        Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
        Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;

        System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
        System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
        System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate));
        System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan90Predicate));
        System.out.println("-----------------------------------------------------------");

        Predicate<Course> noOfStudentsGreaterThan90Predicate = course -> course.getNoOfStudents() > 90;
        Predicate<Course> noOfStudentsGreaterThan95Predicate = course -> course.getNoOfStudents() > 95;
        Predicate<Course> noOfStudentsLessThan90Predicate = course -> course.getNoOfStudents() < 90;

        System.out.println(courses.stream().allMatch(noOfStudentsGreaterThan90Predicate));
        System.out.println(courses.stream().anyMatch(noOfStudentsGreaterThan95Predicate));
        System.out.println(courses.stream().noneMatch(noOfStudentsLessThan90Predicate));
        System.out.println(courses.stream().noneMatch(noOfStudentsGreaterThan95Predicate));
        System.out.println("----------------------------------------------------------");

        //Comparator
        Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparing(Course::getNoOfStudents);
        Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed();
        Comparator<Course> comparingByNoOfStudentsAndReview = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore);

        System.out.println(courses.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));
        System.out.println(courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
        System.out.println();
        System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndReview).collect(Collectors.toList()));
        System.out.println("----------------------------------------------");

        //limit , skip
        System.out.println(courses.stream()
                .sorted(comparingByNoOfStudentsIncreasing).limit(5).collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(comparingByNoOfStudentsIncreasing).skip(5).collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(comparingByNoOfStudentsIncreasing).skip(3).limit(3).collect(Collectors.toList()));

        System.out.println("----------------------------------------------");
        /*
         takeWhile - The takeWhile method retrieves elements from the beginning of a stream as long as a specified
         predicate holds true. Once it encounters an element that does not satisfy the predicate, it stops processing
         further elements.
         dropWhile - the dropWhile method skips elements from the start of a stream until it finds an element that does
          not satisfy the predicate. After this point, all subsequent elements are included in the result. */

        System.out.println("Courses >>: "+courses);

        System.out.println(
        courses.stream().takeWhile(course -> course.getReviewScore()>=95).collect(Collectors.toList()));

        System.out.println(
                courses.stream().dropWhile(course -> course.getReviewScore()>=95).collect(Collectors.toList()));
        System.out.println("--------------------------------------");

        //
        System.out.println(
        courses.stream()
                .max(Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore)));

         System.out.println(
                courses.stream()
                        .min(Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore)));

         System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90Predicate)
                        .min(Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore))
                        .orElse(new Course("Kubernetes","Cloud",91,20000)));
                        //Optional.Empty
                        //Kubernetes:20000:91

        System.out.println("------------------------------------------");










    }

}
