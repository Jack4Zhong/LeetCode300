class Solution:
    
    def __init__(self):
        self.stk = []    

    def next(self, price: int) -> int:
        count = 1
        while self.stk and self.stk[-1][0]<=price:
            count += self.stk.pop()[1]
            
        self.stk.append((price, count))
        return count


if __name__ == "__main__":
    pass