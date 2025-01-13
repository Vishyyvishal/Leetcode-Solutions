class Solution:
    def findMin(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        left = 0
        right = len(nums) - 1

        if nums[right] > nums[0]:
            return nums[0]

        mid = 0
        while left <= right:
            if nums[left] > nums[right]:
                mid = (left + right) / 2
                mid = int(mid)
            if nums[mid] > nums[mid + 1]:
                return nums[mid + 1]
            if nums[mid] < nums[mid - 1]:
                return nums[mid]
            if nums[mid] < nums[right]:
                right = mid
            if nums[mid] > nums[right]:
                left = mid
        
        return -1
 