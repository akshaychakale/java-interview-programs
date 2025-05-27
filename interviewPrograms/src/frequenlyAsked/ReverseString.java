package frequenlyAsked;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";

        reverseString(str);

        reverseStringWordsInSamePosition(str);
    }

    private static void reverseStringWordsInSamePosition(String str) {
        String[] strArray =str.split(" ");
        String result = "";
        for (int i = 0; i < strArray.length; i++) {
            char[] chars=strArray[i].toCharArray();

            for (int j = chars.length-1; j >=0 ; j--) {
                result+=chars[j];
            }
            if(i<strArray.length){
                result+=" ";
            }
        }
        System.out.println(result);

    }

    private static void reverseStringWordsInSamePosition2(String str) {
        String[] words =str.split(" ");
        String result="";

        for (int i = 0; i < words.length; i++) {
            int length=words[i].length();

            for (int j = length-1; j >=0 ; j--) {
                result+=words[i].charAt(j);
            }
            if(i<words.length){
                result+=" ";
            }
        }
        System.out.println(result);
    }

    private static void reverseString(String str){
        char[] chars=str.toCharArray();

        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.print(chars[i]);
        }
    }
}
