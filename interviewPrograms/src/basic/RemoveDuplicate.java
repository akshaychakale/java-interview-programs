package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,44,5,6,7,1,3,5,2,6,4,44};

        Set<Integer> set = new HashSet<>();

        for (int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }

        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.print(it.next());
        }
    }
}
