package com.jack.queue;

public class LeetCode2073 {

    public static void main(String[] args) {

        int [] tickets = {5,1,1,1};
        Solution solution = new Solution();
        int res = solution.timeRequiredToBuy(tickets, 0);
        System.out.println(res);
        
    }

    static class Solution{
        public int timeRequiredToBuy(int[] tickets, int k) {

            int len = tickets.length;
            int res = 0;

            for (int i = 0; i < len; i++) {
                if (i<=k){
                    res += Math.min(tickets[i], tickets[k]);
                } else {
                    res += Math.min(tickets[i], tickets[k]-1);
                }
            }
            return res;
        }
    }

}
