from typing import Optional

from LeetCode.src.main.java.com.jack.linkedlist import ListNode



class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]: # type: ignore
        fast = slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
        
        return slow


if __name__ == "__name__":
    pass