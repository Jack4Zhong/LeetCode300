from typing import Optional
from ListNode import ListNode


class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        pre = cur = ListNode(next=head)
        runner = head
        
        while runner:
            while runner.next and runner.val == runner.next.val:
                runner = runner.next
                
            if cur.next == runner:
                 cur = runner
            else:
                cur.next = runner.next
                
            runner= cur.next
        
        return pre.next


if __name__ == "__main__":
    pass