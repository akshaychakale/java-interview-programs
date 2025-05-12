package jatinSdetVideo;

public class CountLengthOfLastWord {
    public static void main(String[] args) {
        String string = " Helloo    world ";
        String str = string.trim();

        int length=0;
        for (int i = str.length()-1; i >=0 ; i--) {
            if (str.charAt(i)!=' ') {
                length++;
            } else if (length>0) {
                System.out.println("lemgth is "+length);
                break;
            }
        }
    }
}
