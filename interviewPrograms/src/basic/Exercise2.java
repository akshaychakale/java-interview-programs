package basic;

public class Exercise2 {
    public static void main(String[] args) {
        String str = "s4r8f4g3";
//        Expected o/p: ssssrrrrrrrrffffggg
        char currentChar='0';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                currentChar=ch;
            }else if(Character.isDigit(str.charAt(i))){
                int count = Character.getNumericValue(str.charAt(i));

                for (int j = 0; j < count; j++) {
                    System.out.print(currentChar);
                }

        }

        }
    }
}
