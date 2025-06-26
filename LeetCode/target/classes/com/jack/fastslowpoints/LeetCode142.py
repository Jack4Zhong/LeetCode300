
from typing import Optional

from LeetCode.src.main.java.com.jack.linkedlist import ListNode


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]: # type: ignore
        fast = slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next

            if fast == slow:
                res = head
                while res != slow:
                    res = res.next
                    slow = slow.next
                    
                return res
            

if __name__ == "__main__":
    pass