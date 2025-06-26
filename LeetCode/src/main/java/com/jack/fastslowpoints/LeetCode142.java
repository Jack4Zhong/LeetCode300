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

                if (fast ==slow) {
                    ListNode res = head;
                    while(res!=slow){
                        res = res.next;
                        slow = slow.next;
                    }

                    return res;
                }
         
            }
          return null;
        }
    }
}
