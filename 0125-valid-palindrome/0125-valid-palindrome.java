class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
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