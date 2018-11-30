package com.example.pikamouse.arithmetic.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * create by liting 2018/10/13
 */
public class LeetCode20 {

    private HashMap<Character, Character> mappings;

    public LeetCode20(){
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }


    public boolean isValid2(String s ){
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[]args){
        String s = "([)]";
        LeetCode20 leetCode20 = new LeetCode20();
        leetCode20.isValid(s);
    }
}
