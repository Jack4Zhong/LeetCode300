
from typing import List


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        a_set = set()
        res = 0
        
        for num in nums:
            if num in a_set:
                res-=num
            else :
                res+=num
                a_set.add(num)
        return res
        

class BetterSolution:
    def singleNumber(self, nums: List[int]) -> int:
        res = 0
        for num in nums:
            res ^= num
            
        return res

if __name__ == "__main__":
        
        nums = [1,1,2,3,3,4,4]
        res = BetterSolution().singleNumber(nums)
        print(res)
    
    
    