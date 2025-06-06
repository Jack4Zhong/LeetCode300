package com.jack.linkedlist;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0, head);
            ListNode fast = pre;
            ListNode slow = pre;
            int k = n;
            while(k>0) {
                fast = fast.next;
                k--;
            }
            while(fast.next != null){
                fast= fast.next;
                slow = slow.next;
            }

            slow.next= slow.next.next;

        return pre.next;
    
    }

}
