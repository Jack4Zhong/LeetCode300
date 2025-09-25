package com.jack.tree;

public class LeetCode98 {

    public static void main(String[] args) {
        
    }


    static class Solution{

        public boolean isValidBST(TreeNode root) {

            if (root == null) return true;
            
            int value = root.val;
            return isValidBST(root.left, Integer.MIN_VALUE, value) 
                && isValidBST(root.right, value, Integer.MAX_VALUE);

        }

        public boolean isValidBST(TreeNode node, int min, int max){
            if (node == null) return true;

            int value = node.val;
            if (value > max || value < min) return false;

            return (isValidBST(node.left, min, value) 
                && isValidBST(node.right, value, max));
        }
    }
}
