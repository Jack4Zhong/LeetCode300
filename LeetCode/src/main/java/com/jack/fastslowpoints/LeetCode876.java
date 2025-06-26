package com.jack.fastslowpoints;

import com.jack.linkedlist.ListNode;

public class LeetCode876 {

    public static void main(String[] args) {
        
    }

    static class Solution{
        public ListNode middleNode(ListNode head) {
        
            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            return slow;
        }
    }

}
