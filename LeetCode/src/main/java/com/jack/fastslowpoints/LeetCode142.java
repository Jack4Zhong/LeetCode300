package com.jack.fastslowpoints;

import com.jack.linkedlist.ListNode;

public class LeetCode142 {

    public static void main(String[] args) {
        
    }

    static class Solution{
        public ListNode detectCycle(ListNode head) {
       
            ListNode fast = head;
            ListNode slow = head;

            while (fast!= null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;

                if (fast ==slow) break;
            }

            if(fast== null || fast.next == null) return null;

            ListNode res = head;

            if (slow != res){
                slow = slow.next;
                res = res.next;
            }

            return res;
        }
    }
}
