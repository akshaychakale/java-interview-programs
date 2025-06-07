package tasks;

public class brackets {

        public static void main (String[] args) throws java.lang.Exception
        {
            String str = "()[{}]";
//         Return True
//
//         String str = "()["
//         Return false

            verifyBrackets(str);
        }

        private static void verifyBrackets(String str){
            char[] chars=str.toCharArray();
            int openingBracket=0;
            int closingBracket=0;

            for (int i=0;i<chars.length;i++){
                if("{[(".indexOf(chars[i])!=-1){
                    openingBracket++;
                }else if("]})".indexOf(chars[i])!=-1){
                    closingBracket++;
                }
            }

            System.out.println("openingBrackets: "+openingBracket);
            System.out.println("closingBrackets: "+closingBracket);
        }
}
