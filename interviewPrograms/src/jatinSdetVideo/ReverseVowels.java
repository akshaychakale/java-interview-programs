package jatinSdetVideo;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "Hello";
        String vowels="aeiouAEIOU";

        char[] array=str.toCharArray();
        int left=0;
        int right=array.length-1;


        while (left<right){
            if (vowels.indexOf(array[left])==-1) {
                left++;
            } else if (vowels.indexOf(array[right])==-1) {
                right--;
            }else {
                char temp = array[left];
                array[left]=array[right];
                array[right]=temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(array));
    }
}
