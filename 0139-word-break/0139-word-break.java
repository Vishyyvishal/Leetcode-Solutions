class Solution {
    
    private Boolean[] dp;
    
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length() == 0 && wordDict.size() == 0) return true; 
        dp = new Boolean[s.length()];
        return helper(s, 0, wordDict);
    }
    
    public boolean helper(String s, int currentIndex, List<String> words) {
        if(currentIndex == s.length()) return true;
        
        if(dp[currentIndex] != null) {
            return dp[currentIndex];
        }
        

        for(int i = currentIndex + 1; i <= s.length(); i++) {
            String sub = s.substring(currentIndex, i);
            if(words.contains(sub)) {
                if(helper(s, i, words)) {
                    return dp[currentIndex] = true;
                }
            }
        }
        
        return dp[currentIndex] = false;
    }
}