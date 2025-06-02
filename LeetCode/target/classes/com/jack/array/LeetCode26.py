from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        res = 0
        length = len(nums)
        index = 1
        while(index < length):
            if(nums[res]!= nums[index]):
                res+= 1
                nums[res]= nums[index]
                
            index+=1
        return res+1

if __name__ == "__main__":
    pass