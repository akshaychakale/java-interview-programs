package basic;

import java.util.Arrays;
import java.util.Scanner;

public class CompareArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size of 1st array");
        int n = scan.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter elements for array1: ");
        for (int i = 0; i < n; i++) {
            array1[i] = scan.nextInt();
        }

        System.out.println("Enter Size of 2nd array");
        int n2 = scan.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter elements for array2: ");
        for (int i = 0; i < n2; i++) {
            array2[i] = scan.nextInt();
        }

        System.out.println(isArrayEquals2(array1, array2));

        if (isArrayEquals2(array1, array2)) {
            System.out.println("Array elements are equal");
        } else {
            System.out.println("not equal");
        }

    }

    public static boolean isArrayEquals(int[] a1, int[] a2) {
        return Arrays.equals(a1, a2);
    }

    public static boolean isArrayEquals2(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    return false;
                }
            }

            return true;
        }
        return false;
    }
}
