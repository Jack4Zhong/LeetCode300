class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.strip().split()
        return ' '.join(words[::-1])


if __name__ == "__main__":
    res = Solution().reverseWords("this is a world")
    print(res)