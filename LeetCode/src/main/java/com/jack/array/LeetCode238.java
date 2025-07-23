package com.jack.array;

public class LeetCode238 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public int[] productExceptSelf(int[] nums) {
        
            int len = nums.length;
            int product = 1;
            int numOfZero = 0;

            int[] res = new int[len];

            for (int num: nums){
                if (num == 0){
                    numOfZero++;
                }else{
                    product *= num;
                }
            }

            if (numOfZero == 0){
                for (int i = 0; i < len; i++) {
                    res[i] = product/nums[i];
                    
                }
            }

            if(numOfZero == 1){
                for (int i = 0; i < len; i++) {
                    if(nums[i]==0){
                        res[i]= product;
                    }                    
                }
            }
            return res;
        
        }
    }

}
