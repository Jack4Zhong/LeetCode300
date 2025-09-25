package com.jack.tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode257 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public List<String> binaryTreePaths(TreeNode root) {
        
            List<String> res = new ArrayList<>();

            if (root == null ) return res;

            pathfinder(res, root, "");

            return res;
        }

        public void pathfinder(List<String> res, TreeNode node, String path){
            if (node == null) return;

            if (node.left == null && node.right == null){
                res.add(path + node.val);
                return;
            }

            String extension = node.val + "->";
            pathfinder(res, node.left, path + extension);
            pathfinder(res, node.right, path + extension);
        }
    }

}
