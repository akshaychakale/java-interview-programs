package basic;

public class ReverseString {

    public static void main(String[] args) {
        String str = "I love java";

        reverseString(str);
        reverseWords(str);
//        reverseWordsInSamePlace(str);
    }

    private static void reverseString(String str) {
        char[] ch = str.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

    }

    private static void reverseWords(String str) {
        String[] words= str.split(" ");
        System.out.println("");
        for (int i = words.length-1; i >=0; i--) {
            System.out.print(words[i]+" ");
        }

    }

    public static void reverseWordsInSamePlace(String str) {
        String[] words= str.split(" ");
        System.out.println("");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = word.length()-1; j >=0 ; j--) {
                System.out.print(words[j]);
            }
        }
    }
}

