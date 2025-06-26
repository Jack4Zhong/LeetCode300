package com.jack.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode933 {
    public static void main(String[] args) {
        
    }

    static class RecentCounter {

        private Deque<Integer> queue = new ArrayDeque<>();

        public RecentCounter() {
            
        }
        
        public int ping(int t) {
            queue.offer(t);

            while (queue.peekFirst()< t-3000){
                queue.pollFirst();
            }

            return queue.size();
            
        }
}

}
