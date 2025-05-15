package com.jack.twopoints;

public class LeetCode88 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        
    }
    
    
    
    static class Solution{
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int val1 = m>0? nums1[m-1]: Integer.MIN_VALUE;
            int val2 = n>0? nums2[n-1]: Integer.MIN_VALUE;

            while(m>0 || n>0){
                if(val1> val2){
                    nums1[m+n-1] = val1;
                    m--;
                }else{
                    nums1[m+n-1] = val2;
                    n--;
                }
            }

        }
    }

}
