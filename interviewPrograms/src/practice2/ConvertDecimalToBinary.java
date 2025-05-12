package practice2;

import java.util.Arrays;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        int num = 10;
        decimalToBinary(num);
    }

    private static void decimalToBinary(int num) {

        int[] binary = new int[100];

        int i=0;

        while (num!=0){
            binary[i]= num%2;
            num=num/2;
            i++;
        }

        System.out.println(Arrays.toString(binary));
    }
}
