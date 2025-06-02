from typing import Optional
from ListNode import ListNode

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        
        a, b = headA, headB
        while a != b:
            a = a.next if a else headB
            b = b.next if b else headA
            
        return a

if __name__ == "__main__":
    pass