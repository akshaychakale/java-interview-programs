package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{[([])]}";

        verifyValidParentheses(str);

    }

    private static boolean verifyValidParentheses(String str) {
        char[] chars=str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c: chars) {
            if(c == '{'){
                stack.add('}');
            } else if (c=='[') {
                stack.add(']');
            }else if(c == '('){
                stack.add(')');
            } else if (stack.isEmpty() || stack.pop()!=c) {
                System.out.println(" no valid");
                return false;
            }
        }
        System.out.println("valid");
        return stack.isEmpty();
    }
}
