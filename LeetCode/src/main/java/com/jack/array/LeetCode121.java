package com.jack.array;

public class LeetCode121 {


    public static void main(String[] args) {

        Solution solution = new Solution();
        int [] prices = {7,1,5,3,6,4};
        int res = solution.maxProfit(prices);
        System.out.println(res);
    }

    static class Solution{
        public int maxProfit(int[] prices) {

            int len = prices.length;
            int profit = 0;
            int min = prices[0];

            for (int i = 1; i < len; i++) {
                if(prices[i]<min) {
                    min = prices[i];
                    continue;
                }

                profit = Math.max(profit, prices[i]-min);
                
            }
            return profit;
        }
    }

}
