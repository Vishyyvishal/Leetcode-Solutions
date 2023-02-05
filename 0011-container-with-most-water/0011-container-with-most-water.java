class Solution {
    public int maxArea(int[] height) {
        int size = height.length;
        int maxArea = 0;
        
        int left = 0, right = size - 1;
        
        while(left < right) {
            int currSum = 0;
            if(height[left] <= height[right]) {
                currSum = height[left] * (right - left);
                left++;
            } else {
                currSum = height[right] * (right - left);
                right--;
            }
            
            maxArea = Math.max(currSum, maxArea);
        }
        
        return maxArea;
    }
    
}