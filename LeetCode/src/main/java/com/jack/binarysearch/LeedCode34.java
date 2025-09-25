package com.jack.binarysearch;

public class LeedCode34 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public int[] searchRange(int[] nums, int target) {

            int len = nums.length;
            int start = 0;
            int end = len-1;
            while (start < end){
                int mid = start +(end-start)/2;

                if(nums[mid]== target){
                    int left =mid;
                    int right = mid;
                    while (left > 0 && nums[left-1]== target){
                        left--;
                    }

                    while(right<len-1 && nums[right+1]== target){
                        right++;
                    }
                    return new int[]{left, right};

                }else if (nums[mid] > target){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            return new int[]{-1,-1};
        }
    }
}
