package practice2;

public class Misc {

    public static void main(String[] args) {
        int num= 7;

//        isprimeNum(num);
//        findFactorial(num);

        //merge two arrays
        int[] arr1={0,1,2,3,4,5};
        int[] arr2={6,7,8,9,10};

//        mergeTwoArrays(arr1,arr2);

//        findSecondLargestElement(arr1);
        findSecondSmallestElement(arr1);
    }

    public static void findSecondLargestElement(int[] arr){
        int largest = Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                secondLargest=largest;
                largest=arr[i];
            }
        }

        System.out.println(secondLargest);
    }

    public static void findSecondSmallestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest=smallest;
                smallest=arr[i];
            }else if (arr[i]>smallest && arr[i]<secondSmallest){
                secondSmallest=arr[i];
            }

        }
        System.out.println("second smallest : "+secondSmallest);
    }

    public static void mergeTwoArrays(int[]a1,int[]a2){

        int[] mergedArray = new int[a1.length+a2.length];
        int pos=0;

        for (int i : a1){
            mergedArray[pos]=i;
            pos++;
        }

        for (int i : a2){
            mergedArray[pos]=i;
            pos++;
        }

        for (int i : mergedArray){
            System.out.print(i);
        }
    }

    private static void findFactorial(int num) {
        if (num < 0) {
            System.out.println("no factoria for -ve num");
        }

        if (num == 1) {
            System.out.println("factorial is 1");
        }else {
            int factorial=1;
            for (int i = 1; i < num; i++) {
                factorial*=i;
            }
            System.out.println("factorial of "+num+" is "+ factorial);
        }

    }

    private static boolean isprimeNum(int num) {

        if (num<=1) {
            System.out.println("not prime");
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                System.out.println("not prime");
                return false;
            }
        }
        System.out.println("its prime");
        return true;
    }
}
