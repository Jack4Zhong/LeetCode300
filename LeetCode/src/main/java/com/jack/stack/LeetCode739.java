package com.jack.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode739 {


    public static void main(String[] args) {
        
    }

    static class Solution {
        public int[] dailyTemperatures(int[] temperatures) {

            int len = temperatures.length;
            int [] ans = new int[len];

            Deque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i < len; i++) {
                while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                    int j = stack.pop();
                    ans[j] = i-j;
                }
                stack.push(i);
                
            }
            return ans;
        }
    }
}
