package com.jack.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LeetCode20 {
    public static void main(String[] args) {
        
    }

    static class Solution {
        
        public boolean isValid(String s) {
            Map<Character, Character> map = new HashMap<>();
            map.put('(',')');
            map.put('[',']');
            map.put('{','}');

            Deque<Character> stack = new ArrayDeque<>();

            for(char c : s.toCharArray()){

                if (map.containsKey(c)){
                    stack.push(c);
                    continue;
                }

                if (!map.isEmpty() && map.get(stack.peek())==c){
                    stack.pop();
                    continue;
                }

                return false;
            }

            return stack.isEmpty();
        }
    }
}
