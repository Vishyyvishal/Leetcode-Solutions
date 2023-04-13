class Solution {
    public int characterReplacement(String s, int k) {
        int[] fq = new int[26];
        int mostFreqLetter = 0;
        int left = 0;
        int right = 0;
        int res = 0;

        while(right < s.length()) {
            // add char count to array
            fq[s.charAt(right) - 'A']++;

            // update the most frequent letter count 
            mostFreqLetter = Math.max(mostFreqLetter, fq[s.charAt(right) - 'A']);

            int windowSize = right - left + 1;

            if((windowSize - mostFreqLetter) > k) {
                fq[s.charAt(left) - 'A']--;
                left++;
            }

            right++;
        }

        res = Math.min(s.length(), mostFreqLetter + k);
        return res;
    }
}