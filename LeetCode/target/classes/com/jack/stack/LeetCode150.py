class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        
        stack = []
        for token in tokens:
            if len(token)>1 or token.isdigit():
                stack.append(int(token))
            else:
                if token == "+":
                    stack[-2] += stack[-1]
                elif token == "-":
                    stack[-2] -= stack[-1]
                elif token == "*":
                    stack[-2] *= stack[-1]
                else:
                    stack[-2] = int(stack[-2]/stack[-1])
                stack.pop()     
        return stack.pop() 
    
        nums = []
        for t in tokens:
            if len(t) > 1 or t.isdigit():
                nums.append(int(t))
            else:
                if t == "+":
                    nums[-2] += nums[-1]
                elif t == "-":
                    nums[-2] -= nums[-1]
                elif t == "*":
                    nums[-2] *= nums[-1]
                else:
                    nums[-2] = int(nums[-2] / nums[-1])
                nums.pop()
        return nums[0]
    




if __name__ == "__main__":
    pass