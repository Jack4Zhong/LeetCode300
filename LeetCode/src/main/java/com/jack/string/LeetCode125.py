import re


class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        pattern = r'[^a-z0-9]'
        s = re.sub(pattern, '', s)
        
        left, right = 0, len(s)-1
        while (left< right):
            if(s[left]!= s[right]):
                return False
            
            left+=1
            right-=1
        
        return True

if __name__ == "__main__":
    res = Solution().isPalindrome('A man, a plan, a canal: Panama')
    print(res)