package tasks;

public class Exercise1 {

//    2. Script/Code to reverse a string:
//    Develop code to reverse a given string without using built-in functions.


    public static void main(String[] args) {
        String str = "QNu Labs";

        reverseString(str);
    }

    private static void reverseString(String str){

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
