package com.jack.twopoints;

public class LeetCode11 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public int maxArea(int[] height) {
            int maxArea = 0;
            int len = height.length;
            int left = 0;
            int right = len-1;

            while(left< right){
                int min = Math.min(height[left], height[right]);
                maxArea = Math.max(maxArea, min*(right-left));
            }
            
            return maxArea;
        }

    }

}
