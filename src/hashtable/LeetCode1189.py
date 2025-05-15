
from typing import Counter


class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        count = Counter(text)
        count['o'] >>= 1
        count['l'] >>= 1
        return min(count[c] for c in 'balon')


if __name__ == "__main__":
    text = 'loonbalxballpoon'
    res = Solution().maxNumberOfBalloons(text)
    print(res)