package basic;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {

        String[] cars = {"Honda", "KIA", "tata", "KIA"};

//        for (int i = 0; i < cars.length; i++) {
//            for (int j = i + 1; j < cars.length; j++) {
//                if (cars[i].equals(cars[j])) {
//                    System.out.println("Duplicate element : " + cars[i]);
//                }
//            }
//        }
        findDuplicate(cars);
    }

    private static void findDuplicate(String[] strArray){
        Set<String> set = new HashSet<>();

        System.out.println("Duplicates: ");
        for (String s: strArray){
            if(!set.add(s)){
                System.out.println(s);
            }
        }
    }
}
