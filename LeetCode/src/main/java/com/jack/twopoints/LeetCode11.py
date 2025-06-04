from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        res = 0
        while left < right:
            low = min(height[i], height[j])
            res = max(res, low*(right-left))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return res


if __name__ == "__main__":
    pass
