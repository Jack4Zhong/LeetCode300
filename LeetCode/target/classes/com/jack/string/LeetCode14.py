from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        l = len(strs)
        if (l == 0):
            return ''
        pre = strs[0]
        
        if (l == 1):
            return pre
        
        for str in strs[1:]:
            while not str.startswith(pre):
                pre = pre[:-1]
        
        return pre
        

if __name__ == "__main__":
    strs = ["flower","flow","flight"]
    res = Solution().longestCommonPrefix(strs)
    print(res)