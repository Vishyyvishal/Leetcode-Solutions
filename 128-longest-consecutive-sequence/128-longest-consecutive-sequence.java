class Solution {
    // Time: O(N) bc of the if statement 
    // Space: O(N) 
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            int currCount = 1;
            
            if(!set.contains(currNum - 1)) {
                while(set.contains(currNum + 1)) {
                    currNum += 1;
                    currCount += 1;
                }
                maxCount = Math.max(maxCount, currCount);
            }
        }
        return maxCount;        
    }
}