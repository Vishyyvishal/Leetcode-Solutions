class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        
        Set<Integer> set = new HashSet<>();
        int res = 1;
        for(int n : nums) set.add(n);
        for(int n : nums) {
            if(!set.contains(n - 1)) {
                int tempCount = 1;
                while(set.contains(n + 1)) {
                    n++;
                    tempCount++;
                }
                res = Math.max(res, tempCount);
            }
        }
        return res; 
    }
}