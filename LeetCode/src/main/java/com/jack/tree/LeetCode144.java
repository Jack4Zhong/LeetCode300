package com.jack.tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {
    public static void main(String[] args) {
        
    }


    static class Solution{
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if(root == null) return res;

            preorder(res, root);
            return res;
        
        }

        private void preorder(List<Integer> res, TreeNode node){
            if (node == null) return;
            
            res.add(node.val);
            preorder(res, node.left);
            preorder(res, node.right);
        }
    }

}
