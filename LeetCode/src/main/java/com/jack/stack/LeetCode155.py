class Solution:
    
    def __init__(self):
        self.sk=[]
        self.minsk = [inf]

    def push(self, val: int) -> None:
        self.sk.append(val)
        self.minsk.append(min(val, self.minsk[-1]))

    def pop(self) -> None:
        if not self.sk:
            return 
        
        self.sk.pop()
        self.minsk.pop()
        

    def top(self) -> int:
        return self.sk[-1]
        

    def getMin(self) -> int:
        return self.minsk[-1]



if __name__ == "__main__":
    pass