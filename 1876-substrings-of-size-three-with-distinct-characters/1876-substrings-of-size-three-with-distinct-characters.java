class Solution {
    public int countGoodSubstrings(String s) {
        int res = 0;
        for(int i = 0; i <= s.length() - 3; i++) {
            char one = s.charAt(i);
            char two = s.charAt(i + 1);
            char three = s.charAt(i + 2);
            if(one != two && one != three && two != three) {
                res++;
            }
        }
        return res;
    }
}