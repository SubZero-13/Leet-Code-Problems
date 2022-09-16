class Solution {
    Integer dp[][];
    public int maximumScore(int[] nums, int[] multipliers) {
        int m = multipliers.length;
        this.dp = new Integer[m][m];
        return helper(nums, multipliers, 0, nums.length-1, 0);
    }
    private int helper(int n[], int[] m, int st, int ed, int idx) {
        if(idx == m.length) {
            return 0;
        }
        if(dp[st][idx] != null) {
            return dp[st][idx];
        }
        int val1 = m[idx]*n[st] + helper(n, m, st+1, ed, idx+1);
        int val2 = m[idx] * n[ed] + helper(n, m, st, ed-1, idx+1);
        return dp[st][idx] = Math.max(val1, val2);
    }
}