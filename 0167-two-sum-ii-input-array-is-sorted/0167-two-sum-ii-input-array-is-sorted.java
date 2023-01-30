class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l_p = 0, r_p = numbers.length - 1;
        
        while(numbers[l_p] + numbers[r_p] != target) { 
            int tempSum = numbers[l_p] + numbers[r_p];
            if(tempSum > target) {
                r_p--;
            } else if (tempSum < target) {
                l_p++;
            } 
        }
        return new int[] {l_p + 1, r_p + 1};    
    }
}