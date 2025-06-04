package com.jack.array;

import java.util.Arrays;

public class LeetCode189 {


    public static void main(String[] args) {

        Solution solution = new Solution();
        int [] nums = {1,2,3,4,5,6,7};

        solution.rotate(nums, 3);

        System.out.println(Arrays.toString(nums));
        
    }

    static class Solution{
        public void rotate(int[] nums, int k) {
            int len = nums.length;

            int k1 = k%len;

            reverse(nums, 0, len-1);
            reverse(nums, 0, k1-1);
            reverse(nums, k1, len-1);


        }

        private void reverse(int[] nums, int left, int right){
            while(left<right){
                nums[right] = nums[left] + nums[right];
                nums[left] = nums[right] - nums[left];
                nums[right] = nums[right] - nums[left];
                left++; right--;

            }
        }
    }

}
