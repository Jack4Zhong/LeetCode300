package com.jack.fastslowpoints;

public class LeetCode202 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean res = solution.isHappy(19);
        System.out.println(res);
    }

    static class Solution{
        public boolean isHappy(int n) {

            int slow = n;
            int fast = next(n);

            while (slow != fast){
                slow = next(slow);
                fast = next(next(fast));
            }

            return slow == 1;
        
        }

        private int next(int x){
            int y = 0;

            while (x > 0){
                y += (x%10) * (x%10);
                x = x / 10;
            }
            return y;
        }
    }

}
