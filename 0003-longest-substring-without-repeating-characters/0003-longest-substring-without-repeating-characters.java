class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0;
        int tail = 0;
        int head = 0;
        while(head < s.length()) {
            if(!set.contains(s.charAt(head))) {
                set.add(s.charAt(head));
                head++;
                res = Math.max(res, head - tail);
            } else {
                set.remove(s.charAt(tail));
                tail++;
            }
        }
        return res;
    }
}