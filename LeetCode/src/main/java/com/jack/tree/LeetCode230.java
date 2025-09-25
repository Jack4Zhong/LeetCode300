package com.jack.tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode230 {
    public static void main(String[] args) {
        
    }



    static class Solution{

        public int kthSmallest(TreeNode root, int k) {


            List<Integer> list = new ArrayList<>();

            inorder(list, root);

            int res = 0;
            return list.get(k-1);
        
        }

        public void inorder(List<Integer> list , TreeNode node){
            if (node == null) return;

            inorder(list, node.left);

            list.add(node.val);
            inorder(list, node.right);
        }

    }

}
