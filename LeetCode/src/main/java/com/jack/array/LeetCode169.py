from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hashTable = {}
        
        for num in nums:
            if num not in hashTable:
                hashTable[num] = 1
            else:
                hashTable[num] += 1
        
        for num in nums:
            if hashTable[num] > (len(nums)/2):
                return num
            
            
class BetterSolution:
    def majorityElement(self, nums: List[int]) -> int:
        count =0
        res = 0
        
        for num in nums:
            if count == 0:
                res = num
                
            count += 1 if res == num else -1
        
        return res

if __name__ == "__main__":
    nums = [1,1,1,1,2,3,4]
    res = BetterSolution().majorityElement(nums)
    print(res)