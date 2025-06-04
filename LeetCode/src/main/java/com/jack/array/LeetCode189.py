
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        # l = len(nums)
        # k1 = k%l
        # self.reverse(nums, 0, l-1)
        # self.reverse(nums, 0, k1-1)
        # self.reverse(nums, k1, l-1)
        nums[:] = nums[-k:] + nums[:-k]


    def reverse(self, nums: List[int], l: int, r: int) -> None:
        while l < r:
            nums[r] = nums[l] + nums[r]
            nums[l] = nums[r] - nums[l]
            nums[r] = nums[r] - nums[l]


if __name__ == "__main__":
    pass