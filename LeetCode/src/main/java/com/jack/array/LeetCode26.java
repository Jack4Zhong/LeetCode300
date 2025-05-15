package com.jack.array;

public class LeetCode26 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int [] nums = {0,0,1,1,2,3,4,4};

        int res = solution.removeDuplicates(nums);
        System.out.println(res);
        
    }

    static class Solution{
        public int removeDuplicates(int[] nums) {
            int len = nums.length;
            int res = 0;

            for (int i = 1; i < len; i++) {
                if(nums[res] != nums[i]){
                    nums[++res] = nums[i];
                }
            }
            return res++;

        }
    }

}
