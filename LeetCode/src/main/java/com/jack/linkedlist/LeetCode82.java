package com.jack.linkedlist;

public class LeetCode82 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public ListNode deleteDuplicates(ListNode head) {

            ListNode pre = new ListNode(-1, head);
            ListNode curr = pre;
            ListNode run = head;
            while (run != null){
                while(run.next != null && run.val == run.next.val){
                    run= run.next;
                }

                if(curr.next == run) {
                    curr = run;
                }else{
                    curr.next = run.next;
                }
                run = curr.next;
                
            }

            return pre.next;
        }

    }

}
