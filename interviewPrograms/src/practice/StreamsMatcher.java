package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StreamsMatcher {

    public static void main(String[] args) {
       //Basic matching example 1
        Pattern pat;
        Matcher mat;
        boolean found;

        System.out.println("Testing Java against Java");
        pat = Pattern.compile("Java");
        mat= pat.matcher("Java");
        found=mat.matches();
        if (found) {
            System.out.println("Matches");
        }else {
            System.out.println("not matching");
        }

        System.out.println("Testing Java against Java SE");
        mat=pat.matcher("Java SE");
        found=mat.matches();
        if (found) {
            System.out.println("matches");
        }else {
            System.out.println("not matching");
        }

    }
}
