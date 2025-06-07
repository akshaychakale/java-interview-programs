package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class NewProgram1 {



    public static void main(String[] args) {
        String str = "I have Array";
        String reverse= "";
        char[] chars=str.toCharArray();

        for (int i =chars.length-1; i >=0 ; i--) {
            if(chars[i]!=' '){
                reverse+=chars[i];
            }
        }
        char[] revChar = reverse.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for(char arr:revChar){
            arrayList.add(arr);
        }
        System.out.println(arrayList);
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==' '){
                arrayList.add(i,chars[i]);
            }
        }

        System.out.println(arrayList);
    }

}
