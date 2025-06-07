package tasks;

import basic.FindFirstRepeatingCharacter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class NewTask {

    public static void main(String[] args) {
// 1       programme1
        int[] arr1={1,2,3,4,5,1};
        findBalancedArray(arr1);

// 2       binary search
        int[] arr2={1,2,3,4,5,1,64,10};
        int target=10;
        Arrays.sort(arr2);
        int result1 = binarySearchPractice(arr2, target);
        System.out.println(result1);;

// 3   valid brackets
        String str = "()[{}]";
        boolean result2=verifyValidBrackets(str);
        System.out.println(result2);

//        DescendingSort
        int[] arr = {0,1,1,0,0,0};
        descendingSort(arr);

//        FindDuplicate
        int[] arr3={1,2,3,4,2,5,1,64,10};
        findDuplicateElements(arr3);

//        First Repeating Char
        String str1 = "Hello world";
        findFirstRepeatingCharacter(str1);

//        FindMissingNumber
        int[] nums = {1, 2, 3, 4, 5, 7, 8,10,13};
        findMissingNumber(nums);

//      isAnagram
        String str4 = "abcba";
        isAnagram(str4);

//       factorial Number
        getFactorialNumber(5);

//        leap year
        isLeapYear(2009);

//        isPalindrome
        isPalindromeNumber(1234321);

//        merge two arrays
        int[] array1 = {1,2,3,4,4,5,5};
        int[] array2 = {6,7,8,9,10};
        mergeTwoArrays(array1,array2);

//        print fibonacci
        fibonacciSeries(10);

//        reverse String
        String string = "Hello new world";
        reverseStrings(string);

// todo     reverse words in same place
        reverseStringWordsInSamePlace(string);

//        second largest number
        secondLargestElement(array1);

//      second lowest number
        secondLowestElement(array1);

//        count length of last word
        String strr = " Helloo    world ";
        countLengthOfLastWord(strr);

// ToDO       reverse only letters
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        String strrr = "12ab3";
        reverseOnlyLetters(strrr);

// TODO     reverse vowels
        String vowelString = "Hello";
        reverseOnlyVowels(vowelString);

// TODO       Shift Zeros
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        int[] numsArr= {1,5,0,3,9,0,2,78,0};
        shiftZerosLeft(numsArr);

//        int[] numsArr2= {1,5,0,3,9,0,2,78,0,87};
//        bubbleSort(numsArr2);
    }

    private static void bubbleSort(int[] arr){

    }
    private static void shiftZerosLeft(int[] arr) {
    }
    private static void reverseOnlyVowels(String str) {
     char[] chars =str.toCharArray();
        int left=0, right=chars.length-1;
        for (int i = 0; i < chars.length; i++) {
            if ("aeiouAEIOU".indexOf(chars[left])==-1){
                left++;
            }else  if ("aeiouAEIOU".indexOf(chars[right])==-1){
                right--;
            }else {
                char temp = chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
        }
        System.out.print(chars);
    }
    private static void reverseOnlyLetters(String str) {
        char[] chars=str.toCharArray();
        int left=0, right=chars.length-1;

        while (left<=right) {
            if (!Character.isLetter(chars[left])){
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            }else {
                char temp= chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(chars);
    }
    private static void countLengthOfLastWord(String strr){
        String str = strr.trim();
        int count=0;

        for (int i =str.length()-1; i >=0 ; i--) {
            if (str.charAt(i)!=' '){
                count++;
            }else if (count>0){
                System.out.println("length :"+count);
                break;
            }
        }
    }
    private static void secondLowestElement(int[] array){
        int lowest = Integer.MAX_VALUE, secondLowest= Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i]<lowest){
                secondLowest=lowest;
                lowest=array[i];
            }else if(array[i] > lowest && array[i] < secondLowest) {
                secondLowest=array[i];
            }
        }
        System.out.println("---------------------");
        System.out.println("secondLowest: "+secondLowest);
    }
    private static void secondLargestElement(int[] array) {
        int largest = Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i]>largest){
                secondLargest=largest;
                largest = array[i];
            }

        }
        System.out.println("-----------------------");
        System.out.println("second large: "+secondLargest);
    }
    private static void reverseStringWordsInSamePlace(String string) {
        System.out.println(".>>>>>>>>>>>>>>>>");
        String[] words =string.split(" ");

        for (String word : words){
            char[] chars = word.toCharArray();
            int left=0, right=chars.length-1;

            while (left<right){
                char temp = chars[right];
                chars[right]=chars[left];
                chars[left]=temp;
                left++;
                right--;
            }
            System.out.print(new String(chars)+" ");
        }
    }
    private static void reverseStrings(String string) {
        char[] chars = string.toCharArray();
        System.out.println();
        for (int i = chars.length-1; i >= 0 ; i--) {
            System.out.print(chars[i]);
        }
    }
    private static void fibonacciSeries(int range) {
        int a=0 , b=1 , c=1;

        for (int i = 0; i <= range; i++) {
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
    private static void mergeTwoArrays(int[] arr1,int[] arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];
        int pos=0;

        for (int num : arr1){
            mergedArray[pos]=num;
            pos++;
        }

        for (int num : arr2){
            mergedArray[pos]=num;
            pos++;
        }

        System.out.println(Arrays.toString(mergedArray));
    }
    private static void isPalindromeNumber(int num){
        int ogNum= num;

        int rev=0;
        while (num!=0){
            rev = num%10+rev*10;
            num/=10;
        }

        if (ogNum == rev){
            System.out.println("its palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
    private static void isLeapYear(int year){

        if (year%4==0 && year%100!=0){
            System.out.println(year+ " is a leap year");
        }else {
            System.out.println(year+ " is not a leap year");
        }
    }
    private static void getFactorialNumber(int num) {
        int factorial=1;
        if (num!=0){
            System.out.println("undefined");
        }

        for (int i = 1; i <= num ; i++) {
            factorial*=i;
        }
        System.out.println("factorial: "+factorial);
    }
    private static void isAnagram(String str) {
    }
    private static void findMissingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n: nums){
            set.add(n);
        }
        int start = nums[0];
        int end = nums[nums.length-1];
        System.out.println("missing numbers: ");
        for (int i = start; i <= end; i++) {
            if (!set.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
    private static void findFirstRepeatingCharacter(String str1) {
        System.out.println();
        Set<Character> set = new HashSet<>();
        System.out.println("First repeating char: ");
        for (char c: str1.toCharArray()){
            if (!set.add(c)){
                System.out.print(c+" ");
                break;
            }
        }
    }
    private static void findDuplicateElements(int[] arr3) {
        Set<Integer> set = new HashSet<>();
        System.out.println("Duplicates: ");
        for (int n: arr3){
            if (!set.add(n)){
                System.out.print(n+" ");
            }
        }
    }
    private static void descendingSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static boolean verifyValidBrackets(String str) {
        char[] chars =str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '['){
                stack.push(']');
            }else if (chars[i] == '('){
                stack.push(')');
            }else if (chars[i] == '{'){
                stack.push('}');
            }
            else if (stack.isEmpty() || stack.pop()!=chars[i]){
                return false;
            }
        }
        return stack.isEmpty();
    }
    private static int binarySearchPractice(int[] arr2, int target) {
        int low = arr2[0];
        int high = arr2.length-1;

        while (low <= high){
            int mid = low + (high-low)/2;

            if (arr2[mid] == target){
                return mid;
            }

            if (arr2[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }

        }

        return -1;
    }
    private static void findBalancedArray(int[] arr){
        int totalSum = 0;
        for (int n: arr){
            totalSum+=n;
        }

        int leftSum=0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum= totalSum-leftSum-arr[i];
            if(leftSum==rightSum){
                System.out.println(arr[i]);
            }
            leftSum+=arr[i];
        }

    }
}
