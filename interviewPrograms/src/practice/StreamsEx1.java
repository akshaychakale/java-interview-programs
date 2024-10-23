package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsEx1 {
    public static void main(String[] args) {
//        create streams from various sources:

//        1. From Collections
        List<Integer> myList = Arrays.asList(1, 2, 3);
        Stream<Integer> stream = myList.stream(); // Sequential stream
        Stream<Integer> parallelStream = myList.parallelStream(); // Parallel stream

//       2. From Arrays
        Stream<Integer> arrayStream = Arrays.stream(new Integer[]{1, 2, 3});

//        Using static method
        Stream<String> stringStream = Stream.of("A", "B", "C");

//        Generating infinite stream
        Stream<Double> randomNumbers = Stream.generate(Math::random);
        Stream<Integer> iteratedNumbers = Stream.iterate(0, n -> n + 1);
    }
}
