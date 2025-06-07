package tasks;

public class CountVowels {
//6. Count Vowels in a String
//    Given a string, determine how many times each vowel (A, E, I, O, U) appears in it. The count should be case-insensitive, but the output should display uppercase vowels.
//            Example 1:
//    Input: str1 = "My NAME is Khan"
//    Output:
//    A = 2
//    E = 1
//    I = 1
//    O = 0
//    U = 0

    public static void main(String[] args) {
        String str = "My NAME is Khan";

        int vowelsCount=0;
        char[] chars=str.toCharArray();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < chars.length; i++) {
            if (vowels.indexOf(chars[i])!=-1){
                vowelsCount++;

            }
        }

        System.out.println("vowels count: "+ vowelsCount);
    }
}
