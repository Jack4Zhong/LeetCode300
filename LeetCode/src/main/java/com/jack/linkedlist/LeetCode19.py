
from typing import Optional

from ListNode import ListNode


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        pre = ListNode(next=head)
        slow = fast = pre
        
        while n>0:
            fast = fast.next
            n-=1
            
        while fast.next:
            fast = fast.next
            slow = slow.next
            
        slow.next = slow.next.next

        return pre.next

if __name__ == "__main__":
    pass