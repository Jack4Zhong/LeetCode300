from typing import List


class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        mp = {}
        
        for i, v in enumerate(nums):
            if v in mp and i-mp[v]<=k:
                return True
            
            mp[v]= i

        return False

if __name__ == "__main__":
    
    nums = [1,2,3,1]
    k = 3
    res = Solution().containsNearbyDuplicate(nums, k)
    
    print (res)