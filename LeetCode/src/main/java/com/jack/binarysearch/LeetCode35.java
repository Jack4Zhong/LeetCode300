package com.jack.binarysearch;

public class LeetCode35 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int [] nums = {1,3,5,6};
        int res =solution.searchInsert(nums, 2);     
        System.out.println(res);   
    }

    static class Solution{
        public int searchInsert(int[] nums, int target) {

            int left = 0;
            int right = nums.length;

            while (left < right){
                int mid = left+(right-left)/2;

                if (nums[mid] == target){
                    return mid;
                }else if (nums[mid] < target){
                    left = mid + 1 ;
                } else {
                    right = mid ;
                }
                
            }
            return left;
        } 
    }
}
