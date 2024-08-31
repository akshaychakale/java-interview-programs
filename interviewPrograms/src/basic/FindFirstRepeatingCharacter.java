package basic;

import java.util.Scanner;

public class FindFirstRepeatingCharacter {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string: ");
        System.out.println(firstCharacter(scan.nextLine()));
    }

    private static char firstCharacter(String str){
        char[] ch=str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    return ch[i];
                }
            }
        }
        return '\0';
    }

}
