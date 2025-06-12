package jatinSdetVideo;

public class VerifyMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,5,4,2,0};
        int[] arr2 = {10,1,2,3,5,7,5,4,2,0};

        System.out.println(isMountainArray(arr));;
        System.out.println(isMountainArray(arr2));;
    }

    private static boolean isMountainArray(int[] arr){
        if(arr.length < 3){
            return false;
        }

        int i=0;
        while (i+1<arr.length &&arr[i]<arr[i+1]){
            i++;
        }

        while (i+1<arr.length && arr[i]>arr[i+1]){
            i++;
        }

        if(arr.length-1 == i){
            return true;
        }

        return false;
    }
}
