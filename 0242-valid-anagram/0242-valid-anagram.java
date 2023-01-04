class Solution {
    public boolean isAnagram(String s, String t) {
        // base case 1 
        if(s.length() != t.length()) return false;
        // base case 2 
        if(s.equals(t)) return true;

        Map<Character, Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray()) {
            if(map.containsKey(ch)) {
                int occurence = map.get(ch) + 1;
                map.put(ch, occurence);
            } else {
                map.put(ch, 1);
            }
        }
        
        for(char ch : t.toCharArray()) {
            if(map.containsKey(ch)) {
                int sub = map.get(ch) - 1;
                map.put(ch, sub);
                if(map.get(ch) == 0) map.remove(ch);
            }
        }
        
        return map.isEmpty(); 
    }
}