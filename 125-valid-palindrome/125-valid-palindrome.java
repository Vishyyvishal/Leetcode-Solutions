class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        // remove all non-alphanumeric chars
        s = s.replaceAll("[^A-Za-z0-9]", "");
        
        if(s.isEmpty()) return true;
        
        int front_p = 0;
        int back_p = s.length() - 1;
        
        while(front_p < back_p) {
            if(s.charAt(front_p) != s.charAt(back_p)) return false;
            
            front_p++;
            back_p--;
        }
        
        return true;
        
        
        
    }
}