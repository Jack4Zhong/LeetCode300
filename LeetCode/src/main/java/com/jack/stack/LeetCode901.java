package com.jack.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode901 {
    public static void main(String[] args) {

        StockSpanner ss = new StockSpanner();
        System.out.println(ss.next(100));
        System.out.println(ss.next(80));
        System.out.println(ss.next(60));
        System.out.println(ss.next(70));
        System.out.println(ss.next(60));
        System.out.println(ss.next(75));
        System.out.println(ss.next(75));
        System.out.println(ss.next(85));
        
    }

    static class StockSpanner {

        private Deque<int[]> stack = new ArrayDeque<>();

        public StockSpanner() {
            
        }
        
        public int next(int price) {
            int count = 1;

            while (!stack.isEmpty() && stack.peek()[0]<=price){
                count += stack.pop()[1];
            }

            stack.push(new int[]{price, count});
            
            return count;
        }
    }

}
