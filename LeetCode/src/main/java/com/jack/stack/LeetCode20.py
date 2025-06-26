class Solution:
    def isValid(self, s: str) -> bool:
        stk = []
        d = {'()', '[]', '{}'}
        
        for c in s:
            if c in '({[':
                stk.append(c)
            elif not stk or stk.pop() + c not in d:
                return False
        return not stk



if __name__ == "__main__":
    str = "()[]{}(("
    res = Solution().isValid(str)
    print(res)

