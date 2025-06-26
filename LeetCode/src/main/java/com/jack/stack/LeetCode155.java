package com.jack.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode155 {
    public static void main(String[] args) {

        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);

        System.out.println(stack.getMin());
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.getMin());
    }

    static class MinStack {

        private Deque<Integer> stack1 = new ArrayDeque<>();
        private Deque<Integer> stack2 = new ArrayDeque<>();

        public MinStack() {
            stack2.push(Integer.MAX_VALUE);
            
        }
        
        public void push(int val) {
            stack1.push(val);   
            stack2.push(Math.min(val, stack2.peek()));
        }
        
        public void pop() {
            stack1.pop();
            stack2.pop();       
        }
        
        public int top() {
            return stack1.peek();
        }
        
        public int getMin() {
            return stack2.peek();
        }
    }

}
