package frequenlyAsked;

public class CapitaliseFirstLetter {
    public static void main(String[] args) {
        String input = "capitalize the first letter of each word";
        capitalizeFirstLetters(input);
//        System.out.println(output);
    }

    private static void capitalizeFirstLetters(String str) {
        String[] words = str.split("\\s");
        String string = "";
        for(String word : words){
            if(word.length()>0){
                String capital = Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase();
                string+=capital+" ";
            }
        }
        System.out.println(string);
    }
}
