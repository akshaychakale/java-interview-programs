package frequenlyAsked;

import java.util.regex.Pattern;

public class RemoveAllCharsExceptAlphabets {
    public static void main(String[] args) {
        String str = " hello @world 123 !";

        removeAllCharsExceptAlphabets(str);
    }

    private static void removeAllCharsExceptAlphabets(String str) {
        char[] chars=str.toCharArray();
        String onlyAlphabets="";
        for (char c: chars){
            if(Character.isLetter(c) || c==' '){
                onlyAlphabets+=c;
            }
        }

        System.out.println(onlyAlphabets);
    }
}
