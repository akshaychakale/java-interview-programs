package basic;

public class CountDigits {
    public static void main(String[] args) {
        int num= 1234567;

        int count=String.valueOf(num).length();
        System.out.println("Count of digit in number is : "+count);
    }
}
