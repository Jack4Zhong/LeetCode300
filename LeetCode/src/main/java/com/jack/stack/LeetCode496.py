class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        mp ={}
        stk = []
        for val in nums2:
            while stk and stk[-1]< val:
                mp[stk.pop()]= val
            
            stk.append(val)
            
        return [m.get(v, -1) for v in nums1]


if __name__ == "__main__":
    pass