class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);
        
        // prefix portion
        int curr = 1;
        for(int i = 0; i < n; i++) {
            res[i] *= curr;
            curr *= nums[i];
        }
        
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] *= curr;
            curr *= nums[i];
        }
        
        return res;
    }
}


/*
Time: O(N) Space: O(N)
Not the most efficient

    int n = nums.length;
    int[] pre = new int[n];
    int[] post = new int[n];
    pre[0] = 1;
    post[n - 1] = 1;

    for(int i = 1; i < n; i++) {
        pre[i] = pre[i - 1] * nums[i - 1];
    }

    for(int i = n - 2; i >= 0; i--) {
        post[i] = post[i + 1] * nums[i + 1];
    }

    int res[] = new int[n];
    for(int i = 0; i < n; i++) {
        res[i] = pre[i] * post[i];
    }

    return res;

*/