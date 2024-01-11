package Strings.Easy;

//https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

//open bracket will have a closed bracket after it.
public class ValidParentheses20_24 {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                s.push(c);
            } else {
                if (c == '}') {
                    if (s.isEmpty() || s.peek() != '{') {
                        return false;
                    }
                }
                if (c == ']') {
                    if (s.isEmpty() || s.peek() != '[') {
                        return false;
                    }
                }
                if (c == ')') {
                    if (s.isEmpty() || s.peek() != '(') {
                        return false;
                    }
                }
                s.pop();
            }
        }
        return s.isEmpty();
    }
}
