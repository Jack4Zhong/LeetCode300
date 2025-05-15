

from typing import List

class Solution:
    def moveZeroes(self, nums:List[int]) -> None:
        index = -1 
        
        for i, val in enumerate(nums):
            if val:
                index +=1
                nums[i], nums[index] = nums[index], nums[i]
            
if __name__ == "__main__":
    lst = [0, 1, 0, 3, 12]
    Solution().moveZeroes(lst)
    print(lst)