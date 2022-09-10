class Solution {
    public int[] twoSum(int[] numbers, int target) {        
        int front_p = 0;
        int back_p = numbers.length - 1;
        
        
        while(front_p < back_p) {
            int total = numbers[front_p] + numbers[back_p];
            if(total > target) back_p--;
            else if (total < target) front_p++;
            else break;
        }
        
        return new int[] {front_p + 1, back_p + 1};
        
    }
}