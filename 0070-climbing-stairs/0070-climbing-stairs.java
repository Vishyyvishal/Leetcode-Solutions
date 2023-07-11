class Solution {
    Map<Integer, Integer> dp = new HashMap<>();

    public int climbStairs(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        // if we've computed the value before then just fetch from the cache
        if(dp.containsKey(n)) return dp.get(n);

        // compute the ways of current number
        int res = climbStairs(n - 1) + climbStairs(n - 2);

        // save that computation
        dp.put(n, res);

        return res;
    }
}