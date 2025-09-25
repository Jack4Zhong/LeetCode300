package com.jack.tree;

import java.util.ArrayDeque;
import java.util.Deque;


public class LeetCode222 {

    public static void main(String[] args) {
        
    }


    static class Solution{
        public int countNodes(TreeNode root) {
            int count= 0;
            if(root == null) return count;

            Deque<TreeNode> queue = new ArrayDeque<>();

            queue.offer(root);

            while(!queue.isEmpty()){
                TreeNode node =queue.poll();
                count++;
                if (node.left!= null){
                    queue.offer(node.left);
                }

                if (node.right!= null){
                    queue.offer(node.right);
                }

            }

            return count;

        }
    }

}
