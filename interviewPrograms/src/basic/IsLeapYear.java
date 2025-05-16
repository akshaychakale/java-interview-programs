package basic;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year: ");
        int year = new Scanner(System.in).nextInt();

        isLeapYear(year);

    }

    private static void isLeapYear(int year) {
        if (year%400==0 && year%100==0){
            System.out.println(year+" is leap year");
        } else
            if (year%4==0 && year%100!=0) {
            System.out.println(year+" is leap year");
        }else {
            System.out.println(year+" is not leap year");
        }
    }
}
