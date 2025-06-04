class Solution:
    def isHappy(self, n: int) -> bool:
        slow = n
        fast = self.next(n)
        
        while fast != slow:
            fast = self.next(self.next(fast))
            slow = self.next(slow)
        
        return slow == 1
    
    def next(self, x: int) -> int:
        y =0
        while x:
            x, v = divmod(x, 10)
            y=v*v
            
        return y
        
        



if __name__ == "__main__":
    pass