class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers)-1
        
        while(left < right):
            if(numbers[left] + numbers[right]== target):
                return [left+1, right+1]
            
            if(numbers[left] + numbers[right]< target):
                left+=1
                continue
            
            right -=1
                
        return [-1,-1]
            
            


if __name__ == "__main__":
    pass

