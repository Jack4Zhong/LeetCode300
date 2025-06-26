package com.jack.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode2390 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public String removeStars(String s) {

            Deque<Character> stack = new ArrayDeque<>();
            for(char c : s.toCharArray()){
                if (c == '*'){
                    if(!stack.isEmpty()) stack.pop();
                }else{
                    stack.push(c);
                }
            }

            StringBuilder sb = new StringBuilder();

            while(!stack.isEmpty()){
                sb.insert(0,stack.pop());
            }
            return sb.toString();
        
        }
    }

}
