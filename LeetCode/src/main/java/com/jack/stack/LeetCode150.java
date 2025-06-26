package com.jack.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode150 {

    public static void main(String[] args) {
        
    }

    static class Solution{
        public int evalRPN(String[] tokens) {

            Deque<Integer> stack = new ArrayDeque<>();
            for(String token : tokens){
                switch (token) {
                    case "+" -> stack.push(stack.pop()+stack.pop());
                    case "-" -> stack.push(-(stack.pop()-stack.pop()));
                    case "*" -> stack.push(stack.pop()*stack.pop());
                    case "/" -> {
                        int val1 = stack.pop();
                        int val2 = stack.pop();
                        stack.push(val2/val1);
                    }
                    default -> stack.push(Integer.valueOf(token));
                }
            }
            return stack.pop();
        }
    }

}
