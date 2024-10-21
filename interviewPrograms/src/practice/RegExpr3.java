package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr3 {
    public static void main(String[] args) {
        //Create a patter to match a sequence which starts with e and ends with d

        /*it will return the longest subsequence starting with
        e and ending with d using (e.+d) pattern */
        Pattern pat = Pattern.compile("e.+d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find()) {
            System.out.println("Match : " + mat.group());
        }
        System.out.println("_________________________________________");

        //This patter will return the shortest subsequence
        Pattern pat2 = Pattern.compile("e.+?d");
        Matcher mat2 = pat2.matcher("extend cup end table");

        while (mat2.find()) {
            System.out.println("Match : " + mat2.group());
        }
    }
}
