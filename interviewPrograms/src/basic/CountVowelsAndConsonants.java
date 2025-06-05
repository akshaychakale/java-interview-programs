package basic;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        String str= "Automation";
//        char[] arr= str.toCharArray();
//        int vowels = 0,consonants=0;
//        for (int i = 0; i < arr.length; i++) {
//            if ("aeiouAEIOU".indexOf(arr[i])!=-1) {
//                vowels++;
//            }else if (Character.isLetter(arr[i])) {
//             consonants++;
//            }
//        }
//
//        System.out.println("Vowel count: "+vowels);
//        System.out.println("consonants count: "+consonants);

        segregateString(str);
    }

    private static void segregateString(String str) {
        char[] chars = str.toCharArray();
        String vowels = "";
        String consonants = "";
        String numbers = " ";
        String specialChars = "";

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels += ch;
                } else {
                    consonants += ch;
                }
            } else if (Character.isDigit(ch)) {
                numbers += ch;
            } else {
                specialChars += ch;
            }
        }

        System.out.println(vowels);

    }

    private static boolean isVowel(char c){
        char ch = Character.toLowerCase(c);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }


}
