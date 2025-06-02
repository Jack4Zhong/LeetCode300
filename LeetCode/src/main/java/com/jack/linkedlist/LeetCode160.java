package com.jack.linkedlist;

public class LeetCode160 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode nodeA = headA;
            ListNode nodeB = headB;

            while(nodeA != nodeB){
                nodeA = nodeA== null? headB: nodeA.next;
                nodeB = nodeB== null? headA: nodeB.next;
            }

            return nodeA;
        }
        
    }

}
