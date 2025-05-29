package frequenlyAsked;

import java.util.Arrays;

public class IsAnagramicString {
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));
    }

    private static boolean areAnagrams(String str1, String str2) {

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if(Arrays.equals(chars1,chars2)){
            return true;
        }
        return false;
    }
}
