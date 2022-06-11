class Solution {
    
/*
    max length of s is 15

    1. create a map with roman chars to integer
    2. scan the string from right to left. get the integer value of the current 
       character from the map and add it to the result
    3. if the character tot he right of the current character is bigger than the current
       character, subtrat from the result
       
    Time:  O(1) b/c max length => O(15) -> O(1)
    Space: O(1) b/c map stores at most 7 characters -> O(7) -> O(1)
*/
    
    public int romanToInt(String s) {
        // map: roman char -> integer value
        Map<Character, Integer> map = new HashMap<>(7);
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        char lastChar = s.charAt(s.length() - 1);
        int res = map.get(lastChar);
        
        // scan the string from right to left 
        // start at 2nd to last char so we can look at 2 chars at a time
        for(int i = s.length() - 2; i >= 0; i--) {
            char currChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            if(map.get(currChar) >= map.get(nextChar)) {
                res += map.get(currChar);
            } else {
                // if char at the right is bigger -> special rule: subtract
                res -= map.get(currChar);
            }
        }
        return res;
    }
}