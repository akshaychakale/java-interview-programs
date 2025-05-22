package tasks;

import java.util.Stack;

public class VerifyValidBrackets {
    public static void main(String[] args) {
        String str = "()[{}]";

        System.out.println(isBracketsValid(str));;
    }

    private static boolean isBracketsValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()){
            if(c == '('){
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c=='{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop()!=c) {
                System.out.println("not valid");
                return false;
            }

        }
        System.out.println("valid");
        return stack.isEmpty();
    }


}
