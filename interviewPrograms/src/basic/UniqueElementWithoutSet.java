package basic;

import java.util.ArrayList;
import java.util.List;

public class UniqueElementWithoutSet {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,21,32,1,2,1};

        List<Integer> unique = new ArrayList<>();

        for(int i : arr){
            if(unique.contains(i)){
                continue;
            }else {
                unique.add(i);
            }
        }

        System.out.println(unique);
    }
}
