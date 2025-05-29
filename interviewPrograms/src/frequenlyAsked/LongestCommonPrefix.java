package frequenlyAsked;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flowing"};

        longestPrefix2(arr);
    }

    private static String longestPrefix(String[] arr) {
        String prefix=arr[0];

        for (int i = 0; i < arr.length; i++) {
            while (arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return " ";
                }
            }
        }
        System.out.println(prefix);
        return prefix;
    }

    private static String longestPrefix2(String[] arr) {
        String prefix = arr[0];

        for (int i = 0; i < arr.length; i++) {
            while(arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                return " ";
            }
        }
        System.out.println(prefix);
        return prefix;
    }
}
