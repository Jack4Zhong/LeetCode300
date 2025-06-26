package com.jack.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode1047 {

    public static void main(String[] args) {
        
    }

    static class Solution{
        public String removeDuplicates(String s) {
            int len = s.length();
            if (s == null || len <1) return s;

            Deque<Character> stack = new ArrayDeque<>();

            for (int i = 0; i < len; i++) {

                char c = s.charAt(i);
                if (!stack.isEmpty() && c== stack.pop()) {
                    stack.pop();
                    continue;
                }

                stack.push(c);
            }

            StringBuilder sb = new StringBuilder();

            while(stack.isEmpty()){
                sb.insert(0, stack.pop());
            }
            return sb.toString();    
        }
    }
}
