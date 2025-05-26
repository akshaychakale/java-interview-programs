package jatinSdetVideo;

public class GetLargestPalindromeString {

    public static void main(String[] args) {
//        String s = "abababa";
        String s = "nitin";
        String longest="";
        for (int i = 0; i <=s.length(); i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                String sub= s.substring(i,j);

                if (isPalindrome(sub) && sub.length()>longest.length()){
                    longest=sub;
                }
            }
        }

        System.out.println(longest);

        }

        private static boolean isPalindrome(String str){
            StringBuilder sb = new StringBuilder(str);
            StringBuilder rev=sb.reverse();

            if (str.equals(String.valueOf(rev))) {
                return true;
            }
        return false;
    }


}
