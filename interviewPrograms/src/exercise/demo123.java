package exercise;

public class demo123 {
    public static void main(String[] args) {
        String s="s2r8f4g3";
        char[] ch=s.toCharArray();
        char c='0';
        for (int i = 0; i < ch.length; i++) {

            if (Character.isLetter(ch[i])) {
                c=ch[i];
            } else if (Character.isDigit(ch[i])) {
                int count=Character.getNumericValue(ch[i]);

                for (int j = 0; j < count; j++) {
                    System.out.print(c);
                }
            }



        }
    }
}
