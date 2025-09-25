package com.jack.linkedlist;

public class LeetCode234 {

    public static void main(String[] args) {
        
    }

    static class Solution{
        public boolean isPalindrome(ListNode head) {

            if (head == null) return true;

            ListNode mid = findMiddle(head);

            ListNode revNode = reverseLinkedList(mid.next);

            while (revNode!= null){
                if (revNode.val != head.val) return false;
                revNode= revNode.next;
                head = head.next;
            }
            return true;
        }

        

        private ListNode findMiddle(ListNode head){
            ListNode pre = new ListNode();
            pre.next = head;

            ListNode slow = pre;
            ListNode fast = pre;
            
            while (fast!= null && fast.next!= null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
            
        }

        private ListNode reverseLinkedList(ListNode head){
            ListNode pre = null;

            while (head != null){
                ListNode temp = head.next;
                head.next = pre;
                pre = head;
                head = temp;
            }
            return pre;
        }
    }

}
