package com.jack.tree;

public class LeetCode783 {

    public static void main(String[] args) {
        
    }

    static class Solution{


        Integer prev = null;
        int diff = Integer.MAX_VALUE;
        public int minDiffInBST(TreeNode root) {

            if (root == null) return -1;

            inorder(root);

            return diff;
        
        }

        public void inorder(TreeNode node){
            if (node == null) return;

            inorder(node.left);

            if (prev == null){
                prev = node.val;
            }else {
                diff = Math.min(diff, node.val-prev);
                prev = node.val;
            }

            inorder (node.right);
        }
    }

}
