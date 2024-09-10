package basic;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        String str= "Automation";
        char[] arr= str.toCharArray();
        int vowels = 0,consonants=0;
        for (int i = 0; i < arr.length; i++) {
            if ("aeiouAEIOU".indexOf(arr[i])!=-1) {
                vowels++;
            }else if (Character.isLetter(arr[i])) {
             consonants++;
            }
        }

        System.out.println("Vowel count: "+vowels);
        System.out.println("consonants count: "+consonants);
    }
}
