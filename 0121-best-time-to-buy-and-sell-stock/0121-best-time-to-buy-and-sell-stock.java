class Solution {
    public int maxProfit(int[] prices) {
        // left is buy
        int left = 0;
        // right is sell
        int right = 1;
        int maxProfit = 0;
        
        while(right < prices.length) {
            // is it profitable? 
            if(prices[left] < prices[right]) {
                int delta = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, delta);
            } else if(prices[left] > prices[right]) {
                left = right;
            }
            right++;
        }
        
        return maxProfit;
    }
}