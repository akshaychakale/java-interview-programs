package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(6,7,8,9,10);

        mergeList(l1,l2);
    }

    private static void mergeList(List<Integer> l1, List<Integer> l2) {
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(l1);
        mergedList.addAll(l2);
        System.out.println(mergedList);
    }
}
