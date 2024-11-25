class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        res = 0
        l, r = 0, 0
        count = 0
        while r < len(nums):
            if nums[r] == 0:
                count += 1
            while count == 2:
                if nums[l] == 0:
                    count -= 1
                l += 1
            res = max(res, r - l + 1)
            r += 1
        return res
    
    