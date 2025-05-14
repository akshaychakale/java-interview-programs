package jatinSdetVideo;

public class PrintEvenWorldsInString {
    public static void main(String[] args) {
        String str = "sky is blue and vast";

        String[] arr = str.split(" ");

        for(String s: arr){
            if (s.length()%2==0) {
                System.out.println(s);
            }
        }
    }
}
