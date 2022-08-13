class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        for(int i = 1; i < n; i++) {
            int left = nums[i];
            if(i > 1) {
                left += (dp[i-2]);
            }
            int right = 0 + dp[i-1];
            dp[i] = Math.max(left, right);
        }
        return dp[n-1];
    }
}