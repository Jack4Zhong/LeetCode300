package com.jack.tree;

public class LeetCode543 {

    public static void main(String[] args) {
        
    }

    static class Solution{
        public int diameterOfBinaryTree(TreeNode root) {
            if (root == null) return 0;

            int leftHeight = treeHeight(root.left);
            int rightHeight = treeHeight(root.right);

            int leftMax = diameterOfBinaryTree(root.left);
            int rightMax = diameterOfBinaryTree(root.right);

            return Math.max((leftHeight+ rightHeight), Math.max(leftMax, rightMax));
            
        
        }


        private int treeHeight(TreeNode node){

            if (node == null) return 0;
            return 1+ Math.max(treeHeight(node.left), treeHeight(node.right));
        }
    }

}
