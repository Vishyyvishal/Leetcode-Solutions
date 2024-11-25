class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        left = 0
        res = 0
        temp_res = 0
        
        
        for r in range(len(nums)):
            if nums[r] == 1:
                temp_res += 1
            else:
                temp_res = 0
            res = max(res, temp_res)
        
        return res
                
        
        
                
            
        