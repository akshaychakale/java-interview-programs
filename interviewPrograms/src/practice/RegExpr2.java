package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr2 {
    public static void main(String[] args) {
        //using find() to find subsequence

        Pattern pat = Pattern.compile("Java");
        Matcher mat= pat.matcher("Java SE");

        if (mat.find()) {
            System.out.println("subsequence found");
        }else {
            System.out.println("subsequence not found");
        }
        System.out.println("______________________________________");
        //finding multiple sub-sequences

        Pattern pat1 = Pattern.compile("Test");
        Matcher mat1 = pat1.matcher("Test 1 2 3 Test");

        while (mat1.find()){
            System.out.println("Test found at index " + mat1.start());
        }
        System.out.println("______________________________________");
    }
}
