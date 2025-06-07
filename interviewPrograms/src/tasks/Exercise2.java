package tasks;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
//    4. Script/Code to identify duplicate city names in an array:
//    Write code to check for any duplicate city names in a given string array.
//
//            Examples:
//            - Input: `list1 = ["Bengaluru", "Hyderabad", "Mumbai", "Chennai"]`
//            - Output: "No duplicates"
//
//            - Input: `list1 = ["Bengaluru", "Hyderabad", "Mumbai", "Chennai", "Chennai"]`
//            - Output: "Duplicated city names: Chennai"

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        findDuplicates(list1);
    }

    private static boolean findDuplicates(List<String> list1) {

        for (int i = 0; i < list1.size()-1; i++) {
            for (int j = i-1; j < list1.size(); j++) {
                if (list1.get(i).equals(list1.get(j))){
                    return true;
                }
            }
        }
        return false;
    }
}
