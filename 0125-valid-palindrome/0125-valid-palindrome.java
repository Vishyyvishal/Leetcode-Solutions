class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        int front = 0; 
        int back = s.length() - 1;
        
        while(front <= back) {
            if(s.charAt(front) != s.charAt(back)) return false;
            front++;
            back--;
        }
        
        return true;
    }
}