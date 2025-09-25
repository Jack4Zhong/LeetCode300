package com.jack.tree;

public class LeetCode226 {
    public static void main(String[] args) {
        
    }

    static class Solution{

        public TreeNode invertTree(TreeNode root) {
            if (root == null) return root;

            TreeNode left = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(left);

            return root;

        }

    }

}
