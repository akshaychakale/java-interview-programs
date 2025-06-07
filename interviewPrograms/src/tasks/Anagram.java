package tasks;

import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        swap(10,20);
    }

    private static void swap(int a, int b) {
        System.out.println("a:" + a + "b:" + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a + "b:" + b);
    }
}
