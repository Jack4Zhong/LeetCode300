package com.jack.tree;

public class LeetCode108 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public TreeNode sortedArrayToBST(int[] nums) {
            return createNode(nums, 0, nums.length-1);
            
        }

        public TreeNode createNode(int [] nums, int start, int end){
            if(start > end) return null;

            int mid = start + (end-start)/2;

            TreeNode node = new TreeNode(nums[mid]);
            node.left = createNode(nums, start, mid-1);
            node.right = createNode(nums, mid+1, end);

            return node;
        
        }
    }

}
