

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        
        s_index,t_index = 0,0
        s_len = len(s)
        t_len = len(t)
        
        while (s_index<s_len and t_index<t_len):
            if(s[s_index]== t[t_index]):
                s_index +=1        
            t_index +=1
            
        return s_len == s_index
        

            
if __name__ == "__main__":
    
    res = Solution().isSubsequence('ace', 'abcde')
    print(res)
 