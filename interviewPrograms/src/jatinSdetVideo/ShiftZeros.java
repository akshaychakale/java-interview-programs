package jatinSdetVideo;

public class ShiftZeros {

    public static void main(String[] args) {
        int[] num = {1,43,0,6,0,9,0};

        shiftZerosLeft(num);
    }

    private static void shiftZerosLeft(int[] num) {
        int nonZeroValue=0;
        int temp=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] != 0){
                 temp = num[nonZeroValue];
                 num[nonZeroValue]=num[i];
                 num[i]=temp;
                 nonZeroValue++;
            }
        }

        for (int n : num){
            System.out.print(n);
        }
    }
}
