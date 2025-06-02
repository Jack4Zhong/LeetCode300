from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res = 0
        mi = prices[0]
        
        for price in prices:
            mi = min(mi, price)
            res = max(res, price -mi)
            
        return res
    




if __name__ == "__main__":
    prices = [7,1,5,3,6,4]
    res = Solution().maxProfit(prices)
    print(res)