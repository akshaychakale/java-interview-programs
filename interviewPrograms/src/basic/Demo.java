package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 9};
        List<Integer> missingNumbers = findMissingNumbers(array);
        System.out.println("Missing numbers: " + missingNumbers);
    }

    public static List<Integer> findMissingNumbers(int[] array) {
        List<Integer> missing = new ArrayList<>();
        Arrays.sort(array);  // Ensure the array is sorted

        for (int i = array[0]; i <= array[array.length - 1]; i++) {
            if (!contains(array, i)) {
                missing.add(i);
            }
        }

        return missing;
    }

    private static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
