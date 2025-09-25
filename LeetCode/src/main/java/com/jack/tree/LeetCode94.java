package com.jack.tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode94 {
    public static void main(String[] args) {
        
    }


    static class Solution{
        
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();

            if (root == null) return res;

            inorder(res, root);
            return res;
        
        }


        public void inorder(List<Integer> res, TreeNode node){

            if (node == null) return; 

            inorder(res, node.left);
            res.add(node.val);
            inorder(res, node.right);

        }
    }

}
