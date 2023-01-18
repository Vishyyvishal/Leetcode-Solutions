class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        
        Set<Integer> set = new TreeSet<>();        
        for(int n : nums) set.add(n);
        
        int maxCount = 0, tempCount = 0, prev = 0;
        
        for(int n : set) {
            if(prev == n - 1 || tempCount == 0) {
                tempCount++;
            } else { 
                tempCount = 1;
            }
            prev = n;
            maxCount = Math.max(tempCount, maxCount);
        }
        
        return maxCount;
        
    }
}