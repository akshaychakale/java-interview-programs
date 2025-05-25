package retries;

public class AddNumbersFromString {
    public static void main(String[] args) {
        String s = "as2 re3 swfg4 gdg12";
        char[] chars = s.toCharArray();

        int sum=0;
        for (int i = 0; i < chars.length ; i++) {
            if(Character.isDigit(chars[i])){
                sum+=Integer.parseInt(String.valueOf(chars[i]));
            }
        }

        System.out.println(sum);

    }
}
